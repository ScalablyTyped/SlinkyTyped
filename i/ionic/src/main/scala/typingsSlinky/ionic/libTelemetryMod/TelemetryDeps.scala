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

@js.native
trait TelemetryDeps extends js.Object {
  val client: IClient = js.native
  val config: IConfig = js.native
  val ctx: IonicContext = js.native
  val project: js.UndefOr[IProject] = js.native
  val session: ISession = js.native
  def getInfo(): js.Promise[js.Array[InfoItem]] = js.native
}

object TelemetryDeps {
  @scala.inline
  def apply(
    client: IClient,
    config: IConfig,
    ctx: IonicContext,
    getInfo: () => js.Promise[js.Array[InfoItem]],
    session: ISession
  ): TelemetryDeps = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], getInfo = js.Any.fromFunction0(getInfo), session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelemetryDeps]
  }
  @scala.inline
  implicit class TelemetryDepsOps[Self <: TelemetryDeps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient(value: IClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfig(value: IConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCtx(value: IonicContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetInfo(value: () => js.Promise[js.Array[InfoItem]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInfo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSession(value: ISession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProject(value: IProject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(js.undefined)
        ret
    }
  }
  
}

