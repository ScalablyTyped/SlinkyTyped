package typingsSlinky.asyncDashPolling.asyncDashPollingMod

import typingsSlinky.asyncDashPolling.Anon_EventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async-polling", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[Result](
    pollingFunc: js.Function1[
      /* end */ js.Function2[/* err */ js.UndefOr[js.Error], /* result */ js.UndefOr[Result], _], 
      _
    ],
    delay: Double
  ): Anon_EventName = js.native
}

