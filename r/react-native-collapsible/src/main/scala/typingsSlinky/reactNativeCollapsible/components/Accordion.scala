package typingsSlinky.reactNativeCollapsible.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeCollapsible.accordionMod.AccordionProps
import typingsSlinky.reactNativeCollapsible.accordionMod.default
import typingsSlinky.reactNativeCollapsible.mod.EasingMode
import typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.bottom
import typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.center
import typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Accordion {
  
  @JSImport("react-native-collapsible/Accordion", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default[T]] {
    
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
    def renderFooter(value: (T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement): this.type = set("renderFooter", js.Any.fromFunction4(value))
    
    @scala.inline
    def renderSectionTitle(value: (T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement): this.type = set("renderSectionTitle", js.Any.fromFunction4(value))
    
    @scala.inline
    def sectionContainerStyle(value: StyleProp[ViewStyle]): this.type = set("sectionContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sectionContainerStyleNull: this.type = set("sectionContainerStyle", null)
    
    @scala.inline
    def touchableComponent(value: ReactComponentClass[js.Object]): this.type = set("touchableComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def touchableProps(value: js.Object): this.type = set("touchableProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def underlayColor(value: String): this.type = set("underlayColor", value.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: AccordionProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[T](
    activeSections: js.Array[Double],
    onChange: js.Array[Double] => Unit,
    renderContent: (T, Double, Boolean, js.Array[T]) => ReactElement,
    renderHeader: (T, Double, Boolean, js.Array[T]) => ReactElement,
    sections: js.Array[T]
  ): Builder[T] = {
    val __props = js.Dynamic.literal(activeSections = activeSections.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), renderContent = js.Any.fromFunction4(renderContent), renderHeader = js.Any.fromFunction4(renderHeader), sections = sections.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[AccordionProps[T]]))
  }
}
