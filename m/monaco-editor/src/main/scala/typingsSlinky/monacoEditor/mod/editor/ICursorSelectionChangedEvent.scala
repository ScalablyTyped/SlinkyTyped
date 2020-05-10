package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.mod.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICursorSelectionChangedEvent extends js.Object {
  /**
    * Reason.
    */
  val reason: CursorChangeReason = js.native
  /**
    * The secondary selections.
    */
  val secondarySelections: js.Array[Selection] = js.native
  /**
    * The primary selection.
    */
  val selection: Selection = js.native
  /**
    * Source of the call that caused the event.
    */
  val source: String = js.native
}

object ICursorSelectionChangedEvent {
  @scala.inline
  def apply(
    reason: CursorChangeReason,
    secondarySelections: js.Array[Selection],
    selection: Selection,
    source: String
  ): ICursorSelectionChangedEvent = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], secondarySelections = secondarySelections.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICursorSelectionChangedEvent]
  }
  @scala.inline
  implicit class ICursorSelectionChangedEventOps[Self <: ICursorSelectionChangedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReason(value: CursorChangeReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecondarySelections(value: js.Array[Selection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondarySelections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelection(value: Selection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

