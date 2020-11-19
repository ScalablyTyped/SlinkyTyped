package typingsSlinky.geodesy

import typingsSlinky.geodesy.anon.Distance
import typingsSlinky.geodesy.anon.FinalBearing
import typingsSlinky.geodesy.dmsMod.Precision
import typingsSlinky.geodesy.mod.Dp
import typingsSlinky.geodesy.mod.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("geodesy/latlon-ellipsoidal-vincenty", JSImport.Namespace)
@js.native
object latlonEllipsoidalVincentyMod extends js.Object {
  
  // tslint:disable-next-line no-unnecessary-class
  @js.native
  class Dms ()
    extends typingsSlinky.geodesy.latlonEllipsoidalMod.Dms
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
  trait LatLonEllipsoidalVincenty
    extends typingsSlinky.geodesy.latlonEllipsoidalMod.default {
    
    def destinationPoint(distance: Double, initialBearing: Double): LatLonEllipsoidalVincenty = js.native
    
    def direct(distance: Double, initialBearing: Double): FinalBearing = js.native
    
    def distanceTo(point: LatLonEllipsoidalVincenty): Double = js.native
    
    def finalBearingOn(distance: Double, initialBearing: Double): Double = js.native
    
    def finalBearingTo(point: LatLonEllipsoidalVincenty): Double = js.native
    
    def initialBearingTo(point: LatLonEllipsoidalVincenty): Double = js.native
    
    def inverse(point: LatLonEllipsoidalVincenty): Distance = js.native
  }
  
  @js.native
  class default () extends LatLonEllipsoidalVincenty
}
