package typingsSlinky.geodesy

import typingsSlinky.geodesy.dmsMod.Precision
import typingsSlinky.geodesy.latlonEllipsoidalMod.Vector3d
import typingsSlinky.geodesy.mod.Datum
import typingsSlinky.geodesy.mod.Dp
import typingsSlinky.geodesy.mod.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("geodesy/latlon-nvector-ellipsoidal", JSImport.Namespace)
@js.native
object latlonNvectorEllipsoidalMod extends js.Object {
  
  @js.native
  class Cartesian () extends CartesianNvector
  
  @js.native
  trait CartesianNvector
    extends typingsSlinky.geodesy.latlonEllipsoidalMod.Cartesian {
    
    def toNvector(datum: Datum): NvectorEllipsoidal = js.native
  }
  
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
  trait LatLonNvectorEllipsoidal
    extends typingsSlinky.geodesy.latlonEllipsoidalMod.default {
    
    def deltaTo(point: LatLonNvectorEllipsoidal): Ned = js.native
    
    def destinationPoint(delta: Ned): LatLonNvectorEllipsoidal = js.native
    
    def toNvector(): NvectorEllipsoidal = js.native
  }
  
  @js.native
  class Ned protected () extends js.Object {
    def this(north: Double, east: Double, down: Double) = this()
    
    def bearing: Double = js.native
    
    def elevation: Double = js.native
    
    def length: Double = js.native
    
    def toString(dp: Double): String = js.native
  }
  /* static members */
  @js.native
  object Ned extends js.Object {
    
    def fromDistanceBearingElevation(dist: Double, brng: Double, elev: Double): Ned = js.native
  }
  
  @js.native
  class Nvector protected () extends NvectorEllipsoidal {
    def this(x: Double, y: Double, z: Double) = this()
    def this(x: Double, y: Double, z: Double, h: Double) = this()
    def this(x: Double, y: Double, z: Double, h: js.UndefOr[scala.Nothing], datum: Datum) = this()
    def this(x: Double, y: Double, z: Double, h: Double, datum: Datum) = this()
  }
  
  @js.native
  trait NvectorEllipsoidal extends Vector3d {
    
    def toCartesian(): CartesianNvector = js.native
    
    def toLatLon(): LatLonNvectorEllipsoidal = js.native
    
    def toString(dp: js.UndefOr[scala.Nothing], dpHeight: Double): String = js.native
    def toString(dp: Double, dpHeight: Double): String = js.native
  }
  
  @js.native
  class default () extends LatLonNvectorEllipsoidal
}
