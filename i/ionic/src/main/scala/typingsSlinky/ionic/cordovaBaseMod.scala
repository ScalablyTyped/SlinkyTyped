package typingsSlinky.ionic

import typingsSlinky.ionic.anon.PromptToInstall
import typingsSlinky.ionic.anon.RequiredProjectIntegratio
import typingsSlinky.ionic.commandMod.Command
import typingsSlinky.ionic.definitionsMod.CommandInstanceInfo
import typingsSlinky.ionic.definitionsMod.CommandMetadataOption
import typingsSlinky.ionic.definitionsMod.INamespace
import typingsSlinky.ionic.definitionsMod.IShellRunOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cordovaBaseMod {
  
  @JSImport("ionic/commands/cordova/base", "CORDOVA_BUILD_EXAMPLE_COMMANDS")
  @js.native
  val CORDOVA_BUILD_EXAMPLE_COMMANDS: js.Array[String] = js.native
  
  @JSImport("ionic/commands/cordova/base", "CORDOVA_COMPILE_OPTIONS")
  @js.native
  val CORDOVA_COMPILE_OPTIONS: js.Array[CommandMetadataOption] = js.native
  
  @JSImport("ionic/commands/cordova/base", "CORDOVA_RUN_OPTIONS")
  @js.native
  val CORDOVA_RUN_OPTIONS: js.Array[CommandMetadataOption] = js.native
  
  @JSImport("ionic/commands/cordova/base", "CordovaCommand")
  @js.native
  abstract class CordovaCommand protected () extends Command {
    def this(namespace: INamespace) = this()
    
    var _integration: js.Any = js.native
    
    /* protected */ def checkCordova(runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    
    /* protected */ def checkForPlatformInstallation(platform: String): js.Promise[Unit] = js.native
    /* protected */ def checkForPlatformInstallation(platform: String, hasPromptToInstallPromptToInstallRefusalMsg: PromptToInstall): js.Promise[Unit] = js.native
    
    /* protected */ def integration: RequiredProjectIntegratio = js.native
    
    /* protected */ def preRunChecks(runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    
    /* protected */ def runCordova(argList: js.Array[String]): js.Promise[Unit] = js.native
    /* protected */ def runCordova(argList: js.Array[String], hasFatalOnNotFoundTruncateErrorOutputOptions: IShellRunOptions): js.Promise[Unit] = js.native
  }
}
