package typingsSlinky.reactSpring.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSpring.renderpropsAddonsMod.ParallaxProps
import typingsSlinky.reactSpring.renderpropsUniversalMod.SpringConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Parallax {
  @JSImport("react-spring/renderprops-addons", "Parallax")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactSpring.renderpropsAddonsMod.Parallax] {
    @scala.inline
    def configFunction1(value: /* key */ String => SpringConfig): this.type = set("config", js.Any.fromFunction1(value))
    @scala.inline
    def config(value: SpringConfig | (js.Function1[/* key */ String, SpringConfig])): this.type = set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def scrolling(value: Boolean): this.type = set("scrolling", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ParallaxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(pages: Double): Builder = {
    val __props = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ParallaxProps]))
  }
}

