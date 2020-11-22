package typingsSlinky.d3.mod

import typingsSlinky.d3Scale.anon.ToString
import typingsSlinky.d3Scale.mod.NumberValue
import typingsSlinky.d3Scale.mod.ScalePoint_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "scalePoint")
@js.native
object scalePoint extends js.Object {
  
  def apply[Domain /* <: ToString */](): ScalePoint_[Domain] = js.native
  def apply[Domain /* <: ToString */](domain: js.Iterable[Domain], range: js.Iterable[NumberValue]): ScalePoint_[Domain] = js.native
  def apply[Domain /* <: ToString */](range: js.Iterable[NumberValue]): ScalePoint_[Domain] = js.native
}
