package typingsSlinky.googleapis.cloudtasksV2Mod.cloudtasksV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Retry config.  These settings determine when a failed task attempt is
  * retried.
  */
@js.native
trait SchemaRetryConfig extends StObject {
  
  /**
    * Number of attempts per task.  Cloud Tasks will attempt the task
    * `max_attempts` times (that is, if the first attempt fails, then there
    * will be `max_attempts - 1` retries). Must be &gt;= -1.  If unspecified
    * when the queue is created, Cloud Tasks will pick the default.  -1
    * indicates unlimited attempts.  This field has the same meaning as
    * [task_retry_limit in
    * queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
    */
  var maxAttempts: js.UndefOr[Double] = js.native
  
  /**
    * A task will be scheduled for retry between min_backoff and max_backoff
    * duration after it fails, if the queue&#39;s RetryConfig specifies that
    * the task should be retried.  If unspecified when the queue is created,
    * Cloud Tasks will pick the default.   `max_backoff` will be truncated to
    * the nearest second.  This field has the same meaning as
    * [max_backoff_seconds in
    * queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
    */
  var maxBackoff: js.UndefOr[String] = js.native
  
  /**
    * The time between retries will double `max_doublings` times.  A task&#39;s
    * retry interval starts at min_backoff, then doubles `max_doublings` times,
    * then increases linearly, and finally retries retries at intervals of
    * max_backoff up to max_attempts times.  For example, if min_backoff is
    * 10s, max_backoff is 300s, and `max_doublings` is 3, then the a task will
    * first be retried in 10s. The retry interval will double three times, and
    * then increase linearly by 2^3 * 10s.  Finally, the task will retry at
    * intervals of max_backoff until the task has been attempted max_attempts
    * times. Thus, the requests will retry at 10s, 20s, 40s, 80s, 160s, 240s,
    * 300s, 300s, ....  If unspecified when the queue is created, Cloud Tasks
    * will pick the default.   This field has the same meaning as
    * [max_doublings in
    * queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
    */
  var maxDoublings: js.UndefOr[Double] = js.native
  
  /**
    * If positive, `max_retry_duration` specifies the time limit for retrying a
    * failed task, measured from when the task was first attempted. Once
    * `max_retry_duration` time has passed *and* the task has been attempted
    * max_attempts times, no further attempts will be made and the task will be
    * deleted.  If zero, then the task age is unlimited.  If unspecified when
    * the queue is created, Cloud Tasks will pick the default.
    * `max_retry_duration` will be truncated to the nearest second.  This field
    * has the same meaning as [task_age_limit in
    * queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
    */
  var maxRetryDuration: js.UndefOr[String] = js.native
  
  /**
    * A task will be scheduled for retry between min_backoff and max_backoff
    * duration after it fails, if the queue&#39;s RetryConfig specifies that
    * the task should be retried.  If unspecified when the queue is created,
    * Cloud Tasks will pick the default.   `min_backoff` will be truncated to
    * the nearest second.  This field has the same meaning as
    * [min_backoff_seconds in
    * queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#retry_parameters).
    */
  var minBackoff: js.UndefOr[String] = js.native
}
object SchemaRetryConfig {
  
  @scala.inline
  def apply(): SchemaRetryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRetryConfig]
  }
  
  @scala.inline
  implicit class SchemaRetryConfigMutableBuilder[Self <: SchemaRetryConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAttemptsUndefined: Self = StObject.set(x, "maxAttempts", js.undefined)
    
    @scala.inline
    def setMaxBackoff(value: String): Self = StObject.set(x, "maxBackoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBackoffUndefined: Self = StObject.set(x, "maxBackoff", js.undefined)
    
    @scala.inline
    def setMaxDoublings(value: Double): Self = StObject.set(x, "maxDoublings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDoublingsUndefined: Self = StObject.set(x, "maxDoublings", js.undefined)
    
    @scala.inline
    def setMaxRetryDuration(value: String): Self = StObject.set(x, "maxRetryDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRetryDurationUndefined: Self = StObject.set(x, "maxRetryDuration", js.undefined)
    
    @scala.inline
    def setMinBackoff(value: String): Self = StObject.set(x, "minBackoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinBackoffUndefined: Self = StObject.set(x, "minBackoff", js.undefined)
  }
}
