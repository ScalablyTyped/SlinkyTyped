package typingsSlinky.nodeZendesk.mod.JobStatuses

import typingsSlinky.nodeZendesk.mod.ZendeskCallback
import typingsSlinky.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Methods extends js.Object {
  
  def show(jobStatusId: ZendeskID): js.Promise[ResponsePayload] = js.native
  def show(jobStatusId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload = js.native
  
  def watch(jobStatusId: ZendeskID, interval: Double, maxAttempts: Double): js.Promise[_] = js.native
  def watch(jobStatusId: ZendeskID, interval: Double, maxAttempts: Double, cb: ZendeskCallback[_, _]): js.Any = js.native
}
