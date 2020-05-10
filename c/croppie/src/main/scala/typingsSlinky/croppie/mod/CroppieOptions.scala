package typingsSlinky.croppie.mod

import typingsSlinky.croppie.AnonHeight
import typingsSlinky.croppie.AnonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CroppieOptions extends js.Object {
  var boundary: js.UndefOr[AnonHeight] = js.native
  var customClass: js.UndefOr[String] = js.native
  var enableExif: js.UndefOr[Boolean] = js.native
  var enableOrientation: js.UndefOr[Boolean] = js.native
  var enableZoom: js.UndefOr[Boolean] = js.native
  var enforceBoundary: js.UndefOr[Boolean] = js.native
  var mouseWheelZoom: js.UndefOr[Boolean] = js.native
  var showZoomer: js.UndefOr[Boolean] = js.native
  var viewport: js.UndefOr[AnonType] = js.native
}

object CroppieOptions {
  @scala.inline
  def apply(): CroppieOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CroppieOptions]
  }
  @scala.inline
  implicit class CroppieOptionsOps[Self <: CroppieOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundary(value: AnonHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundary")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customClass")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableExif(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableExif")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableExif: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableExif")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableOrientation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withEnforceBoundary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceBoundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnforceBoundary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceBoundary")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseWheelZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseWheelZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseWheelZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseWheelZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withShowZoomer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showZoomer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowZoomer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showZoomer")(js.undefined)
        ret
    }
    @scala.inline
    def withViewport(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewport")(js.undefined)
        ret
    }
  }
  
}

