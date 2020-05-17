package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the menu's MenuItem object.
  */
@js.native
trait ASPxClientMenuItem extends js.Object {
  /**
    * Gets the item's index within the parent's collection of items.
    */
  var index: Double = js.native
  /**
    * For internal use only.
    */
  var indexPath: String = js.native
  /**
    * Gets the menu object to which the current item belongs.
    */
  var menu: ASPxClientMenuBase = js.native
  /**
    * Gets the name that uniquely identifies the menu item.
    */
  var name: String = js.native
  /**
    * Gets the immediate parent item to which the current item belongs.
    */
  var parent: ASPxClientMenuItem = js.native
  /**
    * Indicates whether the menu item is checked.
    */
  def GetChecked(): Boolean = js.native
  /**
    * Returns a value specifying whether a menu item is enabled.
    */
  def GetEnabled(): Boolean = js.native
  /**
    * Returns the URL pointing to the image displayed within the menu item.
    */
  def GetImageUrl(): String = js.native
  /**
    * Returns the current menu item's immediate subitem specified by its index. An ASPxClientMenuItem object representing the menu item's immediate subitem located at the specified index within the menu item's MenuItem.Items collection.
    * @param index An integer value specifying the zero-based index of the submenu item to be retrieved.
    */
  def GetItem(index: Double): ASPxClientMenuItem = js.native
  /**
    * Returns the current menu item's subitem specified by its name. An ASPxClientMenuItem object that represents the current menu item's subitem with the specified name.
    * @param name A string value specifying the name of the menu item.
    */
  def GetItemByName(name: String): ASPxClientMenuItem = js.native
  /**
    * Returns the number of the current menu item's immediate child items.
    */
  def GetItemCount(): Double = js.native
  /**
    * Gets a URL which defines the navigation location for the menu item.
    */
  def GetNavigateUrl(): String = js.native
  /**
    * Returns text displayed within the menu item.
    */
  def GetText(): String = js.native
  /**
    * Returns a value specifying whether a menu item is displayed.
    */
  def GetVisible(): Boolean = js.native
  /**
    * Specifies whether the menu item is checked.
    * @param value true if the menu item is checked; otherwise, false.
    */
  def SetChecked(value: Boolean): Unit = js.native
  /**
    * Specifies whether the menu item is enabled.
    * @param value true to enable the menu item; otherwise, false.
    */
  def SetEnabled(value: Boolean): Unit = js.native
  /**
    * Sets the URL which points to the image displayed within the menu item.
    * @param value A string value specifying the URL to the image displayed within the menu item.
    */
  def SetImageUrl(value: String): Unit = js.native
  /**
    * Specifies a URL which defines the navigation location for the menu item.
    * @param value A string value which specifies a URL to where the client web browser will navigate when the menu item is clicked.
    */
  def SetNavigateUrl(value: String): Unit = js.native
  /**
    * Sets the text to be displayed within the menu item.
    * @param value A string value specifying the text to be displayed within the menu item.
    */
  def SetText(value: String): Unit = js.native
  /**
    * Specifies the menu item's visibility.
    * @param value true if the menu item is visible; otherwise, false.
    */
  def SetVisible(value: Boolean): Unit = js.native
}

object ASPxClientMenuItem {
  @scala.inline
  def apply(
    GetChecked: () => Boolean,
    GetEnabled: () => Boolean,
    GetImageUrl: () => String,
    GetItem: Double => ASPxClientMenuItem,
    GetItemByName: String => ASPxClientMenuItem,
    GetItemCount: () => Double,
    GetNavigateUrl: () => String,
    GetText: () => String,
    GetVisible: () => Boolean,
    SetChecked: Boolean => Unit,
    SetEnabled: Boolean => Unit,
    SetImageUrl: String => Unit,
    SetNavigateUrl: String => Unit,
    SetText: String => Unit,
    SetVisible: Boolean => Unit,
    index: Double,
    indexPath: String,
    menu: ASPxClientMenuBase,
    name: String,
    parent: ASPxClientMenuItem
  ): ASPxClientMenuItem = {
    val __obj = js.Dynamic.literal(GetChecked = js.Any.fromFunction0(GetChecked), GetEnabled = js.Any.fromFunction0(GetEnabled), GetImageUrl = js.Any.fromFunction0(GetImageUrl), GetItem = js.Any.fromFunction1(GetItem), GetItemByName = js.Any.fromFunction1(GetItemByName), GetItemCount = js.Any.fromFunction0(GetItemCount), GetNavigateUrl = js.Any.fromFunction0(GetNavigateUrl), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetChecked = js.Any.fromFunction1(SetChecked), SetEnabled = js.Any.fromFunction1(SetEnabled), SetImageUrl = js.Any.fromFunction1(SetImageUrl), SetNavigateUrl = js.Any.fromFunction1(SetNavigateUrl), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible), index = index.asInstanceOf[js.Any], indexPath = indexPath.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientMenuItem]
  }
  @scala.inline
  implicit class ASPxClientMenuItemOps[Self <: ASPxClientMenuItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetChecked(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetChecked")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetImageUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetImageUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetItem(value: Double => ASPxClientMenuItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetItemByName(value: String => ASPxClientMenuItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetItemByName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetItemCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetItemCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNavigateUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetNavigateUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVisible(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetVisible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetChecked(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetChecked")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetEnabled(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetEnabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetImageUrl(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetImageUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetNavigateUrl(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetNavigateUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetText(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetVisible(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetVisible")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenu(value: ASPxClientMenuBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: ASPxClientMenuItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

