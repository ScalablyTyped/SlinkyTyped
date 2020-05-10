package typingsSlinky.reduxLittleRouter.components

import typingsSlinky.reduxLittleRouter.mod.Href
import typingsSlinky.reduxLittleRouter.mod.LinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ImmutablePersistentQueryLink {
  @JSImport("redux-little-router", "ImmutablePersistentQueryLink")
  @js.native
  object component extends js.Object
  
  def withProps(p: LinkProps): SharedBuilder_LinkProps_963111816[typingsSlinky.reduxLittleRouter.mod.ImmutablePersistentQueryLink] = new SharedBuilder_LinkProps_963111816[typingsSlinky.reduxLittleRouter.mod.ImmutablePersistentQueryLink](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(href: Href): SharedBuilder_LinkProps_963111816[typingsSlinky.reduxLittleRouter.mod.ImmutablePersistentQueryLink] = {
    val __props = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    new SharedBuilder_LinkProps_963111816[typingsSlinky.reduxLittleRouter.mod.ImmutablePersistentQueryLink](js.Array(this.component, __props.asInstanceOf[LinkProps]))
  }
}

