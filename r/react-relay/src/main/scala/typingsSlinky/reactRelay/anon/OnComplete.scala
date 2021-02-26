package typingsSlinky.reactRelay.anon

import typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.VariablesOf
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnComplete[TQuery /* <: OperationType */] extends StObject {
  
  var UNSTABLE_extraVariables: js.UndefOr[Partial[VariablesOf[TQuery]]] = js.native
  
  var onComplete: js.UndefOr[js.Function1[/* arg */ js.Error | Null, Unit]] = js.native
}
object OnComplete {
  
  @scala.inline
  def apply[TQuery /* <: OperationType */](): OnComplete[TQuery] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnComplete[TQuery]]
  }
  
  @scala.inline
  implicit class OnCompleteMutableBuilder[Self <: OnComplete[_], TQuery /* <: OperationType */] (val x: Self with OnComplete[TQuery]) extends AnyVal {
    
    @scala.inline
    def setOnComplete(value: /* arg */ js.Error | Null => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
    @scala.inline
    def setUNSTABLE_extraVariables(value: Partial[VariablesOf[TQuery]]): Self = StObject.set(x, "UNSTABLE_extraVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNSTABLE_extraVariablesUndefined: Self = StObject.set(x, "UNSTABLE_extraVariables", js.undefined)
  }
}
