package typingsSlinky.blueprintjsCore.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsCore.panelPropsMod.IPanel
import typingsSlinky.blueprintjsCore.panelViewMod.IPanelViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PanelView {
  
  @JSImport("@blueprintjs/core/lib/esm/components/panel-stack/panelView", "PanelView")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsCore.panelViewMod.PanelView] {
    
    @scala.inline
    def previousPanel(value: IPanel[js.Object]): this.type = set("previousPanel", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IPanelViewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    onClose: IPanel[_] => Unit,
    onOpen: IPanel[_] => Unit,
    panel: IPanel[js.Object],
    showHeader: Boolean
  ): Builder = {
    val __props = js.Dynamic.literal(onClose = js.Any.fromFunction1(onClose), onOpen = js.Any.fromFunction1(onOpen), panel = panel.asInstanceOf[js.Any], showHeader = showHeader.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IPanelViewProps]))
  }
}
