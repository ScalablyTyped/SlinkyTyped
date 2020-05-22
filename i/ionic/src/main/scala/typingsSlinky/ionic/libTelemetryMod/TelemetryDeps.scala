package typingsSlinky.ionic.libTelemetryMod

import typingsSlinky.ionic.definitionsMod.IClient
import typingsSlinky.ionic.definitionsMod.IConfig
import typingsSlinky.ionic.definitionsMod.IProject
import typingsSlinky.ionic.definitionsMod.ISession
import typingsSlinky.ionic.definitionsMod.InfoItem
import typingsSlinky.ionic.definitionsMod.IonicContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TelemetryDeps extends js.Object {
  val client: IClient
  val config: IConfig
  val ctx: IonicContext
  val project: js.UndefOr[IProject] = js.undefined
  val session: ISession
  def getInfo(): js.Promise[js.Array[InfoItem]]
}

object TelemetryDeps {
  @scala.inline
  def apply(
    client: IClient,
    config: IConfig,
    ctx: IonicContext,
    getInfo: () => js.Promise[js.Array[InfoItem]],
    session: ISession,
    project: IProject = null
  ): TelemetryDeps = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], getInfo = js.Any.fromFunction0(getInfo), session = session.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelemetryDeps]
  }
}

