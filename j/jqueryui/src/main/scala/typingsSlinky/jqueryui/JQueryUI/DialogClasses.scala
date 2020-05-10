package typingsSlinky.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogClasses extends js.Object {
  var `ui-dialog`: js.UndefOr[String] = js.native
  var `ui-dialog-buttonpane`: js.UndefOr[String] = js.native
  var `ui-dialog-buttons`: js.UndefOr[String] = js.native
  var `ui-dialog-buttonset`: js.UndefOr[String] = js.native
  var `ui-dialog-content`: js.UndefOr[String] = js.native
  var `ui-dialog-dragging`: js.UndefOr[String] = js.native
  var `ui-dialog-resizing`: js.UndefOr[String] = js.native
  var `ui-dialog-title`: js.UndefOr[String] = js.native
  var `ui-dialog-titlebar`: js.UndefOr[String] = js.native
  var `ui-dialog-titlebar-close`: js.UndefOr[String] = js.native
  var `ui-widget-overlay`: js.UndefOr[String] = js.native
}

object DialogClasses {
  @scala.inline
  def apply(): DialogClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogClasses]
  }
  @scala.inline
  implicit class DialogClassesOps[Self <: DialogClasses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withUi-dialog`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-dialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUi-dialog`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-dialog")(js.undefined)
        ret
    }
    @scala.inline
    def `withUi-dialog-buttonpane`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-dialog-buttonpane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUi-dialog-buttonpane`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-dialog-buttonpane")(js.undefined)
        ret
    }
    @scala.inline
    def `withUi-dialog-buttons`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-dialog-buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUi-dialog-buttons`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-dialog-buttons")(js.undefined)
        ret
    }
    @scala.inline
    def `withUi-dialog-buttonset`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-dialog-buttonset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUi-dialog-buttonset`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-dialog-buttonset")(js.undefined)
        ret
    }
    @scala.inline
    def `withUi-dialog-content`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-dialog-content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUi-dialog-content`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-dialog-content")(js.undefined)
        ret
    }
    @scala.inline
    def `withUi-dialog-dragging`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-dialog-dragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUi-dialog-dragging`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-dialog-dragging")(js.undefined)
        ret
    }
    @scala.inline
    def `withUi-dialog-resizing`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-dialog-resizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUi-dialog-resizing`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-dialog-resizing")(js.undefined)
        ret
    }
    @scala.inline
    def `withUi-dialog-title`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-dialog-title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUi-dialog-title`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-dialog-title")(js.undefined)
        ret
    }
    @scala.inline
    def `withUi-dialog-titlebar`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-dialog-titlebar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUi-dialog-titlebar`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-dialog-titlebar")(js.undefined)
        ret
    }
    @scala.inline
    def `withUi-dialog-titlebar-close`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-dialog-titlebar-close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUi-dialog-titlebar-close`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-dialog-titlebar-close")(js.undefined)
        ret
    }
    @scala.inline
    def `withUi-widget-overlay`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-widget-overlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUi-widget-overlay`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-widget-overlay")(js.undefined)
        ret
    }
  }
  
}

