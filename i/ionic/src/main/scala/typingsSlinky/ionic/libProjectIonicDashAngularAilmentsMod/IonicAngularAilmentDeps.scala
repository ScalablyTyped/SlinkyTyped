package typingsSlinky.ionic.libProjectIonicDashAngularAilmentsMod

import typingsSlinky.ionic.definitionsMod.IClient
import typingsSlinky.ionic.definitionsMod.IConfig
import typingsSlinky.ionic.definitionsMod.ILogger
import typingsSlinky.ionic.definitionsMod.ISession
import typingsSlinky.ionic.definitionsMod.IShell
import typingsSlinky.ionic.libDoctorAilmentsBaseMod.AilmentDeps
import typingsSlinky.ionic.libProjectIonicDashAngularMod.IonicAngularProject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonicAngularAilmentDeps extends AilmentDeps {
  @JSName("project")
  val project_IonicAngularAilmentDeps: IonicAngularProject
}

object IonicAngularAilmentDeps {
  @scala.inline
  def apply(
    client: IClient,
    config: IConfig,
    log: ILogger,
    project: IonicAngularProject,
    session: ISession,
    shell: IShell
  ): IonicAngularAilmentDeps = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IonicAngularAilmentDeps]
  }
}

