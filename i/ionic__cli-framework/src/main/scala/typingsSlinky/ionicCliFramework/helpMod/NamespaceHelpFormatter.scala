package typingsSlinky.ionicCliFramework.helpMod

import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadata
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataOption
import typingsSlinky.ionicCliFramework.definitionsMod.HydratedCommandMetadata
import typingsSlinky.ionicCliFramework.definitionsMod.ICommand
import typingsSlinky.ionicCliFramework.definitionsMod.INamespace
import typingsSlinky.ionicCliFramework.definitionsMod.NamespaceLocateResult
import typingsSlinky.ionicCliFramework.definitionsMod.NamespaceMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/cli-framework/lib/help", "NamespaceHelpFormatter")
@js.native
abstract class NamespaceHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected () extends HelpFormatter {
  def this(hasLocationNamespaceColors: NamespaceHelpFormatterDeps[C, N, M, I, O]) = this()
  
  var _fullName: js.UndefOr[String] = js.native
  
  var _metadata: js.UndefOr[NamespaceMetadata] = js.native
  
  val dotswidth: Double = js.native
  
  /**
    * Given command metadata, decide whether to keep or discard the command that
    * the metadata represents.
    *
    * @param meta: The metadata of the command.
    * @return `true` to keep, `false` to discard
    */
  def filterCommandCallback(meta: HydratedCommandMetadata[C, N, M, I, O]): js.Promise[Boolean] = js.native
  
  def getCommandMetadataList(): js.Promise[js.Array[HydratedCommandMetadata[C, N, M, I, O]]] = js.native
  
  def getNamespaceFullName(): js.Promise[String] = js.native
  
  def getNamespaceMetadata(): js.Promise[NamespaceMetadata] = js.native
  
  val location: NamespaceLocateResult[C, N, M, I, O] = js.native
  
  val namespace: N = js.native
  
  /* protected */ def normalizeCommandMetadata(metadata: HydratedCommandMetadata[C, N, M, I, O]): HydratedCommandMetadata[C, N, M, I, O] = js.native
  
  /* protected */ def normalizeMetadata(metadata: NamespaceMetadata): NamespaceMetadata = js.native
}
