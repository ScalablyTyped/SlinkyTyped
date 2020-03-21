package typingsSlinky.ionic.ailmentsBaseMod

import typingsSlinky.ionic.definitionsMod.IClient
import typingsSlinky.ionic.definitionsMod.IConfig
import typingsSlinky.ionic.definitionsMod.ILogger
import typingsSlinky.ionic.definitionsMod.IProject
import typingsSlinky.ionic.definitionsMod.ISession
import typingsSlinky.ionic.definitionsMod.IShell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AilmentDeps extends js.Object {
  var client: IClient
  var config: IConfig
  var log: ILogger
  var project: IProject
  var session: ISession
  var shell: IShell
}

object AilmentDeps {
  @scala.inline
  def apply(
    client: IClient,
    config: IConfig,
    log: ILogger,
    project: IProject,
    session: ISession,
    shell: IShell
  ): AilmentDeps = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AilmentDeps]
  }
}

