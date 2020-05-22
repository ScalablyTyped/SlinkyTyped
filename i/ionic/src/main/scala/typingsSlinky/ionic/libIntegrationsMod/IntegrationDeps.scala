package typingsSlinky.ionic.libIntegrationsMod

import typingsSlinky.ionic.definitionsMod.IConfig
import typingsSlinky.ionic.definitionsMod.ILogger
import typingsSlinky.ionic.definitionsMod.IProject
import typingsSlinky.ionic.definitionsMod.IShell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntegrationDeps extends js.Object {
  val config: IConfig
  val log: ILogger
  val project: IProject
  val shell: IShell
}

object IntegrationDeps {
  @scala.inline
  def apply(config: IConfig, log: ILogger, project: IProject, shell: IShell): IntegrationDeps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegrationDeps]
  }
}

