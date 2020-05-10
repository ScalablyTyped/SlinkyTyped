package typingsSlinky.mirrorx.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.history.mod.LocationDescriptor
import typingsSlinky.history.mod.LocationState
import typingsSlinky.mirrorx.mod.RedirectProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Redirect {
  @JSImport("mirrorx", "Redirect")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.mirrorx.mod.Redirect] {
    @scala.inline
    def exact(value: Boolean): this.type = set("exact", value.asInstanceOf[js.Any])
    @scala.inline
    def from(value: String): this.type = set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def path(value: String): this.type = set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def push(value: Boolean): this.type = set("push", value.asInstanceOf[js.Any])
    @scala.inline
    def strict(value: Boolean): this.type = set("strict", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RedirectProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(to: LocationDescriptor[LocationState]): Builder = {
    val __props = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RedirectProps]))
  }
}

