package typingsSlinky.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompletionItemInsertTextRule extends StObject
@JSImport("monaco-editor", "languages.CompletionItemInsertTextRule")
@js.native
object CompletionItemInsertTextRule extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompletionItemInsertTextRule with Double] = js.native
  
  /**
    * `insertText` is a snippet.
    */
  @js.native
  sealed trait InsertAsSnippet extends CompletionItemInsertTextRule
  /* 4 */ val InsertAsSnippet: typingsSlinky.monacoEditor.mod.languages.CompletionItemInsertTextRule.InsertAsSnippet with Double = js.native
  
  /**
    * Adjust whitespace/indentation of multiline insert texts to
    * match the current line indentation.
    */
  @js.native
  sealed trait KeepWhitespace extends CompletionItemInsertTextRule
  /* 1 */ val KeepWhitespace: typingsSlinky.monacoEditor.mod.languages.CompletionItemInsertTextRule.KeepWhitespace with Double = js.native
}
