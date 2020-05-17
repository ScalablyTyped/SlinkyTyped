package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the Floating Action Button's BootstrapFABActionItem object.
  */
@js.native
trait BootstrapClientFABActionItem extends ASPxClientFABActionItemBase {
  def GetBadgeCssClass(): String = js.native
  def GetBadgeIconCssClass(): String = js.native
  def GetBadgeText(): String = js.native
  def GetIconCssClass(): String = js.native
  def SetBadgeCssClass(cssClass: String): Unit = js.native
  def SetBadgeIconCssClass(cssClass: String): Unit = js.native
  def SetBadgeText(text: String): Unit = js.native
  def SetIconCssClass(cssClass: String): Unit = js.native
}

object BootstrapClientFABActionItem {
  @scala.inline
  def apply(
    GetActionName: () => String,
    GetBadgeCssClass: () => String,
    GetBadgeIconCssClass: () => String,
    GetBadgeText: () => String,
    GetIconCssClass: () => String,
    GetText: () => String,
    GetVisible: () => Boolean,
    SetBadgeCssClass: String => Unit,
    SetBadgeIconCssClass: String => Unit,
    SetBadgeText: String => Unit,
    SetIconCssClass: String => Unit,
    SetText: String => Unit,
    SetVisible: Boolean => Unit
  ): BootstrapClientFABActionItem = {
    val __obj = js.Dynamic.literal(GetActionName = js.Any.fromFunction0(GetActionName), GetBadgeCssClass = js.Any.fromFunction0(GetBadgeCssClass), GetBadgeIconCssClass = js.Any.fromFunction0(GetBadgeIconCssClass), GetBadgeText = js.Any.fromFunction0(GetBadgeText), GetIconCssClass = js.Any.fromFunction0(GetIconCssClass), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetBadgeCssClass = js.Any.fromFunction1(SetBadgeCssClass), SetBadgeIconCssClass = js.Any.fromFunction1(SetBadgeIconCssClass), SetBadgeText = js.Any.fromFunction1(SetBadgeText), SetIconCssClass = js.Any.fromFunction1(SetIconCssClass), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible))
    __obj.asInstanceOf[BootstrapClientFABActionItem]
  }
  @scala.inline
  implicit class BootstrapClientFABActionItemOps[Self <: BootstrapClientFABActionItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetBadgeCssClass(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetBadgeCssClass")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBadgeIconCssClass(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetBadgeIconCssClass")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBadgeText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetBadgeText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIconCssClass(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetIconCssClass")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetBadgeCssClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetBadgeCssClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetBadgeIconCssClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetBadgeIconCssClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetBadgeText(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetBadgeText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIconCssClass(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetIconCssClass")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

