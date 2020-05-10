package typingsSlinky.cathoQuantum.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cathoQuantum.AnonName
import typingsSlinky.cathoQuantum.AnonSpacingObject
import typingsSlinky.cathoQuantum.socialsMod.NonEmptyArray
import typingsSlinky.cathoQuantum.socialsMod.SocialsProps
import typingsSlinky.cathoQuantum.socialsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Socials {
  @JSImport("@catho/quantum/Socials", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def size(value: String): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: AnonSpacingObject): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def withBox(value: Boolean): this.type = set("withBox", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SocialsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(items: NonEmptyArray[AnonName]): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SocialsProps]))
  }
}

