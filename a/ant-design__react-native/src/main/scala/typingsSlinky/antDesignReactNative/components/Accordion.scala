package typingsSlinky.antDesignReactNative.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.accordionMod.AccordionHeader
import typingsSlinky.antDesignReactNative.accordionMod.AccordionNativeProps
import typingsSlinky.antDesignReactNative.accordionMod.default
import typingsSlinky.antDesignReactNative.anon.PartialAccordionStyle
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.bottom
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.center
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.top
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeCollapsible.mod.EasingMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Accordion {
  @JSImport("@ant-design/react-native/lib/accordion", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T <: AccordionHeader] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default[js.Any]] {
    @scala.inline
    def activeSections(value: js.Array[Double]): this.type = set("activeSections", value.asInstanceOf[js.Any])
    @scala.inline
    def align(value: top | center | bottom): this.type = set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def containerStyleNull: this.type = set("containerStyle", null)
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def easing(value: EasingMode | js.Any): this.type = set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def expandFromBottom(value: Boolean): this.type = set("expandFromBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def expandMultiple(value: Boolean): this.type = set("expandMultiple", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* indexes */ js.Array[Double] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def renderContent(value: (T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement): this.type = set("renderContent", js.Any.fromFunction4(value))
    @scala.inline
    def renderFooter(value: (T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement): this.type = set("renderFooter", js.Any.fromFunction4(value))
    @scala.inline
    def renderHeader(value: (T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement): this.type = set("renderHeader", js.Any.fromFunction4(value))
    @scala.inline
    def renderSectionTitle(value: (T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement): this.type = set("renderSectionTitle", js.Any.fromFunction4(value))
    @scala.inline
    def sectionContainerStyle(value: StyleProp[ViewStyle]): this.type = set("sectionContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def sectionContainerStyleNull: this.type = set("sectionContainerStyle", null)
    @scala.inline
    def sections(value: js.Array[T]): this.type = set("sections", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def styleNull: this.type = set("style", null)
    @scala.inline
    def styles(value: PartialAccordionStyle): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def touchableComponent(value: ReactComponentClass[js.Object]): this.type = set("touchableComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def touchableProps(value: js.Object): this.type = set("touchableProps", value.asInstanceOf[js.Any])
    @scala.inline
    def underlayColor(value: String): this.type = set("underlayColor", value.asInstanceOf[js.Any])
  }
  
  def withProps[T <: AccordionHeader](p: AccordionNativeProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T <: AccordionHeader](): Builder[T] = {
    val __props = js.Dynamic.literal()
    new Builder[T](js.Array(this.component, __props.asInstanceOf[AccordionNativeProps[T]]))
  }
  implicit def make[T <: AccordionHeader](companion: Accordion.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
}

