package typingsSlinky.gatsbyImage.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gatsbyImage.AnonWasCached
import typingsSlinky.gatsbyImage.gatsbyImageStrings.`lazy`
import typingsSlinky.gatsbyImage.gatsbyImageStrings.`scale-down`
import typingsSlinky.gatsbyImage.gatsbyImageStrings.auto
import typingsSlinky.gatsbyImage.gatsbyImageStrings.contain
import typingsSlinky.gatsbyImage.gatsbyImageStrings.cover
import typingsSlinky.gatsbyImage.gatsbyImageStrings.eager
import typingsSlinky.gatsbyImage.gatsbyImageStrings.fill
import typingsSlinky.gatsbyImage.gatsbyImageStrings.none
import typingsSlinky.gatsbyImage.mod.FixedObject
import typingsSlinky.gatsbyImage.mod.FluidObject
import typingsSlinky.gatsbyImage.withIEPolyfillMod.GatsbyImageWithIEPolyfillProps
import typingsSlinky.gatsbyImage.withIEPolyfillMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object WithIEPolyfill {
  @JSImport("gatsby-image/withIEPolyfill", JSImport.Default)
  @js.native
  object component extends js.Object
  
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
    def fixed(value: FixedObject | js.Array[FixedObject]): this.type = set("fixed", value.asInstanceOf[js.Any])
    @scala.inline
    def fluid(value: FluidObject | js.Array[FluidObject]): this.type = set("fluid", value.asInstanceOf[js.Any])
    @scala.inline
    def imgStyle(value: js.Object): this.type = set("imgStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
    @scala.inline
    def loading(value: auto | `lazy` | eager): this.type = set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def objectFit(value: fill | contain | cover | none | `scale-down`): this.type = set("objectFit", value.asInstanceOf[js.Any])
    @scala.inline
    def objectPosition(value: String): this.type = set("objectPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def onError(value: /* event */ js.Any => Unit): this.type = set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def onLoad(value: () => Unit): this.type = set("onLoad", js.Any.fromFunction0(value))
    @scala.inline
    def onStartLoad(value: /* param */ AnonWasCached => Unit): this.type = set("onStartLoad", js.Any.fromFunction1(value))
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
  
  def withProps(p: GatsbyImageWithIEPolyfillProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: WithIEPolyfill.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

