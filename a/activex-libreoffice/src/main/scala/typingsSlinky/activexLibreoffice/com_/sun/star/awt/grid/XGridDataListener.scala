package typingsSlinky.activexLibreoffice.com_.sun.star.awt.grid

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance of this interface is used by the {@link XGridDataModel} to get notifications about data model changes.
  *
  * Usually you must not implement this interface yourself, but you must notify it correctly if you implement the {@link XGridDataModel} yourself
  *
  * .
  * @since OOo 3.3
  */
@js.native
trait XGridDataListener extends XEventListener {
  /** is called when existing data in a grid control's data model has been modified. */
  def dataChanged(Event: GridDataEvent): Unit = js.native
  /** is called when the title of one or more rows changed. */
  def rowHeadingChanged(Event: GridDataEvent): Unit = js.native
  /** is called when one or more rows of data have been inserted into a grid control's data model. */
  def rowsInserted(Event: GridDataEvent): Unit = js.native
  /** is called when one or more rows of data have been removed from a grid control's data model. */
  def rowsRemoved(Event: GridDataEvent): Unit = js.native
}

object XGridDataListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    dataChanged: GridDataEvent => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    rowHeadingChanged: GridDataEvent => Unit,
    rowsInserted: GridDataEvent => Unit,
    rowsRemoved: GridDataEvent => Unit
  ): XGridDataListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), dataChanged = js.Any.fromFunction1(dataChanged), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), rowHeadingChanged = js.Any.fromFunction1(rowHeadingChanged), rowsInserted = js.Any.fromFunction1(rowsInserted), rowsRemoved = js.Any.fromFunction1(rowsRemoved))
    __obj.asInstanceOf[XGridDataListener]
  }
  @scala.inline
  implicit class XGridDataListenerOps[Self <: XGridDataListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataChanged(value: GridDataEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRowHeadingChanged(value: GridDataEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeadingChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRowsInserted(value: GridDataEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsInserted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRowsRemoved(value: GridDataEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsRemoved")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

