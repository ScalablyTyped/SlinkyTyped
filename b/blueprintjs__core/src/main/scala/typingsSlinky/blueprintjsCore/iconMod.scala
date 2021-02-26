package typingsSlinky.blueprintjsCore

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.blueprintjsCoreBooleans.`false`
import typingsSlinky.blueprintjsCore.commonMod.AbstractPureComponent2
import typingsSlinky.blueprintjsCore.propsMod.IIntentProps
import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.blueprintjsCore.propsMod.MaybeElement
import typingsSlinky.blueprintjsIcons.iconNameMod.IconName
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.DOMAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/icon/icon", "Icon")
  @js.native
  class Icon protected ()
    extends AbstractPureComponent2[IIconProps with DOMAttributes[HTMLElement], js.Object, js.Object] {
    def this(props: IIconProps with DOMAttributes[HTMLElement]) = this()
    def this(props: IIconProps with DOMAttributes[HTMLElement], context: js.Any) = this()
    
    /** Render `<path>` elements for the given icon name. Returns `null` if name is unknown. */
    var renderSvgPaths: js.Any = js.native
  }
  /* static members */
  object Icon {
    
    @JSImport("@blueprintjs/core/lib/esm/components/icon/icon", "Icon")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/icon/icon", "Icon.SIZE_LARGE")
    @js.native
    val SIZE_LARGE: /* 20 */ Double = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/icon/icon", "Icon.SIZE_STANDARD")
    @js.native
    val SIZE_STANDARD: /* 16 */ Double = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/icon/icon", "Icon.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IIconProps
    extends IIntentProps
       with IProps {
    
    /** This component does not support custom children. Use the `icon` prop. */
    var children: js.UndefOr[scala.Nothing] = js.native
    
    /**
      * Color of icon. This is used as the `fill` attribute on the `<svg>` image
      * so it will override any CSS `color` property, including that set by
      * `intent`. If this prop is omitted, icon color is inherited from
      * surrounding text.
      */
    var color: js.UndefOr[String] = js.native
    
    /**
      * String for the `title` attribute on the rendered element, which will appear
      * on hover as a native browser tooltip.
      */
    var htmlTitle: js.UndefOr[String] = js.native
    
    /**
      * Name of a Blueprint UI icon, or an icon element, to render. This prop is
      * required because it determines the content of the component, but it can
      * be explicitly set to falsy values to render nothing.
      *
      * - If `null` or `undefined` or `false`, this component will render nothing.
      * - If given an `IconName` (a string literal union of all icon names), that
      *   icon will be rendered as an `<svg>` with `<path>` tags. Unknown strings
      *   will render a blank icon to occupy space.
      * - If given a `JSX.Element`, that element will be rendered and _all other
      *   props on this component are ignored._ This type is supported to
      *   simplify icon support in other Blueprint components. As a consumer, you
      *   should avoid using `<Icon icon={<Element />}` directly; simply render
      *   `<Element />` instead.
      */
    var icon: IconName | MaybeElement = js.native
    
    /**
      * Size of the icon, in pixels. Blueprint contains 16px and 20px SVG icon
      * images, and chooses the appropriate resolution based on this prop.
      * @default Icon.SIZE_STANDARD = 16
      */
    var iconSize: js.UndefOr[Double] = js.native
    
    /** CSS style properties. */
    var style: js.UndefOr[CSSProperties] = js.native
    
    /**
      * HTML tag to use for the rendered element.
      * @default "span"
      */
    var tagName: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
      ] = js.native
    
    /**
      * Description string. This string does not appear in normal browsers, but
      * it increases accessibility. For instance, screen readers will use it for
      * aural feedback. By default, this is set to the icon's name. Pass an
      * explicit falsy value to disable.
      */
    var title: js.UndefOr[String | `false` | Null] = js.native
  }
  object IIconProps {
    
    @scala.inline
    def apply(): IIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IIconProps]
    }
    
    @scala.inline
    implicit class IIconPropsMutableBuilder[Self <: IIconProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setHtmlTitle(value: String): Self = StObject.set(x, "htmlTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlTitleUndefined: Self = StObject.set(x, "htmlTitle", js.undefined)
      
      @scala.inline
      def setIcon(value: IconName | MaybeElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconNull: Self = StObject.set(x, "icon", null)
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      
      @scala.inline
      def setTitle(value: String | `false`): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleNull: Self = StObject.set(x, "title", null)
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
