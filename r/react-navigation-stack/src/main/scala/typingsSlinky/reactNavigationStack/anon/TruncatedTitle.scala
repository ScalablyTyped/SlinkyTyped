package typingsSlinky.reactNavigationStack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TruncatedTitle extends js.Object {
  var tintColor: String = js.native
  var truncatedTitle: String = js.native
}

object TruncatedTitle {
  @scala.inline
  def apply(tintColor: String, truncatedTitle: String): TruncatedTitle = {
    val __obj = js.Dynamic.literal(tintColor = tintColor.asInstanceOf[js.Any], truncatedTitle = truncatedTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TruncatedTitle]
  }
  @scala.inline
  implicit class TruncatedTitleOps[Self <: TruncatedTitle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTruncatedTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncatedTitle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

