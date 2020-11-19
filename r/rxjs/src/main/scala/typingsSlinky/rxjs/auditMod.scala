package typingsSlinky.rxjs

import typingsSlinky.rxjs.typesMod.MonoTypeOperatorFunction
import typingsSlinky.rxjs.typesMod.SubscribableOrPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/operators/audit", JSImport.Namespace)
@js.native
object auditMod extends js.Object {
  
  def audit[T](durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[_]]): MonoTypeOperatorFunction[T] = js.native
}
