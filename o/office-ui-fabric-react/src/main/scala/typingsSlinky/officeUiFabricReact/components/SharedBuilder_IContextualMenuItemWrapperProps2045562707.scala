package typingsSlinky.officeUiFabricReact.components

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.PointerEvent
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuItemProps
import typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_IContextualMenuItemWrapperProps2045562707[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def componentRefFunction1(
    value: /* ref */ typingsSlinky.officeUiFabricReact.contextualMenuItemWrapperContextualMenuItemWrapperMod.ContextualMenuItemWrapper | Null => Unit
  ): this.type = set("componentRef", js.Any.fromFunction1(value))
  
  @scala.inline
  def componentRefRefObject(
    value: ReactRef[
      typingsSlinky.officeUiFabricReact.contextualMenuItemWrapperContextualMenuItemWrapperMod.ContextualMenuItemWrapper
    ]
  ): this.type = set("componentRef", value.asInstanceOf[js.Any])
  
  @scala.inline
  def componentRef(
    value: IRefObject[
      typingsSlinky.officeUiFabricReact.contextualMenuItemWrapperContextualMenuItemWrapperMod.ContextualMenuItemWrapper
    ]
  ): this.type = set("componentRef", value.asInstanceOf[js.Any])
  
  @scala.inline
  def contextualMenuItemAsFunctionComponent(value: ReactComponentClass[IContextualMenuItemProps]): this.type = set("contextualMenuItemAs", value.asInstanceOf[js.Any])
  
  @scala.inline
  def contextualMenuItemAsComponentClass(value: ReactComponentClass[IContextualMenuItemProps]): this.type = set("contextualMenuItemAs", value.asInstanceOf[js.Any])
  
  @scala.inline
  def contextualMenuItemAs(value: ReactComponentClass[IContextualMenuItemProps]): this.type = set("contextualMenuItemAs", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dismissMenu(value: (/* ev */ js.UndefOr[js.Any], /* dismissAll */ js.UndefOr[Boolean]) => Unit): this.type = set("dismissMenu", js.Any.fromFunction2(value))
  
  @scala.inline
  def dismissSubMenu(value: () => Unit): this.type = set("dismissSubMenu", js.Any.fromFunction0(value))
  
  @scala.inline
  def executeItemClick(
    value: (/* item */ IContextualMenuItem, /* ev */ SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]) => Unit
  ): this.type = set("executeItemClick", js.Any.fromFunction2(value))
  
  @scala.inline
  def expandedMenuItemKey(value: String): this.type = set("expandedMenuItemKey", value.asInstanceOf[js.Any])
  
  @scala.inline
  def getSubMenuId(value: /* item */ IContextualMenuItem => js.UndefOr[String]): this.type = set("getSubMenuId", js.Any.fromFunction1(value))
  
  @scala.inline
  def hasCheckmarks(value: Boolean): this.type = set("hasCheckmarks", value.asInstanceOf[js.Any])
  
  @scala.inline
  def hasIcons(value: Boolean): this.type = set("hasIcons", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onItemClick(
    value: (/* item */ IContextualMenuItem, /* ev */ SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]) => Unit
  ): this.type = set("onItemClick", js.Any.fromFunction2(value))
  
  @scala.inline
  def onItemClickBase(
    value: (/* item */ IContextualMenuItem, /* ev */ SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement], /* target */ HTMLElement) => Unit
  ): this.type = set("onItemClickBase", js.Any.fromFunction3(value))
  
  @scala.inline
  def onItemKeyDown(value: (/* item */ IContextualMenuItem, /* ev */ SyntheticKeyboardEvent[HTMLElement]) => Unit): this.type = set("onItemKeyDown", js.Any.fromFunction2(value))
  
  @scala.inline
  def onItemMouseDown(value: (/* item */ IContextualMenuItem, /* ev */ SyntheticMouseEvent[HTMLElement]) => Unit): this.type = set("onItemMouseDown", js.Any.fromFunction2(value))
  
  @scala.inline
  def onItemMouseEnter(
    value: (/* item */ IContextualMenuItem, /* ev */ SyntheticMouseEvent[HTMLElement], /* target */ HTMLElement) => Boolean | Unit
  ): this.type = set("onItemMouseEnter", js.Any.fromFunction3(value))
  
  @scala.inline
  def onItemMouseLeave(value: (/* item */ IContextualMenuItem, /* ev */ SyntheticMouseEvent[HTMLElement]) => Unit): this.type = set("onItemMouseLeave", js.Any.fromFunction2(value))
  
  @scala.inline
  def onItemMouseMove(
    value: (/* item */ IContextualMenuItem, /* ev */ SyntheticMouseEvent[HTMLElement], /* target */ HTMLElement) => Unit
  ): this.type = set("onItemMouseMove", js.Any.fromFunction3(value))
  
  @scala.inline
  def onTap(value: /* ev */ SyntheticTouchEvent[HTMLElement] | PointerEvent => Unit): this.type = set("onTap", js.Any.fromFunction1(value))
  
  @scala.inline
  def openSubMenu(value: (/* item */ js.Any, /* target */ HTMLElement) => Unit): this.type = set("openSubMenu", js.Any.fromFunction2(value))
}
