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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStaticResourceConfig extends js.Object {
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
  implicit class IStaticResourceConfigOps[Self <: IStaticResourceConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindables(value: js.Array[String | IBindablePropertyConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindables")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerless")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultBindingMode(value: bindingMode | oneTime | oneWay | twoWay | fromView | toView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultBindingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultBindingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultBindingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withHasDynamicOptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDynamicOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasDynamicOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDynamicOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessAttributes(
      value: (/* viewCompiler */ ViewCompiler, /* resources */ ViewResources_, /* node */ Element, /* attributes */ NamedNodeMap, /* elementInstruction */ BehaviorInstruction) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processAttributes")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutProcessAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessContent(
      value: (/* viewCompiler */ ViewCompiler, /* resources */ ViewResources_, /* node */ Element, /* instruction */ BehaviorInstruction) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processContent")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutProcessContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processContent")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowDOMOptions(value: ShadowRootInit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowDOMOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowDOMOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowDOMOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateController(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateController")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateController: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateController")(js.undefined)
        ret
    }
    @scala.inline
    def withType(
      value: element | attribute | valueConverter | bindingBehavior | typingsSlinky.aureliaTemplating.aureliaTemplatingStrings.viewEngineHooks
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUsesShadowDOM(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usesShadowDOM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsesShadowDOM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usesShadowDOM")(js.undefined)
        ret
    }
  }
  
}

