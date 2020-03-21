package typingsSlinky.officeUiFabricReact.contextualMenuTypesMod

import typingsSlinky.officeUiFabricReact.calloutTypesMod.ICalloutContentStyleProps
import typingsSlinky.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuItemStyleProps
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextualMenuSubComponentStyles extends js.Object {
  /** Styles for the callout that hosts the ContextualMenu options. */
  var callout: IStyleFunctionOrObject[ICalloutContentStyleProps, _]
  /** Styles for each menu item. */
  var menuItem: IStyleFunctionOrObject[IContextualMenuItemStyleProps, _]
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
}

