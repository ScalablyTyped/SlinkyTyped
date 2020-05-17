package typingsSlinky.beanstalkdWorker

import typingsSlinky.beanstalkdWorker.mod.JobStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object beanstalkdWorkerStrings {
  @js.native
  sealed trait success extends JobStatus
  
  @scala.inline
  def success: success = "success".asInstanceOf[success]
}

