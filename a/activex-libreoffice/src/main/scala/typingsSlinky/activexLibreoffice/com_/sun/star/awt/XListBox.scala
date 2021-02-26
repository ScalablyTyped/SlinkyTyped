package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class XListBoxMutableBuilder[Self <: XListBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddActionListener(value: XActionListener => Unit): Self = StObject.set(x, "addActionListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddItem(value: (String, Double) => Unit): Self = StObject.set(x, "addItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddItemListener(value: XItemListener => Unit): Self = StObject.set(x, "addItemListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddItems(value: (SeqEquiv[String], Double) => Unit): Self = StObject.set(x, "addItems", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDropDownLineCount(value: Double): Self = StObject.set(x, "DropDownLineCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDropDownLineCount(value: () => Double): Self = StObject.set(x, "getDropDownLineCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItem(value: Double => String): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemCount(value: () => Double): Self = StObject.set(x, "getItemCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItems(value: () => SafeArray[String]): Self = StObject.set(x, "getItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectedItem(value: () => String): Self = StObject.set(x, "getSelectedItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectedItemPos(value: () => Double): Self = StObject.set(x, "getSelectedItemPos", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectedItems(value: () => SafeArray[String]): Self = StObject.set(x, "getSelectedItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectedItemsPos(value: () => SafeArray[Double]): Self = StObject.set(x, "getSelectedItemsPos", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsMutipleMode(value: () => Boolean): Self = StObject.set(x, "isMutipleMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setItemCount(value: Double): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: SafeArray[String]): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMakeVisible(value: Double => Unit): Self = StObject.set(x, "makeVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveActionListener(value: XActionListener => Unit): Self = StObject.set(x, "removeActionListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveItemListener(value: XItemListener => Unit): Self = StObject.set(x, "removeItemListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveItems(value: (Double, Double) => Unit): Self = StObject.set(x, "removeItems", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelectItem(value: (String, Boolean) => Unit): Self = StObject.set(x, "selectItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelectItemPos(value: (Double, Boolean) => Unit): Self = StObject.set(x, "selectItemPos", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelectItemsPos(value: (SeqEquiv[Double], Boolean) => Unit): Self = StObject.set(x, "selectItemsPos", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelectedItem(value: String): Self = StObject.set(x, "SelectedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItemPos(value: Double): Self = StObject.set(x, "SelectedItemPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItems(value: SafeArray[String]): Self = StObject.set(x, "SelectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItemsPos(value: SafeArray[Double]): Self = StObject.set(x, "SelectedItemsPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetDropDownLineCount(value: Double => Unit): Self = StObject.set(x, "setDropDownLineCount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMultipleMode(value: Boolean => Unit): Self = StObject.set(x, "setMultipleMode", js.Any.fromFunction1(value))
  }
}
