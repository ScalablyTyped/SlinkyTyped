package typingsSlinky.bull.mod

import typingsSlinky.bull.anon.AttemptsMade
import typingsSlinky.bull.anon.Message
import typingsSlinky.bull.bullBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Job[T] extends js.Object {
  
  /**
    * How many attempts where made to run this job
    */
  var attemptsMade: Double = js.native
  
  /**
    * The custom data passed when the job was created
    */
  var data: T = js.native
  
  /**
    * Ensure this job is never ran again even if attemptsMade is less than job.attempts.
    */
  def discard(): js.Promise[Unit] = js.native
  
  var failedReason: js.UndefOr[String] = js.native
  
  /**
    * Returns a promise that resolves to the returned data when the job has been finished.
    * TODO: Add a watchdog to check if the job has finished periodically.
    * since pubsub does not give any guarantees.
    */
  def finished(): js.Promise[_] = js.native
  
  /**
    * When this job was completed (unix milliseconds)
    */
  var finishedOn: js.UndefOr[Double] = js.native
  
  /**
    * Returns a promise resolving to the current job's status.
    * Please take note that the implementation of this method is not very efficient, nor is
    * it atomic. If your queue does have a very large quantity of jobs, you may want to
    * avoid using this method.
    */
  def getState(): js.Promise[JobStatus] = js.native
  
  var id: JobId = js.native
  
  /**
    * Returns a promise resolving to a boolean which, if true, current job's state is active
    */
  def isActive(): js.Promise[Boolean] = js.native
  
  /**
    * Returns a promise resolving to a boolean which, if true, current job's state is completed
    */
  def isCompleted(): js.Promise[Boolean] = js.native
  
  /**
    * Returns a promise resolving to a boolean which, if true, current job's state is delayed
    */
  def isDelayed(): js.Promise[Boolean] = js.native
  
  /**
    * Returns a promise resolving to a boolean which, if true, current job's state is failed
    */
  def isFailed(): js.Promise[Boolean] = js.native
  
  /**
    * Returns a promise resolving to a boolean which, if true, current job's state is paused
    */
  def isPaused(): js.Promise[Boolean] = js.native
  
  /**
    * Returns a promise resolving to a boolean which, if true, current job's state is stuck
    */
  def isStuck(): js.Promise[Boolean] = js.native
  
  /**
    * Returns a promise resolving to a boolean which, if true, current job's state is wait
    */
  def isWaiting(): js.Promise[Boolean] = js.native
  
  /**
    * The lock id of the job
    */
  def lockKey(): String = js.native
  
  /**
    * Logs one row of log data.
    *
    * @param row String with log data to be logged.
    */
  def log(row: String): js.Promise[_] = js.native
  
  /**
    * Moves a job to the `completed` queue. Pulls a job from 'waiting' to 'active'
    * and returns a tuple containing the next jobs data and id. If no job is in the `waiting` queue, returns null.
    */
  def moveToCompleted(): js.Promise[(js.Tuple2[_, JobId]) | Null] = js.native
  def moveToCompleted(returnValue: js.UndefOr[scala.Nothing], ignoreLock: js.UndefOr[scala.Nothing], notFetch: Boolean): js.Promise[(js.Tuple2[_, JobId]) | Null] = js.native
  def moveToCompleted(returnValue: js.UndefOr[scala.Nothing], ignoreLock: Boolean): js.Promise[(js.Tuple2[_, JobId]) | Null] = js.native
  def moveToCompleted(returnValue: js.UndefOr[scala.Nothing], ignoreLock: Boolean, notFetch: Boolean): js.Promise[(js.Tuple2[_, JobId]) | Null] = js.native
  def moveToCompleted(returnValue: String): js.Promise[(js.Tuple2[_, JobId]) | Null] = js.native
  def moveToCompleted(returnValue: String, ignoreLock: js.UndefOr[scala.Nothing], notFetch: Boolean): js.Promise[(js.Tuple2[_, JobId]) | Null] = js.native
  def moveToCompleted(returnValue: String, ignoreLock: Boolean): js.Promise[(js.Tuple2[_, JobId]) | Null] = js.native
  def moveToCompleted(returnValue: String, ignoreLock: Boolean, notFetch: Boolean): js.Promise[(js.Tuple2[_, JobId]) | Null] = js.native
  
  /**
    * Moves a job to the `failed` queue. Pulls a job from 'waiting' to 'active'
    * and returns a tuple containing the next jobs data and id. If no job is in the `waiting` queue, returns null.
    */
  def moveToFailed(errorInfo: Message): js.Promise[(js.Tuple2[_, JobId]) | Null] = js.native
  def moveToFailed(errorInfo: Message, ignoreLock: Boolean): js.Promise[(js.Tuple2[_, JobId]) | Null] = js.native
  
  /**
    * The named processor name
    */
  var name: String = js.native
  
  /**
    * Options of the job
    */
  var opts: JobOptions = js.native
  
  /**
    * When this job was started (unix milliseconds)
    */
  var processedOn: js.UndefOr[Double] = js.native
  
  /**
    * Get progress on a job
    */
  def progress(): js.Any = js.native
  /**
    * Report progress on a job
    */
  def progress(value: js.Any): js.Promise[Unit] = js.native
  
  /**
    * Promotes a job that is currently "delayed" to the "waiting" state and executed as soon as possible.
    */
  def promote(): js.Promise[Unit] = js.native
  
  /**
    * Which queue this job was part of
    */
  var queue: Queue[T] = js.native
  
  /**
    * Releases the lock on the job. Only locks owned by the queue instance can be released.
    */
  def releaseLock(): js.Promise[Unit] = js.native
  
  /**
    * Removes a job from the queue and from any lists it may be included in.
    * The returned promise resolves when the job has been removed.
    */
  def remove(): js.Promise[Unit] = js.native
  
  /**
    * Re-run a job that has failed. The returned promise resolves when the job
    * has been scheduled for retry.
    */
  def retry(): js.Promise[Unit] = js.native
  
  var returnvalue: js.Any = js.native
  
  /**
    * The stacktrace for any errors
    */
  var stacktrace: js.Array[String] = js.native
  
  /**
    * Takes a lock for this job so that no other queue worker can process it at the same time.
    */
  def takeLock(): js.Promise[Double | `false`] = js.native
  
  var timestamp: Double = js.native
  
  /**
    * Get job properties as Json Object
    */
  def toJSON(): AttemptsMade[T] = js.native
  
  /**
    * Update a specific job's data. Promise resolves when the job has been updated.
    */
  def update(data: js.Any): js.Promise[Unit] = js.native
}
