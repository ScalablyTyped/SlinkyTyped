package typingsSlinky.openlayers.mod.olx

import typingsSlinky.openlayers.mod.layer.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object literal with options for the {@link ol.Map#forEachFeatureAtPixel} and
  * {@link ol.Map#hasFeatureAtPixel} methods.
  */
@js.native
trait AtPixelOptions extends js.Object {
  var hitTolerance: js.UndefOr[Double] = js.native
  var layerFilter: js.UndefOr[js.Function1[/* layer */ Layer, Boolean]] = js.native
}

object AtPixelOptions {
  @scala.inline
  def apply(): AtPixelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AtPixelOptions]
  }
  @scala.inline
  implicit class AtPixelOptionsOps[Self <: AtPixelOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHitTolerance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitTolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHitTolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitTolerance")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerFilter(value: /* layer */ Layer => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLayerFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerFilter")(js.undefined)
        ret
    }
  }
  
}

