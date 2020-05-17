package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapTab extends js.Object {
  val index: Double = js.native
  val instance: js.Any = js.native
  val name: String = js.native
  val tabControl: BootstrapTabControl | Null = js.native
  def getActiveIconCssClass(): String = js.native
  def getActiveImageUrl(): String = js.native
  def getBadgeIconCssClass(): String = js.native
  def getBadgeText(): String = js.native
  def getEnabled(): Boolean = js.native
  def getIconCssClass(): String = js.native
  def getImageUrl(): String = js.native
  def getNavigateUrl(): String = js.native
  def getText(): String = js.native
  def getVisible(): Boolean = js.native
  def setActiveIconCssClass(cssClass: String): Unit = js.native
  def setActiveImageUrl(value: String): Unit = js.native
  def setBadgeIconCssClass(cssClass: String): Unit = js.native
  def setBadgeText(text: String): Unit = js.native
  def setEnabled(value: Boolean): Unit = js.native
  def setIconCssClass(cssClass: String): Unit = js.native
  def setImageUrl(value: String): Unit = js.native
  def setNavigateUrl(value: String): Unit = js.native
  def setText(value: String): Unit = js.native
  def setVisible(value: Boolean): Unit = js.native
}

object BootstrapTab {
  @scala.inline
  def apply(
    getActiveIconCssClass: () => String,
    getActiveImageUrl: () => String,
    getBadgeIconCssClass: () => String,
    getBadgeText: () => String,
    getEnabled: () => Boolean,
    getIconCssClass: () => String,
    getImageUrl: () => String,
    getNavigateUrl: () => String,
    getText: () => String,
    getVisible: () => Boolean,
    index: Double,
    instance: js.Any,
    name: String,
    setActiveIconCssClass: String => Unit,
    setActiveImageUrl: String => Unit,
    setBadgeIconCssClass: String => Unit,
    setBadgeText: String => Unit,
    setEnabled: Boolean => Unit,
    setIconCssClass: String => Unit,
    setImageUrl: String => Unit,
    setNavigateUrl: String => Unit,
    setText: String => Unit,
    setVisible: Boolean => Unit
  ): BootstrapTab = {
    val __obj = js.Dynamic.literal(getActiveIconCssClass = js.Any.fromFunction0(getActiveIconCssClass), getActiveImageUrl = js.Any.fromFunction0(getActiveImageUrl), getBadgeIconCssClass = js.Any.fromFunction0(getBadgeIconCssClass), getBadgeText = js.Any.fromFunction0(getBadgeText), getEnabled = js.Any.fromFunction0(getEnabled), getIconCssClass = js.Any.fromFunction0(getIconCssClass), getImageUrl = js.Any.fromFunction0(getImageUrl), getNavigateUrl = js.Any.fromFunction0(getNavigateUrl), getText = js.Any.fromFunction0(getText), getVisible = js.Any.fromFunction0(getVisible), index = index.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setActiveIconCssClass = js.Any.fromFunction1(setActiveIconCssClass), setActiveImageUrl = js.Any.fromFunction1(setActiveImageUrl), setBadgeIconCssClass = js.Any.fromFunction1(setBadgeIconCssClass), setBadgeText = js.Any.fromFunction1(setBadgeText), setEnabled = js.Any.fromFunction1(setEnabled), setIconCssClass = js.Any.fromFunction1(setIconCssClass), setImageUrl = js.Any.fromFunction1(setImageUrl), setNavigateUrl = js.Any.fromFunction1(setNavigateUrl), setText = js.Any.fromFunction1(setText), setVisible = js.Any.fromFunction1(setVisible))
    __obj.asInstanceOf[BootstrapTab]
  }
  @scala.inline
  implicit class BootstrapTabOps[Self <: BootstrapTab] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetActiveIconCssClass(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveIconCssClass")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetActiveImageUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveImageUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBadgeIconCssClass(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBadgeIconCssClass")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBadgeText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBadgeText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIconCssClass(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIconCssClass")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetImageUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getImageUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNavigateUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNavigateUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVisible(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVisible")(js.Any.fromFunction0(value))
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
    def withSetActiveIconCssClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActiveIconCssClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetActiveImageUrl(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActiveImageUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetBadgeIconCssClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBadgeIconCssClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetBadgeText(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBadgeText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetEnabled(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIconCssClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIconCssClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetImageUrl(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setImageUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetNavigateUrl(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNavigateUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetText(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetVisible(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVisible")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTabControl(value: BootstrapTabControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabControlNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabControl")(null)
        ret
    }
  }
  
}

