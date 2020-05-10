package typingsSlinky.antDesignPro.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignPro.antDesignProStrings.down
import typingsSlinky.antDesignPro.antDesignProStrings.up
import typingsSlinky.antDesignPro.trendMod.ITrendProps
import typingsSlinky.antDesignPro.trendMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Trend {
  @JSImport("ant-design-pro/lib/Trend", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def colorful(value: Boolean): this.type = set("colorful", value.asInstanceOf[js.Any])
    @scala.inline
    def reverseColor(value: Boolean): this.type = set("reverseColor", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ITrendProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(flag: up | down): Builder = {
    val __props = js.Dynamic.literal(flag = flag.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ITrendProps]))
  }
}

