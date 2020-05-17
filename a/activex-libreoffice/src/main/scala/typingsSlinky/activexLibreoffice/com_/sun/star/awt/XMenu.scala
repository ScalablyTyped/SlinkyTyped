package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a simple menu. */
@js.native
trait XMenu extends XInterface {
  /**
    * returns the number of items in the menu.
    * @returns the number of items in this {@link XMenu} .
    */
  val ItemCount: Double = js.native
  /**
    * adds the specified menu listener to receive events from this menu.
    * @param xListener the {@link XMenuListener} to be added.
    */
  def addMenuListener(xListener: XMenuListener): Unit = js.native
  /** removes all items from the menu. */
  def clear(): Unit = js.native
  /**
    * specifies whether mnemonics are automatically assigned to menu items, or not.
    * @param bEnable if `TRUE` , mnemonics are automatically assigned to menu items.
    */
  def enableAutoMnemonics(bEnable: Boolean): Unit = js.native
  /**
    * enables or disables the menu item.
    * @param nItemId specifies the menu item ID.
    * @param bEnable specifies whether the menu item should be enabled ( `TRUE` ) or disabled ( `FALSE` ).
    */
  def enableItem(nItemId: Double, bEnable: Boolean): Unit = js.native
  /**
    * retrieves the command string for the menu item.
    * @param nItemId specifies the menu item ID for which the command URL should be set.
    * @returns the command of the menu item.
    */
  def getCommand(nItemId: Double): String = js.native
  /**
    * retrieves the help command string for the menu item.
    * @param nItemId specifies the menu item ID for which the help command should be set.
    * @returns the help command of the menu item.
    */
  def getHelpCommand(nItemId: Double): String = js.native
  /**
    * retrieves the help text for the menu item.
    * @param nItemId specifies the menu item identifier for which the help text should be retrieved.
    * @returns a string with the help text.
    */
  def getHelpText(nItemId: Double): String = js.native
  /**
    * returns the number of items in the menu.
    * @returns the number of items in this {@link XMenu} .
    */
  def getItemCount(): Double = js.native
  /**
    * returns the ID of the item at the specified position.
    * @param nItemPos specifies the position of the menu item for which the item ID is queried.
    * @returns the ID of the menu item at the given position.
    */
  def getItemId(nItemPos: Double): Double = js.native
  /**
    * returns the position of the item with the specified ID.
    * @param nItemId specifies the ID of the menu item for which the item position is queried.
    * @returns the position of the menu item with the specified ID.
    */
  def getItemPos(nItemId: Double): Double = js.native
  /**
    * returns the string for the given item id.
    * @param nItemId specifies the ID of the menu item.
    * @returns the label of the menu item.
    */
  def getItemText(nItemId: Double): String = js.native
  /**
    * retrieves the type of the menu item.
    * @param nItemPos specifies the position of the menu item for which the item type is queried.
    * @returns a MenuItemType indicating the item type.
    */
  def getItemType(nItemPos: Double): MenuItemType = js.native
  /**
    * returns the popup menu from the menu item.
    * @param nItemId specifies the menu item ID for which the {@link XPopupMenu} should be retrieved.
    * @returns a {@link XPopupMenu} .
    */
  def getPopupMenu(nItemId: Double): XPopupMenu = js.native
  /**
    * retrieves the tip help text for the menu item.
    * @param nItemId specifies the menu item identifier for which the tip help text should be retrieved.
    * @returns a string with the tip help text.
    */
  def getTipHelpText(nItemId: Double): String = js.native
  /**
    * specifies whether disabled menu entries should be hidden, or not.
    * @param bHide if `TRUE` , disabled menu entries are hidden.
    */
  def hideDisabledEntries(bHide: Boolean): Unit = js.native
  /**
    * inserts an item into the menu.
    *
    * The item is appended if the position is greater than or equal to {@link getItemCount()} or if it is negative.
    * @param nItemId specifies the ID of the menu item to be inserted.
    * @param aText specifies the label of the menu item.
    * @param nItemStyle specifies the style of the menu item, as defined in {@link MenuItemStyle} .
    * @param nItemPos specifies the position where the menu item will be inserted.
    */
  def insertItem(nItemId: Double, aText: String, nItemStyle: Double, nItemPos: Double): Unit = js.native
  /**
    * returns the state of the menu item.
    * @param nItemId specifies the menu item ID.
    * @returns `TRUE` if the item is enabled, `FALSE` otherwise.
    */
  def isItemEnabled(nItemId: Double): Boolean = js.native
  /**
    * checks whether an {@link XMenu} is an {@link XPopupMenu} .
    * @returns `TRUE` if the menu is a {@link PopupMenu} , `FALSE` if it is a {@link MenuBar} .
    */
  def isPopupMenu(): Boolean = js.native
  /**
    * removes one or more items from the menu.
    * @param nItemPos specifies the position of the (first) menu item to be removed.
    * @param nCount specifies the number of menu items to remove.
    */
  def removeItem(nItemPos: Double, nCount: Double): Unit = js.native
  /**
    * removes the specified menu listener so that it no longer receives events from this menu.
    * @param xListener the {@link XMenuListener} to be removed.
    */
  def removeMenuListener(xListener: XMenuListener): Unit = js.native
  /**
    * sets the command string for the menu item.
    * @param nItemId specifies the menu item ID for which the command should be set.
    * @param aCommand specifies the command for the menu item.
    */
  def setCommand(nItemId: Double, aCommand: String): Unit = js.native
  /**
    * sets the help command string for the menu item.
    * @param nItemId specifies the menu item ID for which the help command URL be set.
    * @param aCommand specifies the help command for the menu item.
    */
  def setHelpCommand(nItemId: Double, aCommand: String): Unit = js.native
  /**
    * sets the help text for the menu item.
    * @param nItemId specifies the menu item identifier for which the help text should be set.
    * @param sHelpText specifies the help text for the menu item.
    */
  def setHelpText(nItemId: Double, sHelpText: String): Unit = js.native
  /**
    * sets the text for the menu item.
    * @param nItemId specifies the ID of the menu item.
    * @param aText specifies the label of the menu item.
    */
  def setItemText(nItemId: Double, aText: String): Unit = js.native
  /**
    * sets the popup menu for a specified menu item.
    * @param nItemId specifies the menu item ID for which the {@link XPopupMenu} should be set.
    * @param aPopupMenu specifies a {@link XPopupMenu} .
    */
  def setPopupMenu(nItemId: Double, aPopupMenu: XPopupMenu): Unit = js.native
  /**
    * sets the tip help text for the menu item.
    * @param nItemId specifies the menu item identifier for which the tip help text should be set.
    * @param sTipHelpText specifies the tip help text for the menu item.
    */
  def setTipHelpText(nItemId: Double, sTipHelpText: String): Unit = js.native
}

