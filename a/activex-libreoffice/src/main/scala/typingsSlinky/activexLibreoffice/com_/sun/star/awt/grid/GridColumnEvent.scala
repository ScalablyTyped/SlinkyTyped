package typingsSlinky.activexLibreoffice.com_.sun.star.awt.grid

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event used by a {@link XGridColumn} to notify changes in the column.
  * @since OOo 3.3
  */
@js.native
trait GridColumnEvent extends EventObject {
  /** Contains the name of the attributes whose value changed. */
  var AttributeName: String = js.native
  /** Contains the index of the changed column */
  var ColumnIndex: Double = js.native
  /** Contains the new value */
  var NewValue: js.Any = js.native
  /** Contains the old value */
  var OldValue: js.Any = js.native
}

object GridColumnEvent {
  @scala.inline
  def apply(AttributeName: String, ColumnIndex: Double, NewValue: js.Any, OldValue: js.Any, Source: XInterface): GridColumnEvent = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], ColumnIndex = ColumnIndex.asInstanceOf[js.Any], NewValue = NewValue.asInstanceOf[js.Any], OldValue = OldValue.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridColumnEvent]
  }
  @scala.inline
  implicit class GridColumnEventOps[Self <: GridColumnEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OldValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

