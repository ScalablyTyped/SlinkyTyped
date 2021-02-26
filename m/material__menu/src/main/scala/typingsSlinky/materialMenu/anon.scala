package typingsSlinky.materialMenu

import org.scalajs.dom.raw.Element
import typingsSlinky.materialMenu.typesMod.MDCMenuItemEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ARIACHECKEDATTR extends StObject {
    
    var ARIA_CHECKED_ATTR: String = js.native
    
    var ARIA_DISABLED_ATTR: String = js.native
    
    var CHECKBOX_SELECTOR: String = js.native
    
    var LIST_SELECTOR: String = js.native
    
    var SELECTED_EVENT: String = js.native
  }
  object ARIACHECKEDATTR {
    
    @scala.inline
    def apply(
      ARIA_CHECKED_ATTR: String,
      ARIA_DISABLED_ATTR: String,
      CHECKBOX_SELECTOR: String,
      LIST_SELECTOR: String,
      SELECTED_EVENT: String
    ): ARIACHECKEDATTR = {
      val __obj = js.Dynamic.literal(ARIA_CHECKED_ATTR = ARIA_CHECKED_ATTR.asInstanceOf[js.Any], ARIA_DISABLED_ATTR = ARIA_DISABLED_ATTR.asInstanceOf[js.Any], CHECKBOX_SELECTOR = CHECKBOX_SELECTOR.asInstanceOf[js.Any], LIST_SELECTOR = LIST_SELECTOR.asInstanceOf[js.Any], SELECTED_EVENT = SELECTED_EVENT.asInstanceOf[js.Any])
      __obj.asInstanceOf[ARIACHECKEDATTR]
    }
    
    @scala.inline
    implicit class ARIACHECKEDATTRMutableBuilder[Self <: ARIACHECKEDATTR] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setARIA_CHECKED_ATTR(value: String): Self = StObject.set(x, "ARIA_CHECKED_ATTR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setARIA_DISABLED_ATTR(value: String): Self = StObject.set(x, "ARIA_DISABLED_ATTR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCHECKBOX_SELECTOR(value: String): Self = StObject.set(x, "CHECKBOX_SELECTOR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLIST_SELECTOR(value: String): Self = StObject.set(x, "LIST_SELECTOR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSELECTED_EVENT(value: String): Self = StObject.set(x, "SELECTED_EVENT", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FOCUSROOTINDEX extends StObject {
    
    var FOCUS_ROOT_INDEX: Double = js.native
  }
  object FOCUSROOTINDEX {
    
    @scala.inline
    def apply(FOCUS_ROOT_INDEX: Double): FOCUSROOTINDEX = {
      val __obj = js.Dynamic.literal(FOCUS_ROOT_INDEX = FOCUS_ROOT_INDEX.asInstanceOf[js.Any])
      __obj.asInstanceOf[FOCUSROOTINDEX]
    }
    
    @scala.inline
    implicit class FOCUSROOTINDEXMutableBuilder[Self <: FOCUSROOTINDEX] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFOCUS_ROOT_INDEX(value: Double): Self = StObject.set(x, "FOCUS_ROOT_INDEX", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MENUSELECTEDLISTITEM extends StObject {
    
    var MENU_SELECTED_LIST_ITEM: String = js.native
    
    var MENU_SELECTION_GROUP: String = js.native
    
    var ROOT: String = js.native
  }
  object MENUSELECTEDLISTITEM {
    
    @scala.inline
    def apply(MENU_SELECTED_LIST_ITEM: String, MENU_SELECTION_GROUP: String, ROOT: String): MENUSELECTEDLISTITEM = {
      val __obj = js.Dynamic.literal(MENU_SELECTED_LIST_ITEM = MENU_SELECTED_LIST_ITEM.asInstanceOf[js.Any], MENU_SELECTION_GROUP = MENU_SELECTION_GROUP.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any])
      __obj.asInstanceOf[MENUSELECTEDLISTITEM]
    }
    
    @scala.inline
    implicit class MENUSELECTEDLISTITEMMutableBuilder[Self <: MENUSELECTEDLISTITEM] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMENU_SELECTED_LIST_ITEM(value: String): Self = StObject.set(x, "MENU_SELECTED_LIST_ITEM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMENU_SELECTION_GROUP(value: String): Self = StObject.set(x, "MENU_SELECTION_GROUP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setROOT(value: String): Self = StObject.set(x, "ROOT", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/menu.@material/menu/adapter.MDCMenuAdapter> */
  @js.native
  trait PartialMDCMenuAdapter extends StObject {
    
    var addAttributeToElementAtIndex: js.UndefOr[js.Function3[/* index */ Double, /* attr */ String, /* value */ String, Unit]] = js.native
    
    var addClassToElementAtIndex: js.UndefOr[js.Function2[/* index */ Double, /* className */ String, Unit]] = js.native
    
    var closeSurface: js.UndefOr[js.Function1[/* skipRestoreFocus */ js.UndefOr[Boolean], Unit]] = js.native
    
    var elementContainsClass: js.UndefOr[js.Function2[/* element */ Element, /* className */ String, Boolean]] = js.native
    
    var focusItemAtIndex: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
    
    var focusListRoot: js.UndefOr[js.Function0[Unit]] = js.native
    
    var getElementIndex: js.UndefOr[js.Function1[/* element */ Element, Double]] = js.native
    
    var getMenuItemCount: js.UndefOr[js.Function0[Double]] = js.native
    
    var getSelectedSiblingOfItemAtIndex: js.UndefOr[js.Function1[/* index */ Double, Double]] = js.native
    
    var isSelectableItemAtIndex: js.UndefOr[js.Function1[/* index */ Double, Boolean]] = js.native
    
    var notifySelected: js.UndefOr[js.Function1[/* evtData */ MDCMenuItemEventDetail, Unit]] = js.native
    
    var removeAttributeFromElementAtIndex: js.UndefOr[js.Function2[/* index */ Double, /* attr */ String, Unit]] = js.native
    
    var removeClassFromElementAtIndex: js.UndefOr[js.Function2[/* index */ Double, /* className */ String, Unit]] = js.native
  }
  object PartialMDCMenuAdapter {
    
    @scala.inline
    def apply(): PartialMDCMenuAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCMenuAdapter]
    }
    
    @scala.inline
    implicit class PartialMDCMenuAdapterMutableBuilder[Self <: PartialMDCMenuAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddAttributeToElementAtIndex(value: (/* index */ Double, /* attr */ String, /* value */ String) => Unit): Self = StObject.set(x, "addAttributeToElementAtIndex", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAddAttributeToElementAtIndexUndefined: Self = StObject.set(x, "addAttributeToElementAtIndex", js.undefined)
      
      @scala.inline
      def setAddClassToElementAtIndex(value: (/* index */ Double, /* className */ String) => Unit): Self = StObject.set(x, "addClassToElementAtIndex", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddClassToElementAtIndexUndefined: Self = StObject.set(x, "addClassToElementAtIndex", js.undefined)
      
      @scala.inline
      def setCloseSurface(value: /* skipRestoreFocus */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "closeSurface", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCloseSurfaceUndefined: Self = StObject.set(x, "closeSurface", js.undefined)
      
      @scala.inline
      def setElementContainsClass(value: (/* element */ Element, /* className */ String) => Boolean): Self = StObject.set(x, "elementContainsClass", js.Any.fromFunction2(value))
      
      @scala.inline
      def setElementContainsClassUndefined: Self = StObject.set(x, "elementContainsClass", js.undefined)
      
      @scala.inline
      def setFocusItemAtIndex(value: /* index */ Double => Unit): Self = StObject.set(x, "focusItemAtIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFocusItemAtIndexUndefined: Self = StObject.set(x, "focusItemAtIndex", js.undefined)
      
      @scala.inline
      def setFocusListRoot(value: () => Unit): Self = StObject.set(x, "focusListRoot", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFocusListRootUndefined: Self = StObject.set(x, "focusListRoot", js.undefined)
      
      @scala.inline
      def setGetElementIndex(value: /* element */ Element => Double): Self = StObject.set(x, "getElementIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetElementIndexUndefined: Self = StObject.set(x, "getElementIndex", js.undefined)
      
      @scala.inline
      def setGetMenuItemCount(value: () => Double): Self = StObject.set(x, "getMenuItemCount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMenuItemCountUndefined: Self = StObject.set(x, "getMenuItemCount", js.undefined)
      
      @scala.inline
      def setGetSelectedSiblingOfItemAtIndex(value: /* index */ Double => Double): Self = StObject.set(x, "getSelectedSiblingOfItemAtIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetSelectedSiblingOfItemAtIndexUndefined: Self = StObject.set(x, "getSelectedSiblingOfItemAtIndex", js.undefined)
      
      @scala.inline
      def setIsSelectableItemAtIndex(value: /* index */ Double => Boolean): Self = StObject.set(x, "isSelectableItemAtIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsSelectableItemAtIndexUndefined: Self = StObject.set(x, "isSelectableItemAtIndex", js.undefined)
      
      @scala.inline
      def setNotifySelected(value: /* evtData */ MDCMenuItemEventDetail => Unit): Self = StObject.set(x, "notifySelected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotifySelectedUndefined: Self = StObject.set(x, "notifySelected", js.undefined)
      
      @scala.inline
      def setRemoveAttributeFromElementAtIndex(value: (/* index */ Double, /* attr */ String) => Unit): Self = StObject.set(x, "removeAttributeFromElementAtIndex", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveAttributeFromElementAtIndexUndefined: Self = StObject.set(x, "removeAttributeFromElementAtIndex", js.undefined)
      
      @scala.inline
      def setRemoveClassFromElementAtIndex(value: (/* index */ Double, /* className */ String) => Unit): Self = StObject.set(x, "removeClassFromElementAtIndex", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveClassFromElementAtIndexUndefined: Self = StObject.set(x, "removeClassFromElementAtIndex", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@material/menu-surface.@material/menu-surface/types.MDCMenuDistance> */
  @js.native
  trait PartialMDCMenuDistance extends StObject {
    
    var bottom: js.UndefOr[Double] = js.native
    
    var left: js.UndefOr[Double] = js.native
    
    var right: js.UndefOr[Double] = js.native
    
    var top: js.UndefOr[Double] = js.native
  }
  object PartialMDCMenuDistance {
    
    @scala.inline
    def apply(): PartialMDCMenuDistance = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCMenuDistance]
    }
    
    @scala.inline
    implicit class PartialMDCMenuDistanceMutableBuilder[Self <: PartialMDCMenuDistance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
}
