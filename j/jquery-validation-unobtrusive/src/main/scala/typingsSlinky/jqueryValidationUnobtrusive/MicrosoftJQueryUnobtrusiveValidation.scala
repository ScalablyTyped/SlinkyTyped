package typingsSlinky.jqueryValidationUnobtrusive

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery
import typingsSlinky.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MicrosoftJQueryUnobtrusiveValidation {
  
  @js.native
  trait Adapter extends StObject {
    
    var adapt: js.Function = js.native
    
    var name: String = js.native
    
    var params: js.Array[String] = js.native
  }
  object Adapter {
    
    @scala.inline
    def apply(adapt: js.Function, name: String, params: js.Array[String]): Adapter = {
      val __obj = js.Dynamic.literal(adapt = adapt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[Adapter]
    }
    
    @scala.inline
    implicit class AdapterMutableBuilder[Self <: Adapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdapt(value: js.Function): Self = StObject.set(x, "adapt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: js.Array[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsVarargs(value: String*): Self = StObject.set(x, "params", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Adapters extends Array[Adapter] {
    
    def add(adapterName: String, fn: js.Function): Adapters = js.native
    def add(adapterName: String, params: js.Array[String], fn: js.Function): Adapters = js.native
    
    def addBool(adapterName: String): Adapters = js.native
    def addBool(adapterName: String, ruleName: String): Adapters = js.native
    
    def addMethod(
      adapterName: String,
      fn: js.Function3[/* value */ String, /* element */ Element, /* params */ js.Any, _]
    ): Adapters = js.native
    
    def addMinMax(adapterName: String, minRuleName: String, maxRuleName: String, minMaxRuleName: String): Adapters = js.native
    def addMinMax(
      adapterName: String,
      minRuleName: String,
      maxRuleName: String,
      minMaxRuleName: String,
      minAttribute: js.UndefOr[scala.Nothing],
      maxAttribute: String
    ): Adapters = js.native
    def addMinMax(
      adapterName: String,
      minRuleName: String,
      maxRuleName: String,
      minMaxRuleName: String,
      minAttribute: String
    ): Adapters = js.native
    def addMinMax(
      adapterName: String,
      minRuleName: String,
      maxRuleName: String,
      minMaxRuleName: String,
      minAttribute: String,
      maxAttribute: String
    ): Adapters = js.native
    
    def addSingleVal(adapterName: String, attribute: String, ruleName: String): Adapters = js.native
    def addSingleVal(adapterName: String, ruleName: String): Adapters = js.native
  }
  
  type JQuerySelector = String | Document | Element | JQuery[HTMLElement]
  
  @js.native
  trait Validator extends StObject {
    
    var adapters: Adapters = js.native
    
    def parse(selector: JQuerySelector): Unit = js.native
    
    def parseElement(element: JQuerySelector): Unit = js.native
    def parseElement(element: JQuerySelector, skipAttach: Boolean): Unit = js.native
  }
}
