package typingsSlinky.angularStrap.mgcrea.ngStrap

import typingsSlinky.angular.mod.IPromise
import typingsSlinky.angular.mod.IRootScopeService
import typingsSlinky.angular.mod.IScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// Modal
// see http://mgcrea.github.io/angular-strap/#/modals
///////////////////////////////////////////////////////////////////////////
object modal {
  
  @js.native
  trait IModal extends StObject {
    
    @JSName("$promise")
    var $promise: IPromise[Unit] = js.native
    
    def hide(): Unit = js.native
    
    def show(): Unit = js.native
    
    def toggle(): Unit = js.native
  }
  object IModal {
    
    @scala.inline
    def apply($promise: IPromise[Unit], hide: () => Unit, show: () => Unit, toggle: () => Unit): IModal = {
      val __obj = js.Dynamic.literal($promise = $promise.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle))
      __obj.asInstanceOf[IModal]
    }
    
    @scala.inline
    implicit class IModalMutableBuilder[Self <: IModal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$promise(value: IPromise[Unit]): Self = StObject.set(x, "$promise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IModalOptions extends StObject {
    
    var animation: js.UndefOr[String] = js.native
    
    var backdrop: js.UndefOr[Boolean | String] = js.native
    
    var backdropAnimation: js.UndefOr[String] = js.native
    
    var container: js.UndefOr[String | Boolean] = js.native
    
    var content: js.UndefOr[String] = js.native
    
    var contentTemplate: js.UndefOr[String] = js.native
    
    var controller: js.UndefOr[js.Any] = js.native
    
    var controllerAs: js.UndefOr[String] = js.native
    
    var html: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var keyboard: js.UndefOr[Boolean] = js.native
    
    var locals: js.UndefOr[js.Any] = js.native
    
    var onBeforeHide: js.UndefOr[js.Function1[/* modal */ IModal, Unit]] = js.native
    
    var onBeforeShow: js.UndefOr[js.Function1[/* modal */ IModal, Unit]] = js.native
    
    var onHide: js.UndefOr[js.Function1[/* modal */ IModal, Unit]] = js.native
    
    var onShow: js.UndefOr[js.Function1[/* modal */ IModal, Unit]] = js.native
    
    var placement: js.UndefOr[String] = js.native
    
    var prefixEvent: js.UndefOr[String] = js.native
    
    var resolve: js.UndefOr[js.Any] = js.native
    
    var scope: js.UndefOr[IScope] = js.native
    
    var show: js.UndefOr[Boolean] = js.native
    
    var template: js.UndefOr[String] = js.native
    
    var templateUrl: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object IModalOptions {
    
    @scala.inline
    def apply(): IModalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IModalOptions]
    }
    
    @scala.inline
    implicit class IModalOptionsMutableBuilder[Self <: IModalOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setBackdrop(value: Boolean | String): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropAnimation(value: String): Self = StObject.set(x, "backdropAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropAnimationUndefined: Self = StObject.set(x, "backdropAnimation", js.undefined)
      
      @scala.inline
      def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
      
      @scala.inline
      def setContainer(value: String | Boolean): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTemplate(value: String): Self = StObject.set(x, "contentTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTemplateUndefined: Self = StObject.set(x, "contentTemplate", js.undefined)
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setController(value: js.Any): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControllerAs(value: String): Self = StObject.set(x, "controllerAs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControllerAsUndefined: Self = StObject.set(x, "controllerAs", js.undefined)
      
      @scala.inline
      def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
      
      @scala.inline
      def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      @scala.inline
      def setLocals(value: js.Any): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalsUndefined: Self = StObject.set(x, "locals", js.undefined)
      
      @scala.inline
      def setOnBeforeHide(value: /* modal */ IModal => Unit): Self = StObject.set(x, "onBeforeHide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeHideUndefined: Self = StObject.set(x, "onBeforeHide", js.undefined)
      
      @scala.inline
      def setOnBeforeShow(value: /* modal */ IModal => Unit): Self = StObject.set(x, "onBeforeShow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeShowUndefined: Self = StObject.set(x, "onBeforeShow", js.undefined)
      
      @scala.inline
      def setOnHide(value: /* modal */ IModal => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      @scala.inline
      def setOnShow(value: /* modal */ IModal => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      @scala.inline
      def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPrefixEvent(value: String): Self = StObject.set(x, "prefixEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixEventUndefined: Self = StObject.set(x, "prefixEvent", js.undefined)
      
      @scala.inline
      def setResolve(value: js.Any): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
      
      @scala.inline
      def setScope(value: IScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait IModalProvider extends StObject {
    
    var defaults: IModalOptions = js.native
  }
  object IModalProvider {
    
    @scala.inline
    def apply(defaults: IModalOptions): IModalProvider = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[IModalProvider]
    }
    
    @scala.inline
    implicit class IModalProviderMutableBuilder[Self <: IModalProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaults(value: IModalOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IModalScope extends IRootScopeService {
    
    @JSName("$hide")
    def $hide(): Unit = js.native
    
    @JSName("$show")
    def $show(): Unit = js.native
    
    @JSName("$toggle")
    def $toggle(): Unit = js.native
  }
  
  type IModalService = js.Function1[/* config */ js.UndefOr[IModalOptions], IModal]
}
