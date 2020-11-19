package typingsSlinky.plottable

import typingsSlinky.plottable.quantitativeScaleMod.QuantitativeScale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable/build/src/scales/logScale", JSImport.Namespace)
@js.native
object logScaleMod extends js.Object {
  
  @js.native
  /**
    * @constructor
    */
  class Log () extends QuantitativeScale[Double] {
    def this(base: Double) = this()
    
    var _d3Scale: js.Any = js.native
  }
}
