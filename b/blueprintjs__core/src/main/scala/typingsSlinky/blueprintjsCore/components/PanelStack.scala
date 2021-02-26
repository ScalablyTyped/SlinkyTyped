package typingsSlinky.blueprintjsCore.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsCore.panelPropsMod.IPanel
import typingsSlinky.blueprintjsCore.panelStackMod.IPanelStackProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PanelStack {
  
  @JSImport("@blueprintjs/core", "PanelStack")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.PanelStack] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialPanel(value: IPanel[_]): this.type = set("initialPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClose(value: /* removedPanel */ IPanel[js.Object] => Unit): this.type = set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def onOpen(value: /* addedPanel */ IPanel[js.Object] => Unit): this.type = set("onOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def renderActivePanelOnly(value: Boolean): this.type = set("renderActivePanelOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showPanelHeader(value: Boolean): this.type = set("showPanelHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stack(value: js.Array[IPanel[_]]): this.type = set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stackVarargs(value: IPanel[js.Any]*): this.type = set("stack", js.Array(value :_*))
  }
  
  implicit def make(companion: PanelStack.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IPanelStackProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
