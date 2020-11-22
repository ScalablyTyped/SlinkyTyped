package typingsSlinky.d3.mod

import typingsSlinky.d3Scale.mod.NumberValue
import typingsSlinky.d3Scale.mod.ScaleTime_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "scaleTime")
@js.native
object scaleTime extends js.Object {
  
  def apply[Range, Output, Unknown](): ScaleTime_[Range, Output, Unknown] = js.native
  def apply[Range, Output, Unknown](domain: js.Iterable[js.Date | NumberValue], range: js.Iterable[Range]): ScaleTime_[Range, Output, Unknown] = js.native
  def apply[Range, Output, Unknown](range: js.Iterable[Range]): ScaleTime_[Range, Output, Unknown] = js.native
}
