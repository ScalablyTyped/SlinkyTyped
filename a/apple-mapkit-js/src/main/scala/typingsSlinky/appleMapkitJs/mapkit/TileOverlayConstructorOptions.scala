package typingsSlinky.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Attributes used when initializing a tile overlay, including minimum and
  * maximum zoom, opacity, and custom data.
  */
@js.native
trait TileOverlayConstructorOptions extends js.Object {
  /**
    * Custom data used to populate the URL template.
    */
  var data: js.UndefOr[js.Object] = js.native
  /**
    * Maximum zoom level of the overlay.
    */
  var maximumZ: js.UndefOr[Double] = js.native
  /**
    * Minimum zoom level of the overlay.
    */
  var minimumZ: js.UndefOr[Double] = js.native
  /**
    * Opacity level of the overlay.
    */
  var opacity: js.UndefOr[Double] = js.native
}

object TileOverlayConstructorOptions {
  @scala.inline
  def apply(): TileOverlayConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileOverlayConstructorOptions]
  }
  @scala.inline
  implicit class TileOverlayConstructorOptionsOps[Self <: TileOverlayConstructorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumZ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumZ")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumZ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumZ")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
  }
  
}

