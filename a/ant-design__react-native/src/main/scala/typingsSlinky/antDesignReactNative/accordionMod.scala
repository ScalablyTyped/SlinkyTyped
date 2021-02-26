package typingsSlinky.antDesignReactNative

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.antDesignReactNative.anon.PartialAccordionStyle
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.bottom
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.center
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.top
import typingsSlinky.antDesignReactNative.styleMod.AccordionStyle
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeCollapsible.mod.EasingMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionMod {
  
  @JSImport("@ant-design/react-native/lib/accordion", JSImport.Default)
  @js.native
  class default[T /* <: AccordionHeader */] () extends Accordion[T]
  object default {
    
    @JSImport("@ant-design/react-native/lib/accordion", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ant-design/react-native/lib/accordion", "default.Panel")
    @js.native
    def Panel: js.Any = js.native
    @scala.inline
    def Panel_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Panel")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Accordion[T /* <: AccordionHeader */]
    extends Component[AccordionNativeProps[T], js.Any, js.Any] {
    
    def renderContent(styles: AccordionStyle): js.Function1[/* section */ T, ReactElement] = js.native
    
    def renderHeader(styles: AccordionStyle): js.Function3[/* section */ T, /* _ */ Double, /* isActive */ Boolean, ReactElement] = js.native
  }
  
  @js.native
  trait AccordionHeader extends StObject {
    
    var content: ReactElement = js.native
    
    var style: StyleProp[ViewStyle] = js.native
    
    var title: String = js.native
  }
  object AccordionHeader {
    
    @scala.inline
    def apply(content: ReactElement, title: String): AccordionHeader = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccordionHeader]
    }
    
    @scala.inline
    implicit class AccordionHeaderMutableBuilder[Self <: AccordionHeader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent @ant-design/react-native.@ant-design/react-native/lib/style.WithThemeStyles<@ant-design/react-native.@ant-design/react-native/lib/accordion/style.AccordionStyle> */
  /* Inlined parent std.Partial<react-native-collapsible.react-native-collapsible/Accordion.AccordionProps<T>> */
  @js.native
  trait AccordionNativeProps[T] extends StObject {
    
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
    implicit class AccordionNativePropsMutableBuilder[Self <: AccordionNativeProps[_], T] (val x: Self with AccordionNativeProps[T]) extends AnyVal {
      
      @scala.inline
      def setActiveSections(value: js.Array[Double]): Self = StObject.set(x, "activeSections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveSectionsUndefined: Self = StObject.set(x, "activeSections", js.undefined)
      
      @scala.inline
      def setActiveSectionsVarargs(value: Double*): Self = StObject.set(x, "activeSections", js.Array(value :_*))
      
      @scala.inline
      def setAlign(value: top | center | bottom): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      @scala.inline
      def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(value: EasingMode | js.Any): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setExpandFromBottom(value: Boolean): Self = StObject.set(x, "expandFromBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandFromBottomUndefined: Self = StObject.set(x, "expandFromBottom", js.undefined)
      
      @scala.inline
      def setExpandMultiple(value: Boolean): Self = StObject.set(x, "expandMultiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandMultipleUndefined: Self = StObject.set(x, "expandMultiple", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* indexes */ js.Array[Double] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setRenderContent(
        value: (/* content */ T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement
      ): Self = StObject.set(x, "renderContent", js.Any.fromFunction4(value))
      
      @scala.inline
      def setRenderContentUndefined: Self = StObject.set(x, "renderContent", js.undefined)
      
      @scala.inline
      def setRenderFooter(
        value: (/* content */ T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement
      ): Self = StObject.set(x, "renderFooter", js.Any.fromFunction4(value))
      
      @scala.inline
      def setRenderFooterUndefined: Self = StObject.set(x, "renderFooter", js.undefined)
      
      @scala.inline
      def setRenderHeader(
        value: (/* content */ T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement
      ): Self = StObject.set(x, "renderHeader", js.Any.fromFunction4(value))
      
      @scala.inline
      def setRenderHeaderUndefined: Self = StObject.set(x, "renderHeader", js.undefined)
      
      @scala.inline
      def setRenderSectionTitle(
        value: (/* content */ T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement
      ): Self = StObject.set(x, "renderSectionTitle", js.Any.fromFunction4(value))
      
      @scala.inline
      def setRenderSectionTitleUndefined: Self = StObject.set(x, "renderSectionTitle", js.undefined)
      
      @scala.inline
      def setSectionContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "sectionContainerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSectionContainerStyleNull: Self = StObject.set(x, "sectionContainerStyle", null)
      
      @scala.inline
      def setSectionContainerStyleUndefined: Self = StObject.set(x, "sectionContainerStyle", js.undefined)
      
      @scala.inline
      def setSections(value: js.Array[T]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
      
      @scala.inline
      def setSectionsVarargs(value: T*): Self = StObject.set(x, "sections", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyles(value: PartialAccordionStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTouchableComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "touchableComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchableComponentUndefined: Self = StObject.set(x, "touchableComponent", js.undefined)
      
      @scala.inline
      def setTouchableProps(value: js.Object): Self = StObject.set(x, "touchableProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchablePropsUndefined: Self = StObject.set(x, "touchableProps", js.undefined)
      
      @scala.inline
      def setUnderlayColor(value: String): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
    }
  }
  
  @js.native
  trait AccordionPanelProps extends StObject {
    
    var header: js.Any = js.native
    
    var key: js.UndefOr[String] = js.native
  }
  object AccordionPanelProps {
    
    @scala.inline
    def apply(header: js.Any): AccordionPanelProps = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccordionPanelProps]
    }
    
    @scala.inline
    implicit class AccordionPanelPropsMutableBuilder[Self <: AccordionPanelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeader(value: js.Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
}
