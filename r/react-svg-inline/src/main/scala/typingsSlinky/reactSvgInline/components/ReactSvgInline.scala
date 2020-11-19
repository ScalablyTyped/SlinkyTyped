package typingsSlinky.reactSvgInline.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSvgInline.mod.SVGInlineProps
import typingsSlinky.reactSvgInline.mod.^
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactSvgInline {
  
  @JSImport("react-svg-inline", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    
    @scala.inline
    def accessibilityDesc(value: String): this.type = set("accessibilityDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def classSuffix(value: String): this.type = set("classSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cleanupVarargs(
      value: (title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup)*
    ): this.type = set("cleanup", js.Array(value :_*))
    
    @scala.inline
    def cleanup(
      value: Boolean | (js.Array[
          title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup
        ])
    ): this.type = set("cleanup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cleanupExceptionsVarargs(
      value: (title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup)*
    ): this.type = set("cleanupExceptions", js.Array(value :_*))
    
    @scala.inline
    def cleanupExceptions(
      value: js.Array[
          title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup
        ]
    ): this.type = set("cleanupExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentReactElement(value: ReactElement): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def component(value: ReactElement): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fill(value: String): this.type = set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: String): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SVGInlineProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(svg: String): Builder = {
    val __props = js.Dynamic.literal(svg = svg.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SVGInlineProps]))
  }
}
