package typingsSlinky.openlayers.mod

import typingsSlinky.openlayers.mod.proj.Projection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SphereMetricOptions extends js.Object {
  /**
    * Projection of the geometry.  By default, the geometry is assumed to be in
    * EPSG:3857 (Web Mercator).
    */
  var projection: js.UndefOr[Projection] = js.native
  /**
    * Sphere radius.  By default, the radius of the earth is used (Clarke 1866
    * Authalic Sphere).
    * @api
    */
  var radius: js.UndefOr[Double] = js.native
}

object SphereMetricOptions {
  @scala.inline
  def apply(): SphereMetricOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SphereMetricOptions]
  }
  @scala.inline
  implicit class SphereMetricOptionsOps[Self <: SphereMetricOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjection(value: Projection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(js.undefined)
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(js.undefined)
        ret
    }
  }
  
}

