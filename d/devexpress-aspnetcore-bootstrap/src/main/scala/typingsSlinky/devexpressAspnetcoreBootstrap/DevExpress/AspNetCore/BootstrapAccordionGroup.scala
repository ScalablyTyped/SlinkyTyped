package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapAccordionGroup extends js.Object {
  val index: Double = js.native
  val instance: js.Any = js.native
  val name: String = js.native
  val navBar: BootstrapAccordion | Null = js.native
  def getEnabled(): Boolean = js.native
  def getExpanded(): Boolean = js.native
  def getHeaderBadgeIconCssClass(): String = js.native
  def getHeaderBadgeText(): String = js.native
  def getItem(index: Double): BootstrapAccordionItem | Null = js.native
  def getItemByName(name: String): BootstrapAccordionItem | Null = js.native
  def getItemCount(): Double = js.native
  def getText(): String = js.native
  def getVisible(): Boolean = js.native
  def setExpanded(value: Boolean): Unit = js.native
  def setHeaderBadgeIconCssClass(cssClass: String): Unit = js.native
  def setHeaderBadgeText(text: String): Unit = js.native
  def setText(text: String): Unit = js.native
  def setVisible(value: Boolean): Unit = js.native
}

object BootstrapAccordionGroup {
  @scala.inline
  def apply(
    getEnabled: () => Boolean,
    getExpanded: () => Boolean,
    getHeaderBadgeIconCssClass: () => String,
    getHeaderBadgeText: () => String,
    getItem: Double => BootstrapAccordionItem | Null,
    getItemByName: String => BootstrapAccordionItem | Null,
    getItemCount: () => Double,
    getText: () => String,
    getVisible: () => Boolean,
    index: Double,
    instance: js.Any,
    name: String,
    setExpanded: Boolean => Unit,
    setHeaderBadgeIconCssClass: String => Unit,
    setHeaderBadgeText: String => Unit,
    setText: String => Unit,
    setVisible: Boolean => Unit
  ): BootstrapAccordionGroup = {
    val __obj = js.Dynamic.literal(getEnabled = js.Any.fromFunction0(getEnabled), getExpanded = js.Any.fromFunction0(getExpanded), getHeaderBadgeIconCssClass = js.Any.fromFunction0(getHeaderBadgeIconCssClass), getHeaderBadgeText = js.Any.fromFunction0(getHeaderBadgeText), getItem = js.Any.fromFunction1(getItem), getItemByName = js.Any.fromFunction1(getItemByName), getItemCount = js.Any.fromFunction0(getItemCount), getText = js.Any.fromFunction0(getText), getVisible = js.Any.fromFunction0(getVisible), index = index.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setExpanded = js.Any.fromFunction1(setExpanded), setHeaderBadgeIconCssClass = js.Any.fromFunction1(setHeaderBadgeIconCssClass), setHeaderBadgeText = js.Any.fromFunction1(setHeaderBadgeText), setText = js.Any.fromFunction1(setText), setVisible = js.Any.fromFunction1(setVisible))
    __obj.asInstanceOf[BootstrapAccordionGroup]
  }
  @scala.inline
  implicit class BootstrapAccordionGroupOps[Self <: BootstrapAccordionGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetExpanded(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExpanded")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHeaderBadgeIconCssClass(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeaderBadgeIconCssClass")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHeaderBadgeText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeaderBadgeText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetItem(value: Double => BootstrapAccordionItem | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetItemByName(value: String => BootstrapAccordionItem | Null): Self = {
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
    def withSetExpanded(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setExpanded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHeaderBadgeIconCssClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeaderBadgeIconCssClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHeaderBadgeText(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeaderBadgeText")(js.Any.fromFunction1(value))
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
    def withNavBar(value: BootstrapAccordion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavBarNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navBar")(null)
        ret
    }
  }
  
}

