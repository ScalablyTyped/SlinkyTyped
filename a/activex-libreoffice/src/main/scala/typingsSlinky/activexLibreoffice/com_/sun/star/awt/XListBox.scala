package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the items of a list box and makes it possible to register item and action event listeners. */
@js.native
trait XListBox extends XInterface {
  /** returns the number of visible lines in drop down mode. */
  var DropDownLineCount: Double = js.native
  /** returns the number of items in the listbox. */
  val ItemCount: Double = js.native
  /** returns all items of the list box. */
  val Items: SafeArray[String] = js.native
  /**
    * returns the currently selected item. When multiple items are selected, the first one is returned. When nothing is selected, an empty string is
    * returned.
    */
  val SelectedItem: String = js.native
  /**
    * returns the position of the currently selected item. When multiple items are selected, the position of the first one is returned. When nothing is
    * selected, -1 is returned.
    */
  val SelectedItemPos: Double = js.native
  /** returns all currently selected items. */
  val SelectedItems: SafeArray[String] = js.native
  /** returns the positions of all currently selected items. */
  val SelectedItemsPos: SafeArray[Double] = js.native
  /** registers a listener for action events. */
  def addActionListener(l: XActionListener): Unit = js.native
  /** adds an item at the specified position. */
  def addItem(aItem: String, nPos: Double): Unit = js.native
  /** registers a listener for item events. */
  def addItemListener(l: XItemListener): Unit = js.native
  /** adds multiple items at the specified position. */
  def addItems(aItems: SeqEquiv[String], nPos: Double): Unit = js.native
  /** returns the number of visible lines in drop down mode. */
  def getDropDownLineCount(): Double = js.native
  /** returns the item at the specified position. */
  def getItem(nPos: Double): String = js.native
  /** returns the number of items in the listbox. */
  def getItemCount(): Double = js.native
  /** returns all items of the list box. */
  def getItems(): SafeArray[String] = js.native
  /**
    * returns the currently selected item. When multiple items are selected, the first one is returned. When nothing is selected, an empty string is
    * returned.
    */
  def getSelectedItem(): String = js.native
  /**
    * returns the position of the currently selected item. When multiple items are selected, the position of the first one is returned. When nothing is
    * selected, -1 is returned.
    */
  def getSelectedItemPos(): Double = js.native
  /** returns all currently selected items. */
  def getSelectedItems(): SafeArray[String] = js.native
  /** returns the positions of all currently selected items. */
  def getSelectedItemsPos(): SafeArray[Double] = js.native
  /** returns `TRUE` if multiple items can be selected, `FALSE` if only one item can be selected. */
  def isMutipleMode(): Boolean = js.native
  /** makes the item at the specified position visible by scrolling. */
  def makeVisible(nEntry: Double): Unit = js.native
  /** unregisters a listener for action events. */
  def removeActionListener(l: XActionListener): Unit = js.native
  /** unregisters a listener for item events. */
  def removeItemListener(l: XItemListener): Unit = js.native
  /** removes a number of items at the specified position. */
  def removeItems(nPos: Double, nCount: Double): Unit = js.native
  /** selects/deselects the specified item. */
  def selectItem(aItem: String, bSelect: Boolean): Unit = js.native
  /** selects/deselects the item at the specified position. */
  def selectItemPos(nPos: Double, bSelect: Boolean): Unit = js.native
  /** selects/deselects multiple items at the specified positions. */
  def selectItemsPos(aPositions: SeqEquiv[Double], bSelect: Boolean): Unit = js.native
  /** sets the number of visible lines for drop down mode. */
  def setDropDownLineCount(nLines: Double): Unit = js.native
  /** determines if only a single item or multiple items can be selected. */
  def setMultipleMode(bMulti: Boolean): Unit = js.native
}

