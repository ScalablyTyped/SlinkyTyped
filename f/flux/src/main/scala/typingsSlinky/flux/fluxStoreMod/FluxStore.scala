package typingsSlinky.flux.fluxStoreMod

import typingsSlinky.fbemitter.mod.EventEmitter
import typingsSlinky.fbemitter.mod.EventSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents the most basic functionality for a FluxStore. Do not
  * extend this store directly; instead extend FluxReduceStore when creating a
  * new store.
  */
@js.native
trait FluxStore[TPayload] extends js.Object {
  var __changeEvent: String = js.native
  var __changed: Boolean = js.native
  var __className: String = js.native
  var __dispatcher: typingsSlinky.flux.dispatcherMod.^[TPayload] = js.native
  var __emitter: EventEmitter = js.native
  /**
    * Emit an event notifying all listeners that this store has changed.
    * This can only be invoked when dispatching.
    * Changes are de-duplicated and resolved at the end of this store's __onDispatch function.
    */
  /* protected */ def __emitChange(): Unit = js.native
  /**
    * This method encapsulates all logic for invoking __onDispatch. It should
    * be used for things like catching changes and emitting them after the
    * subclass has handled a payload.
    */
  /* protected */ def __invokeOnDispatch(payload: TPayload): Unit = js.native
  /**
    * Subclasses must override this method.
    * This is how the store receives actions from the dispatcher.
    * All state mutation logic must be done during this method.
    */
  /* protected */ def __onDispatch(payload: TPayload): Unit = js.native
  /**
    * Adds a listener to the store, when the store changes the given callback will be called.
    * A token is returned that can be used to remove the listener.
    * Calling the remove() function on the returned token will remove the listener.
    */
  def addListener(callback: js.Function0[Unit]): EventSubscription = js.native
  /**
    * Returns the dispatch token that the dispatcher recognizes this store by.
    * Can be used to waitFor() this store.
    */
  def getDispatchToken(): String = js.native
  /**
    * Returns the dispatcher this store is registered with.
    */
  def getDispatcher(): typingsSlinky.flux.dispatcherMod.^[TPayload] = js.native
  /**
    * Ask if a store has changed during the current dispatch.
    * Can only be invoked while dispatching.
    * This can be used for constructing derived stores that depend on data from other stores.
    */
  def hasChanged(): Boolean = js.native
}

object FluxStore {
  @scala.inline
  def apply[TPayload](
    __changeEvent: String,
    __changed: Boolean,
    __className: String,
    __dispatcher: typingsSlinky.flux.dispatcherMod.^[TPayload],
    __emitChange: () => Unit,
    __emitter: EventEmitter,
    __invokeOnDispatch: TPayload => Unit,
    __onDispatch: TPayload => Unit,
    addListener: js.Function0[Unit] => EventSubscription,
    getDispatchToken: () => String,
    getDispatcher: () => typingsSlinky.flux.dispatcherMod.^[TPayload],
    hasChanged: () => Boolean
  ): FluxStore[TPayload] = {
    val __obj = js.Dynamic.literal(__changeEvent = __changeEvent.asInstanceOf[js.Any], __changed = __changed.asInstanceOf[js.Any], __className = __className.asInstanceOf[js.Any], __dispatcher = __dispatcher.asInstanceOf[js.Any], __emitChange = js.Any.fromFunction0(__emitChange), __emitter = __emitter.asInstanceOf[js.Any], __invokeOnDispatch = js.Any.fromFunction1(__invokeOnDispatch), __onDispatch = js.Any.fromFunction1(__onDispatch), addListener = js.Any.fromFunction1(addListener), getDispatchToken = js.Any.fromFunction0(getDispatchToken), getDispatcher = js.Any.fromFunction0(getDispatcher), hasChanged = js.Any.fromFunction0(hasChanged))
    __obj.asInstanceOf[FluxStore[TPayload]]
  }
  @scala.inline
  implicit class FluxStoreOps[Self[tpayload] <: FluxStore[tpayload], TPayload] (val x: Self[TPayload]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TPayload] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TPayload]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TPayload] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TPayload] with Other]
    @scala.inline
    def with__changeEvent(value: String): Self[TPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__changeEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with__changed(value: Boolean): Self[TPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with__className(value: String): Self[TPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with__dispatcher(value: typingsSlinky.flux.dispatcherMod.^[TPayload]): Self[TPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__dispatcher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with__emitChange(value: () => Unit): Self[TPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__emitChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with__emitter(value: EventEmitter): Self[TPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__emitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with__invokeOnDispatch(value: TPayload => Unit): Self[TPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__invokeOnDispatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with__onDispatch(value: TPayload => Unit): Self[TPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__onDispatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddListener(value: js.Function0[Unit] => EventSubscription): Self[TPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDispatchToken(value: () => String): Self[TPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDispatchToken")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDispatcher(value: () => typingsSlinky.flux.dispatcherMod.^[TPayload]): Self[TPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDispatcher")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasChanged(value: () => Boolean): Self[TPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChanged")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

