package typingsSlinky.beanstalkdWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type JobPollHandler = js.Function1[/* state */ typingsSlinky.beanstalkd.mod.BeanstalkdJobState, js.Any]
  
  type JobStatus = typingsSlinky.beanstalkd.mod.BeanstalkdJobState | typingsSlinky.beanstalkdWorker.beanstalkdWorkerStrings.success
  
  type TubeHandler = js.ThisFunction1[
    /* this */ typingsSlinky.beanstalkdWorker.mod.WatcherJob, 
    /* payload */ js.UndefOr[js.Any], 
    js.Any
  ]
}
