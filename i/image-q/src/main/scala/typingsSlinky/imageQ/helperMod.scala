package typingsSlinky.imageQ

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.imageQ.abstractDistanceCalculatorMod.AbstractDistanceCalculator
import typingsSlinky.imageQ.commonMod.IImageDitherer
import typingsSlinky.imageQ.paletteCommonMod.IPaletteQuantizer
import typingsSlinky.imageQ.pointContainerMod.PointContainer
import typingsSlinky.imageQ.utilsPaletteMod.Palette
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("image-q/dist/helper", JSImport.Namespace)
@js.native
object helperMod extends js.Object {
  
  @js.native
  class IQ protected () extends js.Object {
    def this(
      colors: Double,
      DistanceCalculator: Instantiable0[AbstractDistanceCalculator],
      Quantizer: Instantiable2[
            /* distanceCalculator */ AbstractDistanceCalculator, 
            /* color */ Double, 
            IPaletteQuantizer
          ],
      ditherer: IImageDitherer
    ) = this()
    
    def buildImage(image: PointContainer, palette: Palette): PointContainer = js.native
    
    def buildPalette(): Palette = js.native
    
    def compare(image1: PointContainer, image2: PointContainer): Double = js.native
    
    var distanceCalculator: js.Any = js.native
    
    var ditherer: js.Any = js.native
    
    var paletteQuantizer: js.Any = js.native
    
    def sample(image: PointContainer): Unit = js.native
  }
}
