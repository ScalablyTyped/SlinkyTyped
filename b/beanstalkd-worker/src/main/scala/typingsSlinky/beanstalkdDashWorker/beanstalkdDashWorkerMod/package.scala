package typingsSlinky.beanstalkdDashWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object beanstalkdDashWorkerMod {
  import typingsSlinky.beanstalkd.beanstalkdMod.BeanstalkdJobState
  import typingsSlinky.beanstalkdDashWorker.beanstalkdDashWorkerStrings.success

  type JobPollHandler = js.Function1[/* state */ BeanstalkdJobState, js.Any]
  type JobStatus = BeanstalkdJobState | success
  type TubeHandler = js.ThisFunction1[/* this */ WatcherJob, /* payload */ js.UndefOr[js.Any], js.Any]
}
