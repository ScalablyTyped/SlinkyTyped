package typingsSlinky.reactOverlays.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactOverlays.esmPortalMod.PortalProps
import typingsSlinky.reactOverlays.esmUseWaitForDOMRefMod.DOMContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Portal {
  
  @JSImport("react-overlays/esm", "Portal")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def container(value: DOMContainer[HTMLElement]): this.type = set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerFunction0(value: () => HTMLElement | ReactRef[HTMLElement] | Null): this.type = set("container", js.Any.fromFunction0(value))
    
    @scala.inline
    def containerHTMLElement(value: HTMLElement): this.type = set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerNull: this.type = set("container", null)
    
    @scala.inline
    def containerRefObject(value: ReactRef[HTMLElement]): this.type = set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onRendered(value: /* element */ js.Any => Unit): this.type = set("onRendered", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: Portal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PortalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
