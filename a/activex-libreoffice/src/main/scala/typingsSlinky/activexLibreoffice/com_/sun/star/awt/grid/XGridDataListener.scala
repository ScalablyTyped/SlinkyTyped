package typingsSlinky.activexLibreoffice.com_.sun.star.awt.grid

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataChanged(value: GridDataEvent => Unit): Self = this.set("dataChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRowHeadingChanged(value: GridDataEvent => Unit): Self = this.set("rowHeadingChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRowsInserted(value: GridDataEvent => Unit): Self = this.set("rowsInserted", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRowsRemoved(value: GridDataEvent => Unit): Self = this.set("rowsRemoved", js.Any.fromFunction1(value))
  }
}
