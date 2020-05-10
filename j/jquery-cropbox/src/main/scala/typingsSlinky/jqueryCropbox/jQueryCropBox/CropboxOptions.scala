package typingsSlinky.jqueryCropbox.jQueryCropBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CropboxOptions extends js.Object {
  /**
    * If not null, this is the entire html block that should appear on hover over the image for instructions and/or buttons (could include the zoom in/out buttons for example). If null, the default html block is used which has the text "Click to drag" and the zoom in/out buttons. Use false to disable controls.
    */
  var controls: js.UndefOr[js.Any] = js.native
  /**
    * Height in pixels of the cropping window
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Maximum zoom value. With the default of 1.0 users can't zoom beyond the maximum image resolution.
    */
  var maxZoom: js.UndefOr[Double] = js.native
  /**
    * Set the initial cropping area
    */
  var result: js.UndefOr[CropboxArea] = js.native
  /**
    * This flag is used to determine when to display the controls. Never, always and hover do exactly what you would expect (never show them, always show them, show them on hover). The auto flag is the same as the hover flag, except that on mobile devices it always shows the controls (since there is no hover event).
    */
  var showControls: js.UndefOr[ShowControls] = js.native
  /**
    * Width in pixels of the cropping window
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * Number of incremental zoom steps. With the default of 10, you have to click the zoom-in button 9 times to reach 100%.
    */
  var zoom: js.UndefOr[Double] = js.native
}

object CropboxOptions {
  @scala.inline
  def apply(): CropboxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CropboxOptions]
  }
  @scala.inline
  implicit class CropboxOptionsOps[Self <: CropboxOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControls(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withResult(value: CropboxArea): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
    @scala.inline
    def withShowControls(value: ShowControls): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showControls")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
  }
  
}

