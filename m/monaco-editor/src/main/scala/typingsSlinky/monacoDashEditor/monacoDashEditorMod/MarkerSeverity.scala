package typingsSlinky.monacoDashEditor.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MarkerSeverity extends js.Object

@JSImport("monaco-editor", "MarkerSeverity")
@js.native
object MarkerSeverity extends js.Object {
  @js.native
  sealed trait Error extends MarkerSeverity
  
  @js.native
  sealed trait Hint extends MarkerSeverity
  
  @js.native
  sealed trait Info extends MarkerSeverity
  
  @js.native
  sealed trait Warning extends MarkerSeverity
  
  /* 8 */ val Error: typingsSlinky.monacoDashEditor.monacoDashEditorMod.MarkerSeverity.Error with Double = js.native
  /* 1 */ val Hint: typingsSlinky.monacoDashEditor.monacoDashEditorMod.MarkerSeverity.Hint with Double = js.native
  /* 2 */ val Info: typingsSlinky.monacoDashEditor.monacoDashEditorMod.MarkerSeverity.Info with Double = js.native
  /* 4 */ val Warning: typingsSlinky.monacoDashEditor.monacoDashEditorMod.MarkerSeverity.Warning with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MarkerSeverity with Double] = js.native
}

