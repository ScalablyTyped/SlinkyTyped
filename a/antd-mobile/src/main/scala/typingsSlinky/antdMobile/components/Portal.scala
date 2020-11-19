package typingsSlinky.antdMobile.components

import org.scalajs.dom.raw.Element
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.antdMobile.portalMod.PortalProps
import typingsSlinky.antdMobile.portalMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Portal {
  
  @JSImport("antd-mobile/lib/input-item/Portal", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: PortalProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(getContainer: () => Element): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(getContainer = js.Any.fromFunction0(getContainer))
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[PortalProps]))
  }
}
