package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ASPxFormLayout's LayoutItem object.
  */
@js.native
trait ASPxClientLayoutItem extends js.Object {
  /**
    * Gets the form layout object to which the current item belongs.
    */
  var formLayout: ASPxClientFormLayout = js.native
  /**
    * Gets the name that uniquely identifies the layout item.
    */
  var name: String = js.native
  /**
    * Gets the immediate parent layout item to which the current layout item belongs.
    */
  var parent: ASPxClientLayoutItem = js.native
  /**
    * Returns the text displayed in the layout item caption.
    */
  def GetCaption(): String = js.native
  /**
    * Returns the current layout item's subitem specified by its name. An ASPxClientLayoutItem object that represents the current layout item's subitem with the specified name.
    * @param name A string value specifying the name of the layout item.
    */
  def GetItemByName(name: String): ASPxClientLayoutItem = js.native
  /**
    * Returns a value specifying whether a layout item is displayed.
    */
  def GetVisible(): Boolean = js.native
  /**
    * Specifies the text displayed in the layout item caption.
    * @param caption A string value specifying the item caption.
    */
  def SetCaption(caption: String): Unit = js.native
  /**
    * Specifies the layout item's visibility.
    * @param value true, if the layout item is visible; otherwise, false.
    */
  def SetVisible(value: Boolean): Unit = js.native
}

object ASPxClientLayoutItem {
  @scala.inline
  def apply(
    GetCaption: () => String,
    GetItemByName: String => ASPxClientLayoutItem,
    GetVisible: () => Boolean,
    SetCaption: String => Unit,
    SetVisible: Boolean => Unit,
    formLayout: ASPxClientFormLayout,
    name: String,
    parent: ASPxClientLayoutItem
  ): ASPxClientLayoutItem = {
    val __obj = js.Dynamic.literal(GetCaption = js.Any.fromFunction0(GetCaption), GetItemByName = js.Any.fromFunction1(GetItemByName), GetVisible = js.Any.fromFunction0(GetVisible), SetCaption = js.Any.fromFunction1(SetCaption), SetVisible = js.Any.fromFunction1(SetVisible), formLayout = formLayout.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientLayoutItem]
  }
  @scala.inline
  implicit class ASPxClientLayoutItemOps[Self <: ASPxClientLayoutItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCaption(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetCaption")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetItemByName(value: String => ASPxClientLayoutItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetItemByName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetVisible(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetVisible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetCaption(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetCaption")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetVisible(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetVisible")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormLayout(value: ASPxClientFormLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: ASPxClientLayoutItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

