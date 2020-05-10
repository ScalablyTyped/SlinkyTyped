package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.AnonTarget
import typingsSlinky.primereact.pickListTransferControlsMod.PickListTransferControlsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PickListTransferControls {
  @JSImport("primereact/components/picklist/PickListTransferControls", "PickListTransferControls")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[
          tag.type, 
          typingsSlinky.primereact.pickListTransferControlsMod.PickListTransferControls
        ] {
    @scala.inline
    def onTransfer(value: /* e */ AnonTarget => Unit): this.type = set("onTransfer", js.Any.fromFunction1(value))
    @scala.inline
    def source(value: js.Array[_]): this.type = set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def sourceSelection(value: js.Array[_]): this.type = set("sourceSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def target(value: js.Array[_]): this.type = set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def targetSelection(value: js.Array[_]): this.type = set("targetSelection", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PickListTransferControlsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PickListTransferControls.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

