package typingsSlinky.beanstalkdWorker.mod

import typingsSlinky.beanstalkd.mod.BeanstalkdJobState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.beanstalkd.mod.BeanstalkdJobState
  - typingsSlinky.beanstalkdWorker.beanstalkdWorkerStrings.success
*/
trait JobStatus extends js.Object

object JobStatus {
  @scala.inline
  def success: typingsSlinky.beanstalkdWorker.beanstalkdWorkerStrings.success = "success".asInstanceOf[typingsSlinky.beanstalkdWorker.beanstalkdWorkerStrings.success]
  @scala.inline
  implicit def apply(value: BeanstalkdJobState): JobStatus = value.asInstanceOf[JobStatus]
}

