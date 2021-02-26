package typingsSlinky.gatsbyImage.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gatsbyImage.anon.WasCached
import typingsSlinky.gatsbyImage.gatsbyImageStrings.`lazy`
import typingsSlinky.gatsbyImage.gatsbyImageStrings.auto
import typingsSlinky.gatsbyImage.gatsbyImageStrings.eager
import typingsSlinky.gatsbyImage.mod.FixedObject
import typingsSlinky.gatsbyImage.mod.FluidObject
import typingsSlinky.gatsbyImage.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GatsbyImage {
  
  object GatsbyImageFixedProps {
    
    @scala.inline
    def apply(fixed: FixedObject | js.Array[FixedObject]): Builder = {
      val __props = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.gatsbyImage.mod.GatsbyImageFixedProps]))
    }
    
    @JSImport("gatsby-image", JSImport.Default)
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, default] {
      
      @scala.inline
      def Tag(value: String): this.type = set("Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def alt(value: String): this.type = set("alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def backgroundColor(value: String | Boolean): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def className(value: String | js.Object): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def critical(value: Boolean): this.type = set("critical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def crossOrigin(value: String | Boolean): this.type = set("crossOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def durationFadeIn(value: Double): this.type = set("durationFadeIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def fadeIn(value: Boolean): this.type = set("fadeIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def imgStyle(value: js.Object): this.type = set("imgStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def loading(value: auto | `lazy` | eager): this.type = set("loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onError(value: /* event */ js.Any => Unit): this.type = set("onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def onLoad(value: () => Unit): this.type = set("onLoad", js.Any.fromFunction0(value))
      
      @scala.inline
      def onStartLoad(value: /* param */ WasCached => Unit): this.type = set("onStartLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def placeholderClassName(value: String): this.type = set("placeholderClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def placeholderStyle(value: js.Object): this.type = set("placeholderStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def resolutions(value: FixedObject): this.type = set("resolutions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def sizes(value: FluidObject): this.type = set("sizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsSlinky.gatsbyImage.mod.GatsbyImageFixedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object GatsbyImageFluidProps {
    
    @scala.inline
    def apply(fluid: FluidObject | js.Array[FluidObject]): Builder = {
      val __props = js.Dynamic.literal(fluid = fluid.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.gatsbyImage.mod.GatsbyImageFluidProps]))
    }
    
    @JSImport("gatsby-image", JSImport.Default)
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, default] {
      
      @scala.inline
      def Tag(value: String): this.type = set("Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def alt(value: String): this.type = set("alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def backgroundColor(value: String | Boolean): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def className(value: String | js.Object): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def critical(value: Boolean): this.type = set("critical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def crossOrigin(value: String | Boolean): this.type = set("crossOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def durationFadeIn(value: Double): this.type = set("durationFadeIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def fadeIn(value: Boolean): this.type = set("fadeIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def imgStyle(value: js.Object): this.type = set("imgStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def loading(value: auto | `lazy` | eager): this.type = set("loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onError(value: /* event */ js.Any => Unit): this.type = set("onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def onLoad(value: () => Unit): this.type = set("onLoad", js.Any.fromFunction0(value))
      
      @scala.inline
      def onStartLoad(value: /* param */ WasCached => Unit): this.type = set("onStartLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def placeholderClassName(value: String): this.type = set("placeholderClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def placeholderStyle(value: js.Object): this.type = set("placeholderStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def resolutions(value: FixedObject): this.type = set("resolutions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def sizes(value: FluidObject): this.type = set("sizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsSlinky.gatsbyImage.mod.GatsbyImageFluidProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
