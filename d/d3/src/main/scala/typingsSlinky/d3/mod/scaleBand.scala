package typingsSlinky.d3.mod

import typingsSlinky.d3Scale.anon.ToString
import typingsSlinky.d3Scale.mod.NumberValue
import typingsSlinky.d3Scale.mod.ScaleBand_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "scaleBand")
@js.native
object scaleBand extends js.Object {
  
  def apply[Domain /* <: ToString */](): ScaleBand_[Domain] = js.native
  def apply[Domain /* <: ToString */](domain: js.Iterable[Domain], range: js.Iterable[NumberValue]): ScaleBand_[Domain] = js.native
  def apply[Domain /* <: ToString */](range: js.Iterable[NumberValue]): ScaleBand_[Domain] = js.native
}