object XMenu {
  @scala.inline
  def apply(
    ItemCount: Double,
    acquire: () => Unit,
    addMenuListener: XMenuListener => Unit,
    clear: () => Unit,
    enableAutoMnemonics: Boolean => Unit,
    enableItem: (Double, Boolean) => Unit,
    getCommand: Double => String,
    getHelpCommand: Double => String,
    getHelpText: Double => String,
    getItemCount: () => Double,
    getItemId: Double => Double,
    getItemPos: Double => Double,
    getItemText: Double => String,
    getItemType: Double => MenuItemType,
    getPopupMenu: Double => XPopupMenu,
    getTipHelpText: Double => String,
    hideDisabledEntries: Boolean => Unit,
    insertItem: (Double, String, Double, Double) => Unit,
    isItemEnabled: Double => Boolean,
    isPopupMenu: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeItem: (Double, Double) => Unit,
    removeMenuListener: XMenuListener => Unit,
    setCommand: (Double, String) => Unit,
    setHelpCommand: (Double, String) => Unit,
    setHelpText: (Double, String) => Unit,
    setItemText: (Double, String) => Unit,
    setPopupMenu: (Double, XPopupMenu) => Unit,
    setTipHelpText: (Double, String) => Unit
  ): XMenu = {
    val __obj = js.Dynamic.literal(ItemCount = ItemCount.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addMenuListener = js.Any.fromFunction1(addMenuListener), clear = js.Any.fromFunction0(clear), enableAutoMnemonics = js.Any.fromFunction1(enableAutoMnemonics), enableItem = js.Any.fromFunction2(enableItem), getCommand = js.Any.fromFunction1(getCommand), getHelpCommand = js.Any.fromFunction1(getHelpCommand), getHelpText = js.Any.fromFunction1(getHelpText), getItemCount = js.Any.fromFunction0(getItemCount), getItemId = js.Any.fromFunction1(getItemId), getItemPos = js.Any.fromFunction1(getItemPos), getItemText = js.Any.fromFunction1(getItemText), getItemType = js.Any.fromFunction1(getItemType), getPopupMenu = js.Any.fromFunction1(getPopupMenu), getTipHelpText = js.Any.fromFunction1(getTipHelpText), hideDisabledEntries = js.Any.fromFunction1(hideDisabledEntries), insertItem = js.Any.fromFunction4(insertItem), isItemEnabled = js.Any.fromFunction1(isItemEnabled), isPopupMenu = js.Any.fromFunction0(isPopupMenu), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeItem = js.Any.fromFunction2(removeItem), removeMenuListener = js.Any.fromFunction1(removeMenuListener), setCommand = js.Any.fromFunction2(setCommand), setHelpCommand = js.Any.fromFunction2(setHelpCommand), setHelpText = js.Any.fromFunction2(setHelpText), setItemText = js.Any.fromFunction2(setItemText), setPopupMenu = js.Any.fromFunction2(setPopupMenu), setTipHelpText = js.Any.fromFunction2(setTipHelpText))
    __obj.asInstanceOf[XMenu]
  }
  @scala.inline
  implicit class XMenuOps[Self <: XMenu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddMenuListener(value: XMenuListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMenuListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnableAutoMnemonics(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoMnemonics")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnableItem(value: (Double, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableItem")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetCommand(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCommand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetHelpCommand(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHelpCommand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetHelpText(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHelpText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetItemCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetItemId(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetItemPos(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemPos")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetItemText(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetItemType(value: Double => MenuItemType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPopupMenu(value: Double => XPopupMenu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPopupMenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTipHelpText(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTipHelpText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHideDisabledEntries(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDisabledEntries")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsertItem(value: (Double, String, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertItem")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withIsItemEnabled(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isItemEnabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsPopupMenu(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPopupMenu")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveItem(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeItem")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveMenuListener(value: XMenuListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMenuListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetCommand(value: (Double, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCommand")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetHelpCommand(value: (Double, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHelpCommand")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetHelpText(value: (Double, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHelpText")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetItemText(value: (Double, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItemText")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetPopupMenu(value: (Double, XPopupMenu) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPopupMenu")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetTipHelpText(value: (Double, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTipHelpText")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

