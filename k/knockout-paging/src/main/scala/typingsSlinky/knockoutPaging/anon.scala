package typingsSlinky.knockoutPaging

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AddDisposeCallback extends StObject {
    
    def addDisposeCallback(node: org.scalajs.dom.raw.Element, callback: js.Function): Unit = js.native
    
    def cleanNode(node: Node): org.scalajs.dom.raw.Element = js.native
    
    def removeDisposeCallback(node: org.scalajs.dom.raw.Element, callback: js.Function): Unit = js.native
    
    def removeNode(node: Node): Unit = js.native
  }
  object AddDisposeCallback {
    
    @scala.inline
    def apply(
      addDisposeCallback: (org.scalajs.dom.raw.Element, js.Function) => Unit,
      cleanNode: Node => org.scalajs.dom.raw.Element,
      removeDisposeCallback: (org.scalajs.dom.raw.Element, js.Function) => Unit,
      removeNode: Node => Unit
    ): AddDisposeCallback = {
      val __obj = js.Dynamic.literal(addDisposeCallback = js.Any.fromFunction2(addDisposeCallback), cleanNode = js.Any.fromFunction1(cleanNode), removeDisposeCallback = js.Any.fromFunction2(removeDisposeCallback), removeNode = js.Any.fromFunction1(removeNode))
      __obj.asInstanceOf[AddDisposeCallback]
    }
    
    @scala.inline
    implicit class AddDisposeCallbackMutableBuilder[Self <: AddDisposeCallback] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddDisposeCallback(value: (org.scalajs.dom.raw.Element, js.Function) => Unit): Self = StObject.set(x, "addDisposeCallback", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCleanNode(value: Node => org.scalajs.dom.raw.Element): Self = StObject.set(x, "cleanNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveDisposeCallback(value: (org.scalajs.dom.raw.Element, js.Function) => Unit): Self = StObject.set(x, "removeDisposeCallback", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveNode(value: Node => Unit): Self = StObject.set(x, "removeNode", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait AddTemplate extends StObject {
    
    def addTemplate(templateName: String, templateMarkup: String): Unit = js.native
    
    def createJavaScriptEvaluatorBlock(script: String): String = js.native
    
    def renderTemplateSource(templateSource: js.Object, bindingContext: KnockoutBindingContext, options: js.Object): js.Array[Node] = js.native
  }
  object AddTemplate {
    
    @scala.inline
    def apply(
      addTemplate: (String, String) => Unit,
      createJavaScriptEvaluatorBlock: String => String,
      renderTemplateSource: (js.Object, KnockoutBindingContext, js.Object) => js.Array[Node]
    ): AddTemplate = {
      val __obj = js.Dynamic.literal(addTemplate = js.Any.fromFunction2(addTemplate), createJavaScriptEvaluatorBlock = js.Any.fromFunction1(createJavaScriptEvaluatorBlock), renderTemplateSource = js.Any.fromFunction3(renderTemplateSource))
      __obj.asInstanceOf[AddTemplate]
    }
    
    @scala.inline
    implicit class AddTemplateMutableBuilder[Self <: AddTemplate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddTemplate(value: (String, String) => Unit): Self = StObject.set(x, "addTemplate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCreateJavaScriptEvaluatorBlock(value: String => String): Self = StObject.set(x, "createJavaScriptEvaluatorBlock", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderTemplateSource(value: (js.Object, KnockoutBindingContext, js.Object) => js.Array[Node]): Self = StObject.set(x, "renderTemplateSource", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait ApplyMemoizedBindingsToNextSibling extends StObject {
    
    def applyMemoizedBindingsToNextSibling(bindings: js.Any, nodeName: String): String = js.native
    
    def ensureTemplateIsRewritten(template: String, templateEngine: KnockoutTemplateEngine, templateDocument: Document): js.Any = js.native
    def ensureTemplateIsRewritten(template: Node, templateEngine: KnockoutTemplateEngine, templateDocument: Document): js.Any = js.native
    
    def memoizeBindingAttributeSyntax(htmlString: String, templateEngine: KnockoutTemplateEngine): js.Any = js.native
  }
  
  @js.native
  trait BindingRewriteValidators extends StObject {
    
    var bindingRewriteValidators: js.Any = js.native
    
    def parseObjectLiteral(objectLiteralString: String): js.Array[_] = js.native
  }
  object BindingRewriteValidators {
    
    @scala.inline
    def apply(bindingRewriteValidators: js.Any, parseObjectLiteral: String => js.Array[_]): BindingRewriteValidators = {
      val __obj = js.Dynamic.literal(bindingRewriteValidators = bindingRewriteValidators.asInstanceOf[js.Any], parseObjectLiteral = js.Any.fromFunction1(parseObjectLiteral))
      __obj.asInstanceOf[BindingRewriteValidators]
    }
    
    @scala.inline
    implicit class BindingRewriteValidatorsMutableBuilder[Self <: BindingRewriteValidators] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBindingRewriteValidators(value: js.Any): Self = StObject.set(x, "bindingRewriteValidators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseObjectLiteral(value: String => js.Array[_]): Self = StObject.set(x, "parseObjectLiteral", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Clear extends StObject {
    
    def clear(node: org.scalajs.dom.raw.Element): Boolean = js.native
    
    def get(node: org.scalajs.dom.raw.Element, key: String): js.Any = js.native
    
    def getAll(node: org.scalajs.dom.raw.Element, createIfNotFound: Boolean): js.Any = js.native
    
    def set(node: org.scalajs.dom.raw.Element, key: String, value: js.Any): Unit = js.native
  }
  object Clear {
    
    @scala.inline
    def apply(
      clear: org.scalajs.dom.raw.Element => Boolean,
      get: (org.scalajs.dom.raw.Element, String) => js.Any,
      getAll: (org.scalajs.dom.raw.Element, Boolean) => js.Any,
      set: (org.scalajs.dom.raw.Element, String, js.Any) => Unit
    ): Clear = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), get = js.Any.fromFunction2(get), getAll = js.Any.fromFunction2(getAll), set = js.Any.fromFunction3(set))
      __obj.asInstanceOf[Clear]
    }
    
    @scala.inline
    implicit class ClearMutableBuilder[Self <: Clear] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: org.scalajs.dom.raw.Element => Boolean): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet(value: (org.scalajs.dom.raw.Element, String) => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetAll(value: (org.scalajs.dom.raw.Element, Boolean) => js.Any): Self = StObject.set(x, "getAll", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSet(value: (org.scalajs.dom.raw.Element, String, js.Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait ControlsDescendantBindings extends StObject {
    
    var controlsDescendantBindings: Boolean = js.native
  }
  object ControlsDescendantBindings {
    
    @scala.inline
    def apply(controlsDescendantBindings: Boolean): ControlsDescendantBindings = {
      val __obj = js.Dynamic.literal(controlsDescendantBindings = controlsDescendantBindings.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlsDescendantBindings]
    }
    
    @scala.inline
    implicit class ControlsDescendantBindingsMutableBuilder[Self <: ControlsDescendantBindings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setControlsDescendantBindings(value: Boolean): Self = StObject.set(x, "controlsDescendantBindings", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Dictindex extends /* index */ NumberDictionary[Node] {
    
    var length: Double = js.native
  }
  object Dictindex {
    
    @scala.inline
    def apply(length: Double): Dictindex = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictindex]
    }
    
    @scala.inline
    implicit class DictindexMutableBuilder[Self <: Dictindex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Dictname extends /* name */ StringDictionary[KnockoutPageGenerator] {
    
    var sliding: KnockoutSlidingPageGenerator = js.native
  }
  object Dictname {
    
    @scala.inline
    def apply(sliding: KnockoutSlidingPageGenerator): Dictname = {
      val __obj = js.Dynamic.literal(sliding = sliding.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictname]
    }
    
    @scala.inline
    implicit class DictnameMutableBuilder[Self <: Dictname] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSliding(value: KnockoutSlidingPageGenerator): Self = StObject.set(x, "sliding", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Element extends StObject {
    
    var element: Node = js.native
  }
  object Element {
    
    @scala.inline
    def apply(element: Node): Element = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[Element]
    }
    
    @scala.inline
    implicit class ElementMutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: Node): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instance extends Instantiable0[KnockoutNativeTemplateEngine] {
    
    var instance: KnockoutNativeTemplateEngine = js.native
  }
  
  @js.native
  trait Instantiable extends Instantiable0[KnockoutTemplateEngine]
  
  @js.native
  trait InstantiableInstance extends Instantiable0[KnockoutBindingProvider] {
    
    var instance: KnockoutBindingProvider = js.native
  }
  
  @js.native
  trait InstantiableKnockoutTemplateAnonymous
    extends Instantiable1[/* element */ org.scalajs.dom.raw.Element, KnockoutTemplateAnonymous]
  
  @js.native
  trait InstantiableKnockoutTemplateSourcesDomElement
    extends Instantiable1[/* element */ org.scalajs.dom.raw.Element, KnockoutTemplateSourcesDomElement]
  
  @js.native
  trait Method extends StObject {
    
    var method: js.UndefOr[String] = js.native
    
    var timeout: Double = js.native
  }
  object Method {
    
    @scala.inline
    def apply(timeout: Double): Method = {
      val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Method]
    }
    
    @scala.inline
    implicit class MethodMutableBuilder[Self <: Method] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Paged extends StObject {
    
    var paged: js.Any = js.native
  }
  object Paged {
    
    @scala.inline
    def apply(paged: js.Any): Paged = {
      val __obj = js.Dynamic.literal(paged = paged.asInstanceOf[js.Any])
      __obj.asInstanceOf[Paged]
    }
    
    @scala.inline
    implicit class PagedMutableBuilder[Self <: Paged] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPaged(value: js.Any): Self = StObject.set(x, "paged", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReadValue extends StObject {
    
    def readValue(element: HTMLElement): js.Any = js.native
    
    def writeValue(element: HTMLElement, value: js.Any): Unit = js.native
  }
  object ReadValue {
    
    @scala.inline
    def apply(readValue: HTMLElement => js.Any, writeValue: (HTMLElement, js.Any) => Unit): ReadValue = {
      val __obj = js.Dynamic.literal(readValue = js.Any.fromFunction1(readValue), writeValue = js.Any.fromFunction2(writeValue))
      __obj.asInstanceOf[ReadValue]
    }
    
    @scala.inline
    implicit class ReadValueMutableBuilder[Self <: ReadValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReadValue(value: HTMLElement => js.Any): Self = StObject.set(x, "readValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWriteValue(value: (HTMLElement, js.Any) => Unit): Self = StObject.set(x, "writeValue", js.Any.fromFunction2(value))
    }
  }
}
