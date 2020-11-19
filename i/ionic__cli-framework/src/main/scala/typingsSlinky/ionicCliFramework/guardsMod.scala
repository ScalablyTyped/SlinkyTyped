package typingsSlinky.ionicCliFramework

import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadata
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataOption
import typingsSlinky.ionicCliFramework.definitionsMod.ICommand
import typingsSlinky.ionicCliFramework.definitionsMod.INamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/cli-framework/guards", JSImport.Namespace)
@js.native
object guardsMod extends js.Object {
  
  def isCommand[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](obj: js.Any): /* is C */ Boolean = js.native
  
  def isHydratedCommandMetadata[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](obj: js.Any): /* is @ionic/cli-framework.@ionic/cli-framework/definitions.HydratedCommandMetadata<C, N, M, I, O> */ Boolean = js.native
  
  def isLinkFootnote(obj: js.Any): /* is @ionic/cli-framework.@ionic/cli-framework/definitions.LinkFootnote */ Boolean = js.native
  
  def isNamespace[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](obj: js.Any): /* is N */ Boolean = js.native
  
  def isPackageJson(obj: js.Any): /* is @ionic/cli-framework.@ionic/cli-framework/definitions.PackageJson */ Boolean = js.native
}
