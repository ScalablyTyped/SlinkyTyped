package typingsSlinky.bucks

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Bucks")
@js.native
object Bucks extends js.Object {
  @js.native
  trait Bucks extends js.Object {
    /**
      * Add a task.
      * @param task Function added async chain
      */
    def add(task: TaskWithNext): typingsSlinky.bucks.Bucks.Bucks = js.native
    /**
      * Add delay execution.
      * @param ms number millisecond for delaying
      */
    def delay(ms: Double): typingsSlinky.bucks.Bucks.Bucks = js.native
    /**
      * Destroy this object and call last callback function.
      * @param err If specify err and no callback, throw to execute failure callback
      */
    def destroy(): typingsSlinky.bucks.Bucks.Bucks = js.native
    def destroy(err: js.Error): typingsSlinky.bucks.Bucks.Bucks = js.native
    /**
      * Called when destroy async chain.
      */
    def dispose(): Unit = js.native
    /**
      * Add a empty task.
      */
    def empty(): typingsSlinky.bucks.Bucks.Bucks = js.native
    /**
      * Complete creating async chain and start executing.
      * @param callback Last callback function
      * @param errback Handler for occurring error in last callback function
      */
    def end(): Unit = js.native
    def end(callback: js.UndefOr[scala.Nothing], errback: js.Function1[/* err */ js.Error, _]): Unit = js.native
    def end(callback: Task): Unit = js.native
    def end(callback: Task, errback: js.Function1[/* err */ js.Error, _]): Unit = js.native
    /**
      * Add a task called only in case of error.
      * @param onError Function called only in case of error
      */
    def error(onError: js.Function2[/* err */ js.Error, /* next */ js.UndefOr[Task], _]): typingsSlinky.bucks.Bucks.Bucks = js.native
    /**
      * Add tasks in asynchronous way and join their results.
      * @param tasks Functions called in asynchronous way and join their results
      */
    def parallel(tasks: js.Array[TaskWithNext]): typingsSlinky.bucks.Bucks.Bucks = js.native
    /**
      * Add a task called only in case of success.
      * @param onSuccess Function called only in case of success
      */
    def `then`(onSuccess: js.Function2[/* res */ js.Any, /* next */ js.UndefOr[Task], _]): typingsSlinky.bucks.Bucks.Bucks = js.native
    /**
      * Add tasks in asynchronous way and join their results.
      * @param tasks Functions added async chain
      */
    def waterfall(tasks: js.Array[TaskWithNext]): typingsSlinky.bucks.Bucks.Bucks = js.native
  }
  
  @js.native
  trait BucksStatic
    extends /**
    * Create bucks object.
    */
  Instantiable0[typingsSlinky.bucks.Bucks.Bucks] {
    /**
      * If set `true`, uncaught errors are logged.
      */
    var DEBUG: Boolean = js.native
    /**
      * bucks.js version.
      */
    var VERSION: String = js.native
    /**
      * Not yet called `end` bucks object.
      */
    var living: js.Array[typingsSlinky.bucks.Bucks.Bucks] = js.native
    /**
      * Running bucks objects.
      */
    var running: js.Array[typingsSlinky.bucks.Bucks.Bucks] = js.native
    /**
      * Catch all errors.
      * @param onError Function called after catching error
      */
    def onError(onError: js.Function2[/* err */ js.Error, /* bucks */ typingsSlinky.bucks.Bucks.Bucks, _]): Unit = js.native
  }
  
  type Task = js.Function2[/* err */ js.UndefOr[js.Error], /* res */ js.UndefOr[js.Any], js.Any]
  type TaskWithNext = js.Function3[
    /* err */ js.UndefOr[js.Error], 
    /* res */ js.UndefOr[js.Any], 
    /* next */ js.UndefOr[Task], 
    js.Any
  ]
}

