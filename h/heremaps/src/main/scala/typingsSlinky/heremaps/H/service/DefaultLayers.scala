package typingsSlinky.heremaps.H.service

import typingsSlinky.heremaps.AnonNormal
import typingsSlinky.heremaps.AnonSatellite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This property specifies collection of pre-configured HERE layers
  */
@js.native
trait DefaultLayers extends js.Object {
  var raster: AnonSatellite = js.native
  var vector: AnonNormal = js.native
}

object DefaultLayers {
  @scala.inline
  def apply(raster: AnonSatellite, vector: AnonNormal): DefaultLayers = {
    val __obj = js.Dynamic.literal(raster = raster.asInstanceOf[js.Any], vector = vector.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultLayers]
  }
  @scala.inline
  implicit class DefaultLayersOps[Self <: DefaultLayers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRaster(value: AnonSatellite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVector(value: AnonNormal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vector")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

