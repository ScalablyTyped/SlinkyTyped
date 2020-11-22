package typingsSlinky.novaEditorNode

import typingsSlinky.novaEditorNode.anon.Event
import typingsSlinky.novaEditorNode.anon.Identifer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssistantsRegistry extends js.Object {
  
  def registerCompletionAssistant(selector: AssistantsRegistrySelector, `object`: CompletionAssistant): Disposable = js.native
  
  def registerIssueAssistant(selector: AssistantsRegistrySelector, `object`: IssueAssistant): Disposable = js.native
  def registerIssueAssistant(selector: AssistantsRegistrySelector, `object`: IssueAssistant, options: Event): Disposable = js.native
  
  def registerTaskAssistant(`object`: TaskAssistant): Disposable = js.native
  def registerTaskAssistant(`object`: TaskAssistant, options: Identifer): Disposable = js.native
}
