package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of a popup control's PopupWindow object.
  */
@js.native
trait ASPxClientPopupWindow extends js.Object {
  /**
    * Gets the index of the current popup window within the popup control's ASPxPopupControl.Windows collection.
    */
  var index: Double = js.native
  /**
    * Gets the name that uniquely identifies the current popup window.
    */
  var name: String = js.native
  /**
    * Gets the popup control to which the current popup window belongs.
    */
  var popupControl: ASPxClientPopupControl = js.native
  /**
    * Returns the URL pointing to the image displayed within the <strong>window footer</strong>.
    */
  def GetFooterImageUrl(): String = js.native
  /**
    * Returns the URL where the web browser will navigate when the text or image is clicked within the popup window's <strong>footer</strong>.
    */
  def GetFooterNavigateUrl(): String = js.native
  /**
    * Returns the text displayed within the popup window's <strong>footer</strong>.
    */
  def GetFooterText(): String = js.native
  /**
    * Returns the URL pointing to the image displayed within the <strong>window header</strong>.
    */
  def GetHeaderImageUrl(): String = js.native
  /**
    * Returns the URL where the web browser will navigate when the text or image is clicked within the popup window's <strong>header</strong>.
    */
  def GetHeaderNavigateUrl(): String = js.native
  /**
    * Returns the text displayed within the window's <strong>header</strong>.
    */
  def GetHeaderText(): String = js.native
  /**
    * Specifies the URL which points to the image displayed within the <strong>window footer</strong>.
    * @param value A string value that is the URL to the image displayed within the window footer.
    */
  def SetFooterImageUrl(value: String): Unit = js.native
  /**
    * Specifies the URL where the web browser will navigate when the text or image is clicked within the popup window's <strong>footer</strong>.
    * @param value A string value which specifies the required navigation location.
    */
  def SetFooterNavigateUrl(value: String): Unit = js.native
  /**
    * Specifies the text displayed within the window's <strong>footer</strong>.
    * @param value A string value that specifies the window's footer text.
    */
  def SetFooterText(value: String): Unit = js.native
  /**
    * Specifies the URL which points to the image displayed within the <strong>window header</strong>.
    * @param value A string value that is the URL to the image displayed within the header.
    */
  def SetHeaderImageUrl(value: String): Unit = js.native
  /**
    * Returns the URL where the web browser will navigate when the text or image is clicked within the popup window's <strong>header</strong>.
    * @param value A string value which specifies the required navigation location.
    */
  def SetHeaderNavigateUrl(value: String): Unit = js.native
  /**
    * Specifies the text displayed within the window's <strong>header</strong>.
    * @param value A string value that specifies the window's header text.
    */
  def SetHeaderText(value: String): Unit = js.native
}

object ASPxClientPopupWindow {
  @scala.inline
  def apply(
    GetFooterImageUrl: () => String,
    GetFooterNavigateUrl: () => String,
    GetFooterText: () => String,
    GetHeaderImageUrl: () => String,
    GetHeaderNavigateUrl: () => String,
    GetHeaderText: () => String,
    SetFooterImageUrl: String => Unit,
    SetFooterNavigateUrl: String => Unit,
    SetFooterText: String => Unit,
    SetHeaderImageUrl: String => Unit,
    SetHeaderNavigateUrl: String => Unit,
    SetHeaderText: String => Unit,
    index: Double,
    name: String,
    popupControl: ASPxClientPopupControl
  ): ASPxClientPopupWindow = {
    val __obj = js.Dynamic.literal(GetFooterImageUrl = js.Any.fromFunction0(GetFooterImageUrl), GetFooterNavigateUrl = js.Any.fromFunction0(GetFooterNavigateUrl), GetFooterText = js.Any.fromFunction0(GetFooterText), GetHeaderImageUrl = js.Any.fromFunction0(GetHeaderImageUrl), GetHeaderNavigateUrl = js.Any.fromFunction0(GetHeaderNavigateUrl), GetHeaderText = js.Any.fromFunction0(GetHeaderText), SetFooterImageUrl = js.Any.fromFunction1(SetFooterImageUrl), SetFooterNavigateUrl = js.Any.fromFunction1(SetFooterNavigateUrl), SetFooterText = js.Any.fromFunction1(SetFooterText), SetHeaderImageUrl = js.Any.fromFunction1(SetHeaderImageUrl), SetHeaderNavigateUrl = js.Any.fromFunction1(SetHeaderNavigateUrl), SetHeaderText = js.Any.fromFunction1(SetHeaderText), index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], popupControl = popupControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientPopupWindow]
  }
  @scala.inline
  implicit class ASPxClientPopupWindowOps[Self <: ASPxClientPopupWindow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetFooterImageUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetFooterImageUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFooterNavigateUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetFooterNavigateUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFooterText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetFooterText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHeaderImageUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetHeaderImageUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHeaderNavigateUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetHeaderNavigateUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHeaderText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetHeaderText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetFooterImageUrl(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetFooterImageUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFooterNavigateUrl(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetFooterNavigateUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFooterText(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetFooterText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHeaderImageUrl(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetHeaderImageUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHeaderNavigateUrl(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetHeaderNavigateUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHeaderText(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetHeaderText")(js.Any.fromFunction1(value))
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
    def withPopupControl(value: ASPxClientPopupControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupControl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

