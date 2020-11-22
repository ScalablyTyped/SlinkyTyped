package typingsSlinky.d3.mod

import typingsSlinky.d3Scale.mod.NumberValue
import typingsSlinky.d3Scale.mod.ScaleLogarithmic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "scaleLog")
@js.native
object scaleLog extends js.Object {
  
  def apply[Range, Output, Unknown](): ScaleLogarithmic[Range, Output, Unknown] = js.native
  def apply[Range, Output, Unknown](domain: js.Iterable[NumberValue], range: js.Iterable[Range]): ScaleLogarithmic[Range, Output, Unknown] = js.native
  def apply[Range, Output, Unknown](range: js.Iterable[Range]): ScaleLogarithmic[Range, Output, Unknown] = js.native
}
