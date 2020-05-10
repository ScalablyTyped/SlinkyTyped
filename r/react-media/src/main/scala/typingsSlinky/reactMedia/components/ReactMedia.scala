package typingsSlinky.reactMedia.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMedia.mod.MediaQueryValue
import typingsSlinky.reactMedia.mod.SingleQueryProps
import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactMedia {
  @JSImport("react-media", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def defaultMatches(value: Boolean): this.type = set("defaultMatches", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* matches */ Boolean => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def render(value: () => TagMod[Any]): this.type = set("render", js.Any.fromFunction0(value))
    @scala.inline
    def targetWindow(value: Window_): this.type = set("targetWindow", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SingleQueryProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(query: MediaQueryValue): Builder = {
    val __props = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SingleQueryProps]))
  }
}

