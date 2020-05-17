package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the items of a combo box and makes it possible to register item and action event listeners. */
@js.native
trait XComboBox extends XInterface {
  /** returns the number of visible lines in the drop down mode. */
  var DropDownLineCount: Double = js.native
  /** returns the number of items in the combo box. */
  val ItemCount: Double = js.native
  /** returns all items of the combo box. */
  val Items: SafeArray[String] = js.native
  /** registers a listener for action events. */
  def addActionListener(l: XActionListener): Unit = js.native
  /** adds an item at the specified position. */
  def addItem(aItem: String, nPos: Double): Unit = js.native
  /** registers a listener for item events. */
  def addItemListener(l: XItemListener): Unit = js.native
  /** adds multiple items at the specified position. */
  def addItems(aItems: SeqEquiv[String], nPos: Double): Unit = js.native
  /** returns the number of visible lines in the drop down mode. */
  def getDropDownLineCount(): Double = js.native
  /** returns the item at the specified position. */
  def getItem(nPos: Double): String = js.native
  /** returns the number of items in the combo box. */
  def getItemCount(): Double = js.native
  /** returns all items of the combo box. */
  def getItems(): SafeArray[String] = js.native
  /** unregisters a listener for action events. */
  def removeActionListener(l: XActionListener): Unit = js.native
  /** unregisters a listener for item events. */
  def removeItemListener(l: XItemListener): Unit = js.native
  /** removes a number of items at the specified position. */
  def removeItems(nPos: Double, nCount: Double): Unit = js.native
  /** sets the number of visible lines for drop down mode. */
  def setDropDownLineCount(nLines: Double): Unit = js.native
}

object XComboBox {
  @scala.inline
  def apply(
    DropDownLineCount: Double,
    ItemCount: Double,
    Items: SafeArray[String],
    acquire: () => Unit,
    addActionListener: XActionListener => Unit,
    addItem: (String, Double) => Unit,
    addItemListener: XItemListener => Unit,
    addItems: (SeqEquiv[String], Double) => Unit,
    getDropDownLineCount: () => Double,
    getItem: Double => String,
    getItemCount: () => Double,
    getItems: () => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeActionListener: XActionListener => Unit,
    removeItemListener: XItemListener => Unit,
    removeItems: (Double, Double) => Unit,
    setDropDownLineCount: Double => Unit
  ): XComboBox = {
    val __obj = js.Dynamic.literal(DropDownLineCount = DropDownLineCount.asInstanceOf[js.Any], ItemCount = ItemCount.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addActionListener = js.Any.fromFunction1(addActionListener), addItem = js.Any.fromFunction2(addItem), addItemListener = js.Any.fromFunction1(addItemListener), addItems = js.Any.fromFunction2(addItems), getDropDownLineCount = js.Any.fromFunction0(getDropDownLineCount), getItem = js.Any.fromFunction1(getItem), getItemCount = js.Any.fromFunction0(getItemCount), getItems = js.Any.fromFunction0(getItems), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeActionListener = js.Any.fromFunction1(removeActionListener), removeItemListener = js.Any.fromFunction1(removeItemListener), removeItems = js.Any.fromFunction2(removeItems), setDropDownLineCount = js.Any.fromFunction1(setDropDownLineCount))
    __obj.asInstanceOf[XComboBox]
  }
  @scala.inline
  implicit class XComboBoxOps[Self <: XComboBox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDropDownLineCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DropDownLineCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddActionListener(value: XActionListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addActionListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddItem(value: (String, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addItem")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddItemListener(value: XItemListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addItemListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddItems(value: (SeqEquiv[String], Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addItems")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetDropDownLineCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDropDownLineCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetItem(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetItemCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetItems(value: () => SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveActionListener(value: XActionListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeActionListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveItemListener(value: XItemListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeItemListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveItems(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeItems")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetDropDownLineCount(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDropDownLineCount")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

