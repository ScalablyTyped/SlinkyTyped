package typingsSlinky.materialDialog

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ACTIONATTRIBUTE extends StObject {
    
    var ACTION_ATTRIBUTE: String = js.native
    
    var BUTTON_DEFAULT_ATTRIBUTE: String = js.native
    
    var BUTTON_SELECTOR: String = js.native
    
    var CLOSED_EVENT: String = js.native
    
    var CLOSE_ACTION: String = js.native
    
    var CLOSING_EVENT: String = js.native
    
    var CONTAINER_SELECTOR: String = js.native
    
    var CONTENT_SELECTOR: String = js.native
    
    var DESTROY_ACTION: String = js.native
    
    var INITIAL_FOCUS_ATTRIBUTE: String = js.native
    
    var OPENED_EVENT: String = js.native
    
    var OPENING_EVENT: String = js.native
    
    var SCRIM_SELECTOR: String = js.native
    
    var SUPPRESS_DEFAULT_PRESS_SELECTOR: String = js.native
    
    var SURFACE_SELECTOR: String = js.native
  }
  object ACTIONATTRIBUTE {
    
    @scala.inline
    def apply(
      ACTION_ATTRIBUTE: String,
      BUTTON_DEFAULT_ATTRIBUTE: String,
      BUTTON_SELECTOR: String,
      CLOSED_EVENT: String,
      CLOSE_ACTION: String,
      CLOSING_EVENT: String,
      CONTAINER_SELECTOR: String,
      CONTENT_SELECTOR: String,
      DESTROY_ACTION: String,
      INITIAL_FOCUS_ATTRIBUTE: String,
      OPENED_EVENT: String,
      OPENING_EVENT: String,
      SCRIM_SELECTOR: String,
      SUPPRESS_DEFAULT_PRESS_SELECTOR: String,
      SURFACE_SELECTOR: String
    ): ACTIONATTRIBUTE = {
      val __obj = js.Dynamic.literal(ACTION_ATTRIBUTE = ACTION_ATTRIBUTE.asInstanceOf[js.Any], BUTTON_DEFAULT_ATTRIBUTE = BUTTON_DEFAULT_ATTRIBUTE.asInstanceOf[js.Any], BUTTON_SELECTOR = BUTTON_SELECTOR.asInstanceOf[js.Any], CLOSED_EVENT = CLOSED_EVENT.asInstanceOf[js.Any], CLOSE_ACTION = CLOSE_ACTION.asInstanceOf[js.Any], CLOSING_EVENT = CLOSING_EVENT.asInstanceOf[js.Any], CONTAINER_SELECTOR = CONTAINER_SELECTOR.asInstanceOf[js.Any], CONTENT_SELECTOR = CONTENT_SELECTOR.asInstanceOf[js.Any], DESTROY_ACTION = DESTROY_ACTION.asInstanceOf[js.Any], INITIAL_FOCUS_ATTRIBUTE = INITIAL_FOCUS_ATTRIBUTE.asInstanceOf[js.Any], OPENED_EVENT = OPENED_EVENT.asInstanceOf[js.Any], OPENING_EVENT = OPENING_EVENT.asInstanceOf[js.Any], SCRIM_SELECTOR = SCRIM_SELECTOR.asInstanceOf[js.Any], SUPPRESS_DEFAULT_PRESS_SELECTOR = SUPPRESS_DEFAULT_PRESS_SELECTOR.asInstanceOf[js.Any], SURFACE_SELECTOR = SURFACE_SELECTOR.asInstanceOf[js.Any])
      __obj.asInstanceOf[ACTIONATTRIBUTE]
    }
    
    @scala.inline
    implicit class ACTIONATTRIBUTEMutableBuilder[Self <: ACTIONATTRIBUTE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setACTION_ATTRIBUTE(value: String): Self = StObject.set(x, "ACTION_ATTRIBUTE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBUTTON_DEFAULT_ATTRIBUTE(value: String): Self = StObject.set(x, "BUTTON_DEFAULT_ATTRIBUTE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBUTTON_SELECTOR(value: String): Self = StObject.set(x, "BUTTON_SELECTOR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCLOSED_EVENT(value: String): Self = StObject.set(x, "CLOSED_EVENT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCLOSE_ACTION(value: String): Self = StObject.set(x, "CLOSE_ACTION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCLOSING_EVENT(value: String): Self = StObject.set(x, "CLOSING_EVENT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCONTAINER_SELECTOR(value: String): Self = StObject.set(x, "CONTAINER_SELECTOR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCONTENT_SELECTOR(value: String): Self = StObject.set(x, "CONTENT_SELECTOR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDESTROY_ACTION(value: String): Self = StObject.set(x, "DESTROY_ACTION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setINITIAL_FOCUS_ATTRIBUTE(value: String): Self = StObject.set(x, "INITIAL_FOCUS_ATTRIBUTE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOPENED_EVENT(value: String): Self = StObject.set(x, "OPENED_EVENT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOPENING_EVENT(value: String): Self = StObject.set(x, "OPENING_EVENT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSCRIM_SELECTOR(value: String): Self = StObject.set(x, "SCRIM_SELECTOR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSUPPRESS_DEFAULT_PRESS_SELECTOR(value: String): Self = StObject.set(x, "SUPPRESS_DEFAULT_PRESS_SELECTOR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSURFACE_SELECTOR(value: String): Self = StObject.set(x, "SURFACE_SELECTOR", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CLOSING extends StObject {
    
    var CLOSING: String = js.native
    
    var OPEN: String = js.native
    
    var OPENING: String = js.native
    
    var SCROLLABLE: String = js.native
    
    var SCROLL_LOCK: String = js.native
    
    var STACKED: String = js.native
  }
  object CLOSING {
    
    @scala.inline
    def apply(
      CLOSING: String,
      OPEN: String,
      OPENING: String,
      SCROLLABLE: String,
      SCROLL_LOCK: String,
      STACKED: String
    ): CLOSING = {
      val __obj = js.Dynamic.literal(CLOSING = CLOSING.asInstanceOf[js.Any], OPEN = OPEN.asInstanceOf[js.Any], OPENING = OPENING.asInstanceOf[js.Any], SCROLLABLE = SCROLLABLE.asInstanceOf[js.Any], SCROLL_LOCK = SCROLL_LOCK.asInstanceOf[js.Any], STACKED = STACKED.asInstanceOf[js.Any])
      __obj.asInstanceOf[CLOSING]
    }
    
    @scala.inline
    implicit class CLOSINGMutableBuilder[Self <: CLOSING] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCLOSING(value: String): Self = StObject.set(x, "CLOSING", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOPEN(value: String): Self = StObject.set(x, "OPEN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOPENING(value: String): Self = StObject.set(x, "OPENING", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSCROLLABLE(value: String): Self = StObject.set(x, "SCROLLABLE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSCROLL_LOCK(value: String): Self = StObject.set(x, "SCROLL_LOCK", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSTACKED(value: String): Self = StObject.set(x, "STACKED", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DIALOGANIMATIONCLOSETIMEMS extends StObject {
    
    var DIALOG_ANIMATION_CLOSE_TIME_MS: Double = js.native
    
    var DIALOG_ANIMATION_OPEN_TIME_MS: Double = js.native
  }
  object DIALOGANIMATIONCLOSETIMEMS {
    
    @scala.inline
    def apply(DIALOG_ANIMATION_CLOSE_TIME_MS: Double, DIALOG_ANIMATION_OPEN_TIME_MS: Double): DIALOGANIMATIONCLOSETIMEMS = {
      val __obj = js.Dynamic.literal(DIALOG_ANIMATION_CLOSE_TIME_MS = DIALOG_ANIMATION_CLOSE_TIME_MS.asInstanceOf[js.Any], DIALOG_ANIMATION_OPEN_TIME_MS = DIALOG_ANIMATION_OPEN_TIME_MS.asInstanceOf[js.Any])
      __obj.asInstanceOf[DIALOGANIMATIONCLOSETIMEMS]
    }
    
    @scala.inline
    implicit class DIALOGANIMATIONCLOSETIMEMSMutableBuilder[Self <: DIALOGANIMATIONCLOSETIMEMS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDIALOG_ANIMATION_CLOSE_TIME_MS(value: Double): Self = StObject.set(x, "DIALOG_ANIMATION_CLOSE_TIME_MS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDIALOG_ANIMATION_OPEN_TIME_MS(value: Double): Self = StObject.set(x, "DIALOG_ANIMATION_OPEN_TIME_MS", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/dialog.@material/dialog/adapter.MDCDialogAdapter> */
  @js.native
  trait PartialMDCDialogAdapter extends StObject {
    
    var addBodyClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
    
    var areButtonsStacked: js.UndefOr[js.Function0[Boolean]] = js.native
    
    var clickDefaultButton: js.UndefOr[js.Function0[Unit]] = js.native
    
    var eventTargetMatches: js.UndefOr[js.Function2[/* target */ EventTarget | Null, /* selector */ String, Boolean]] = js.native
    
    var getActionFromEvent: js.UndefOr[js.Function1[/* evt */ Event, String | Null]] = js.native
    
    var getInitialFocusEl: js.UndefOr[js.Function0[HTMLElement | Null]] = js.native
    
    var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.native
    
    var isContentScrollable: js.UndefOr[js.Function0[Boolean]] = js.native
    
    var notifyClosed: js.UndefOr[js.Function1[/* action */ String, Unit]] = js.native
    
    var notifyClosing: js.UndefOr[js.Function1[/* action */ String, Unit]] = js.native
    
    var notifyOpened: js.UndefOr[js.Function0[Unit]] = js.native
    
    var notifyOpening: js.UndefOr[js.Function0[Unit]] = js.native
    
    var releaseFocus: js.UndefOr[js.Function0[Unit]] = js.native
    
    var removeBodyClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
    
    var reverseButtons: js.UndefOr[js.Function0[Unit]] = js.native
    
    var trapFocus: js.UndefOr[js.Function1[/* focusElement */ HTMLElement | Null, Unit]] = js.native
  }
  object PartialMDCDialogAdapter {
    
    @scala.inline
    def apply(): PartialMDCDialogAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCDialogAdapter]
    }
    
    @scala.inline
    implicit class PartialMDCDialogAdapterMutableBuilder[Self <: PartialMDCDialogAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddBodyClass(value: /* className */ String => Unit): Self = StObject.set(x, "addBodyClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddBodyClassUndefined: Self = StObject.set(x, "addBodyClass", js.undefined)
      
      @scala.inline
      def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      @scala.inline
      def setAreButtonsStacked(value: () => Boolean): Self = StObject.set(x, "areButtonsStacked", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAreButtonsStackedUndefined: Self = StObject.set(x, "areButtonsStacked", js.undefined)
      
      @scala.inline
      def setClickDefaultButton(value: () => Unit): Self = StObject.set(x, "clickDefaultButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClickDefaultButtonUndefined: Self = StObject.set(x, "clickDefaultButton", js.undefined)
      
      @scala.inline
      def setEventTargetMatches(value: (/* target */ EventTarget | Null, /* selector */ String) => Boolean): Self = StObject.set(x, "eventTargetMatches", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEventTargetMatchesUndefined: Self = StObject.set(x, "eventTargetMatches", js.undefined)
      
      @scala.inline
      def setGetActionFromEvent(value: /* evt */ Event => String | Null): Self = StObject.set(x, "getActionFromEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetActionFromEventUndefined: Self = StObject.set(x, "getActionFromEvent", js.undefined)
      
      @scala.inline
      def setGetInitialFocusEl(value: () => HTMLElement | Null): Self = StObject.set(x, "getInitialFocusEl", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetInitialFocusElUndefined: Self = StObject.set(x, "getInitialFocusEl", js.undefined)
      
      @scala.inline
      def setHasClass(value: /* className */ String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasClassUndefined: Self = StObject.set(x, "hasClass", js.undefined)
      
      @scala.inline
      def setIsContentScrollable(value: () => Boolean): Self = StObject.set(x, "isContentScrollable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsContentScrollableUndefined: Self = StObject.set(x, "isContentScrollable", js.undefined)
      
      @scala.inline
      def setNotifyClosed(value: /* action */ String => Unit): Self = StObject.set(x, "notifyClosed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotifyClosedUndefined: Self = StObject.set(x, "notifyClosed", js.undefined)
      
      @scala.inline
      def setNotifyClosing(value: /* action */ String => Unit): Self = StObject.set(x, "notifyClosing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotifyClosingUndefined: Self = StObject.set(x, "notifyClosing", js.undefined)
      
      @scala.inline
      def setNotifyOpened(value: () => Unit): Self = StObject.set(x, "notifyOpened", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNotifyOpenedUndefined: Self = StObject.set(x, "notifyOpened", js.undefined)
      
      @scala.inline
      def setNotifyOpening(value: () => Unit): Self = StObject.set(x, "notifyOpening", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNotifyOpeningUndefined: Self = StObject.set(x, "notifyOpening", js.undefined)
      
      @scala.inline
      def setReleaseFocus(value: () => Unit): Self = StObject.set(x, "releaseFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReleaseFocusUndefined: Self = StObject.set(x, "releaseFocus", js.undefined)
      
      @scala.inline
      def setRemoveBodyClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeBodyClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveBodyClassUndefined: Self = StObject.set(x, "removeBodyClass", js.undefined)
      
      @scala.inline
      def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      @scala.inline
      def setReverseButtons(value: () => Unit): Self = StObject.set(x, "reverseButtons", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReverseButtonsUndefined: Self = StObject.set(x, "reverseButtons", js.undefined)
      
      @scala.inline
      def setTrapFocus(value: /* focusElement */ HTMLElement | Null => Unit): Self = StObject.set(x, "trapFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTrapFocusUndefined: Self = StObject.set(x, "trapFocus", js.undefined)
    }
  }
}
