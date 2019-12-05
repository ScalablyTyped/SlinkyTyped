package typingsSlinky.officeDashJsDashPreview.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionMode extends js.Object

/**
  * [Api set: WordApi]
  */
@JSGlobal("Word.SelectionMode")
@js.native
object SelectionMode extends js.Object {
  @js.native
  sealed trait end extends SelectionMode
  
  @js.native
  sealed trait select extends SelectionMode
  
  @js.native
  sealed trait start extends SelectionMode
  
  /* "End" */ val end: typingsSlinky.officeDashJsDashPreview.Word.SelectionMode.end with String = js.native
  /* "Select" */ val select: typingsSlinky.officeDashJsDashPreview.Word.SelectionMode.select with String = js.native
  /* "Start" */ val start: typingsSlinky.officeDashJsDashPreview.Word.SelectionMode.start with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SelectionMode with String] = js.native
}

