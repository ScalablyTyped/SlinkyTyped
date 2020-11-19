package typingsSlinky.esfxCancelable.distMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cancelable extends js.Object
@JSImport("@esfx/cancelable/dist", "Cancelable")
@js.native
object Cancelable extends js.Object {
  
  /**
    * A well-known symbol used to define a method to retrieve the `CancelSignal` for an object.
    */
  val cancelSignal: js.Symbol = js.native
  
  /**
    * A `Cancelable` that is already signaled.
    */
  val canceled: CancelableCancelSignal = js.native
  
  /**
    * Determines whether a value is a `Cancelable` object.
    */
  def hasInstance(value: js.Any): /* is @esfx/cancelable.@esfx/cancelable/dist.Cancelable */ Boolean = js.native
  
  /**
    * Determines whether a value is a `Cancelable` object.
    * @deprecated Use `Cancelable.hasInstance` instead.
    */
  def isCancelable(value: js.Any): /* is @esfx/cancelable.@esfx/cancelable/dist.Cancelable */ Boolean = js.native
  
  /**
    * Determines whether `cancelable` is in the signaled state.
    */
  def isSignaled(): Boolean = js.native
  def isSignaled(cancelable: Cancelable): Boolean = js.native
  
  val name: /* "Cancelable" */ String = js.native
  
  /**
    * A `Cancelable` that can never be signaled.
    */
  val none: CancelableCancelSignal = js.native
  
  def subscribe(cancelable: js.UndefOr[scala.Nothing], onSignaled: js.Function0[Unit]): CancelSubscription = js.native
  /**
    * Subscribes to be notified when a `cancelable` becomes signaled.
    */
  def subscribe(cancelable: Cancelable, onSignaled: js.Function0[Unit]): CancelSubscription = js.native
  
  /**
    * Throws a `CancelError` exception if the provided `cancelable` is in the signaled state.
    */
  def throwIfSignaled(): Unit = js.native
  def throwIfSignaled(cancelable: Cancelable): Unit = js.native
}
