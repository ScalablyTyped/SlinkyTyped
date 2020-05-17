package typingsSlinky.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Runner is a highly performant and simple alternative to signals. Best used in situations
  * where events are dispatched to many objects at high frequency (say every frame!)
  *
  *
  * like a signal..
  * ```
  * import { Runner } from '@pixi/runner';
  *
  * const myObject = {
  *     loaded: new Runner('loaded')
  * }
  *
  * const listener = {
  *     loaded: function(){
  *         // thin
  *     }
  * }
  *
  * myObject.update.add(listener);
  *
  * myObject.loaded.emit();
  * ```
  *
  * Or for handling calling the same function on many items
  * ```
  * import { Runner } from '@pixi/runner';
  *
  * const myGame = {
  *     update: new Runner('update')
  * }
  *
  * const gameObject = {
  *     update: function(time){
  *         // update my gamey state
  *     }
  * }
  *
  * myGame.update.add(gameObject1);
  *
  * myGame.update.emit(time);
  * ```
  * @class
  * @memberof PIXI
  */
@js.native
trait Runner extends js.Object {
  /**
    * `true` if there are no this Runner contains no listeners
    *
    * @member {boolean}
    * @readonly
    */
  val empty: Boolean = js.native
  /**
    * The name of the runner.
    *
    * @member {string}
    * @readonly
    */
  val name: String = js.native
  /**
    * Add a listener to the Runner
    *
    * Runners do not need to have scope or functions passed to them.
    * All that is required is to pass the listening object and ensure that it has contains a function that has the same name
    * as the name provided to the Runner when it was created.
    *
    * Eg A listener passed to this Runner will require a 'complete' function.
    *
    * ```
    * import { Runner } from '@pixi/runner';
    *
    * const complete = new Runner('complete');
    * ```
    *
    * The scope used will be the object itself.
    *
    * @param {any} item - The object that will be listening.
    * @return {PIXI.Runner}
    */
  def add(item: js.Any): Runner = js.native
  /**
    * Check to see if the listener is already in the Runner
    * @param {any} item - The listener that you would like to check.
    */
  def contains(item: js.Any): Unit = js.native
  /**
    * Remove all references, don't use after this.
    */
  def destroy(): Unit = js.native
  /**
    * Alias for `emit`
    * @memberof PIXI.Runner#
    * @method dispatch
    * @see PIXI.Runner#emit
    */
  def dispatch(): Unit = js.native
  /**
    * Dispatch/Broadcast Runner to all listeners added to the queue.
    * @param {...any} params - optional parameters to pass to each listener
    * @return {PIXI.Runner}
    */
  def emit(params: js.Any*): Runner = js.native
  /**
    * Remove a single listener from the dispatch queue.
    * @param {any} item - The listenr that you would like to remove.
    * @return {PIXI.Runner}
    */
  def remove(item: js.Any): Runner = js.native
  /**
    * Remove all listeners from the Runner
    * @return {PIXI.Runner}
    */
  def removeAll(): Runner = js.native
  /**
    * Alias for `emit`
    * @memberof PIXI.Runner#
    * @method run
    * @see PIXI.Runner#emit
    */
  def run(): Unit = js.native
}

object Runner {
  @scala.inline
  def apply(
    add: js.Any => Runner,
    contains: js.Any => Unit,
    destroy: () => Unit,
    dispatch: () => Unit,
    emit: /* repeated */ js.Any => Runner,
    empty: Boolean,
    name: String,
    remove: js.Any => Runner,
    removeAll: () => Runner,
    run: () => Unit
  ): Runner = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), contains = js.Any.fromFunction1(contains), destroy = js.Any.fromFunction0(destroy), dispatch = js.Any.fromFunction0(dispatch), emit = js.Any.fromFunction1(emit), empty = empty.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), removeAll = js.Any.fromFunction0(removeAll), run = js.Any.fromFunction0(run))
    __obj.asInstanceOf[Runner]
  }
  @scala.inline
  implicit class RunnerOps[Self <: Runner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: js.Any => Runner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContains(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDispatch(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEmit(value: /* repeated */ js.Any => Runner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: js.Any => Runner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveAll(value: () => Runner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRun(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

