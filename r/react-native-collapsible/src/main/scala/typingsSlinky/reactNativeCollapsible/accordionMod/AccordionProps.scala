package typingsSlinky.reactNativeCollapsible.accordionMod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeCollapsible.mod.EasingMode
import typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.bottom
import typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.center
import typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccordionProps[T] extends js.Object {
  /**
    * Control which indices in the sections array are currently open. If empty, closes all sections.
    */
  var activeSections: js.Array[Double] = js.native
  /**
    * Alignment of the content when transitioning, can be top, center or bottom
    *
    * @default top
    */
  var align: js.UndefOr[top | center | bottom] = js.native
  /**
    * Optional styling for the Accordion container
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Controls whether user can interact with accordion
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Duration of transition in milliseconds
    *
    * @default 300
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * Function or function name from Easing (or tween-functions if < RN 0.8). Collapsible will try to combine Easing functions for you if you name them like tween-functions.
    *
    * @default easeOutCubic
    */
  var easing: js.UndefOr[EasingMode | js.Any] = js.native
  /**
    * Expand content from the bottom instead of the top
    *
    * @default false
    */
  var expandFromBottom: js.UndefOr[Boolean] = js.native
  /**
    * Allow more than one section to be expanded at a time. Defaults to false for legacy behavior.
    *
    * @default false
    */
  var expandMultiple: js.UndefOr[Boolean] = js.native
  /**
    * A function that should return a renderable representing the footer
    */
  var renderFooter: js.UndefOr[
    js.Function4[
      /* content */ T, 
      /* index */ Double, 
      /* isActive */ Boolean, 
      /* sections */ js.Array[T], 
      ReactElement
    ]
  ] = js.native
  /**
    * A function that should return a renderable representing the section title above the touchable
    */
  var renderSectionTitle: js.UndefOr[
    js.Function4[
      /* content */ T, 
      /* index */ Double, 
      /* isActive */ Boolean, 
      /* sections */ js.Array[T], 
      ReactElement
    ]
  ] = js.native
  /**
    * Optional styling for the section container
    */
  var sectionContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * An array of sections passed to the render methods
    */
  var sections: js.Array[T] = js.native
  /**
    * Component to use for the Touchable
    *
    * @default TouchableHighlight
    */
  var touchableComponent: js.UndefOr[ReactComponentClass[js.Object]] = js.native
  /**
    * Object of props to pass to the touchable component
    */
  var touchableProps: js.UndefOr[js.Object] = js.native
  /**
    * The color of the underlay that will show through when tapping on headers.
    *
    * @default black
    */
  var underlayColor: js.UndefOr[String] = js.native
  /**
    * A function that is called when the currently active section(s) are updated.
    */
  def onChange(indexes: js.Array[Double]): Unit = js.native
  /**
    * A function that should return a renderable representing the content
    */
  def renderContent(content: T, index: Double, isActive: Boolean, sections: js.Array[T]): ReactElement = js.native
  /**
    * A function that should return a renderable representing the header
    */
  def renderHeader(content: T, index: Double, isActive: Boolean, sections: js.Array[T]): ReactElement = js.native
}

object AccordionProps {
  @scala.inline
  def apply[T](
    activeSections: js.Array[Double],
    onChange: js.Array[Double] => Unit,
    renderContent: (T, Double, Boolean, js.Array[T]) => ReactElement,
    renderHeader: (T, Double, Boolean, js.Array[T]) => ReactElement,
    sections: js.Array[T]
  ): AccordionProps[T] = {
    val __obj = js.Dynamic.literal(activeSections = activeSections.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), renderContent = js.Any.fromFunction4(renderContent), renderHeader = js.Any.fromFunction4(renderHeader), sections = sections.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionProps[T]]
  }
  @scala.inline
  implicit class AccordionPropsOps[Self[t] <: AccordionProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withActiveSections(value: js.Array[Double]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeSections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnChange(value: js.Array[Double] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRenderContent(value: (T, Double, Boolean, js.Array[T]) => ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderContent")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withRenderHeader(value: (T, Double, Boolean, js.Array[T]) => ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderHeader")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSections(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlign(value: top | center | bottom): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerStyle(value: StyleProp[ViewStyle]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerStyleNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(null)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEasing(value: EasingMode | js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasing: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandFromBottom(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandFromBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandFromBottom: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandFromBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandMultiple(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandMultiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandMultiple: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandMultiple")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderFooter(
      value: (/* content */ T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFooter")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutRenderFooter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderSectionTitle(
      value: (/* content */ T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSectionTitle")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutRenderSectionTitle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSectionTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withSectionContainerStyle(value: StyleProp[ViewStyle]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSectionContainerStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSectionContainerStyleNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionContainerStyle")(null)
        ret
    }
    @scala.inline
    def withTouchableComponent(value: ReactComponentClass[js.Object]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchableComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchableComponent: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchableComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchableProps(value: js.Object): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchableProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchableProps: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchableProps")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderlayColor(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlayColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderlayColor: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlayColor")(js.undefined)
        ret
    }
  }
  
}

