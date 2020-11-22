package typingsSlinky.d3.mod

import typingsSlinky.d3Scale.mod.NumberValue
import typingsSlinky.d3Scale.mod.ScaleSequentialQuantile_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "scaleSequentialQuantile")
@js.native
object scaleSequentialQuantile extends js.Object {
  
  def apply[Output, Unknown](): ScaleSequentialQuantile_[Output, Unknown] = js.native
  def apply[Output, Unknown](domain: js.Iterable[NumberValue], interpolator: js.Function1[/* t */ Double, Output]): ScaleSequentialQuantile_[Output, Unknown] = js.native
  def apply[Output, Unknown](interpolator: js.Function1[/* t */ Double, Output]): ScaleSequentialQuantile_[Output, Unknown] = js.native
}
