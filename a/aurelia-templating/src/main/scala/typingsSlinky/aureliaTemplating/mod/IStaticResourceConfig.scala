package typingsSlinky.aureliaTemplating.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.NamedNodeMap
import typingsSlinky.aureliaBinding.mod.bindingMode
import typingsSlinky.aureliaTemplating.aureliaTemplatingStrings.attribute
import typingsSlinky.aureliaTemplating.aureliaTemplatingStrings.bindingBehavior
import typingsSlinky.aureliaTemplating.aureliaTemplatingStrings.element
import typingsSlinky.aureliaTemplating.aureliaTemplatingStrings.fromView
import typingsSlinky.aureliaTemplating.aureliaTemplatingStrings.oneTime
import typingsSlinky.aureliaTemplating.aureliaTemplatingStrings.oneWay
import typingsSlinky.aureliaTemplating.aureliaTemplatingStrings.toView
import typingsSlinky.aureliaTemplating.aureliaTemplatingStrings.twoWay
import typingsSlinky.aureliaTemplating.aureliaTemplatingStrings.valueConverter
import typingsSlinky.std.ShadowRootInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStaticResourceConfig extends StObject {
  
  /**
    * List of bindable properties of this custom element / custom attribute, by name or full config object
    */
  var bindables: js.UndefOr[js.Array[String | IBindablePropertyConfig]] = js.native
  
  /**
    * Flag a custom element as containerless. Which will remove their render target
    */
  var containerless: js.UndefOr[Boolean] = js.native
  
  /**
    * Used to set default binding mode of default custom attribute view model "value" property
    */
  var defaultBindingMode: js.UndefOr[bindingMode | oneTime | oneWay | twoWay | fromView | toView] = js.native
  
  /**
    * Flags a custom attribute has dynamic options
    */
  var hasDynamicOptions: js.UndefOr[Boolean] = js.native
  
  /**
    * Name of this resource. Reccommended to explicitly set to works better with minifier
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Custom processing of the attributes on an element before the framework inspects them.
    */
  var processAttributes: js.UndefOr[
    js.Function5[
      /* viewCompiler */ ViewCompiler, 
      /* resources */ ViewResources_, 
      /* node */ Element, 
      /* attributes */ NamedNodeMap, 
      /* elementInstruction */ BehaviorInstruction, 
      Unit
    ]
  ] = js.native
  
  /**
    * Enables custom processing of the content that is places inside the custom element by its consumer.
    * Pass a boolean to direct the template compiler to not process
    * the content placed inside this element. Alternatively, pass a function which
    * can provide custom processing of the content. This function should then return
    * a boolean indicating whether the compiler should also process the content.
    */
  var processContent: js.UndefOr[
    js.Function4[
      /* viewCompiler */ ViewCompiler, 
      /* resources */ ViewResources_, 
      /* node */ Element, 
      /* instruction */ BehaviorInstruction, 
      Boolean
    ]
  ] = js.native
  
  /**
    * Options that will be used if the element is flagged with usesShadowDOM
    */
  var shadowDOMOptions: js.UndefOr[ShadowRootInit] = js.native
  
  /**
    * Used to tell if a custom attribute is a template controller
    */
  var templateController: js.UndefOr[Boolean] = js.native
  
  /**
    * Resource type of this class, omit equals to custom element
    */
  var `type`: js.UndefOr[
    element | attribute | valueConverter | bindingBehavior | typingsSlinky.aureliaTemplating.aureliaTemplatingStrings.viewEngineHooks
  ] = js.native
  
  /**
    * Flag if this custom element uses native shadow dom instead of emulation
    */
  var usesShadowDOM: js.UndefOr[Boolean] = js.native
}
object IStaticResourceConfig {
  
  @scala.inline
  def apply(): IStaticResourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStaticResourceConfig]
  }
  
  @scala.inline
  implicit class IStaticResourceConfigMutableBuilder[Self <: IStaticResourceConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindables(value: js.Array[String | IBindablePropertyConfig]): Self = StObject.set(x, "bindables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindablesUndefined: Self = StObject.set(x, "bindables", js.undefined)
    
    @scala.inline
    def setBindablesVarargs(value: (String | IBindablePropertyConfig)*): Self = StObject.set(x, "bindables", js.Array(value :_*))
    
    @scala.inline
    def setContainerless(value: Boolean): Self = StObject.set(x, "containerless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerlessUndefined: Self = StObject.set(x, "containerless", js.undefined)
    
    @scala.inline
    def setDefaultBindingMode(value: bindingMode | oneTime | oneWay | twoWay | fromView | toView): Self = StObject.set(x, "defaultBindingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultBindingModeUndefined: Self = StObject.set(x, "defaultBindingMode", js.undefined)
    
    @scala.inline
    def setHasDynamicOptions(value: Boolean): Self = StObject.set(x, "hasDynamicOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasDynamicOptionsUndefined: Self = StObject.set(x, "hasDynamicOptions", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProcessAttributes(
      value: (/* viewCompiler */ ViewCompiler, /* resources */ ViewResources_, /* node */ Element, /* attributes */ NamedNodeMap, /* elementInstruction */ BehaviorInstruction) => Unit
    ): Self = StObject.set(x, "processAttributes", js.Any.fromFunction5(value))
    
    @scala.inline
    def setProcessAttributesUndefined: Self = StObject.set(x, "processAttributes", js.undefined)
    
    @scala.inline
    def setProcessContent(
      value: (/* viewCompiler */ ViewCompiler, /* resources */ ViewResources_, /* node */ Element, /* instruction */ BehaviorInstruction) => Boolean
    ): Self = StObject.set(x, "processContent", js.Any.fromFunction4(value))
    
    @scala.inline
    def setProcessContentUndefined: Self = StObject.set(x, "processContent", js.undefined)
    
    @scala.inline
    def setShadowDOMOptions(value: ShadowRootInit): Self = StObject.set(x, "shadowDOMOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowDOMOptionsUndefined: Self = StObject.set(x, "shadowDOMOptions", js.undefined)
    
    @scala.inline
    def setTemplateController(value: Boolean): Self = StObject.set(x, "templateController", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateControllerUndefined: Self = StObject.set(x, "templateController", js.undefined)
    
    @scala.inline
    def setType(
      value: element | attribute | valueConverter | bindingBehavior | typingsSlinky.aureliaTemplating.aureliaTemplatingStrings.viewEngineHooks
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUsesShadowDOM(value: Boolean): Self = StObject.set(x, "usesShadowDOM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsesShadowDOMUndefined: Self = StObject.set(x, "usesShadowDOM", js.undefined)
  }
}
