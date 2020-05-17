package typingsSlinky.activexLibreoffice.com_.sun.star.awt.grid

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event used by a {@link XGridControl} to notify changes in its row selection.
  * @see XGridRowSelection
  * @see XGridSelectionListener
  */
@js.native
trait GridSelectionEvent extends EventObject {
  /** denotes the indexes of the columns being selected at the time the event was fired. */
  var SelectedColumnIndexes: SafeArray[Double] = js.native
  /** denotes the indexes of the rows being selected at the time the event was fired. */
  var SelectedRowIndexes: SafeArray[Double] = js.native
}

object GridSelectionEvent {
  @scala.inline
  def apply(
    SelectedColumnIndexes: SafeArray[Double],
    SelectedRowIndexes: SafeArray[Double],
    Source: XInterface
  ): GridSelectionEvent = {
    val __obj = js.Dynamic.literal(SelectedColumnIndexes = SelectedColumnIndexes.asInstanceOf[js.Any], SelectedRowIndexes = SelectedRowIndexes.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridSelectionEvent]
  }
  @scala.inline
  implicit class GridSelectionEventOps[Self <: GridSelectionEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelectedColumnIndexes(value: SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectedColumnIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedRowIndexes(value: SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectedRowIndexes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

