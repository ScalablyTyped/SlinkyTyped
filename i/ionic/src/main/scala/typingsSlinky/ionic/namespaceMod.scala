package typingsSlinky.ionic

import typingsSlinky.ionic.definitionsMod.CommandMetadata
import typingsSlinky.ionic.definitionsMod.CommandMetadataOption
import typingsSlinky.ionic.definitionsMod.ICommand
import typingsSlinky.ionic.definitionsMod.INamespace
import typingsSlinky.ionic.definitionsMod.IProject
import typingsSlinky.ionic.definitionsMod.IonicEnvironment
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMapGetter
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsSlinky.ionicCliFramework.definitionsMod.NamespaceMapGetter
import typingsSlinky.ionicCliFramework.mod.BaseNamespace
import typingsSlinky.ionicUtilsObject.mod.AliasedMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/namespace", JSImport.Namespace)
@js.native
object namespaceMod extends js.Object {
  @js.native
  class CommandMap () extends AliasedMap[
          String, 
          CommandMapGetter[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption]
        ]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.ionicCliFramework.definitionsMod.INamespace because Already inherited
  - typingsSlinky.ionic.definitionsMod.INamespace because var conflicts: parent, root. Inlined env, project */ @js.native
  abstract class Namespace () extends BaseNamespace[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption] {
    def this(parent: INamespace) = this()
    @JSName("env")
    var env_FNamespace: IonicEnvironment = js.native
    @JSName("project")
    var project_FNamespace: js.UndefOr[IProject] = js.native
    def env: IonicEnvironment = js.native
    def project: js.UndefOr[IProject] = js.native
  }
  
  @js.native
  class NamespaceMap () extends AliasedMap[
          String, 
          NamespaceMapGetter[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption]
        ]
  
}

