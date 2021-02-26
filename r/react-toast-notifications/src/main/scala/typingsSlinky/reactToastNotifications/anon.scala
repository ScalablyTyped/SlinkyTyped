package typingsSlinky.reactToastNotifications

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactToastNotifications.mod.AppearanceTypes
import typingsSlinky.reactToastNotifications.mod.Options
import typingsSlinky.reactToastNotifications.mod.RemoveAllToasts
import typingsSlinky.reactToastNotifications.mod.RemoveToast
import typingsSlinky.reactToastNotifications.mod.ToastContainerProps
import typingsSlinky.reactToastNotifications.mod.ToastProps
import typingsSlinky.reactToastNotifications.mod.UpdateToast
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AddToast extends StObject {
    
    var addToast: typingsSlinky.reactToastNotifications.mod.AddToast = js.native
    
    var removeAllToasts: RemoveAllToasts = js.native
    
    var removeToast: RemoveToast = js.native
    
    var toastStack: js.Array[Appearance] = js.native
    
    var updateToast: UpdateToast = js.native
  }
  object AddToast {
    
    @scala.inline
    def apply(
      addToast: (/* content */ ReactElement, /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Unit,
      removeAllToasts: () => Unit,
      removeToast: (/* id */ String, /* callback */ js.UndefOr[js.Function0[Unit]]) => Unit,
      toastStack: js.Array[Appearance],
      updateToast: (/* id */ String, /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Unit
    ): AddToast = {
      val __obj = js.Dynamic.literal(addToast = js.Any.fromFunction3(addToast), removeAllToasts = js.Any.fromFunction0(removeAllToasts), removeToast = js.Any.fromFunction2(removeToast), toastStack = toastStack.asInstanceOf[js.Any], updateToast = js.Any.fromFunction3(updateToast))
      __obj.asInstanceOf[AddToast]
    }
    
    @scala.inline
    implicit class AddToastMutableBuilder[Self <: AddToast] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddToast(
        value: (/* content */ ReactElement, /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Unit
      ): Self = StObject.set(x, "addToast", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRemoveAllToasts(value: () => Unit): Self = StObject.set(x, "removeAllToasts", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveToast(value: (/* id */ String, /* callback */ js.UndefOr[js.Function0[Unit]]) => Unit): Self = StObject.set(x, "removeToast", js.Any.fromFunction2(value))
      
      @scala.inline
      def setToastStack(value: js.Array[Appearance]): Self = StObject.set(x, "toastStack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToastStackVarargs(value: Appearance*): Self = StObject.set(x, "toastStack", js.Array(value :_*))
      
      @scala.inline
      def setUpdateToast(
        value: (/* id */ String, /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Unit
      ): Self = StObject.set(x, "updateToast", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait Appearance extends StObject {
    
    var appearance: AppearanceTypes = js.native
    
    var content: ReactElement = js.native
    
    var id: String = js.native
  }
  object Appearance {
    
    @scala.inline
    def apply(appearance: AppearanceTypes, id: String): Appearance = {
      val __obj = js.Dynamic.literal(appearance = appearance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Appearance]
    }
    
    @scala.inline
    implicit class AppearanceMutableBuilder[Self <: Appearance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppearance(value: AppearanceTypes): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Toast extends StObject {
    
    var Toast: js.UndefOr[ReactComponentClass[ToastProps]] = js.native
    
    var ToastContainer: js.UndefOr[ReactComponentClass[ToastContainerProps]] = js.native
  }
  object Toast {
    
    @scala.inline
    def apply(): Toast = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Toast]
    }
    
    @scala.inline
    implicit class ToastMutableBuilder[Self <: Toast] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToast(value: ReactComponentClass[ToastProps]): Self = StObject.set(x, "Toast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToastComponentClass(value: ReactComponentClass[ToastProps]): Self = StObject.set(x, "Toast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToastContainer(value: ReactComponentClass[ToastContainerProps]): Self = StObject.set(x, "ToastContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToastContainerComponentClass(value: ReactComponentClass[ToastContainerProps]): Self = StObject.set(x, "ToastContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToastContainerFunctionComponent(value: ReactComponentClass[ToastContainerProps]): Self = StObject.set(x, "ToastContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToastContainerUndefined: Self = StObject.set(x, "ToastContainer", js.undefined)
      
      @scala.inline
      def setToastFunctionComponent(value: ReactComponentClass[ToastProps]): Self = StObject.set(x, "Toast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToastUndefined: Self = StObject.set(x, "Toast", js.undefined)
    }
  }
}
