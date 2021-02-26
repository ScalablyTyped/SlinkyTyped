package typingsSlinky.ionicCliFramework

import typingsSlinky.ionicCliFramework.definitionsMod.CommandInstanceInfo
import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineInputs
import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineOptions
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMapGetter
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadata
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataOption
import typingsSlinky.ionicCliFramework.definitionsMod.CommandPathItem
import typingsSlinky.ionicCliFramework.definitionsMod.ICommand
import typingsSlinky.ionicCliFramework.definitionsMod.INamespace
import typingsSlinky.ionicCliFramework.definitionsMod.NamespaceMapGetter
import typingsSlinky.ionicUtilsObject.mod.AliasedMap
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandMod {
  
  @JSImport("@ionic/cli-framework/lib/command", "BaseCommand")
  @js.native
  abstract class BaseCommand[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected () extends StObject {
    def this(namespace: N) = this()
    
    def getMetadata(): js.Promise[M] = js.native
    
    var namespace: N = js.native
    
    def run(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
    def run(
      inputs: CommandLineInputs,
      options: CommandLineOptions,
      runtime: Partial[CommandInstanceInfo[C, N, M, I, O]]
    ): js.Promise[Unit] = js.native
    
    def validate(argv: CommandLineInputs): js.Promise[Unit] = js.native
  }
  
  @JSImport("@ionic/cli-framework/lib/command", "BaseCommandMap")
  @js.native
  class BaseCommandMap[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] () extends AliasedMap[String, CommandMapGetter[C, N, M, I, O]]
  
  @JSImport("@ionic/cli-framework/lib/command", "BaseNamespace")
  @js.native
  abstract class BaseNamespace[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] () extends INamespace[C, N, M, I, O] {
    def this(parent: N) = this()
    
    @JSName("root")
    def root_MBaseNamespace: N = js.native
  }
  
  @JSImport("@ionic/cli-framework/lib/command", "BaseNamespaceMap")
  @js.native
  class BaseNamespaceMap[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] () extends AliasedMap[String, NamespaceMapGetter[C, N, M, I, O]]
  
  @JSImport("@ionic/cli-framework/lib/command", "Command")
  @js.native
  abstract class Command protected () extends BaseCommand[
          Command, 
          Namespace, 
          CommandMetadata[CommandMetadataInput, CommandMetadataOption], 
          CommandMetadataInput, 
          CommandMetadataOption
        ] {
    def this(namespace: Namespace) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib/command", "CommandMap")
  @js.native
  class CommandMap () extends BaseCommandMap[
          Command, 
          Namespace, 
          CommandMetadata[CommandMetadataInput, CommandMetadataOption], 
          CommandMetadataInput, 
          CommandMetadataOption
        ]
  
  @JSImport("@ionic/cli-framework/lib/command", "CommandMapDefault")
  @js.native
  val CommandMapDefault: js.Symbol = js.native
  
  @JSImport("@ionic/cli-framework/lib/command", "Namespace")
  @js.native
  abstract class Namespace () extends BaseNamespace[
          Command, 
          Namespace, 
          CommandMetadata[CommandMetadataInput, CommandMetadataOption], 
          CommandMetadataInput, 
          CommandMetadataOption
        ] {
    def this(parent: Namespace) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib/command", "NamespaceMap")
  @js.native
  class NamespaceMap () extends BaseNamespaceMap[
          Command, 
          Namespace, 
          CommandMetadata[CommandMetadataInput, CommandMetadataOption], 
          CommandMetadataInput, 
          CommandMetadataOption
        ]
  
  @JSImport("@ionic/cli-framework/lib/command", "generateCommandPath")
  @js.native
  def generateCommandPath[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](cmd: C): js.Promise[js.Array[CommandPathItem[C, N, M, I, O]]] = js.native
}
