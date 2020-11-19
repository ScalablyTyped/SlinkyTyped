package typingsSlinky.obliterator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("obliterator/filter", JSImport.Namespace)
@js.native
object filterMod extends js.Object {
  
  def default[T](predicate: PredicateFunction[T], iterator: js.Iterator[T]): typingsSlinky.obliterator.iteratorMod.default[T] = js.native
  
  type PredicateFunction[T] = js.Function1[/* item */ T, Boolean]
}
