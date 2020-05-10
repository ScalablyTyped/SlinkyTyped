package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutReference extends js.Object {
  var layoutId: js.UndefOr[String] = js.native
  var predefinedLayout: js.UndefOr[String] = js.native
}

object LayoutReference {
  @scala.inline
  def apply(): LayoutReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutReference]
  }
  @scala.inline
  implicit class LayoutReferenceOps[Self <: LayoutReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayoutId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutId")(js.undefined)
        ret
    }
    @scala.inline
    def withPredefinedLayout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predefinedLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredefinedLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predefinedLayout")(js.undefined)
        ret
    }
  }
  
}

