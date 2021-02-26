package typingsSlinky.ionic

import typingsSlinky.ionic.ailmentsBaseMod.AilmentDeps
import typingsSlinky.ionic.angularMod.AngularProject
import typingsSlinky.ionic.definitionsMod.IClient
import typingsSlinky.ionic.definitionsMod.IConfig
import typingsSlinky.ionic.definitionsMod.ILogger
import typingsSlinky.ionic.definitionsMod.ISession
import typingsSlinky.ionic.definitionsMod.IShell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angularAilmentsMod {
  
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
    implicit class AngularAilmentDepsMutableBuilder[Self <: AngularAilmentDeps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProject(value: AngularProject): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    }
  }
}
