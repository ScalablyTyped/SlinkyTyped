package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.anon.DirectionOriginalEvent
import typingsSlinky.primereact.pickListTransferControlsMod.PickListTransferControlsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PickListTransferControls {
  
  @JSImport("primereact/components/picklist/PickListTransferControls", "PickListTransferControls")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[
          tag.type, 
          typingsSlinky.primereact.pickListTransferControlsMod.PickListTransferControls
        ] {
    
    @scala.inline
    def onTransfer(value: /* e */ DirectionOriginalEvent => Unit): this.type = set("onTransfer", js.Any.fromFunction1(value))
    
    @scala.inline
    def source(value: js.Array[_]): this.type = set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sourceSelection(value: js.Array[_]): this.type = set("sourceSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sourceSelectionVarargs(value: js.Any*): this.type = set("sourceSelection", js.Array(value :_*))
    
    @scala.inline
    def sourceVarargs(value: js.Any*): this.type = set("source", js.Array(value :_*))
    
    @scala.inline
    def target(value: js.Array[_]): this.type = set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetSelection(value: js.Array[_]): this.type = set("targetSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetSelectionVarargs(value: js.Any*): this.type = set("targetSelection", js.Array(value :_*))
    
    @scala.inline
    def targetVarargs(value: js.Any*): this.type = set("target", js.Array(value :_*))
  }
  
  implicit def make(companion: PickListTransferControls.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PickListTransferControlsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
