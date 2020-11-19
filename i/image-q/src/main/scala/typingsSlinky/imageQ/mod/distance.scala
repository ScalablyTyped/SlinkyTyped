package typingsSlinky.imageQ.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("image-q", "distance")
@js.native
object distance extends js.Object {
  
  @js.native
  abstract class AbstractDistanceCalculator ()
    extends typingsSlinky.imageQ.distanceMod.AbstractDistanceCalculator
  
  @js.native
  class AbstractEuclidean ()
    extends typingsSlinky.imageQ.euclideanMod.AbstractEuclidean
  
  @js.native
  abstract class AbstractManhattan ()
    extends typingsSlinky.imageQ.manhattanMod.AbstractManhattan
  
  @js.native
  class CIE94GraphicArts ()
    extends typingsSlinky.imageQ.cie94Mod.CIE94GraphicArts
  
  @js.native
  class CIE94Textiles ()
    extends typingsSlinky.imageQ.cie94Mod.CIE94Textiles
  
  @js.native
  class CIEDE2000 ()
    extends typingsSlinky.imageQ.distanceMod.CIEDE2000
  /* static members */
  @js.native
  object CIEDE2000 extends js.Object {
    
    /* private */ def _calculateRT(ahp: js.Any, aCp: js.Any): js.Any = js.native
    
    /* private */ def _calculateT(ahp: js.Any): js.Any = js.native
    
    /* private */ def _calculate_ahp(C1pC2p: js.Any, h_bar: js.Any, h1p: js.Any, h2p: js.Any): js.Any = js.native
    
    /* private */ def _calculate_dHp(C1pC2p: js.Any, h_bar: js.Any, h2p: js.Any, h1p: js.Any): js.Any = js.native
    
    /* private */ def _calculatehp(b: js.Any, ap: js.Any): js.Any = js.native
    
    val _deg180InRad: js.Any = js.native
    
    val _deg25InRad: js.Any = js.native
    
    val _deg275InRad: js.Any = js.native
    
    val _deg30InRad: js.Any = js.native
    
    val _deg360InRad: js.Any = js.native
    
    val _deg63InRad: js.Any = js.native
    
    val _deg6InRad: js.Any = js.native
    
    /**
      * Weight in distance: 0.25
      * Max DeltaE: 100
      * Max DeltaA: 255
      */
    val _kA: js.Any = js.native
    
    val _pow25to7: js.Any = js.native
  }
  
  @js.native
  class CMETRIC ()
    extends typingsSlinky.imageQ.cmetricMod.CMETRIC
  
  @js.native
  class Euclidean ()
    extends typingsSlinky.imageQ.euclideanMod.Euclidean
  
  @js.native
  class EuclideanRgbQuantWOAlpha ()
    extends typingsSlinky.imageQ.euclideanMod.EuclideanRgbQuantWOAlpha
  
  @js.native
  class EuclideanRgbQuantWithAlpha ()
    extends typingsSlinky.imageQ.euclideanMod.EuclideanRgbQuantWithAlpha
  
  @js.native
  class Manhattan ()
    extends typingsSlinky.imageQ.manhattanMod.Manhattan
  
  @js.native
  class ManhattanNommyde ()
    extends typingsSlinky.imageQ.manhattanMod.ManhattanNommyde
  
  @js.native
  class ManhattanSRGB ()
    extends typingsSlinky.imageQ.manhattanMod.ManhattanSRGB
  
  @js.native
  class PNGQUANT ()
    extends typingsSlinky.imageQ.pngQuantMod.PNGQUANT
}
