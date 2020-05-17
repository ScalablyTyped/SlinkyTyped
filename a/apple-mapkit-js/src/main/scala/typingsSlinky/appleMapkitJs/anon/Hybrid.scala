package typingsSlinky.appleMapkitJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hybrid extends js.Object {
  /**
    * A satellite image of the area with road and road name information
    * layered on top.
    */
  val Hybrid: String = js.native
  /**
    * A street map where your data is emphasized over the underlying map details.
    */
  val MutedStandard: String = js.native
  /**
    * A satellite image of the area.
    */
  val Satellite: String = js.native
  /**
    * A street map that shows the position of all roads and some road names.
    */
  val Standard: String = js.native
}

object Hybrid {
  @scala.inline
  def apply(Hybrid: String, MutedStandard: String, Satellite: String, Standard: String): Hybrid = {
    val __obj = js.Dynamic.literal(Hybrid = Hybrid.asInstanceOf[js.Any], MutedStandard = MutedStandard.asInstanceOf[js.Any], Satellite = Satellite.asInstanceOf[js.Any], Standard = Standard.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hybrid]
  }
  @scala.inline
  implicit class HybridOps[Self <: Hybrid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHybrid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hybrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMutedStandard(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MutedStandard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSatellite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Satellite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStandard(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Standard")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

