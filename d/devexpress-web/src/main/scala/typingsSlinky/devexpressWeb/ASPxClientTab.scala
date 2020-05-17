package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of a tab control's Tab or a page control's TabPage object.
  */
@js.native
trait ASPxClientTab extends js.Object {
  /**
    * Gets the index of the current tab (tabbed page) within the control's collection of tabs (tabbed pages).
    */
  var index: Double = js.native
  /**
    * Gets the name that uniquely identifies the current tab.
    */
  var name: String = js.native
  /**
    * Gets the tab control to which the current tab belongs.
    */
  var tabControl: ASPxClientTabControlBase = js.native
  /**
    * Returns the URL pointing to the image displayed within the active tab.
    */
  def GetActiveImageUrl(): String = js.native
  /**
    * Returns a value specifying whether a tab is enabled.
    */
  def GetEnabled(): Boolean = js.native
  /**
    * Returns the URL pointing to the image displayed within the tab.
    */
  def GetImageUrl(): String = js.native
  /**
    * Gets an URL which defines the navigation location for the tab.
    */
  def GetNavigateUrl(): String = js.native
  /**
    * Returns text displayed within the tab.
    */
  def GetText(): String = js.native
  /**
    * Returns a value specifying whether a tab is displayed.
    */
  def GetVisible(): Boolean = js.native
  /**
    * Specifies the URL which points to the image displayed within the active tab.
    * @param value A string value that is the URL to the image displayed within the active tab.
    */
  def SetActiveImageUrl(value: String): Unit = js.native
  /**
    * Specifies whether the tab is enabled.
    * @param value true to enable the tab; otherwise, false.
    */
  def SetEnabled(value: Boolean): Unit = js.native
  /**
    * Specifies the URL which points to the image displayed within the tab.
    * @param value A string value that is the URL to the image displayed within the tab.
    */
  def SetImageUrl(value: String): Unit = js.native
  /**
    * Specifies a URL which defines the navigation location for the tab.
    * @param value A string value which is a URL to where the client web browser will navigate when the tab is clicked.
    */
  def SetNavigateUrl(value: String): Unit = js.native
  /**
    * Specifies the text displayed within the tab.
    * @param value A string value that is the text displayed within the tab.
    */
  def SetText(value: String): Unit = js.native
  /**
    * Specifies whether the tab is visible.
    * @param value true is the tab is visible; otherwise, false.
    */
  def SetVisible(value: Boolean): Unit = js.native
}

object ASPxClientTab {
  @scala.inline
  def apply(
    GetActiveImageUrl: () => String,
    GetEnabled: () => Boolean,
    GetImageUrl: () => String,
    GetNavigateUrl: () => String,
    GetText: () => String,
    GetVisible: () => Boolean,
    SetActiveImageUrl: String => Unit,
    SetEnabled: Boolean => Unit,
    SetImageUrl: String => Unit,
    SetNavigateUrl: String => Unit,
    SetText: String => Unit,
    SetVisible: Boolean => Unit,
    index: Double,
    name: String,
    tabControl: ASPxClientTabControlBase
  ): ASPxClientTab = {
    val __obj = js.Dynamic.literal(GetActiveImageUrl = js.Any.fromFunction0(GetActiveImageUrl), GetEnabled = js.Any.fromFunction0(GetEnabled), GetImageUrl = js.Any.fromFunction0(GetImageUrl), GetNavigateUrl = js.Any.fromFunction0(GetNavigateUrl), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetActiveImageUrl = js.Any.fromFunction1(SetActiveImageUrl), SetEnabled = js.Any.fromFunction1(SetEnabled), SetImageUrl = js.Any.fromFunction1(SetImageUrl), SetNavigateUrl = js.Any.fromFunction1(SetNavigateUrl), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible), index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tabControl = tabControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTab]
  }
  @scala.inline
  implicit class ASPxClientTabOps[Self <: ASPxClientTab] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetActiveImageUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetActiveImageUrl")(js.Any.fromFunction0(value))
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
    def withSetActiveImageUrl(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetActiveImageUrl")(js.Any.fromFunction1(value))
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabControl(value: ASPxClientTabControlBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabControl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

