package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapMenuItem extends js.Object {
  val index: Double = js.native
  val indexPath: String = js.native
  val instance: js.Any = js.native
  val menu: BootstrapMenu | Null = js.native
  val name: String = js.native
  val parent: BootstrapMenuItem | Null = js.native
  def getBadgeIconCssClass(): String = js.native
  def getBadgeText(): String = js.native
  def getChecked(): Boolean = js.native
  def getEnabled(): Boolean = js.native
  def getIconCssClass(): String = js.native
  def getImageUrl(): String = js.native
  def getItem(index: Double): BootstrapMenuItem | Null = js.native
  def getItemByName(name: String): BootstrapMenuItem | Null = js.native
  def getItemCount(): Double = js.native
  def getNavigateUrl(): String = js.native
  def getText(): String = js.native
  def getVisible(): Boolean = js.native
  def setBadgeIconCssClass(cssClass: String): Unit = js.native
  def setBadgeText(text: String): Unit = js.native
  def setChecked(value: Boolean): Unit = js.native
  def setEnabled(value: Boolean): Unit = js.native
  def setIconCssClass(cssClass: String): Unit = js.native
  def setImageUrl(value: String): Unit = js.native
  def setNavigateUrl(value: String): Unit = js.native
  def setText(value: String): Unit = js.native
  def setVisible(value: Boolean): Unit = js.native
}

object BootstrapMenuItem {
  @scala.inline
  def apply(
    getBadgeIconCssClass: () => String,
    getBadgeText: () => String,
    getChecked: () => Boolean,
    getEnabled: () => Boolean,
    getIconCssClass: () => String,
    getImageUrl: () => String,
    getItem: Double => BootstrapMenuItem | Null,
    getItemByName: String => BootstrapMenuItem | Null,
    getItemCount: () => Double,
    getNavigateUrl: () => String,
    getText: () => String,
    getVisible: () => Boolean,
    index: Double,
    indexPath: String,
    instance: js.Any,
    name: String,
    setBadgeIconCssClass: String => Unit,
    setBadgeText: String => Unit,
    setChecked: Boolean => Unit,
    setEnabled: Boolean => Unit,
    setIconCssClass: String => Unit,
    setImageUrl: String => Unit,
    setNavigateUrl: String => Unit,
    setText: String => Unit,
    setVisible: Boolean => Unit
  ): BootstrapMenuItem = {
    val __obj = js.Dynamic.literal(getBadgeIconCssClass = js.Any.fromFunction0(getBadgeIconCssClass), getBadgeText = js.Any.fromFunction0(getBadgeText), getChecked = js.Any.fromFunction0(getChecked), getEnabled = js.Any.fromFunction0(getEnabled), getIconCssClass = js.Any.fromFunction0(getIconCssClass), getImageUrl = js.Any.fromFunction0(getImageUrl), getItem = js.Any.fromFunction1(getItem), getItemByName = js.Any.fromFunction1(getItemByName), getItemCount = js.Any.fromFunction0(getItemCount), getNavigateUrl = js.Any.fromFunction0(getNavigateUrl), getText = js.Any.fromFunction0(getText), getVisible = js.Any.fromFunction0(getVisible), index = index.asInstanceOf[js.Any], indexPath = indexPath.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setBadgeIconCssClass = js.Any.fromFunction1(setBadgeIconCssClass), setBadgeText = js.Any.fromFunction1(setBadgeText), setChecked = js.Any.fromFunction1(setChecked), setEnabled = js.Any.fromFunction1(setEnabled), setIconCssClass = js.Any.fromFunction1(setIconCssClass), setImageUrl = js.Any.fromFunction1(setImageUrl), setNavigateUrl = js.Any.fromFunction1(setNavigateUrl), setText = js.Any.fromFunction1(setText), setVisible = js.Any.fromFunction1(setVisible))
    __obj.asInstanceOf[BootstrapMenuItem]
  }
  @scala.inline
  implicit class BootstrapMenuItemOps[Self <: BootstrapMenuItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withGetChecked(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChecked")(js.Any.fromFunction0(value))
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
    def withGetItem(value: Double => BootstrapMenuItem | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetItemByName(value: String => BootstrapMenuItem | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemByName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetItemCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemCount")(js.Any.fromFunction0(value))
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
    def withIndexPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexPath")(value.asInstanceOf[js.Any])
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
    def withSetChecked(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setChecked")(js.Any.fromFunction1(value))
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
    def withMenu(value: BootstrapMenu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(null)
        ret
    }
    @scala.inline
    def withParent(value: BootstrapMenuItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(null)
        ret
    }
  }
  
}