object XListBox {
  @scala.inline
  def apply(
    DropDownLineCount: Double,
    ItemCount: Double,
    Items: SafeArray[String],
    SelectedItem: String,
    SelectedItemPos: Double,
    SelectedItems: SafeArray[String],
    SelectedItemsPos: SafeArray[Double],
    acquire: () => Unit,
    addActionListener: XActionListener => Unit,
    addItem: (String, Double) => Unit,
    addItemListener: XItemListener => Unit,
    addItems: (SeqEquiv[String], Double) => Unit,
    getDropDownLineCount: () => Double,
    getItem: Double => String,
    getItemCount: () => Double,
    getItems: () => SafeArray[String],
    getSelectedItem: () => String,
    getSelectedItemPos: () => Double,
    getSelectedItems: () => SafeArray[String],
    getSelectedItemsPos: () => SafeArray[Double],
    isMutipleMode: () => Boolean,
    makeVisible: Double => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeActionListener: XActionListener => Unit,
    removeItemListener: XItemListener => Unit,
    removeItems: (Double, Double) => Unit,
    selectItem: (String, Boolean) => Unit,
    selectItemPos: (Double, Boolean) => Unit,
    selectItemsPos: (SeqEquiv[Double], Boolean) => Unit,
    setDropDownLineCount: Double => Unit,
    setMultipleMode: Boolean => Unit
  ): XListBox = {
    val __obj = js.Dynamic.literal(DropDownLineCount = DropDownLineCount.asInstanceOf[js.Any], ItemCount = ItemCount.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any], SelectedItem = SelectedItem.asInstanceOf[js.Any], SelectedItemPos = SelectedItemPos.asInstanceOf[js.Any], SelectedItems = SelectedItems.asInstanceOf[js.Any], SelectedItemsPos = SelectedItemsPos.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addActionListener = js.Any.fromFunction1(addActionListener), addItem = js.Any.fromFunction2(addItem), addItemListener = js.Any.fromFunction1(addItemListener), addItems = js.Any.fromFunction2(addItems), getDropDownLineCount = js.Any.fromFunction0(getDropDownLineCount), getItem = js.Any.fromFunction1(getItem), getItemCount = js.Any.fromFunction0(getItemCount), getItems = js.Any.fromFunction0(getItems), getSelectedItem = js.Any.fromFunction0(getSelectedItem), getSelectedItemPos = js.Any.fromFunction0(getSelectedItemPos), getSelectedItems = js.Any.fromFunction0(getSelectedItems), getSelectedItemsPos = js.Any.fromFunction0(getSelectedItemsPos), isMutipleMode = js.Any.fromFunction0(isMutipleMode), makeVisible = js.Any.fromFunction1(makeVisible), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeActionListener = js.Any.fromFunction1(removeActionListener), removeItemListener = js.Any.fromFunction1(removeItemListener), removeItems = js.Any.fromFunction2(removeItems), selectItem = js.Any.fromFunction2(selectItem), selectItemPos = js.Any.fromFunction2(selectItemPos), selectItemsPos = js.Any.fromFunction2(selectItemsPos), setDropDownLineCount = js.Any.fromFunction1(setDropDownLineCount), setMultipleMode = js.Any.fromFunction1(setMultipleMode))
    __obj.asInstanceOf[XListBox]
  }
  @scala.inline
  implicit class XListBoxOps[Self <: XListBox] (val x: Self) extends AnyVal {
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
    def withSelectedItem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectedItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedItemPos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectedItemPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedItems(value: SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedItemsPos(value: SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectedItemsPos")(value.asInstanceOf[js.Any])
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
    def withGetSelectedItem(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSelectedItemPos(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedItemPos")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSelectedItems(value: () => SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSelectedItemsPos(value: () => SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedItemsPos")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsMutipleMode(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMutipleMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMakeVisible(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("makeVisible")(js.Any.fromFunction1(value))
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
    def withSelectItem(value: (String, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectItem")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSelectItemPos(value: (Double, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectItemPos")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSelectItemsPos(value: (SeqEquiv[Double], Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectItemsPos")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetDropDownLineCount(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDropDownLineCount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMultipleMode(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMultipleMode")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

