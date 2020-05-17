package typingsSlinky.antDesignReactNative.accordionMod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
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

/* Inlined parent @ant-design/react-native.@ant-design/react-native/lib/style.WithThemeStyles<@ant-design/react-native.@ant-design/react-native/lib/accordion/style.AccordionStyle> */
/* Inlined parent std.Partial<react-native-collapsible.react-native-collapsible/Accordion.AccordionProps<T>> */
@js.native
trait AccordionNativeProps[T] extends js.Object {
  var activeSections: js.UndefOr[js.Array[Double]] = js.native
  var align: js.UndefOr[top | center | bottom] = js.native
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var duration: js.UndefOr[Double] = js.native
  var easing: js.UndefOr[EasingMode | js.Any] = js.native
  var expandFromBottom: js.UndefOr[Boolean] = js.native
  var expandMultiple: js.UndefOr[Boolean] = js.native
  var onChange: js.UndefOr[js.Function1[/* indexes */ js.Array[Double], Unit]] = js.native
  var renderContent: js.UndefOr[
    js.Function4[
      /* content */ T, 
      /* index */ Double, 
      /* isActive */ Boolean, 
      /* sections */ js.Array[T], 
      ReactElement
    ]
  ] = js.native
  var renderFooter: js.UndefOr[
    js.Function4[
      /* content */ T, 
      /* index */ Double, 
      /* isActive */ Boolean, 
      /* sections */ js.Array[T], 
      ReactElement
    ]
  ] = js.native
  var renderHeader: js.UndefOr[
    js.Function4[
      /* content */ T, 
      /* index */ Double, 
      /* isActive */ Boolean, 
      /* sections */ js.Array[T], 
      ReactElement
    ]
  ] = js.native
  var renderSectionTitle: js.UndefOr[
    js.Function4[
      /* content */ T, 
      /* index */ Double, 
      /* isActive */ Boolean, 
      /* sections */ js.Array[T], 
      ReactElement
    ]
  ] = js.native
  var sectionContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var sections: js.UndefOr[js.Array[T]] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var styles: js.UndefOr[PartialAccordionStyle] = js.native
  var touchableComponent: js.UndefOr[ReactComponentClass[js.Object]] = js.native
  var touchableProps: js.UndefOr[js.Object] = js.native
  var underlayColor: js.UndefOr[String] = js.native
}

object AccordionNativeProps {
  @scala.inline
  def apply[T](): AccordionNativeProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccordionNativeProps[T]]
  }
  @scala.inline
  implicit class AccordionNativePropsOps[Self[t] <: AccordionNativeProps[t], T] (val x: Self[T]) extends AnyVal {
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
    def withoutActiveSections: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeSections")(js.undefined)
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
    def withOnChange(value: /* indexes */ js.Array[Double] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderContent(
      value: (/* content */ T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderContent")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutRenderContent: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderContent")(js.undefined)
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
    def withRenderHeader(
      value: (/* content */ T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderHeader")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutRenderHeader: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderHeader")(js.undefined)
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
    def withSections(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSections: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sections")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: StyleProp[ViewStyle]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(null)
        ret
    }
    @scala.inline
    def withStyles(value: PartialAccordionStyle): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
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

