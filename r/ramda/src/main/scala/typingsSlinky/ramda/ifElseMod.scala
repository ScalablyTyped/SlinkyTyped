package typingsSlinky.ramda

import typingsSlinky.ramda.toolsMod.Arity1Fn
import typingsSlinky.ramda.toolsMod.Arity2Fn
import typingsSlinky.ramda.toolsMod.Pred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/ifElse", JSImport.Namespace)
@js.native
object ifElseMod extends js.Object {
  def default(fn: Pred, onTrue: Arity1Fn, onFalse: Arity1Fn): Arity1Fn = js.native
  def default(fn: Pred, onTrue: Arity2Fn, onFalse: Arity2Fn): Arity2Fn = js.native
}

