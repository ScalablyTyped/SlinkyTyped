package typingsSlinky.ionic

import typingsSlinky.atIonicCliDashFramework.atIonicCliDashFrameworkMod.BaseNamespace
import typingsSlinky.atIonicCliDashFramework.definitionsMod.CommandMapGetter
import typingsSlinky.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
import typingsSlinky.atIonicCliDashFramework.definitionsMod.NamespaceMapGetter
import typingsSlinky.atIonicUtilsDashObject.atIonicUtilsDashObjectMod.AliasedMap
import typingsSlinky.ionic.definitionsMod.CommandMetadata
import typingsSlinky.ionic.definitionsMod.CommandMetadataOption
import typingsSlinky.ionic.definitionsMod.ICommand
import typingsSlinky.ionic.definitionsMod.INamespace
import typingsSlinky.ionic.definitionsMod.IProject
import typingsSlinky.ionic.definitionsMod.IonicEnvironment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/namespace", JSImport.Namespace)
@js.native
object libNamespaceMod extends js.Object {
  @js.native
  class CommandMap () extends AliasedMap[
          String, 
          CommandMapGetter[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption]
        ]
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.atIonicCliDashFramework.definitionsMod.INamespace because Already inherited
  - typings.ionic.definitionsMod.INamespace because var conflicts: parent, root. Inlined env, project */ @js.native
  abstract class Namespace () extends BaseNamespace[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption] {
    def this(parent: INamespace) = this()
    @JSName("env")
    var env_FNamespace: IonicEnvironment = js.native
    @JSName("project")
    var project_FNamespace: js.UndefOr[IProject] = js.native
    def env(): IonicEnvironment = js.native
    def project(): js.UndefOr[IProject] = js.native
  }
  
  @js.native
  class NamespaceMap () extends AliasedMap[
          String, 
          NamespaceMapGetter[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption]
        ]
  
}

