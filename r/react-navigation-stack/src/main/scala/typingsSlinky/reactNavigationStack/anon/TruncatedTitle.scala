package typingsSlinky.reactNavigationStack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TruncatedTitle extends js.Object {
  var tintColor: String
  var truncatedTitle: String
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTintColor(value: String): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setTruncatedTitle(value: String): Self = this.set("truncatedTitle", value.asInstanceOf[js.Any])
  }
  
}

