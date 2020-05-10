package typingsSlinky.nuclearJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stores are initialized like:
  *
  * ```
  * new Store({
  *   initialize() { ... },
  *   getInitialState() { ... },
  * })
  * ```
  *
  * This type defines the functions for the object passed to the
  * `new Store()` constructor. In additional, all of these functions are
  * available on the base `Store` object itself.
  */
@js.native
trait StoreLike[T] extends js.Object {
  /**
    * Deserializes plain JavaScript to store state.
    */
  var deserialize: js.UndefOr[js.ThisFunction1[/* this */ Store[T], /* state */ js.Any, T]] = js.native
  /**
    * Pure function taking the current state of store and returning the new
    * state after a NuclearJS reactor has been reset
    */
  var handleReset: js.UndefOr[js.ThisFunction1[/* this */ Store[T], /* state */ T, T]] = js.native
  /**
    * Serializes store state to plain JSON serializable JavaScript.
    */
  var serialize: js.UndefOr[js.ThisFunction1[/* this */ Store[T], /* state */ T, _]] = js.native
  /**
    * Gets the initial state for this type of store
    */
  def getInitialState(): T = js.native
  /**
    * Sets up message handlers via `this.on` and to set up the initial
    * state.
    */
  def initialize(): Unit = js.native
}

object StoreLike {
  @scala.inline
  def apply[T](getInitialState: () => T, initialize: () => Unit): StoreLike[T] = {
    val __obj = js.Dynamic.literal(getInitialState = js.Any.fromFunction0(getInitialState), initialize = js.Any.fromFunction0(initialize))
    __obj.asInstanceOf[StoreLike[T]]
  }
  @scala.inline
  implicit class StoreLikeOps[Self[t] <: StoreLike[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withGetInitialState(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInitialState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInitialize(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeserialize(value: js.ThisFunction1[/* this */ Store[T], /* state */ js.Any, T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deserialize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeserialize: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deserialize")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleReset(value: js.ThisFunction1[/* this */ Store[T], /* state */ T, T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleReset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleReset: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleReset")(js.undefined)
        ret
    }
    @scala.inline
    def withSerialize(value: js.ThisFunction1[/* this */ Store[T], /* state */ T, _]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerialize: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.undefined)
        ret
    }
  }
  
}

