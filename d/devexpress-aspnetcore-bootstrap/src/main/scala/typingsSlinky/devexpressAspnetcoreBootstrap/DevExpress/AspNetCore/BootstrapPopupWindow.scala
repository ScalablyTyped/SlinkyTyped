package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapPopupWindow extends js.Object {
  val index: Double = js.native
  val instance: js.Any = js.native
  val name: String = js.native
  val popupControl: BootstrapPopupControl | Null = js.native
  def getFooterImageUrl(): String = js.native
  def getFooterNavigateUrl(): String = js.native
  def getFooterText(): String = js.native
  def getHeaderImageUrl(): String = js.native
  def getHeaderNavigateUrl(): String = js.native
  def getHeaderText(): String = js.native
  def setFooterImageUrl(value: String): Unit = js.native
  def setFooterNavigateUrl(value: String): Unit = js.native
  def setFooterText(value: String): Unit = js.native
  def setHeaderImageUrl(value: String): Unit = js.native
  def setHeaderNavigateUrl(value: String): Unit = js.native
  def setHeaderText(value: String): Unit = js.native
}

object BootstrapPopupWindow {
  @scala.inline
  def apply(
    getFooterImageUrl: () => String,
    getFooterNavigateUrl: () => String,
    getFooterText: () => String,
    getHeaderImageUrl: () => String,
    getHeaderNavigateUrl: () => String,
    getHeaderText: () => String,
    index: Double,
    instance: js.Any,
    name: String,
    setFooterImageUrl: String => Unit,
    setFooterNavigateUrl: String => Unit,
    setFooterText: String => Unit,
    setHeaderImageUrl: String => Unit,
    setHeaderNavigateUrl: String => Unit,
    setHeaderText: String => Unit
  ): BootstrapPopupWindow = {
    val __obj = js.Dynamic.literal(getFooterImageUrl = js.Any.fromFunction0(getFooterImageUrl), getFooterNavigateUrl = js.Any.fromFunction0(getFooterNavigateUrl), getFooterText = js.Any.fromFunction0(getFooterText), getHeaderImageUrl = js.Any.fromFunction0(getHeaderImageUrl), getHeaderNavigateUrl = js.Any.fromFunction0(getHeaderNavigateUrl), getHeaderText = js.Any.fromFunction0(getHeaderText), index = index.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setFooterImageUrl = js.Any.fromFunction1(setFooterImageUrl), setFooterNavigateUrl = js.Any.fromFunction1(setFooterNavigateUrl), setFooterText = js.Any.fromFunction1(setFooterText), setHeaderImageUrl = js.Any.fromFunction1(setHeaderImageUrl), setHeaderNavigateUrl = js.Any.fromFunction1(setHeaderNavigateUrl), setHeaderText = js.Any.fromFunction1(setHeaderText))
    __obj.asInstanceOf[BootstrapPopupWindow]
  }
  @scala.inline
  implicit class BootstrapPopupWindowOps[Self <: BootstrapPopupWindow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetFooterImageUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFooterImageUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFooterNavigateUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFooterNavigateUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFooterText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFooterText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHeaderImageUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeaderImageUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHeaderNavigateUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeaderNavigateUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHeaderText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeaderText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstance(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetFooterImageUrl(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFooterImageUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFooterNavigateUrl(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFooterNavigateUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFooterText(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFooterText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHeaderImageUrl(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeaderImageUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHeaderNavigateUrl(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeaderNavigateUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHeaderText(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeaderText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPopupControl(value: BootstrapPopupControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopupControlNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupControl")(null)
        ret
    }
  }
  
}

