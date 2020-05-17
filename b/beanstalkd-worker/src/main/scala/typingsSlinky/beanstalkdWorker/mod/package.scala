package typingsSlinky.beanstalkdWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type JobPollHandler = js.Function1[/* state */ typingsSlinky.beanstalkd.mod.BeanstalkdJobState, js.Any]
  type TubeHandler = js.ThisFunction1[
    /* this */ typingsSlinky.beanstalkdWorker.mod.WatcherJob, 
    /* payload */ js.UndefOr[js.Any], 
    js.Any
  ]
}
