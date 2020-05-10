package typingsSlinky.reactBootstrapTable.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactBootstrapTable.AnonText
import typingsSlinky.reactBootstrapTable.mod.DropDirection
import typingsSlinky.reactBootstrapTable.mod.SizePerPageDropDownProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SizePerPageDropDown {
  @JSImport("react-bootstrap-table", "SizePerPageDropDown")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactBootstrapTable.mod.SizePerPageDropDown] {
    @scala.inline
    def btnContextual(value: String): this.type = set("btnContextual", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def currSizePerPage(value: String): this.type = set("currSizePerPage", value.asInstanceOf[js.Any])
    @scala.inline
    def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: /* toggleDropDown */ js.Function0[Unit] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def options(value: js.Array[AnonText | Double]): this.type = set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def variation(value: DropDirection): this.type = set("variation", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SizePerPageDropDownProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: SizePerPageDropDown.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

