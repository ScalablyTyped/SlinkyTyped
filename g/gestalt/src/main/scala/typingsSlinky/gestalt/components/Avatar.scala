package typingsSlinky.gestalt.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gestalt.gestaltStrings.`check-circle`
import typingsSlinky.gestalt.gestaltStrings.lg
import typingsSlinky.gestalt.gestaltStrings.md
import typingsSlinky.gestalt.gestaltStrings.pintrest
import typingsSlinky.gestalt.gestaltStrings.sm
import typingsSlinky.gestalt.mod.AvatarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Avatar {
  @JSImport("gestalt", "Avatar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gestalt.mod.Avatar] {
    @scala.inline
    def icon(value: `check-circle` | pintrest): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def outline(value: Boolean): this.type = set("outline", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: sm | md | lg): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def src(value: String): this.type = set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def verified(value: Boolean): this.type = set("verified", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AvatarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(name: String): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AvatarProps]))
  }
}

