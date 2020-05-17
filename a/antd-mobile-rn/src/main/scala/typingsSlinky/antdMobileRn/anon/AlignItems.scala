package typingsSlinky.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlignItems extends js.Object {
  var alignItems: String = js.native
  var backgroundColor: String = js.native
  var flex: Double = js.native
  var justifyContent: String = js.native
}

object AlignItems {
  @scala.inline
  def apply(alignItems: String, backgroundColor: String, flex: Double, justifyContent: String): AlignItems = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], flex = flex.asInstanceOf[js.Any], justifyContent = justifyContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignItems]
  }
  @scala.inline
  implicit class AlignItemsOps[Self <: AlignItems] (val x: Self) extends AnyVal {
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
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flex")(value.asInstanceOf[js.Any])
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

