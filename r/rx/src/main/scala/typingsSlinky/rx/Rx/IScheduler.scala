package typingsSlinky.rx.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScheduler extends js.Object {
  
  /**
    * Returns a scheduler that wraps the original scheduler, adding exception handling for scheduled actions.
    * @param {Function} handler Handler that's run if an exception is caught. The exception will be rethrown if the handler returns false.
    * @returns {Scheduler} Wrapper around the original scheduler, enforcing exception handling.
    */
  def `catch`(handler: js.Function): IScheduler = js.native
  
  /** Gets the current time according to the local machine's system clock. */
  def now(): Double = js.native
  
  /**
    * Schedules an action to be executed.
    * @param state State passed to the action to be executed.
    * @param {Function} action Action to be executed.
    * @returns {Disposable} The disposable object used to cancel the scheduled action (best effort).
    */
  def schedule[TState](state: TState, action: js.Function2[/* scheduler */ this.type, /* state */ TState, IDisposable]): IDisposable = js.native
  
  /**
    * Schedules an action to be executed after dueTime.
    * @param state State passed to the action to be executed.
    * @param {Function} action Action to be executed.
    * @param {Number} dueTime Relative time after which to execute the action.
    * @returns {Disposable} The disposable object used to cancel the scheduled action (best effort).
    */
  def scheduleFuture[TState](
    state: TState,
    dueTime: Double,
    action: js.Function2[/* scheduler */ this.type, /* state */ TState, IDisposable]
  ): IDisposable = js.native
  def scheduleFuture[TState](
    state: TState,
    dueTime: js.Date,
    action: js.Function2[/* scheduler */ this.type, /* state */ TState, IDisposable]
  ): IDisposable = js.native
  
  /**
    * Schedules a periodic piece of work by dynamically discovering the scheduler's capabilities. The periodic task will be scheduled using window.setInterval for the base implementation.
    * @param {Mixed} state Initial state passed to the action upon the first iteration.
    * @param {Number} period Period for running the work periodically.
    * @param {Function} action Action to be executed, potentially updating the state.
    * @returns {Disposable} The disposable object used to cancel the scheduled recurring action (best effort).
    */
  def schedulePeriodic[TState](state: TState, period: Double, action: js.Function1[/* state */ TState, TState]): IDisposable = js.native
  
  /**
    * Schedules an action to be executed recursively.
    * @param {Mixed} state State passed to the action to be executed.
    * @param {Function} action Action to execute recursively. The last parameter passed to the action is used to trigger recursive scheduling of the action, passing in recursive invocation state.
    * @returns {Disposable} The disposable object used to cancel the scheduled action (best effort).
    */
  def scheduleRecursive[TState](
    state: TState,
    action: js.Function2[/* state */ TState, /* action */ js.Function1[/* state */ TState, Unit], Unit]
  ): IDisposable = js.native
  
  /**
    * Schedules an action to be executed recursively after a specified relative due time.
    * @param {Mixed} state State passed to the action to be executed.
    * @param {Function} action Action to execute recursively. The last parameter passed to the action is used to trigger recursive scheduling of the action, passing in the recursive due time and invocation state.
    * @param {Number}dueTime Relative time after which to execute the action for the first time.
    * @returns {Disposable} The disposable object used to cancel the scheduled action (best effort).
    */
  def scheduleRecursiveFuture[TState](
    state: TState,
    dueTime: Double,
    action: js.Function2[
      /* state */ TState, 
      /* action */ js.Function2[/* state */ TState, /* dueTime */ Double, Unit], 
      Unit
    ]
  ): IDisposable = js.native
  def scheduleRecursiveFuture[TState](
    state: TState,
    dueTime: js.Date,
    action: js.Function2[
      /* state */ TState, 
      /* action */ js.Function2[/* state */ TState, /* dueTime */ js.Date, Unit], 
      Unit
    ]
  ): IDisposable = js.native
}
