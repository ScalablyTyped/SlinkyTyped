package typingsSlinky.d3.mod

import typingsSlinky.d3Scale.mod.NumberValue
import typingsSlinky.d3Scale.mod.ScaleDiverging_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "scaleDiverging")
@js.native
object scaleDiverging extends js.Object {
  
  def apply[Output, Unknown](): ScaleDiverging_[Output, Unknown] = js.native
  def apply[Output, Unknown](domain: js.Iterable[NumberValue], interpolator: js.Function1[/* t */ Double, Output]): ScaleDiverging_[Output, Unknown] = js.native
  def apply[Output, Unknown](domain: js.Iterable[NumberValue], interpolator: js.Iterable[Output]): ScaleDiverging_[Output, Unknown] = js.native
  def apply[Output, Unknown](interpolator: js.Function1[/* t */ Double, Output]): ScaleDiverging_[Output, Unknown] = js.native
  def apply[Output, Unknown](interpolator: js.Iterable[Output]): ScaleDiverging_[Output, Unknown] = js.native
}
