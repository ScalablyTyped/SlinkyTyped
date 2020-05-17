package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a collection of items in the Rich Edit's context menu.
  */
@js.native
trait ASPxClientRichEditPopupMenuItemCollection extends js.Object {
  /**
    * Adds the specified menu item to the end of the collection.
    * @param item An ASPxClientRichEditPopupMenuItem object specifying the item to be added to the collection.
    */
  def Add(item: ASPxClientRichEditPopupMenuItem): Unit = js.native
  /**
    * Removes all menu items from the collection.
    */
  def Clear(): Unit = js.native
  /**
    * Returns a menu item specified by its index in the collection. An ASPxClientRichEditPopupMenuItem object that is a menu item with the specified index.
    * @param index An integer value that is the zero-based index of the ASPxClientRichEditPopupMenuItem to retrieve from the ASPxClientRichEditPopupMenuItemCollection.
    */
  def Get(index: Double): ASPxClientRichEditPopupMenuItem = js.native
  /**
    * Returns an item object with the specified ASPxClientRichEditPopupMenuItem.name property value. An ASPxClientRichEditPopupMenuItem object with a specific value of the ASPxClientRichEditPopupMenuItem.name property.
    * @param name A string value representing the ASPxClientRichEditPopupMenuItem.name property value of the required item.
    */
  def GetByName(name: String): ASPxClientRichEditPopupMenuItem = js.native
  /**
    * Returns the total number of menu items in the collection.
    */
  def GetCount(): Double = js.native
  /**
    * Adds the specified item to the specified position within the collection.
    * @param index An integer value that specifies the zero-based index at which the specified item should be inserted.
    * @param item An ASPxClientRichEditPopupMenuItem object to insert.
    */
  def Insert(index: Double, item: ASPxClientRichEditPopupMenuItem): Unit = js.native
  /**
    * Removes a menu item specified by its index within the collection.
    * @param index An integer value specifying the index of the menu item to remove.
    */
  def Remove(index: Double): Unit = js.native
  /**
    * Removes a menu item specified by its name.
    * @param name A string value specifying the ASPxClientRichEditPopupMenuItem.name property value of a menu item to remove from the collection.
    */
  def RemoveByName(name: String): Unit = js.native
}

object ASPxClientRichEditPopupMenuItemCollection {
  @scala.inline
  def apply(
    Add: ASPxClientRichEditPopupMenuItem => Unit,
    Clear: () => Unit,
    Get: Double => ASPxClientRichEditPopupMenuItem,
    GetByName: String => ASPxClientRichEditPopupMenuItem,
    GetCount: () => Double,
    Insert: (Double, ASPxClientRichEditPopupMenuItem) => Unit,
    Remove: Double => Unit,
    RemoveByName: String => Unit
  ): ASPxClientRichEditPopupMenuItemCollection = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Clear = js.Any.fromFunction0(Clear), Get = js.Any.fromFunction1(Get), GetByName = js.Any.fromFunction1(GetByName), GetCount = js.Any.fromFunction0(GetCount), Insert = js.Any.fromFunction2(Insert), Remove = js.Any.fromFunction1(Remove), RemoveByName = js.Any.fromFunction1(RemoveByName))
    __obj.asInstanceOf[ASPxClientRichEditPopupMenuItemCollection]
  }
  @scala.inline
  implicit class ASPxClientRichEditPopupMenuItemCollectionOps[Self <: ASPxClientRichEditPopupMenuItemCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: ASPxClientRichEditPopupMenuItem => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet(value: Double => ASPxClientRichEditPopupMenuItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetByName(value: String => ASPxClientRichEditPopupMenuItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetByName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInsert(value: (Double, ASPxClientRichEditPopupMenuItem) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Insert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemove(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveByName(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveByName")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

