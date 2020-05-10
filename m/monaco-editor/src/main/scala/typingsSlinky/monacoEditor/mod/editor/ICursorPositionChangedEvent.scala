package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICursorPositionChangedEvent extends js.Object {
  /**
    * Primary cursor's position.
    */
  val position: Position = js.native
  /**
    * Reason.
    */
  val reason: CursorChangeReason = js.native
  /**
    * Secondary cursors' position.
    */
  val secondaryPositions: js.Array[Position] = js.native
  /**
    * Source of the call that caused the event.
    */
  val source: String = js.native
}

object ICursorPositionChangedEvent {
  @scala.inline
  def apply(
    position: Position,
    reason: CursorChangeReason,
    secondaryPositions: js.Array[Position],
    source: String
  ): ICursorPositionChangedEvent = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], secondaryPositions = secondaryPositions.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICursorPositionChangedEvent]
  }
  @scala.inline
  implicit class ICursorPositionChangedEventOps[Self <: ICursorPositionChangedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPosition(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: CursorChangeReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecondaryPositions(value: js.Array[Position]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryPositions")(value.asInstanceOf[js.Any])
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

