package typingsSlinky.atlassianDashCrowdDashClient.libModelsSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("atlassian-crowd-client/lib/models/session", JSImport.Namespace)
@js.native
class ^ protected () extends Session {
  def this(token: String, createdAt: js.Date, expiresAt: js.Date) = this()
  /* CompleteClass */
  override val createdAt: js.Date = js.native
  /* CompleteClass */
  override val expiresAt: js.Date = js.native
  /* CompleteClass */
  override val token: String = js.native
  /* CompleteClass */
  override def toCrowd(): SessionObj = js.native
}

@JSImport("atlassian-crowd-client/lib/models/session", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fromCrowd(obj: SessionObj): Session = js.native
}

