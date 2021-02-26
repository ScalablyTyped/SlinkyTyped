package typingsSlinky.imageQ

import typingsSlinky.imageQ.abstractDistanceCalculatorMod.AbstractDistanceCalculator
import typingsSlinky.imageQ.arrayMod.ErrorDiffusionArrayKernel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageMod {
  
  @JSImport("image-q/dist/image", "ErrorDiffusionArray")
  @js.native
  class ErrorDiffusionArray protected ()
    extends typingsSlinky.imageQ.arrayMod.ErrorDiffusionArray {
    def this(colorDistanceCalculator: AbstractDistanceCalculator, kernel: ErrorDiffusionArrayKernel) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      kernel: ErrorDiffusionArrayKernel,
      serpentine: Boolean
    ) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      kernel: ErrorDiffusionArrayKernel,
      serpentine: js.UndefOr[scala.Nothing],
      minimumColorDistanceToDither: Double
    ) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      kernel: ErrorDiffusionArrayKernel,
      serpentine: Boolean,
      minimumColorDistanceToDither: Double
    ) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      kernel: ErrorDiffusionArrayKernel,
      serpentine: js.UndefOr[scala.Nothing],
      minimumColorDistanceToDither: js.UndefOr[scala.Nothing],
      calculateErrorLikeGIMP: Boolean
    ) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      kernel: ErrorDiffusionArrayKernel,
      serpentine: js.UndefOr[scala.Nothing],
      minimumColorDistanceToDither: Double,
      calculateErrorLikeGIMP: Boolean
    ) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      kernel: ErrorDiffusionArrayKernel,
      serpentine: Boolean,
      minimumColorDistanceToDither: js.UndefOr[scala.Nothing],
      calculateErrorLikeGIMP: Boolean
    ) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      kernel: ErrorDiffusionArrayKernel,
      serpentine: Boolean,
      minimumColorDistanceToDither: Double,
      calculateErrorLikeGIMP: Boolean
    ) = this()
  }
  
  @JSImport("image-q/dist/image", "ErrorDiffusionArrayKernel")
  @js.native
  object ErrorDiffusionArrayKernel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.imageQ.arrayMod.ErrorDiffusionArrayKernel with Double] = js.native
    
    /* 3 */ val Atkinson: typingsSlinky.imageQ.arrayMod.ErrorDiffusionArrayKernel.Atkinson with Double = js.native
    
    /* 5 */ val Burkes: typingsSlinky.imageQ.arrayMod.ErrorDiffusionArrayKernel.Burkes with Double = js.native
    
    /* 1 */ val FalseFloydSteinberg: typingsSlinky.imageQ.arrayMod.ErrorDiffusionArrayKernel.FalseFloydSteinberg with Double = js.native
    
    /* 0 */ val FloydSteinberg: typingsSlinky.imageQ.arrayMod.ErrorDiffusionArrayKernel.FloydSteinberg with Double = js.native
    
    /* 4 */ val Jarvis: typingsSlinky.imageQ.arrayMod.ErrorDiffusionArrayKernel.Jarvis with Double = js.native
    
    /* 6 */ val Sierra: typingsSlinky.imageQ.arrayMod.ErrorDiffusionArrayKernel.Sierra with Double = js.native
    
    /* 8 */ val SierraLite: typingsSlinky.imageQ.arrayMod.ErrorDiffusionArrayKernel.SierraLite with Double = js.native
    
    /* 2 */ val Stucki: typingsSlinky.imageQ.arrayMod.ErrorDiffusionArrayKernel.Stucki with Double = js.native
    
    /* 7 */ val TwoSierra: typingsSlinky.imageQ.arrayMod.ErrorDiffusionArrayKernel.TwoSierra with Double = js.native
  }
  
  @JSImport("image-q/dist/image", "ErrorDiffusionRiemersma")
  @js.native
  class ErrorDiffusionRiemersma protected ()
    extends typingsSlinky.imageQ.riemersmaMod.ErrorDiffusionRiemersma {
    def this(colorDistanceCalculator: AbstractDistanceCalculator) = this()
    def this(colorDistanceCalculator: AbstractDistanceCalculator, errorQueueSize: Double) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      errorQueueSize: js.UndefOr[scala.Nothing],
      errorPropagation: Double
    ) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      errorQueueSize: Double,
      errorPropagation: Double
    ) = this()
  }
  
  @JSImport("image-q/dist/image", "NearestColor")
  @js.native
  class NearestColor protected ()
    extends typingsSlinky.imageQ.nearestColorMod.NearestColor {
    def this(colorDistanceCalculator: AbstractDistanceCalculator) = this()
  }
}
