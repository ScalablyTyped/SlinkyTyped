package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.anon.CheckedData
import typingsSlinky.primereact.rowCheckboxMod.RowCheckboxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RowCheckbox {
  @JSImport("primereact/components/datatable/RowCheckbox", "RowCheckbox")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.rowCheckboxMod.RowCheckbox] {
    @scala.inline
    def onClick(value: /* e */ CheckedData => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def rowData(value: js.Object): this.type = set("rowData", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RowCheckboxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: RowCheckbox.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

