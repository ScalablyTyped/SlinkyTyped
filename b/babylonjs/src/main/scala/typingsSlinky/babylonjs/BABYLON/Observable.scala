package typingsSlinky.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Observable[T] extends StObject {
  
  var _deferUnregister: js.Any = js.native
  
  var _eventState: js.Any = js.native
  
  var _observers: js.Any = js.native
  
  var _onObserverAdded: js.Any = js.native
  
  var _remove: js.Any = js.native
  
  /**
    * Create a new Observer with the specified callback
    * @param callback the callback that will be executed for that Observer
    * @param mask the mask used to filter observers
    * @param insertFirst if true the callback will be inserted at the first position, hence executed before the others ones. If false (default behavior) the callback will be inserted at the last position, executed after all the others already present.
    * @param scope optional scope for the callback to be called from
    * @param unregisterOnFirstCall defines if the observer as to be unregistered after the next notification
    * @returns the new observer created for the callback
    */
  def add(callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit]): Nullable[Observer[T]] = js.native
  def add(
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
    mask: js.UndefOr[scala.Nothing],
    insertFirst: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    unregisterOnFirstCall: Boolean
  ): Nullable[Observer[T]] = js.native
  def add(
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
    mask: js.UndefOr[scala.Nothing],
    insertFirst: js.UndefOr[scala.Nothing],
    scope: js.Any
  ): Nullable[Observer[T]] = js.native
  def add(
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
    mask: js.UndefOr[scala.Nothing],
    insertFirst: js.UndefOr[scala.Nothing],
    scope: js.Any,
    unregisterOnFirstCall: Boolean
  ): Nullable[Observer[T]] = js.native
  def add(
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
    mask: js.UndefOr[scala.Nothing],
    insertFirst: Boolean
  ): Nullable[Observer[T]] = js.native
  def add(
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
    mask: js.UndefOr[scala.Nothing],
    insertFirst: Boolean,
    scope: js.UndefOr[scala.Nothing],
    unregisterOnFirstCall: Boolean
  ): Nullable[Observer[T]] = js.native
  def add(
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
    mask: js.UndefOr[scala.Nothing],
    insertFirst: Boolean,
    scope: js.Any
  ): Nullable[Observer[T]] = js.native
  def add(
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
    mask: js.UndefOr[scala.Nothing],
    insertFirst: Boolean,
    scope: js.Any,
    unregisterOnFirstCall: Boolean
  ): Nullable[Observer[T]] = js.native
  def add(callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit], mask: Double): Nullable[Observer[T]] = js.native
  def add(
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
    mask: Double,
    insertFirst: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    unregisterOnFirstCall: Boolean
  ): Nullable[Observer[T]] = js.native
  def add(
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
    mask: Double,
    insertFirst: js.UndefOr[scala.Nothing],
    scope: js.Any
  ): Nullable[Observer[T]] = js.native
  def add(
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
    mask: Double,
    insertFirst: js.UndefOr[scala.Nothing],
    scope: js.Any,
    unregisterOnFirstCall: Boolean
  ): Nullable[Observer[T]] = js.native
  def add(
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
    mask: Double,
    insertFirst: Boolean
  ): Nullable[Observer[T]] = js.native
  def add(
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
    mask: Double,
    insertFirst: Boolean,
    scope: js.UndefOr[scala.Nothing],
    unregisterOnFirstCall: Boolean
  ): Nullable[Observer[T]] = js.native
  def add(
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
    mask: Double,
    insertFirst: Boolean,
    scope: js.Any
  ): Nullable[Observer[T]] = js.native
  def add(
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
    mask: Double,
    insertFirst: Boolean,
    scope: js.Any,
    unregisterOnFirstCall: Boolean
  ): Nullable[Observer[T]] = js.native
  
  /**
    * Create a new Observer with the specified callback and unregisters after the next notification
    * @param callback the callback that will be executed for that Observer
    * @returns the new observer created for the callback
    */
  def addOnce(callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit]): Nullable[Observer[T]] = js.native
  
  /**
    * Clear the list of observers
    */
  def clear(): Unit = js.native
  
  /**
    * Gets a boolean indicating if the observable has at least one observer
    * @returns true is the Observable has at least one Observer registered
    */
  def hasObservers(): Boolean = js.native
  
  /**
    * Does this observable handles observer registered with a given mask
    * @param mask defines the mask to be tested
    * @return whether or not one observer registered with the given mask is handeled
    **/
  def hasSpecificMask(): Boolean = js.native
  def hasSpecificMask(mask: Double): Boolean = js.native
  
  /**
    * Moves the observable to the bottom of the observer list making it get called last when notified
    * @param observer the observer to move
    */
  def makeObserverBottomPriority(observer: Observer[T]): Unit = js.native
  
  /**
    * Moves the observable to the top of the observer list making it get called first when notified
    * @param observer the observer to move
    */
  def makeObserverTopPriority(observer: Observer[T]): Unit = js.native
  
  /**
    * Notify a specific observer
    * @param observer defines the observer to notify
    * @param eventData defines the data to be sent to each callback
    * @param mask is used to filter observers defaults to -1
    */
  def notifyObserver(observer: Observer[T], eventData: T): Unit = js.native
  def notifyObserver(observer: Observer[T], eventData: T, mask: Double): Unit = js.native
  
  /**
    * Notify all Observers by calling their respective callback with the given data
    * Will return true if all observers were executed, false if an observer set skipNextObservers to true, then prevent the subsequent ones to execute
    * @param eventData defines the data to send to all observers
    * @param mask defines the mask of the current notification (observers with incompatible mask (ie mask & observer.mask === 0) will not be notified)
    * @param target defines the original target of the state
    * @param currentTarget defines the current target of the state
    * @param userInfo defines any user info to send to observers
    * @returns false if the complete observer chain was not processed (because one observer set the skipNextObservers to true)
    */
  def notifyObservers(eventData: T): Boolean = js.native
  def notifyObservers(
    eventData: T,
    mask: js.UndefOr[scala.Nothing],
    target: js.UndefOr[scala.Nothing],
    currentTarget: js.UndefOr[scala.Nothing],
    userInfo: js.Any
  ): Boolean = js.native
  def notifyObservers(
    eventData: T,
    mask: js.UndefOr[scala.Nothing],
    target: js.UndefOr[scala.Nothing],
    currentTarget: js.Any
  ): Boolean = js.native
  def notifyObservers(
    eventData: T,
    mask: js.UndefOr[scala.Nothing],
    target: js.UndefOr[scala.Nothing],
    currentTarget: js.Any,
    userInfo: js.Any
  ): Boolean = js.native
  def notifyObservers(eventData: T, mask: js.UndefOr[scala.Nothing], target: js.Any): Boolean = js.native
  def notifyObservers(
    eventData: T,
    mask: js.UndefOr[scala.Nothing],
    target: js.Any,
    currentTarget: js.UndefOr[scala.Nothing],
    userInfo: js.Any
  ): Boolean = js.native
  def notifyObservers(eventData: T, mask: js.UndefOr[scala.Nothing], target: js.Any, currentTarget: js.Any): Boolean = js.native
  def notifyObservers(
    eventData: T,
    mask: js.UndefOr[scala.Nothing],
    target: js.Any,
    currentTarget: js.Any,
    userInfo: js.Any
  ): Boolean = js.native
  def notifyObservers(eventData: T, mask: Double): Boolean = js.native
  def notifyObservers(
    eventData: T,
    mask: Double,
    target: js.UndefOr[scala.Nothing],
    currentTarget: js.UndefOr[scala.Nothing],
    userInfo: js.Any
  ): Boolean = js.native
  def notifyObservers(eventData: T, mask: Double, target: js.UndefOr[scala.Nothing], currentTarget: js.Any): Boolean = js.native
  def notifyObservers(
    eventData: T,
    mask: Double,
    target: js.UndefOr[scala.Nothing],
    currentTarget: js.Any,
    userInfo: js.Any
  ): Boolean = js.native
  def notifyObservers(eventData: T, mask: Double, target: js.Any): Boolean = js.native
  def notifyObservers(
    eventData: T,
    mask: Double,
    target: js.Any,
    currentTarget: js.UndefOr[scala.Nothing],
    userInfo: js.Any
  ): Boolean = js.native
  def notifyObservers(eventData: T, mask: Double, target: js.Any, currentTarget: js.Any): Boolean = js.native
  def notifyObservers(eventData: T, mask: Double, target: js.Any, currentTarget: js.Any, userInfo: js.Any): Boolean = js.native
  
  /**
    * Calling this will execute each callback, expecting it to be a promise or return a value.
    * If at any point in the chain one function fails, the promise will fail and the execution will not continue.
    * This is useful when a chain of events (sometimes async events) is needed to initialize a certain object
    * and it is crucial that all callbacks will be executed.
    * The order of the callbacks is kept, callbacks are not executed parallel.
    *
    * @param eventData The data to be sent to each callback
    * @param mask is used to filter observers defaults to -1
    * @param target defines the callback target (see EventState)
    * @param currentTarget defines he current object in the bubbling phase
    * @param userInfo defines any user info to send to observers
    * @returns {Promise<T>} will return a Promise than resolves when all callbacks executed successfully.
    */
  def notifyObserversWithPromise(eventData: T): js.Promise[T] = js.native
  def notifyObserversWithPromise(
    eventData: T,
    mask: js.UndefOr[scala.Nothing],
    target: js.UndefOr[scala.Nothing],
    currentTarget: js.UndefOr[scala.Nothing],
    userInfo: js.Any
  ): js.Promise[T] = js.native
  def notifyObserversWithPromise(
    eventData: T,
    mask: js.UndefOr[scala.Nothing],
    target: js.UndefOr[scala.Nothing],
    currentTarget: js.Any
  ): js.Promise[T] = js.native
  def notifyObserversWithPromise(
    eventData: T,
    mask: js.UndefOr[scala.Nothing],
    target: js.UndefOr[scala.Nothing],
    currentTarget: js.Any,
    userInfo: js.Any
  ): js.Promise[T] = js.native
  def notifyObserversWithPromise(eventData: T, mask: js.UndefOr[scala.Nothing], target: js.Any): js.Promise[T] = js.native
  def notifyObserversWithPromise(
    eventData: T,
    mask: js.UndefOr[scala.Nothing],
    target: js.Any,
    currentTarget: js.UndefOr[scala.Nothing],
    userInfo: js.Any
  ): js.Promise[T] = js.native
  def notifyObserversWithPromise(eventData: T, mask: js.UndefOr[scala.Nothing], target: js.Any, currentTarget: js.Any): js.Promise[T] = js.native
  def notifyObserversWithPromise(
    eventData: T,
    mask: js.UndefOr[scala.Nothing],
    target: js.Any,
    currentTarget: js.Any,
    userInfo: js.Any
  ): js.Promise[T] = js.native
  def notifyObserversWithPromise(eventData: T, mask: Double): js.Promise[T] = js.native
  def notifyObserversWithPromise(
    eventData: T,
    mask: Double,
    target: js.UndefOr[scala.Nothing],
    currentTarget: js.UndefOr[scala.Nothing],
    userInfo: js.Any
  ): js.Promise[T] = js.native
  def notifyObserversWithPromise(eventData: T, mask: Double, target: js.UndefOr[scala.Nothing], currentTarget: js.Any): js.Promise[T] = js.native
  def notifyObserversWithPromise(
    eventData: T,
    mask: Double,
    target: js.UndefOr[scala.Nothing],
    currentTarget: js.Any,
    userInfo: js.Any
  ): js.Promise[T] = js.native
  def notifyObserversWithPromise(eventData: T, mask: Double, target: js.Any): js.Promise[T] = js.native
  def notifyObserversWithPromise(
    eventData: T,
    mask: Double,
    target: js.Any,
    currentTarget: js.UndefOr[scala.Nothing],
    userInfo: js.Any
  ): js.Promise[T] = js.native
  def notifyObserversWithPromise(eventData: T, mask: Double, target: js.Any, currentTarget: js.Any): js.Promise[T] = js.native
  def notifyObserversWithPromise(eventData: T, mask: Double, target: js.Any, currentTarget: js.Any, userInfo: js.Any): js.Promise[T] = js.native
  
  /**
    * Gets the list of observers
    */
  def observers: js.Array[Observer[T]] = js.native
  
  /**
    * Remove an Observer from the Observable object
    * @param observer the instance of the Observer to remove
    * @returns false if it doesn't belong to this Observable
    */
  def remove(observer: Nullable[Observer[T]]): Boolean = js.native
  
  /**
    * Remove a callback from the Observable object
    * @param callback the callback to remove
    * @param scope optional scope. If used only the callbacks with this scope will be removed
    * @returns false if it doesn't belong to this Observable
    */
  def removeCallback(callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit]): Boolean = js.native
  def removeCallback(callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit], scope: js.Any): Boolean = js.native
}
