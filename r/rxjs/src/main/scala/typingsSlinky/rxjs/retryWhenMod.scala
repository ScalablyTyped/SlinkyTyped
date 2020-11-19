package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.typesMod.MonoTypeOperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/operators/retryWhen", JSImport.Namespace)
@js.native
object retryWhenMod extends js.Object {
  
  def retryWhen[T](notifier: js.Function1[/* errors */ Observable[_], Observable[_]]): MonoTypeOperatorFunction[T] = js.native
}
