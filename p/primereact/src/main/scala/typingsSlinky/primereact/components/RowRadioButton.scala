package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.anon.DataObject
import typingsSlinky.primereact.rowRadioButtonMod.RowRadioButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RowRadioButton {
  
  @JSImport("primereact/components/datatable/RowRadioButton", "RowRadioButton")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.rowRadioButtonMod.RowRadioButton] {
    
    @scala.inline
    def onClick(value: /* e */ DataObject => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def rowData(value: js.Object): this.type = set("rowData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RowRadioButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: RowRadioButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
