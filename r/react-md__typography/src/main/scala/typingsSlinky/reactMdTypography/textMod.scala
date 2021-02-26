package typingsSlinky.reactMdTypography

import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLBodyElement
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLHeadingElement
import org.scalajs.dom.raw.HTMLHtmlElement
import org.scalajs.dom.raw.HTMLParagraphElement
import org.scalajs.dom.raw.HTMLSpanElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdTypography.anon.ClassName
import typingsSlinky.reactMdTypography.reactMdTypographyStrings.bottom
import typingsSlinky.reactMdTypography.reactMdTypographyStrings.initial
import typingsSlinky.reactMdTypography.reactMdTypographyStrings.none
import typingsSlinky.reactMdTypography.reactMdTypographyStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod {
  
  @JSImport("@react-md/typography/types/Text", "Text")
  @js.native
  val Text: ForwardRefExoticComponent[TextProps with RefAttributes[TextElement]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.italic
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.oblique
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.normal
  */
  trait FontStyle extends StObject
  object FontStyle {
    
    @scala.inline
    def italic: typingsSlinky.reactMdTypography.reactMdTypographyStrings.italic = "italic".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.italic]
    
    @scala.inline
    def normal: typingsSlinky.reactMdTypography.reactMdTypographyStrings.normal = "normal".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.normal]
    
    @scala.inline
    def oblique: typingsSlinky.reactMdTypography.reactMdTypographyStrings.oblique = "oblique".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.oblique]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.left
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.center
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.right
  */
  trait TextAlign extends StObject
  object TextAlign {
    
    @scala.inline
    def center: typingsSlinky.reactMdTypography.reactMdTypographyStrings.center = "center".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.center]
    
    @scala.inline
    def left: typingsSlinky.reactMdTypography.reactMdTypographyStrings.left = "left".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.left]
    
    @scala.inline
    def right: typingsSlinky.reactMdTypography.reactMdTypographyStrings.right = "right".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.right]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.secondary
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.hint
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.`theme-primary`
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.`theme-secondary`
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.`theme-warning`
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.`theme-error`
  */
  trait TextColor extends StObject
  object TextColor {
    
    @scala.inline
    def hint: typingsSlinky.reactMdTypography.reactMdTypographyStrings.hint = "hint".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.hint]
    
    @scala.inline
    def secondary: typingsSlinky.reactMdTypography.reactMdTypographyStrings.secondary = "secondary".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.secondary]
    
    @scala.inline
    def `theme-error`: typingsSlinky.reactMdTypography.reactMdTypographyStrings.`theme-error` = "theme-error".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.`theme-error`]
    
    @scala.inline
    def `theme-primary`: typingsSlinky.reactMdTypography.reactMdTypographyStrings.`theme-primary` = "theme-primary".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.`theme-primary`]
    
    @scala.inline
    def `theme-secondary`: typingsSlinky.reactMdTypography.reactMdTypographyStrings.`theme-secondary` = "theme-secondary".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.`theme-secondary`]
    
    @scala.inline
    def `theme-warning`: typingsSlinky.reactMdTypography.reactMdTypographyStrings.`theme-warning` = "theme-warning".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.`theme-warning`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.underline
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.overline
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.`line-through`
  */
  trait TextDecoration extends StObject
  object TextDecoration {
    
    @scala.inline
    def `line-through`: typingsSlinky.reactMdTypography.reactMdTypographyStrings.`line-through` = "line-through".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.`line-through`]
    
    @scala.inline
    def overline: typingsSlinky.reactMdTypography.reactMdTypographyStrings.overline = "overline".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.overline]
    
    @scala.inline
    def underline: typingsSlinky.reactMdTypography.reactMdTypographyStrings.underline = "underline".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.underline]
  }
  
  type TextElement = HTMLHeadingElement | HTMLParagraphElement | HTMLSpanElement | HTMLDivElement | HTMLButtonElement | HTMLAnchorElement | HTMLBodyElement | HTMLHtmlElement
  
  @js.native
  trait TextProps extends HTMLAttributes[TextElement] {
    
    /**
      * An optional text alignment to apply.
      */
    var align: js.UndefOr[TextAlign] = js.native
    
    /**
      * Either a child render function or a react node. If this is not the child
      * render function, a different wrapper component can be provided using the
      * `component` prop.
      */
    @JSName("children")
    var children_TextProps: js.UndefOr[ReactElement | TextRenderFunction] = js.native
    
    /**
      * An optional text color to apply. Unline normal theme colors, these will
      * reflect the `text-secondary-on-background` and `text-hint-on-background`
      * instead of the primary or secondary theme colors.
      */
    @JSName("color")
    var color_TextProps: js.UndefOr[TextColor] = js.native
    
    /**
      * The component to render as when the children are not a render function. If
      * this prop is omitted, the component will be determined by the `type` prop
      * where:
      *
      * - `"headline-1" -> <h1>`
      * - `"headline-2" -> <h2>`
      * - `"headline-3" -> <h3>`
      * - `"headline-4" -> <h4>`
      * - `"headline-5" -> <h5>`
      * - `"headline-6" -> <h6>`
      * - `"subtitle-1" -> <h5>`
      * - `"subtitle-2" -> <h6>`
      * - `"body-1"     -> <p>`
      * - `"body-2"     -> <p>`
      * - `"caption"    -> <caption>`
      * - `"overline"   -> <span>`
      * - `"button"     -> <button>`
      *
      */
    var component: js.UndefOr[ReactElement | Null] = js.native
    
    /**
      * An optional text decoration to apply.
      */
    var decoration: js.UndefOr[TextDecoration] = js.native
    
    /**
      * An optional font-style to apply.
      */
    var fontStyle: js.UndefOr[FontStyle] = js.native
    
    /**
      * Since the typography within react-md tries to not modify base elements, the
      * default margin applied to heading tags (h1-h6) and paragraph (p) might have
      * large margin that you don't want applied when using this component. You can
      * disable:
      *
      * - only the top margin by setting this prop to `"bottom"`
      * - only the bottom margin by setting this prop to `"top"`
      * - top and bottom margin by setting this prop to `"none"`
      * - or keep the initial behavior: `"initial"`
      */
    var margin: js.UndefOr[initial | none | top | bottom] = js.native
    
    /**
      * An optional text transformation to apply.
      */
    var transform: js.UndefOr[TextTransform] = js.native
    
    /**
      * One of the material design typography text styles. This is used to generate
      * a className that can be applied to any element and have the correct
      * typography.
      */
    var `type`: js.UndefOr[TextTypes] = js.native
    
    /**
      * An optional font-weight to apply.
      */
    var weight: js.UndefOr[TextWeight] = js.native
  }
  object TextProps {
    
    @scala.inline
    def apply(): TextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextProps]
    }
    
    @scala.inline
    implicit class TextPropsMutableBuilder[Self <: TextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: TextAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement | TextRenderFunction): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction1(value: /* props */ ClassName => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setColor(value: TextColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setComponent(value: ReactElement): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentNull: Self = StObject.set(x, "component", null)
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setDecoration(value: TextDecoration): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setMargin(value: initial | none | top | bottom): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setTransform(value: TextTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setType(value: TextTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWeight(value: TextWeight): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
  
  type TextRenderFunction = js.Function1[/* props */ ClassName, ReactElement]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.capitalize
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.uppercase
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.lowercase
  */
  trait TextTransform extends StObject
  object TextTransform {
    
    @scala.inline
    def capitalize: typingsSlinky.reactMdTypography.reactMdTypographyStrings.capitalize = "capitalize".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.capitalize]
    
    @scala.inline
    def lowercase: typingsSlinky.reactMdTypography.reactMdTypographyStrings.lowercase = "lowercase".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.lowercase]
    
    @scala.inline
    def uppercase: typingsSlinky.reactMdTypography.reactMdTypographyStrings.uppercase = "uppercase".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.uppercase]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.`headline-1`
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.`headline-2`
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.`headline-3`
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.`headline-4`
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.`headline-5`
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.`headline-6`
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.`subtitle-1`
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.`subtitle-2`
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.`body-1`
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.`body-2`
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.caption
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.overline
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.button
  */
  trait TextTypes extends StObject
  object TextTypes {
    
    @scala.inline
    def `body-1`: typingsSlinky.reactMdTypography.reactMdTypographyStrings.`body-1` = "body-1".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.`body-1`]
    
    @scala.inline
    def `body-2`: typingsSlinky.reactMdTypography.reactMdTypographyStrings.`body-2` = "body-2".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.`body-2`]
    
    @scala.inline
    def button: typingsSlinky.reactMdTypography.reactMdTypographyStrings.button = "button".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.button]
    
    @scala.inline
    def caption: typingsSlinky.reactMdTypography.reactMdTypographyStrings.caption = "caption".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.caption]
    
    @scala.inline
    def `headline-1`: typingsSlinky.reactMdTypography.reactMdTypographyStrings.`headline-1` = "headline-1".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.`headline-1`]
    
    @scala.inline
    def `headline-2`: typingsSlinky.reactMdTypography.reactMdTypographyStrings.`headline-2` = "headline-2".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.`headline-2`]
    
    @scala.inline
    def `headline-3`: typingsSlinky.reactMdTypography.reactMdTypographyStrings.`headline-3` = "headline-3".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.`headline-3`]
    
    @scala.inline
    def `headline-4`: typingsSlinky.reactMdTypography.reactMdTypographyStrings.`headline-4` = "headline-4".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.`headline-4`]
    
    @scala.inline
    def `headline-5`: typingsSlinky.reactMdTypography.reactMdTypographyStrings.`headline-5` = "headline-5".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.`headline-5`]
    
    @scala.inline
    def `headline-6`: typingsSlinky.reactMdTypography.reactMdTypographyStrings.`headline-6` = "headline-6".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.`headline-6`]
    
    @scala.inline
    def overline: typingsSlinky.reactMdTypography.reactMdTypographyStrings.overline = "overline".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.overline]
    
    @scala.inline
    def `subtitle-1`: typingsSlinky.reactMdTypography.reactMdTypographyStrings.`subtitle-1` = "subtitle-1".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.`subtitle-1`]
    
    @scala.inline
    def `subtitle-2`: typingsSlinky.reactMdTypography.reactMdTypographyStrings.`subtitle-2` = "subtitle-2".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.`subtitle-2`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.thin
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.light
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.regular
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.medium
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.bold
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.`semi-bold`
    - typingsSlinky.reactMdTypography.reactMdTypographyStrings.black
  */
  trait TextWeight extends StObject
  object TextWeight {
    
    @scala.inline
    def black: typingsSlinky.reactMdTypography.reactMdTypographyStrings.black = "black".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.black]
    
    @scala.inline
    def bold: typingsSlinky.reactMdTypography.reactMdTypographyStrings.bold = "bold".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.bold]
    
    @scala.inline
    def light: typingsSlinky.reactMdTypography.reactMdTypographyStrings.light = "light".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.light]
    
    @scala.inline
    def medium: typingsSlinky.reactMdTypography.reactMdTypographyStrings.medium = "medium".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.medium]
    
    @scala.inline
    def regular: typingsSlinky.reactMdTypography.reactMdTypographyStrings.regular = "regular".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.regular]
    
    @scala.inline
    def `semi-bold`: typingsSlinky.reactMdTypography.reactMdTypographyStrings.`semi-bold` = "semi-bold".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.`semi-bold`]
    
    @scala.inline
    def thin: typingsSlinky.reactMdTypography.reactMdTypographyStrings.thin = "thin".asInstanceOf[typingsSlinky.reactMdTypography.reactMdTypographyStrings.thin]
  }
}
