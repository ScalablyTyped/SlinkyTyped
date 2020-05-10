package typingsSlinky.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxHtmlEditorMediaResizing extends js.Object {
  /** Specifies media types that can be resized. Currently, only images are supported. */
  var allowedTargets: js.UndefOr[js.Array[String]] = js.native
  /** Enables media resizing. */
  var enabled: js.UndefOr[Boolean] = js.native
}

object dxHtmlEditorMediaResizing {
  @scala.inline
  def apply(): dxHtmlEditorMediaResizing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxHtmlEditorMediaResizing]
  }
  @scala.inline
  implicit class dxHtmlEditorMediaResizingOps[Self <: dxHtmlEditorMediaResizing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedTargets(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedTargets")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
  }
  
}

