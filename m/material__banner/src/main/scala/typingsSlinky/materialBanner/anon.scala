package typingsSlinky.materialBanner

import typingsSlinky.materialBanner.constantsMod.CloseReason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@material/banner.@material/banner/adapter.MDCBannerAdapter> */
  @js.native
  trait PartialMDCBannerAdapter extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
    
    var getContentHeight: js.UndefOr[js.Function0[Double]] = js.native
    
    var notifyClosed: js.UndefOr[js.Function1[/* reason */ CloseReason, Unit]] = js.native
    
    var notifyClosing: js.UndefOr[js.Function1[/* reason */ CloseReason, Unit]] = js.native
    
    var notifyOpened: js.UndefOr[js.Function0[Unit]] = js.native
    
    var notifyOpening: js.UndefOr[js.Function0[Unit]] = js.native
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
    
    var setStyleProperty: js.UndefOr[js.Function2[/* propertyName */ String, /* value */ String, Unit]] = js.native
  }
  object PartialMDCBannerAdapter {
    
    @scala.inline
    def apply(): PartialMDCBannerAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCBannerAdapter]
    }
    
    @scala.inline
    implicit class PartialMDCBannerAdapterMutableBuilder[Self <: PartialMDCBannerAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      @scala.inline
      def setGetContentHeight(value: () => Double): Self = StObject.set(x, "getContentHeight", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContentHeightUndefined: Self = StObject.set(x, "getContentHeight", js.undefined)
      
      @scala.inline
      def setNotifyClosed(value: /* reason */ CloseReason => Unit): Self = StObject.set(x, "notifyClosed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotifyClosedUndefined: Self = StObject.set(x, "notifyClosed", js.undefined)
      
      @scala.inline
      def setNotifyClosing(value: /* reason */ CloseReason => Unit): Self = StObject.set(x, "notifyClosing", js.Any.fromFunction1(value))
      
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
      def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      @scala.inline
      def setSetStyleProperty(value: (/* propertyName */ String, /* value */ String) => Unit): Self = StObject.set(x, "setStyleProperty", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetStylePropertyUndefined: Self = StObject.set(x, "setStyleProperty", js.undefined)
    }
  }
}
