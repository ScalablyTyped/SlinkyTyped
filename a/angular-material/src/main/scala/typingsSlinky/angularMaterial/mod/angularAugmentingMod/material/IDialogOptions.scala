package typingsSlinky.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.angular.JQuery
import typingsSlinky.angular.mod.IController
import typingsSlinky.angular.mod.IControllerConstructor
import typingsSlinky.angular.mod.IPromise
import typingsSlinky.angular.mod.IScope
import typingsSlinky.angular.mod.Injectable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDialogOptions extends StObject {
  
  var autoWrap: js.UndefOr[Boolean] = js.native
  
  var bindToController: js.UndefOr[Boolean] = js.native
  
  // default: true
  var clickOutsideToClose: js.UndefOr[Boolean] = js.native
  
  var closeTo: js.UndefOr[js.Any] = js.native
  
  var contentElement: js.UndefOr[String | Element] = js.native
  
  // default: true
  var controller: js.UndefOr[String | Injectable[IControllerConstructor]] = js.native
  
  var controllerAs: js.UndefOr[String] = js.native
  
  // default: false
  var disableParentScroll: js.UndefOr[Boolean] = js.native
  
  // default: false
  var escapeToClose: js.UndefOr[Boolean] = js.native
  
  // default: true
  var focusOnOpen: js.UndefOr[Boolean] = js.native
  
  var fullscreen: js.UndefOr[Boolean] = js.native
  
  // default: true
  var hasBackdrop: js.UndefOr[Boolean] = js.native
  
  var locals: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var multiple: js.UndefOr[Boolean] = js.native
  
  var onComplete: js.UndefOr[js.Function2[/* scope */ IScope, /* element */ JQuery, Unit]] = js.native
  
  var onRemoving: js.UndefOr[js.Function2[/* element */ JQuery, /* removePromise */ IPromise[_], Unit]] = js.native
  
  // default: root node
  var onShowing: js.UndefOr[js.Function2[/* scope */ IScope, /* element */ JQuery, Unit]] = js.native
  
  var openFrom: js.UndefOr[js.Any] = js.native
  
  var parent: js.UndefOr[String | Element | JQuery] = js.native
  
  // default: new child scope
  var preserveScope: js.UndefOr[Boolean] = js.native
  
  // default: false
  var resolve: js.UndefOr[ResolveObject] = js.native
  
  var scope: js.UndefOr[IScope] = js.native
  
  var skipHide: js.UndefOr[Boolean] = js.native
  
  // default: true
  var targetEvent: js.UndefOr[MouseEvent] = js.native
  
  var template: js.UndefOr[String] = js.native
  
  var templateUrl: js.UndefOr[String] = js.native
  
  // default: false
  var title: js.UndefOr[String] = js.native
}
object IDialogOptions {
  
  @scala.inline
  def apply(): IDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDialogOptions]
  }
  
  @scala.inline
  implicit class IDialogOptionsMutableBuilder[Self <: IDialogOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoWrap(value: Boolean): Self = StObject.set(x, "autoWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoWrapUndefined: Self = StObject.set(x, "autoWrap", js.undefined)
    
    @scala.inline
    def setBindToController(value: Boolean): Self = StObject.set(x, "bindToController", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindToControllerUndefined: Self = StObject.set(x, "bindToController", js.undefined)
    
    @scala.inline
    def setClickOutsideToClose(value: Boolean): Self = StObject.set(x, "clickOutsideToClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickOutsideToCloseUndefined: Self = StObject.set(x, "clickOutsideToClose", js.undefined)
    
    @scala.inline
    def setCloseTo(value: js.Any): Self = StObject.set(x, "closeTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseToUndefined: Self = StObject.set(x, "closeTo", js.undefined)
    
    @scala.inline
    def setContentElement(value: String | Element): Self = StObject.set(x, "contentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentElementElement(value: Element): Self = StObject.set(x, "contentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentElementUndefined: Self = StObject.set(x, "contentElement", js.undefined)
    
    @scala.inline
    def setController(value: String | Injectable[IControllerConstructor]): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControllerAs(value: String): Self = StObject.set(x, "controllerAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControllerAsUndefined: Self = StObject.set(x, "controllerAs", js.undefined)
    
    @scala.inline
    def setControllerFunction1(value: /* repeated */ js.Any => Unit | IController): Self = StObject.set(x, "controller", js.Any.fromFunction1(value))
    
    @scala.inline
    def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    @scala.inline
    def setControllerVarargs(value: (String | IControllerConstructor)*): Self = StObject.set(x, "controller", js.Array(value :_*))
    
    @scala.inline
    def setDisableParentScroll(value: Boolean): Self = StObject.set(x, "disableParentScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableParentScrollUndefined: Self = StObject.set(x, "disableParentScroll", js.undefined)
    
    @scala.inline
    def setEscapeToClose(value: Boolean): Self = StObject.set(x, "escapeToClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEscapeToCloseUndefined: Self = StObject.set(x, "escapeToClose", js.undefined)
    
    @scala.inline
    def setFocusOnOpen(value: Boolean): Self = StObject.set(x, "focusOnOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusOnOpenUndefined: Self = StObject.set(x, "focusOnOpen", js.undefined)
    
    @scala.inline
    def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
    
    @scala.inline
    def setHasBackdrop(value: Boolean): Self = StObject.set(x, "hasBackdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasBackdropUndefined: Self = StObject.set(x, "hasBackdrop", js.undefined)
    
    @scala.inline
    def setLocals(value: StringDictionary[js.Any]): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalsUndefined: Self = StObject.set(x, "locals", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    @scala.inline
    def setOnComplete(value: (/* scope */ IScope, /* element */ JQuery) => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
    @scala.inline
    def setOnRemoving(value: (/* element */ JQuery, /* removePromise */ IPromise[_]) => Unit): Self = StObject.set(x, "onRemoving", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRemovingUndefined: Self = StObject.set(x, "onRemoving", js.undefined)
    
    @scala.inline
    def setOnShowing(value: (/* scope */ IScope, /* element */ JQuery) => Unit): Self = StObject.set(x, "onShowing", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnShowingUndefined: Self = StObject.set(x, "onShowing", js.undefined)
    
    @scala.inline
    def setOpenFrom(value: js.Any): Self = StObject.set(x, "openFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenFromUndefined: Self = StObject.set(x, "openFrom", js.undefined)
    
    @scala.inline
    def setParent(value: String | Element | JQuery): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentElement(value: Element): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setPreserveScope(value: Boolean): Self = StObject.set(x, "preserveScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveScopeUndefined: Self = StObject.set(x, "preserveScope", js.undefined)
    
    @scala.inline
    def setResolve(value: ResolveObject): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    
    @scala.inline
    def setScope(value: IScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setSkipHide(value: Boolean): Self = StObject.set(x, "skipHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipHideUndefined: Self = StObject.set(x, "skipHide", js.undefined)
    
    @scala.inline
    def setTargetEvent(value: MouseEvent): Self = StObject.set(x, "targetEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetEventUndefined: Self = StObject.set(x, "targetEvent", js.undefined)
    
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
