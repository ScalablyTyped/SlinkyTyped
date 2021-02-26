package typingsSlinky.rxjs

import typingsSlinky.rxjs.connectableObservableMod.ConnectableObservable
import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.typesMod.MonoTypeOperatorFunction
import typingsSlinky.rxjs.typesMod.ObservableInput
import typingsSlinky.rxjs.typesMod.ObservedValueOf
import typingsSlinky.rxjs.typesMod.OperatorFunction
import typingsSlinky.rxjs.typesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publishMod {
  
  @JSImport("rxjs/internal/operators/publish", "publish")
  @js.native
  def publish[T](): UnaryFunction[Observable[T], ConnectableObservable[T]] = js.native
  @JSImport("rxjs/internal/operators/publish", "publish")
  @js.native
  def publish[T](selector: MonoTypeOperatorFunction[T]): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators/publish", "publish")
  @js.native
  def publish_TO_ObservableInputWildcard_OperatorFunction[T, O /* <: ObservableInput[_] */](selector: js.Function1[/* shared */ Observable[T], O]): OperatorFunction[T, ObservedValueOf[O]] = js.native
}
