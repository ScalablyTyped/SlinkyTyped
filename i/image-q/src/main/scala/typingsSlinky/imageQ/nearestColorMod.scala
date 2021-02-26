package typingsSlinky.imageQ

import typingsSlinky.imageQ.abstractDistanceCalculatorMod.AbstractDistanceCalculator
import typingsSlinky.imageQ.commonMod.IImageDitherer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nearestColorMod {
  
  @JSImport("image-q/dist/image/nearestColor", "NearestColor")
  @js.native
  class NearestColor protected () extends IImageDitherer {
    def this(colorDistanceCalculator: AbstractDistanceCalculator) = this()
    
    var _distance: js.Any = js.native
  }
}
