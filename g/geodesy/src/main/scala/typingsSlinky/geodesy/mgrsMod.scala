package typingsSlinky.geodesy

import typingsSlinky.geodesy.dmsMod.Precision
import typingsSlinky.geodesy.geodesyNumbers.`10`
import typingsSlinky.geodesy.geodesyNumbers.`2`
import typingsSlinky.geodesy.geodesyNumbers.`4`
import typingsSlinky.geodesy.geodesyNumbers.`6`
import typingsSlinky.geodesy.geodesyNumbers.`8`
import typingsSlinky.geodesy.mod.Datum
import typingsSlinky.geodesy.mod.Dp
import typingsSlinky.geodesy.mod.Format
import typingsSlinky.geodesy.utmMod.LatLonUtm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("geodesy/mgrs", JSImport.Namespace)
@js.native
object mgrsMod extends js.Object {
  
  // tslint:disable-next-line no-unnecessary-class
  @js.native
  class Dms ()
    extends typingsSlinky.geodesy.utmMod.Dms
  /* static members */
  @js.native
  object Dms extends js.Object {
    
    def compassPoint(bearing: Double): String = js.native
    def compassPoint(bearing: Double, precision: Precision): String = js.native
    
    def fromLocale(str: String): String = js.native
    
    def parse(dms: String): Double = js.native
    def parse(dms: Double): Double = js.native
    
    def separator: String = js.native
    def separator_=(char: String): Unit = js.native
    
    def toBrng(deg: Double): String = js.native
    def toBrng(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    def toBrng(deg: Double, format: Format): String = js.native
    def toBrng(deg: Double, format: Format, dp: Dp): String = js.native
    
    def toDms(deg: Double): String = js.native
    def toDms(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    def toDms(deg: Double, format: Format): String = js.native
    def toDms(deg: Double, format: Format, dp: Dp): String = js.native
    
    def toLat(deg: Double): String = js.native
    def toLat(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    def toLat(deg: Double, format: Format): String = js.native
    def toLat(deg: Double, format: Format, dp: Dp): String = js.native
    
    def toLocale(str: String): String = js.native
    
    def toLon(deg: Double): String = js.native
    def toLon(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    def toLon(deg: Double, format: Format): String = js.native
    def toLon(deg: Double, format: Format, dp: Dp): String = js.native
    
    def wrap360(degrees: Double): String = js.native
    
    def wrap90(degrees: Double): String = js.native
  }
  
  @js.native
  class LatLon () extends LatlonUtmMgrs
  
  @js.native
  trait LatlonUtmMgrs extends LatLonUtm
  
  @js.native
  trait Mgrs extends js.Object {
    
    var band: String = js.native
    
    var datum: Datum = js.native
    
    var e100k: String = js.native
    
    var easting: Double = js.native
    
    var n100k: String = js.native
    
    var northing: Double = js.native
    
    @JSName("toString")
    def toString_10(digits: `10`): String = js.native
    @JSName("toString")
    def toString_2(digits: `2`): String = js.native
    @JSName("toString")
    def toString_4(digits: `4`): String = js.native
    @JSName("toString")
    def toString_6(digits: `6`): String = js.native
    @JSName("toString")
    def toString_8(digits: `8`): String = js.native
    
    def toUtm(): UtmMgrs = js.native
    
    var zone: Double = js.native
  }
  
  @js.native
  class Utm () extends UtmMgrs
  
  @js.native
  trait UtmMgrs
    extends typingsSlinky.geodesy.utmMod.default {
    
    def toMgrs(): Mgrs = js.native
  }
  
  @js.native
  class default protected () extends Mgrs {
    def this(zone: Double, band: String, e100k: String, n100k: String, easting: Double, northing: Double) = this()
    def this(
      zone: Double,
      band: String,
      e100k: String,
      n100k: String,
      easting: Double,
      northing: Double,
      datum: Datum
    ) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def parse(mgrsGridRef: String): Mgrs = js.native
  }
}
