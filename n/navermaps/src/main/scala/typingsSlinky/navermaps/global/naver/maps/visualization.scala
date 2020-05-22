package typingsSlinky.navermaps.global.naver.maps

import typingsSlinky.navermaps.naver.maps.visualization.DotMapOptions
import typingsSlinky.navermaps.naver.maps.visualization.HeatMapOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.visualization")
@js.native
object visualization extends js.Object {
  @js.native
  class DotMap ()
    extends typingsSlinky.navermaps.naver.maps.visualization.DotMap {
    def this(dotMapOptions: DotMapOptions) = this()
  }
  
  @js.native
  class HeatMap ()
    extends typingsSlinky.navermaps.naver.maps.visualization.HeatMap {
    def this(heatMapOptions: HeatMapOptions) = this()
  }
  
  @js.native
  class WeightedLocation protected ()
    extends typingsSlinky.navermaps.naver.maps.visualization.WeightedLocation {
    def this(lat: Double, lng: Double) = this()
    def this(lat: Double, lng: Double, weight: Double) = this()
    /* CompleteClass */
    override def getLocation(): typingsSlinky.navermaps.naver.maps.LatLng = js.native
    /* CompleteClass */
    override def getWeight(): Double = js.native
    /* CompleteClass */
    override def lat(): Double = js.native
    /* CompleteClass */
    override def lng(): Double = js.native
  }
  
  // Sub module: visualization
  def apply(): Unit = js.native
  @js.native
  object SpectrumStyle extends js.Object {
    /* 3 */ val COOL: typingsSlinky.navermaps.naver.maps.visualization.SpectrumStyle.COOL with Double = js.native
    /* 4 */ val GREYS: typingsSlinky.navermaps.naver.maps.visualization.SpectrumStyle.GREYS with Double = js.native
    /* 2 */ val HOT: typingsSlinky.navermaps.naver.maps.visualization.SpectrumStyle.HOT with Double = js.native
    /* 1 */ val HSV: typingsSlinky.navermaps.naver.maps.visualization.SpectrumStyle.HSV with Double = js.native
    /* 0 */ val JET: typingsSlinky.navermaps.naver.maps.visualization.SpectrumStyle.JET with Double = js.native
    /* 10 */ val OXYGEN: typingsSlinky.navermaps.naver.maps.visualization.SpectrumStyle.OXYGEN with Double = js.native
    /* 9 */ val PORTLAND: typingsSlinky.navermaps.naver.maps.visualization.SpectrumStyle.PORTLAND with Double = js.native
    /* 8 */ val RAINBOW: typingsSlinky.navermaps.naver.maps.visualization.SpectrumStyle.RAINBOW with Double = js.native
    /* 7 */ val RdBu: typingsSlinky.navermaps.naver.maps.visualization.SpectrumStyle.RdBu with Double = js.native
    /* 5 */ val YIGnBu: typingsSlinky.navermaps.naver.maps.visualization.SpectrumStyle.YIGnBu with Double = js.native
    /* 6 */ val YIOrRd: typingsSlinky.navermaps.naver.maps.visualization.SpectrumStyle.YIOrRd with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.navermaps.naver.maps.visualization.SpectrumStyle with Double] = js.native
  }
  
}

