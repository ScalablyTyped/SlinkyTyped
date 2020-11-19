package typingsSlinky.imageQ

import typingsSlinky.imageQ.abstractDistanceCalculatorMod.AbstractDistanceCalculator
import typingsSlinky.imageQ.commonMod.IImageDitherer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("image-q/dist/image/nearestColor", JSImport.Namespace)
@js.native
object nearestColorMod extends js.Object {
  
  @js.native
  class NearestColor protected () extends IImageDitherer {
    def this(colorDistanceCalculator: AbstractDistanceCalculator) = this()
    
    var _distance: js.Any = js.native
  }
}
