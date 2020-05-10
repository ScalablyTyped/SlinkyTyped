package typingsSlinky.officeUiFabricReact.contextualMenuTypesMod

import typingsSlinky.officeUiFabricReact.calloutTypesMod.ICalloutContentStyleProps
import typingsSlinky.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuItemStyleProps
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContextualMenuSubComponentStyles extends js.Object {
  /** Styles for the callout that hosts the ContextualMenu options. */
  var callout: IStyleFunctionOrObject[ICalloutContentStyleProps, _] = js.native
  /** Styles for each menu item. */
  var menuItem: IStyleFunctionOrObject[IContextualMenuItemStyleProps, _] = js.native
}

object IContextualMenuSubComponentStyles {
  @scala.inline
  def apply(
    callout: IStyleFunctionOrObject[ICalloutContentStyleProps, _],
    menuItem: IStyleFunctionOrObject[IContextualMenuItemStyleProps, _]
  ): IContextualMenuSubComponentStyles = {
    val __obj = js.Dynamic.literal(callout = callout.asInstanceOf[js.Any], menuItem = menuItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualMenuSubComponentStyles]
  }
  @scala.inline
  implicit class IContextualMenuSubComponentStylesOps[Self <: IContextualMenuSubComponentStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalloutFunction1(value: ICalloutContentStyleProps => Partial[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCallout(value: IStyleFunctionOrObject[ICalloutContentStyleProps, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuItemFunction1(value: IContextualMenuItemStyleProps => Partial[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMenuItem(value: IStyleFunctionOrObject[IContextualMenuItemStyleProps, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItem")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

