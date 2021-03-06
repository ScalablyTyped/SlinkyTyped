package typingsSlinky.blueprintjsCore.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsCore.resizeObserverTypesMod.IResizeEntry
import typingsSlinky.blueprintjsCore.resizeSensorMod.IResizeSensorProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ResizeSensor {
  
  @scala.inline
  def apply(onResize: js.Array[IResizeEntry] => Unit): Builder = {
    val __props = js.Dynamic.literal(onResize = js.Any.fromFunction1(onResize))
    new Builder(js.Array(this.component, __props.asInstanceOf[IResizeSensorProps]))
  }
  
  @JSImport("@blueprintjs/core", "ResizeSensor")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.ResizeSensor] {
    
    @scala.inline
    def observeParents(value: Boolean): this.type = set("observeParents", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IResizeSensorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
