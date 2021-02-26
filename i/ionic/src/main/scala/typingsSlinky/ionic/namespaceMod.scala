package typingsSlinky.ionic

import typingsSlinky.ionic.definitionsMod.CommandMetadata
import typingsSlinky.ionic.definitionsMod.CommandMetadataOption
import typingsSlinky.ionic.definitionsMod.ICommand
import typingsSlinky.ionic.definitionsMod.INamespace
import typingsSlinky.ionic.definitionsMod.IProject
import typingsSlinky.ionic.definitionsMod.IonicEnvironment
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsSlinky.ionicCliFramework.mod.BaseCommandMap
import typingsSlinky.ionicCliFramework.mod.BaseNamespace
import typingsSlinky.ionicCliFramework.mod.BaseNamespaceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespaceMod {
  
  @JSImport("ionic/lib/namespace", "CommandMap")
  @js.native
  class CommandMap () extends BaseCommandMap[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.ionicCliFramework.definitionsMod.INamespace because Already inherited
  - typingsSlinky.ionic.definitionsMod.INamespace because var conflicts: parent, root. Inlined env, project */ @JSImport("ionic/lib/namespace", "Namespace")
  @js.native
  abstract class Namespace () extends BaseNamespace[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption] {
    def this(parent: INamespace) = this()
    
    def env: IonicEnvironment = js.native
    @JSName("env")
    var env_FNamespace: IonicEnvironment = js.native
    
    def project: js.UndefOr[IProject] = js.native
    @JSName("project")
    var project_FNamespace: js.UndefOr[IProject] = js.native
  }
  
  @JSImport("ionic/lib/namespace", "NamespaceMap")
  @js.native
  class NamespaceMap () extends BaseNamespaceMap[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption]
}
