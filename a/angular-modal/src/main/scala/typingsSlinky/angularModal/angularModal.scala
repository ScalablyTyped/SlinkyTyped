package typingsSlinky.angularModal

import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.raw.Element
import typingsSlinky.angular.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angularModal {
  
  @js.native
  trait AngularModal extends StObject {
    
    def activate(): js.Any = js.native
    def activate(locals: js.Object): js.Any = js.native
    def activate[T](locals: T): js.Any = js.native
    
    def active(): Boolean = js.native
    
    def deactivate(): js.Any = js.native
  }
  
  type AngularModalControllerDefinition = (Instantiable1[/* args (repeated) */ js.Any, js.Any]) | js.Function | String
  
  type AngularModalFactory = js.Function1[
    /* settings */ AngularModalSettingsWithTemplate | AngularModalSettingsWithTemplateUrl, 
    AngularModal
  ]
  
  // Possible arguments to IControllerService
  type AngularModalJQuerySelector = String | Element | (js.Array[js.Any | Element]) | JQuery | js.Function | js.Object
  
  // Possible arguments to IAugmentedJQueryStatic
  @js.native
  trait AngularModalSettings extends StObject {
    
    var container: js.UndefOr[AngularModalJQuerySelector] = js.native
    
    var controller: js.UndefOr[AngularModalControllerDefinition] = js.native
    
    var controllerAs: js.UndefOr[String] = js.native
  }
  object AngularModalSettings {
    
    @scala.inline
    def apply(): AngularModalSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AngularModalSettings]
    }
    
    @scala.inline
    implicit class AngularModalSettingsMutableBuilder[Self <: AngularModalSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: AngularModalJQuerySelector): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerElement(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setContainerVarargs(value: (js.Any | Element)*): Self = StObject.set(x, "container", js.Array(value :_*))
      
      @scala.inline
      def setController(value: AngularModalControllerDefinition): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControllerAs(value: String): Self = StObject.set(x, "controllerAs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControllerAsUndefined: Self = StObject.set(x, "controllerAs", js.undefined)
      
      @scala.inline
      def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    }
  }
  
  @js.native
  trait AngularModalSettingsWithTemplate extends AngularModalSettings {
    
    var template: js.Any = js.native
  }
  object AngularModalSettingsWithTemplate {
    
    @scala.inline
    def apply(template: js.Any): AngularModalSettingsWithTemplate = {
      val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[AngularModalSettingsWithTemplate]
    }
    
    @scala.inline
    implicit class AngularModalSettingsWithTemplateMutableBuilder[Self <: AngularModalSettingsWithTemplate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTemplate(value: js.Any): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AngularModalSettingsWithTemplateUrl extends AngularModalSettings {
    
    var templateUrl: String = js.native
  }
  object AngularModalSettingsWithTemplateUrl {
    
    @scala.inline
    def apply(templateUrl: String): AngularModalSettingsWithTemplateUrl = {
      val __obj = js.Dynamic.literal(templateUrl = templateUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[AngularModalSettingsWithTemplateUrl]
    }
    
    @scala.inline
    implicit class AngularModalSettingsWithTemplateUrlMutableBuilder[Self <: AngularModalSettingsWithTemplateUrl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
    }
  }
}
