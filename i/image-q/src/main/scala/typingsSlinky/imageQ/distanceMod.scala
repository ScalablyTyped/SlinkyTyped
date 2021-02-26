package typingsSlinky.imageQ

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distanceMod {
  
  @JSImport("image-q/dist/distance", "AbstractDistanceCalculator")
  @js.native
  abstract class AbstractDistanceCalculator ()
    extends typingsSlinky.imageQ.abstractDistanceCalculatorMod.AbstractDistanceCalculator
  
  @JSImport("image-q/dist/distance", "AbstractEuclidean")
  @js.native
  class AbstractEuclidean ()
    extends typingsSlinky.imageQ.euclideanMod.AbstractEuclidean
  
  @JSImport("image-q/dist/distance", "AbstractManhattan")
  @js.native
  abstract class AbstractManhattan ()
    extends typingsSlinky.imageQ.manhattanMod.AbstractManhattan
  
  @JSImport("image-q/dist/distance", "CIE94GraphicArts")
  @js.native
  class CIE94GraphicArts ()
    extends typingsSlinky.imageQ.cie94Mod.CIE94GraphicArts
  
  @JSImport("image-q/dist/distance", "CIE94Textiles")
  @js.native
  class CIE94Textiles ()
    extends typingsSlinky.imageQ.cie94Mod.CIE94Textiles
  
  @JSImport("image-q/dist/distance", "CIEDE2000")
  @js.native
  class CIEDE2000 ()
    extends typingsSlinky.imageQ.ciede2000Mod.CIEDE2000
  /* static members */
  object CIEDE2000 {
    
    @JSImport("image-q/dist/distance", "CIEDE2000._calculateRT")
    @js.native
    def _calculateRT(ahp: js.Any, aCp: js.Any): js.Any = js.native
    
    @JSImport("image-q/dist/distance", "CIEDE2000._calculateT")
    @js.native
    def _calculateT(ahp: js.Any): js.Any = js.native
    
    @JSImport("image-q/dist/distance", "CIEDE2000._calculate_ahp")
    @js.native
    def _calculate_ahp(C1pC2p: js.Any, h_bar: js.Any, h1p: js.Any, h2p: js.Any): js.Any = js.native
    
    @JSImport("image-q/dist/distance", "CIEDE2000._calculate_dHp")
    @js.native
    def _calculate_dHp(C1pC2p: js.Any, h_bar: js.Any, h2p: js.Any, h1p: js.Any): js.Any = js.native
    
    @JSImport("image-q/dist/distance", "CIEDE2000._calculatehp")
    @js.native
    def _calculatehp(b: js.Any, ap: js.Any): js.Any = js.native
    
    @JSImport("image-q/dist/distance", "CIEDE2000._deg180InRad")
    @js.native
    val _deg180InRad: js.Any = js.native
    
    @JSImport("image-q/dist/distance", "CIEDE2000._deg25InRad")
    @js.native
    val _deg25InRad: js.Any = js.native
    
    @JSImport("image-q/dist/distance", "CIEDE2000._deg275InRad")
    @js.native
    val _deg275InRad: js.Any = js.native
    
    @JSImport("image-q/dist/distance", "CIEDE2000._deg30InRad")
    @js.native
    val _deg30InRad: js.Any = js.native
    
    @JSImport("image-q/dist/distance", "CIEDE2000._deg360InRad")
    @js.native
    val _deg360InRad: js.Any = js.native
    
    @JSImport("image-q/dist/distance", "CIEDE2000._deg63InRad")
    @js.native
    val _deg63InRad: js.Any = js.native
    
    @JSImport("image-q/dist/distance", "CIEDE2000._deg6InRad")
    @js.native
    val _deg6InRad: js.Any = js.native
    
    /**
      * Weight in distance: 0.25
      * Max DeltaE: 100
      * Max DeltaA: 255
      */
    @JSImport("image-q/dist/distance", "CIEDE2000._kA")
    @js.native
    val _kA: js.Any = js.native
    
    @JSImport("image-q/dist/distance", "CIEDE2000._pow25to7")
    @js.native
    val _pow25to7: js.Any = js.native
  }
  
  @JSImport("image-q/dist/distance", "CMETRIC")
  @js.native
  class CMETRIC ()
    extends typingsSlinky.imageQ.cmetricMod.CMETRIC
  
  @JSImport("image-q/dist/distance", "Euclidean")
  @js.native
  class Euclidean ()
    extends typingsSlinky.imageQ.euclideanMod.Euclidean
  
  @JSImport("image-q/dist/distance", "EuclideanRgbQuantWOAlpha")
  @js.native
  class EuclideanRgbQuantWOAlpha ()
    extends typingsSlinky.imageQ.euclideanMod.EuclideanRgbQuantWOAlpha
  
  @JSImport("image-q/dist/distance", "EuclideanRgbQuantWithAlpha")
  @js.native
  class EuclideanRgbQuantWithAlpha ()
    extends typingsSlinky.imageQ.euclideanMod.EuclideanRgbQuantWithAlpha
  
  @JSImport("image-q/dist/distance", "Manhattan")
  @js.native
  class Manhattan ()
    extends typingsSlinky.imageQ.manhattanMod.Manhattan
  
  @JSImport("image-q/dist/distance", "ManhattanNommyde")
  @js.native
  class ManhattanNommyde ()
    extends typingsSlinky.imageQ.manhattanMod.ManhattanNommyde
  
  @JSImport("image-q/dist/distance", "ManhattanSRGB")
  @js.native
  class ManhattanSRGB ()
    extends typingsSlinky.imageQ.manhattanMod.ManhattanSRGB
  
  @JSImport("image-q/dist/distance", "PNGQUANT")
  @js.native
  class PNGQUANT ()
    extends typingsSlinky.imageQ.pngQuantMod.PNGQUANT
}
