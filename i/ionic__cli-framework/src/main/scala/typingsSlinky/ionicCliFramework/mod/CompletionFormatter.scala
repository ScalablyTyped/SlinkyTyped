package typingsSlinky.ionicCliFramework.mod

import typingsSlinky.ionicCliFramework.completionMod.CompletionFormatterDeps
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadata
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataOption
import typingsSlinky.ionicCliFramework.definitionsMod.ICommand
import typingsSlinky.ionicCliFramework.definitionsMod.INamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/cli-framework", "CompletionFormatter")
@js.native
abstract class CompletionFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
  extends typingsSlinky.ionicCliFramework.libMod.CompletionFormatter[C, N, M, I, O] {
  def this(hasNamespace: CompletionFormatterDeps[C, N, M, I, O]) = this()
}
