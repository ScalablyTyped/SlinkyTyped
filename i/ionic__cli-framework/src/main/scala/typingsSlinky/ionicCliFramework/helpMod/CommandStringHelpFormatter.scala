package typingsSlinky.ionicCliFramework.helpMod

import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadata
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataOption
import typingsSlinky.ionicCliFramework.definitionsMod.ICommand
import typingsSlinky.ionicCliFramework.definitionsMod.INamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/cli-framework/lib/help", "CommandStringHelpFormatter")
@js.native
class CommandStringHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] () extends CommandHelpFormatter[C, N, M, I, O] {
  
  def formatAfterOptionSummary(opt: O): js.Promise[String] = js.native
  
  /**
    * Insert text after the command's summary.
    *
    * @param meta The metadata of the command.
    */
  def formatAfterSummary(meta: M): js.Promise[String] = js.native
  
  /**
    * Insert text that appears before an option's summary.
    *
    * @param opt The metadata of the option.
    */
  def formatBeforeOptionSummary(opt: O): js.Promise[String] = js.native
  
  /**
    * Insert text before the command's summary.
    *
    * @param meta The metadata of the command.
    */
  def formatBeforeSummary(meta: M): js.Promise[String] = js.native
  
  def formatDescription(): js.Promise[String] = js.native
  
  def formatExamples(): js.Promise[String] = js.native
  
  def formatHeader(): js.Promise[String] = js.native
  
  def formatInlineInput(input: I): js.Promise[String] = js.native
  
  def formatInputs(): js.Promise[String] = js.native
  
  def formatOptionDefault(opt: O): js.Promise[String] = js.native
  
  def formatOptionLine(opt: O): js.Promise[String] = js.native
  
  def formatOptions(): js.Promise[String] = js.native
  
  def formatOptionsGroup(titleText: String, options: js.Array[O]): js.Promise[String] = js.native
  
  def formatSummary(): js.Promise[String] = js.native
  
  def formatUsage(): js.Promise[String] = js.native
}
