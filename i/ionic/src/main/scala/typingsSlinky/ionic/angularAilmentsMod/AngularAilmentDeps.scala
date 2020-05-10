package typingsSlinky.ionic.angularAilmentsMod

import typingsSlinky.ionic.ailmentsBaseMod.AilmentDeps
import typingsSlinky.ionic.angularMod.AngularProject
import typingsSlinky.ionic.definitionsMod.IClient
import typingsSlinky.ionic.definitionsMod.IConfig
import typingsSlinky.ionic.definitionsMod.ILogger
import typingsSlinky.ionic.definitionsMod.ISession
import typingsSlinky.ionic.definitionsMod.IShell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AngularAilmentDeps extends AilmentDeps {
  @JSName("project")
  val project_AngularAilmentDeps: AngularProject = js.native
}

object AngularAilmentDeps {
  @scala.inline
  def apply(
    client: IClient,
    config: IConfig,
    log: ILogger,
    project: AngularProject,
    session: ISession,
    shell: IShell
  ): AngularAilmentDeps = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngularAilmentDeps]
  }
  @scala.inline
  implicit class AngularAilmentDepsOps[Self <: AngularAilmentDeps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProject(value: AngularProject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

