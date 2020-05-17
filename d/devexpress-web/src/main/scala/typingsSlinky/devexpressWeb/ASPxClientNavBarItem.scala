package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the navbar's NavBarItem object.
  */
@js.native
trait ASPxClientNavBarItem extends js.Object {
  /**
    * Gets the group to which the current item belongs.
    */
  var group: ASPxClientNavBarGroup = js.native
  /**
    * Gets the item's index within a collection of a group's items.
    */
  var index: Double = js.native
  /**
    * Gets the name that uniquely identifies the item.
    */
  var name: String = js.native
  /**
    * Gets the navbar to which the current item belongs.
    */
  var navBar: ASPxClientNavBar = js.native
  /**
    * Returns a value indicating whether an item is enabled.
    */
  def GetEnabled(): Boolean = js.native
  /**
    * Returns the URL which points to the image displayed within the item.
    */
  def GetImageUrl(): String = js.native
  /**
    * Gets an URL which defines the item's navigation location.
    */
  def GetNavigateUrl(): String = js.native
  /**
    * Returns text displayed within the item.
    */
  def GetText(): String = js.native
  /**
    * Returns a value specifying whether an item is displayed.
    */
  def GetVisible(): Boolean = js.native
  /**
    * Specifies whether the item is enabled.
    * @param value true if the item is enabled; otherwise, false.
    */
  def SetEnabled(value: Boolean): Unit = js.native
  /**
    * Specifies the URL which points to the image displayed within the item.
    * @param value A string value that specifies the URL to the image displayed within the item.
    */
  def SetImageUrl(value: String): Unit = js.native
  /**
    * Specifies a URL which defines the item's navigation location.
    * @param value A string value which represents the URL to where the client web browser will navigate when the item is clicked.
    */
  def SetNavigateUrl(value: String): Unit = js.native
  /**
    * Specifies the text displayed within the item.
    * @param value A string value that represents the text displayed within the item.
    */
  def SetText(value: String): Unit = js.native
  /**
    * Specifies whether the item is visible.
    * @param value true is the item is visible; otherwise, false.
    */
  def SetVisible(value: Boolean): Unit = js.native
}

object ASPxClientNavBarItem {
  @scala.inline
  def apply(
    GetEnabled: () => Boolean,
    GetImageUrl: () => String,
    GetNavigateUrl: () => String,
    GetText: () => String,
    GetVisible: () => Boolean,
    SetEnabled: Boolean => Unit,
    SetImageUrl: String => Unit,
    SetNavigateUrl: String => Unit,
    SetText: String => Unit,
    SetVisible: Boolean => Unit,
    group: ASPxClientNavBarGroup,
    index: Double,
    name: String,
    navBar: ASPxClientNavBar
  ): ASPxClientNavBarItem = {
    val __obj = js.Dynamic.literal(GetEnabled = js.Any.fromFunction0(GetEnabled), GetImageUrl = js.Any.fromFunction0(GetImageUrl), GetNavigateUrl = js.Any.fromFunction0(GetNavigateUrl), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetImageUrl = js.Any.fromFunction1(SetImageUrl), SetNavigateUrl = js.Any.fromFunction1(SetNavigateUrl), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible), group = group.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], navBar = navBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientNavBarItem]
  }
  @scala.inline
  implicit class ASPxClientNavBarItemOps[Self <: ASPxClientNavBarItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withGroup(value: ASPxClientNavBarGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavBar(value: ASPxClientNavBar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navBar")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

