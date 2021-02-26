package typingsSlinky.reactSvgInline

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.reactSvgInline.reactSvgInlineStrings.comment
import typingsSlinky.reactSvgInline.reactSvgInlineStrings.defs
import typingsSlinky.reactSvgInline.reactSvgInlineStrings.desc
import typingsSlinky.reactSvgInline.reactSvgInlineStrings.fill
import typingsSlinky.reactSvgInline.reactSvgInlineStrings.height
import typingsSlinky.reactSvgInline.reactSvgInlineStrings.sketchMSLayerGroup
import typingsSlinky.reactSvgInline.reactSvgInlineStrings.sketchMSPage
import typingsSlinky.reactSvgInline.reactSvgInlineStrings.sketchMSShapeGroup
import typingsSlinky.reactSvgInline.reactSvgInlineStrings.title
import typingsSlinky.reactSvgInline.reactSvgInlineStrings.width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-svg-inline", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends Component[SVGInlineProps, js.Object, js.Any] {
    def this(props: SVGInlineProps) = this()
    def this(props: SVGInlineProps, context: js.Any) = this()
  }
  @JSImport("react-svg-inline", JSImport.Namespace)
  @js.native
  val ^ : SVGInline = js.native
  
  type SVGInline = ReactComponentClass[SVGInlineProps]
  
  @js.native
  trait SVGInlineProps extends StObject {
    
    var accessibilityDesc: js.UndefOr[String] = js.native
    
    var accessibilityLabel: js.UndefOr[String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var classSuffix: js.UndefOr[String] = js.native
    
    var cleanup: js.UndefOr[
        Boolean | (js.Array[
          title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup
        ])
      ] = js.native
    
    var cleanupExceptions: js.UndefOr[
        js.Array[
          title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup
        ]
      ] = js.native
    
    var component: js.UndefOr[ReactElement] = js.native
    
    var fill: js.UndefOr[String] = js.native
    
    var height: js.UndefOr[String] = js.native
    
    var svg: String = js.native
    
    var width: js.UndefOr[String] = js.native
  }
  object SVGInlineProps {
    
    @scala.inline
    def apply(svg: String): SVGInlineProps = {
      val __obj = js.Dynamic.literal(svg = svg.asInstanceOf[js.Any])
      __obj.asInstanceOf[SVGInlineProps]
    }
    
    @scala.inline
    implicit class SVGInlinePropsMutableBuilder[Self <: SVGInlineProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessibilityDesc(value: String): Self = StObject.set(x, "accessibilityDesc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityDescUndefined: Self = StObject.set(x, "accessibilityDesc", js.undefined)
      
      @scala.inline
      def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClassSuffix(value: String): Self = StObject.set(x, "classSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassSuffixUndefined: Self = StObject.set(x, "classSuffix", js.undefined)
      
      @scala.inline
      def setCleanup(
        value: Boolean | (js.Array[
              title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup
            ])
      ): Self = StObject.set(x, "cleanup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCleanupExceptions(
        value: js.Array[
              title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup
            ]
      ): Self = StObject.set(x, "cleanupExceptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCleanupExceptionsUndefined: Self = StObject.set(x, "cleanupExceptions", js.undefined)
      
      @scala.inline
      def setCleanupExceptionsVarargs(
        value: (title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup)*
      ): Self = StObject.set(x, "cleanupExceptions", js.Array(value :_*))
      
      @scala.inline
      def setCleanupUndefined: Self = StObject.set(x, "cleanup", js.undefined)
      
      @scala.inline
      def setCleanupVarargs(
        value: (title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup)*
      ): Self = StObject.set(x, "cleanup", js.Array(value :_*))
      
      @scala.inline
      def setComponent(value: ReactElement): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentReactElement(value: ReactElement): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setSvg(value: String): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type _To = SVGInline
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: SVGInline = ^
}
