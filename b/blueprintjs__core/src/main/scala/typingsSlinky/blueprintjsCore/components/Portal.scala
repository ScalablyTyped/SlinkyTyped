package typingsSlinky.blueprintjsCore.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsCore.portalMod.IPortalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Portal {
  
  @JSImport("@blueprintjs/core", "Portal")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.Portal] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def container(value: HTMLElement): this.type = set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChildrenMount(value: () => Unit): this.type = set("onChildrenMount", js.Any.fromFunction0(value))
  }
  
  def withProps(p: IPortalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Portal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
