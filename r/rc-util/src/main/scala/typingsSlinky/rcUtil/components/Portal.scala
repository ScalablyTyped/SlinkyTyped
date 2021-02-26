package typingsSlinky.rcUtil.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcUtil.portalMod.PortalProps
import typingsSlinky.rcUtil.portalMod.PortalRef
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Portal {
  
  @scala.inline
  def apply(getContainer: () => HTMLElement): Builder = {
    val __props = js.Dynamic.literal(getContainer = js.Any.fromFunction0(getContainer))
    new Builder(js.Array(this.component, __props.asInstanceOf[PortalProps with RefAttributes[PortalRef]]))
  }
  
  @JSImport("rc-util/lib/Portal", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, PortalRef with js.Object] {
    
    @scala.inline
    def didUpdate(value: PortalProps => Unit): this.type = set("didUpdate", js.Any.fromFunction1(value))
  }
  
  def withProps(p: PortalProps with RefAttributes[PortalRef]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
