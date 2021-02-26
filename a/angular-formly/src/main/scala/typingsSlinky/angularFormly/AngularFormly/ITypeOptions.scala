package typingsSlinky.angularFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angular.JQLite
import typingsSlinky.angular.mod.IAttributes
import typingsSlinky.angular.mod.IController
import typingsSlinky.angular.mod.IDirectiveLinkFn
import typingsSlinky.angular.mod.IScope
import typingsSlinky.angular.mod.ITranscludeFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  *
  * see http://docs.angular-formly.com/docs/custom-templates#section-formlyconfig-settype-options
  */
@js.native
trait ITypeOptions extends StObject {
  
  var apiCheck: js.UndefOr[StringDictionary[js.Function]] = js.native
  
  var apiCheckFunction: js.UndefOr[String] = js.native
  
  //'throw' or 'warn
  var apiCheckInstance: js.UndefOr[js.Any] = js.native
  
  var apiCheckOptions: js.UndefOr[js.Object] = js.native
  
  var controller: js.UndefOr[js.Function | String | js.Array[_]] = js.native
  
  var data: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var defaultOptions: js.UndefOr[IFieldConfigurationObject | js.Function] = js.native
  
  var `extends`: js.UndefOr[String] = js.native
  
  var link: js.UndefOr[IDirectiveLinkFn[IScope, JQLite, IAttributes, IController]] = js.native
  
  var name: String = js.native
  
  var overwriteOk: js.UndefOr[Boolean] = js.native
  
  var template: js.UndefOr[js.Function | String] = js.native
  
  var templateUrl: js.UndefOr[js.Function | String] = js.native
  
  var validateOptions: js.UndefOr[js.Function] = js.native
  
  var wrapper: js.UndefOr[String | js.Array[String]] = js.native
}
object ITypeOptions {
  
  @scala.inline
  def apply(name: String): ITypeOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITypeOptions]
  }
  
  @scala.inline
  implicit class ITypeOptionsMutableBuilder[Self <: ITypeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiCheck(value: StringDictionary[js.Function]): Self = StObject.set(x, "apiCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiCheckFunction(value: String): Self = StObject.set(x, "apiCheckFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiCheckFunctionUndefined: Self = StObject.set(x, "apiCheckFunction", js.undefined)
    
    @scala.inline
    def setApiCheckInstance(value: js.Any): Self = StObject.set(x, "apiCheckInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiCheckInstanceUndefined: Self = StObject.set(x, "apiCheckInstance", js.undefined)
    
    @scala.inline
    def setApiCheckOptions(value: js.Object): Self = StObject.set(x, "apiCheckOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiCheckOptionsUndefined: Self = StObject.set(x, "apiCheckOptions", js.undefined)
    
    @scala.inline
    def setApiCheckUndefined: Self = StObject.set(x, "apiCheck", js.undefined)
    
    @scala.inline
    def setController(value: js.Function | String | js.Array[_]): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    @scala.inline
    def setControllerVarargs(value: js.Any*): Self = StObject.set(x, "controller", js.Array(value :_*))
    
    @scala.inline
    def setData(value: StringDictionary[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDefaultOptions(value: IFieldConfigurationObject | js.Function): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultOptionsUndefined: Self = StObject.set(x, "defaultOptions", js.undefined)
    
    @scala.inline
    def setExtends(value: String): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
    
    @scala.inline
    def setLink(
      value: (IScope, JQLite, IAttributes, /* controller */ js.UndefOr[IController], /* transclude */ js.UndefOr[ITranscludeFunction]) => Unit
    ): Self = StObject.set(x, "link", js.Any.fromFunction5(value))
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwriteOk(value: Boolean): Self = StObject.set(x, "overwriteOk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwriteOkUndefined: Self = StObject.set(x, "overwriteOk", js.undefined)
    
    @scala.inline
    def setTemplate(value: js.Function | String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setTemplateUrl(value: js.Function | String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
    
    @scala.inline
    def setValidateOptions(value: js.Function): Self = StObject.set(x, "validateOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOptionsUndefined: Self = StObject.set(x, "validateOptions", js.undefined)
    
    @scala.inline
    def setWrapper(value: String | js.Array[String]): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    
    @scala.inline
    def setWrapperVarargs(value: String*): Self = StObject.set(x, "wrapper", js.Array(value :_*))
  }
}
