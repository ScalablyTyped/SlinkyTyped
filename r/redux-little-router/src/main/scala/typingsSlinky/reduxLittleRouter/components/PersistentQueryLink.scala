package typingsSlinky.reduxLittleRouter.components

import typingsSlinky.reduxLittleRouter.mod.Href
import typingsSlinky.reduxLittleRouter.mod.LinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PersistentQueryLink {
  
  @scala.inline
  def apply(href: Href): SharedBuilder_LinkProps_963111816[typingsSlinky.reduxLittleRouter.mod.PersistentQueryLink] = {
    val __props = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    new SharedBuilder_LinkProps_963111816[typingsSlinky.reduxLittleRouter.mod.PersistentQueryLink](js.Array(this.component, __props.asInstanceOf[LinkProps]))
  }
  
  @JSImport("redux-little-router", "PersistentQueryLink")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LinkProps): SharedBuilder_LinkProps_963111816[typingsSlinky.reduxLittleRouter.mod.PersistentQueryLink] = new SharedBuilder_LinkProps_963111816[typingsSlinky.reduxLittleRouter.mod.PersistentQueryLink](js.Array(this.component, p.asInstanceOf[js.Any]))
}
