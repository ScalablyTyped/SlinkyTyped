package typingsSlinky.gestalt.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gestalt.AnonEvent
import typingsSlinky.gestalt.gestaltStrings.`null`
import typingsSlinky.gestalt.gestaltStrings.blank
import typingsSlinky.gestalt.gestaltStrings.self
import typingsSlinky.gestalt.mod.LinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Link {
  @JSImport("gestalt", "Link")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gestalt.mod.Link] {
    @scala.inline
    def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: /* args */ AnonEvent => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def target(value: `null` | self | blank): this.type = set("target", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LinkProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(href: String): Builder = {
    val __props = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LinkProps]))
  }
}

