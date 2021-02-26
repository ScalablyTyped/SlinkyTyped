package typingsSlinky.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EditorAutoIndentStrategy extends StObject
@JSImport("monaco-editor", "editor.EditorAutoIndentStrategy")
@js.native
object EditorAutoIndentStrategy extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditorAutoIndentStrategy with Double] = js.native
  
  @js.native
  sealed trait Advanced extends EditorAutoIndentStrategy
  /* 3 */ val Advanced: typingsSlinky.monacoEditor.mod.editor.EditorAutoIndentStrategy.Advanced with Double = js.native
  
  @js.native
  sealed trait Brackets extends EditorAutoIndentStrategy
  /* 2 */ val Brackets: typingsSlinky.monacoEditor.mod.editor.EditorAutoIndentStrategy.Brackets with Double = js.native
  
  @js.native
  sealed trait Full extends EditorAutoIndentStrategy
  /* 4 */ val Full: typingsSlinky.monacoEditor.mod.editor.EditorAutoIndentStrategy.Full with Double = js.native
  
  @js.native
  sealed trait Keep extends EditorAutoIndentStrategy
  /* 1 */ val Keep: typingsSlinky.monacoEditor.mod.editor.EditorAutoIndentStrategy.Keep with Double = js.native
  
  @js.native
  sealed trait None extends EditorAutoIndentStrategy
  /* 0 */ val None: typingsSlinky.monacoEditor.mod.editor.EditorAutoIndentStrategy.None with Double = js.native
}
