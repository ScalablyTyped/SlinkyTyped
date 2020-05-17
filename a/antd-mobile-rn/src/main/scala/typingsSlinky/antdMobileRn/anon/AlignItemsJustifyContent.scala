package typingsSlinky.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlignItemsJustifyContent extends js.Object {
  var alignItems: String = js.native
  var justifyContent: String = js.native
}

object AlignItemsJustifyContent {
  @scala.inline
  def apply(alignItems: String, justifyContent: String): AlignItemsJustifyContent = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], justifyContent = justifyContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignItemsJustifyContent]
  }
  @scala.inline
  implicit class AlignItemsJustifyContentOps[Self <: AlignItemsJustifyContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignItems(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJustifyContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justifyContent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

