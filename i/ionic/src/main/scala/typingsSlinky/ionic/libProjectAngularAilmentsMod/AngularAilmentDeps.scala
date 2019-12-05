package typingsSlinky.ionic.libProjectAngularAilmentsMod

import typingsSlinky.ionic.definitionsMod.IClient
import typingsSlinky.ionic.definitionsMod.IConfig
import typingsSlinky.ionic.definitionsMod.ILogger
import typingsSlinky.ionic.definitionsMod.ISession
import typingsSlinky.ionic.definitionsMod.IShell
import typingsSlinky.ionic.libDoctorAilmentsBaseMod.AilmentDeps
import typingsSlinky.ionic.libProjectAngularMod.AngularProject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AngularAilmentDeps extends AilmentDeps {
  @JSName("project")
  val project_AngularAilmentDeps: AngularProject
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
}

