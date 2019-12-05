package typingsSlinky.rsmqDashWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rsmqDashWorkerMod {
  type CallbackT[R] = js.Function2[/* e */ js.UndefOr[js.Error], /* res */ js.UndefOr[R], Unit]
  type CustomExceedCheckCallback = js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RedisSMQ.Message */ /* message */ js.Any, 
    Boolean
  ]
}
