package typingsSlinky.blueprintjsTable.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsCore.intentMod.Intent
import typingsSlinky.blueprintjsTable.editableNameMod.IEditableNameProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object EditableName {
  @JSImport("@blueprintjs/table", "EditableName")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsTable.mod.EditableName] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def intent(value: Intent): this.type = set("intent", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def onCancel(value: (/* value */ String, /* columnIndex */ js.UndefOr[Double]) => Unit): this.type = set("onCancel", js.Any.fromFunction2(value))
    @scala.inline
    def onChange(value: (/* value */ String, /* columnIndex */ js.UndefOr[Double]) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def onConfirm(value: (/* value */ String, /* columnIndex */ js.UndefOr[Double]) => Unit): this.type = set("onConfirm", js.Any.fromFunction2(value))
  }
  
  def withProps(p: IEditableNameProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: EditableName.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

