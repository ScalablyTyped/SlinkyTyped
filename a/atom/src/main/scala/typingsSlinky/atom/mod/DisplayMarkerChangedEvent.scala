package typingsSlinky.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisplayMarkerChangedEvent extends js.Object {
  /** Boolean indicating whether the marker had a tail before the change. */
  var hadTail: Boolean = js.native
  /** Boolean indicating whether the marker now has a tail */
  var hasTail: Boolean = js.native
  /** Boolean indicating whether the marker is now valid. */
  var isValid: Boolean = js.native
  /** Point representing the new head buffer position. */
  var newHeadBufferPosition: Point = js.native
  /** Point representing the new head screen position. */
  var newHeadScreenPosition: Point = js.native
  /**
    *  -DEPRECATED- Object containing the marker's custom properties after the change.
    *  @deprecated
    */
  var newProperties: js.Object = js.native
  /** Point representing the new tail buffer position. */
  var newTailBufferPosition: Point = js.native
  /** Point representing the new tail screen position. */
  var newTailScreenPosition: Point = js.native
  /** Point representing the former head buffer position. */
  var oldHeadBufferPosition: Point = js.native
  /** Point representing the former head screen position. */
  var oldHeadScreenPosition: Point = js.native
  /**
    *  -DEPRECATED- Object containing the marker's custom properties before the change.
    *  @deprecated
    */
  var oldProperties: js.Object = js.native
  // Point representing the former tail buffer position. */
  var oldTailBufferPosition: Point = js.native
  /** Point representing the former tail screen position. */
  var oldTailScreenPosition: Point = js.native
  /**
    *  Boolean indicating whether this change was caused by a textual change to the
    *  buffer or whether the marker was manipulated directly via its public API.
    */
  var textChanged: Boolean = js.native
  /** Boolean indicating whether the marker was valid before the change. */
  var wasValid: Boolean = js.native
}

object DisplayMarkerChangedEvent {
  @scala.inline
  def apply(
    hadTail: Boolean,
    hasTail: Boolean,
    isValid: Boolean,
    newHeadBufferPosition: Point,
    newHeadScreenPosition: Point,
    newProperties: js.Object,
    newTailBufferPosition: Point,
    newTailScreenPosition: Point,
    oldHeadBufferPosition: Point,
    oldHeadScreenPosition: Point,
    oldProperties: js.Object,
    oldTailBufferPosition: Point,
    oldTailScreenPosition: Point,
    textChanged: Boolean,
    wasValid: Boolean
  ): DisplayMarkerChangedEvent = {
    val __obj = js.Dynamic.literal(hadTail = hadTail.asInstanceOf[js.Any], hasTail = hasTail.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], newHeadBufferPosition = newHeadBufferPosition.asInstanceOf[js.Any], newHeadScreenPosition = newHeadScreenPosition.asInstanceOf[js.Any], newProperties = newProperties.asInstanceOf[js.Any], newTailBufferPosition = newTailBufferPosition.asInstanceOf[js.Any], newTailScreenPosition = newTailScreenPosition.asInstanceOf[js.Any], oldHeadBufferPosition = oldHeadBufferPosition.asInstanceOf[js.Any], oldHeadScreenPosition = oldHeadScreenPosition.asInstanceOf[js.Any], oldProperties = oldProperties.asInstanceOf[js.Any], oldTailBufferPosition = oldTailBufferPosition.asInstanceOf[js.Any], oldTailScreenPosition = oldTailScreenPosition.asInstanceOf[js.Any], textChanged = textChanged.asInstanceOf[js.Any], wasValid = wasValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayMarkerChangedEvent]
  }
  @scala.inline
  implicit class DisplayMarkerChangedEventOps[Self <: DisplayMarkerChangedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHadTail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hadTail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasTail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasTail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewHeadBufferPosition(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newHeadBufferPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewHeadScreenPosition(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newHeadScreenPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewProperties(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewTailBufferPosition(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTailBufferPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewTailScreenPosition(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTailScreenPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldHeadBufferPosition(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldHeadBufferPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldHeadScreenPosition(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldHeadScreenPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldProperties(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldTailBufferPosition(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldTailBufferPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldTailScreenPosition(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldTailScreenPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextChanged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWasValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasValid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

