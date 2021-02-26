package typingsSlinky.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EndOfLineSequence extends StObject
@JSImport("monaco-editor", "editor.EndOfLineSequence")
@js.native
object EndOfLineSequence extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EndOfLineSequence with Double] = js.native
  
  /**
    * Use carriage return and line feed (\r\n) as the end of line character.
    */
  @js.native
  sealed trait CRLF extends EndOfLineSequence
  /* 1 */ val CRLF: typingsSlinky.monacoEditor.mod.editor.EndOfLineSequence.CRLF with Double = js.native
  
  /**
    * Use line feed (\n) as the end of line character.
    */
  @js.native
  sealed trait LF extends EndOfLineSequence
  /* 0 */ val LF: typingsSlinky.monacoEditor.mod.editor.EndOfLineSequence.LF with Double = js.native
}
