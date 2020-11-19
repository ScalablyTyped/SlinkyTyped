package typingsSlinky.imageQ

import typingsSlinky.imageQ.abstractDistanceCalculatorMod.AbstractDistanceCalculator
import typingsSlinky.imageQ.paletteCommonMod.IPaletteQuantizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("image-q/dist/palette/rgbquant/rgbquant", JSImport.Namespace)
@js.native
object rgbquantMod extends js.Object {
  
  @js.native
  class RGBQuant protected () extends IPaletteQuantizer {
    def this(colorDistanceCalculator: AbstractDistanceCalculator) = this()
    def this(colorDistanceCalculator: AbstractDistanceCalculator, colors: Double) = this()
    def this(
      colorDistanceCalculator: AbstractDistanceCalculator,
      colors: js.UndefOr[scala.Nothing],
      method: Double
    ) = this()
    def this(colorDistanceCalculator: AbstractDistanceCalculator, colors: Double, method: Double) = this()
    
    /* private */ def _buildPalette(idxi32: js.Any): js.Any = js.native
    
    val _colors: js.Any = js.native
    
    val _distance: js.Any = js.native
    
    val _distanceIncrement: js.Any = js.native
    
    val _histogram: js.Any = js.native
    
    val _initialDistance: js.Any = js.native
  }
}
