package typingsSlinky.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompletionTriggerKind extends StObject
@JSImport("monaco-editor", "languages.CompletionTriggerKind")
@js.native
object CompletionTriggerKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompletionTriggerKind with Double] = js.native
  
  @js.native
  sealed trait Invoke extends CompletionTriggerKind
  /* 0 */ val Invoke: typingsSlinky.monacoEditor.mod.languages.CompletionTriggerKind.Invoke with Double = js.native
  
  @js.native
  sealed trait TriggerCharacter extends CompletionTriggerKind
  /* 1 */ val TriggerCharacter: typingsSlinky.monacoEditor.mod.languages.CompletionTriggerKind.TriggerCharacter with Double = js.native
  
  @js.native
  sealed trait TriggerForIncompleteCompletions extends CompletionTriggerKind
  /* 2 */ val TriggerForIncompleteCompletions: typingsSlinky.monacoEditor.mod.languages.CompletionTriggerKind.TriggerForIncompleteCompletions with Double = js.native
}
