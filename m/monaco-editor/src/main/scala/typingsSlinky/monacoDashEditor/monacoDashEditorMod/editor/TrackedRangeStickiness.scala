package typingsSlinky.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TrackedRangeStickiness extends js.Object

@JSImport("monaco-editor", "editor.TrackedRangeStickiness")
@js.native
object TrackedRangeStickiness extends js.Object {
  @js.native
  sealed trait AlwaysGrowsWhenTypingAtEdges extends TrackedRangeStickiness
  
  @js.native
  sealed trait GrowsOnlyWhenTypingAfter extends TrackedRangeStickiness
  
  @js.native
  sealed trait GrowsOnlyWhenTypingBefore extends TrackedRangeStickiness
  
  @js.native
  sealed trait NeverGrowsWhenTypingAtEdges extends TrackedRangeStickiness
  
  /* 0 */ val AlwaysGrowsWhenTypingAtEdges: typingsSlinky.monacoDashEditor.monacoDashEditorMod.editor.TrackedRangeStickiness.AlwaysGrowsWhenTypingAtEdges with Double = js.native
  /* 3 */ val GrowsOnlyWhenTypingAfter: typingsSlinky.monacoDashEditor.monacoDashEditorMod.editor.TrackedRangeStickiness.GrowsOnlyWhenTypingAfter with Double = js.native
  /* 2 */ val GrowsOnlyWhenTypingBefore: typingsSlinky.monacoDashEditor.monacoDashEditorMod.editor.TrackedRangeStickiness.GrowsOnlyWhenTypingBefore with Double = js.native
  /* 1 */ val NeverGrowsWhenTypingAtEdges: typingsSlinky.monacoDashEditor.monacoDashEditorMod.editor.TrackedRangeStickiness.NeverGrowsWhenTypingAtEdges with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TrackedRangeStickiness with Double] = js.native
}

