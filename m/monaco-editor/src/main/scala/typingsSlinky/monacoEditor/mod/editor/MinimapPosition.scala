package typingsSlinky.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MinimapPosition extends StObject
@JSImport("monaco-editor", "editor.MinimapPosition")
@js.native
object MinimapPosition extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MinimapPosition with Double] = js.native
  
  @js.native
  sealed trait Gutter extends MinimapPosition
  /* 2 */ val Gutter: typingsSlinky.monacoEditor.mod.editor.MinimapPosition.Gutter with Double = js.native
  
  @js.native
  sealed trait Inline extends MinimapPosition
  /* 1 */ val Inline: typingsSlinky.monacoEditor.mod.editor.MinimapPosition.Inline with Double = js.native
}
