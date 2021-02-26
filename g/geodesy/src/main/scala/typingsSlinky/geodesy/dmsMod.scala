package typingsSlinky.geodesy

import typingsSlinky.geodesy.mod.Dp
import typingsSlinky.geodesy.mod.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dmsMod {
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("geodesy/dms", JSImport.Default)
  @js.native
  class default () extends Dms
  object default {
    
    /* static member */
    @JSImport("geodesy/dms", "default.compassPoint")
    @js.native
    def compassPoint(bearing: Double): String = js.native
    @JSImport("geodesy/dms", "default.compassPoint")
    @js.native
    def compassPoint(bearing: Double, precision: Precision): String = js.native
    
    /* static member */
    @JSImport("geodesy/dms", "default.fromLocale")
    @js.native
    def fromLocale(str: String): String = js.native
    
    /* static member */
    @JSImport("geodesy/dms", "default.parse")
    @js.native
    def parse(dms: String): Double = js.native
    @JSImport("geodesy/dms", "default.parse")
    @js.native
    def parse(dms: Double): Double = js.native
    
    /* static member */
    @JSImport("geodesy/dms", "default.toBrng")
    @js.native
    def toBrng(deg: Double): String = js.native
    @JSImport("geodesy/dms", "default.toBrng")
    @js.native
    def toBrng(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    @JSImport("geodesy/dms", "default.toBrng")
    @js.native
    def toBrng(deg: Double, format: Format): String = js.native
    @JSImport("geodesy/dms", "default.toBrng")
    @js.native
    def toBrng(deg: Double, format: Format, dp: Dp): String = js.native
    
    /* static member */
    @JSImport("geodesy/dms", "default.toDms")
    @js.native
    def toDms(deg: Double): String = js.native
    @JSImport("geodesy/dms", "default.toDms")
    @js.native
    def toDms(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    @JSImport("geodesy/dms", "default.toDms")
    @js.native
    def toDms(deg: Double, format: Format): String = js.native
    @JSImport("geodesy/dms", "default.toDms")
    @js.native
    def toDms(deg: Double, format: Format, dp: Dp): String = js.native
    
    /* static member */
    @JSImport("geodesy/dms", "default.toLat")
    @js.native
    def toLat(deg: Double): String = js.native
    @JSImport("geodesy/dms", "default.toLat")
    @js.native
    def toLat(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    @JSImport("geodesy/dms", "default.toLat")
    @js.native
    def toLat(deg: Double, format: Format): String = js.native
    @JSImport("geodesy/dms", "default.toLat")
    @js.native
    def toLat(deg: Double, format: Format, dp: Dp): String = js.native
    
    /* static member */
    @JSImport("geodesy/dms", "default.toLocale")
    @js.native
    def toLocale(str: String): String = js.native
    
    /* static member */
    @JSImport("geodesy/dms", "default.toLon")
    @js.native
    def toLon(deg: Double): String = js.native
    @JSImport("geodesy/dms", "default.toLon")
    @js.native
    def toLon(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    @JSImport("geodesy/dms", "default.toLon")
    @js.native
    def toLon(deg: Double, format: Format): String = js.native
    @JSImport("geodesy/dms", "default.toLon")
    @js.native
    def toLon(deg: Double, format: Format, dp: Dp): String = js.native
    
    /* static member */
    @JSImport("geodesy/dms", "default.wrap360")
    @js.native
    def wrap360(degrees: Double): String = js.native
    
    /* static member */
    @JSImport("geodesy/dms", "default.wrap90")
    @js.native
    def wrap90(degrees: Double): String = js.native
  }
  
  // tslint:disable-next-line no-unnecessary-class
  @js.native
  trait Dms extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.geodesy.geodesyNumbers.`1`
    - typingsSlinky.geodesy.geodesyNumbers.`2`
    - typingsSlinky.geodesy.geodesyNumbers.`3`
  */
  trait Precision extends StObject
  object Precision {
    
    @scala.inline
    def `1`: typingsSlinky.geodesy.geodesyNumbers.`1` = 1.asInstanceOf[typingsSlinky.geodesy.geodesyNumbers.`1`]
    
    @scala.inline
    def `2`: typingsSlinky.geodesy.geodesyNumbers.`2` = 2.asInstanceOf[typingsSlinky.geodesy.geodesyNumbers.`2`]
    
    @scala.inline
    def `3`: typingsSlinky.geodesy.geodesyNumbers.`3` = 3.asInstanceOf[typingsSlinky.geodesy.geodesyNumbers.`3`]
  }
}
