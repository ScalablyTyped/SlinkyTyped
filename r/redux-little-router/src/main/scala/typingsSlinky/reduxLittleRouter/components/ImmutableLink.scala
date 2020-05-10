package typingsSlinky.reduxLittleRouter.components

import typingsSlinky.reduxLittleRouter.mod.Href
import typingsSlinky.reduxLittleRouter.mod.LinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ImmutableLink {
  @JSImport("redux-little-router", "ImmutableLink")
  @js.native
  object component extends js.Object
  
  def withProps(p: LinkProps): SharedBuilder_LinkProps_963111816[typingsSlinky.reduxLittleRouter.mod.ImmutableLink] = new SharedBuilder_LinkProps_963111816[typingsSlinky.reduxLittleRouter.mod.ImmutableLink](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(href: Href): SharedBuilder_LinkProps_963111816[typingsSlinky.reduxLittleRouter.mod.ImmutableLink] = {
    val __props = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    new SharedBuilder_LinkProps_963111816[typingsSlinky.reduxLittleRouter.mod.ImmutableLink](js.Array(this.component, __props.asInstanceOf[LinkProps]))
  }
}

