package typingsSlinky.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RenderLineNumbersType extends StObject
@JSImport("monaco-editor", "editor.RenderLineNumbersType")
@js.native
object RenderLineNumbersType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RenderLineNumbersType with Double] = js.native
  
  @js.native
  sealed trait Custom extends RenderLineNumbersType
  /* 4 */ val Custom: typingsSlinky.monacoEditor.mod.editor.RenderLineNumbersType.Custom with Double = js.native
  
  @js.native
  sealed trait Interval extends RenderLineNumbersType
  /* 3 */ val Interval: typingsSlinky.monacoEditor.mod.editor.RenderLineNumbersType.Interval with Double = js.native
  
  @js.native
  sealed trait Off extends RenderLineNumbersType
  /* 0 */ val Off: typingsSlinky.monacoEditor.mod.editor.RenderLineNumbersType.Off with Double = js.native
  
  @js.native
  sealed trait On extends RenderLineNumbersType
  /* 1 */ val On: typingsSlinky.monacoEditor.mod.editor.RenderLineNumbersType.On with Double = js.native
  
  @js.native
  sealed trait Relative extends RenderLineNumbersType
  /* 2 */ val Relative: typingsSlinky.monacoEditor.mod.editor.RenderLineNumbersType.Relative with Double = js.native
}
