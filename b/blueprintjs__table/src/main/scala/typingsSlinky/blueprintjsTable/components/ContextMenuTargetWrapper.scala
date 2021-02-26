package typingsSlinky.blueprintjsTable.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsTable.contextMenuTargetWrapperMod.IContextMenuTargetWrapper
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ContextMenuTargetWrapper {
  
  @scala.inline
  def apply(renderContextMenu: SyntheticMouseEvent[HTMLElement] => ReactElement, style: CSSProperties): Builder = {
    val __props = js.Dynamic.literal(renderContextMenu = js.Any.fromFunction1(renderContextMenu), style = style.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IContextMenuTargetWrapper]))
  }
  
  @JSImport("@blueprintjs/table/lib/esm/common/contextMenuTargetWrapper", "ContextMenuTargetWrapper")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[
          tag.type, 
          typingsSlinky.blueprintjsTable.contextMenuTargetWrapperMod.ContextMenuTargetWrapper
        ] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IContextMenuTargetWrapper): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
