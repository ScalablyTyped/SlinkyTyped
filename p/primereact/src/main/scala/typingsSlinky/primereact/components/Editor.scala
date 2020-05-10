package typingsSlinky.primereact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.AnonHtmlValue
import typingsSlinky.primereact.AnonOldRange
import typingsSlinky.primereact.editorMod.EditorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Editor {
  @JSImport("primereact/editor", "Editor")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactEditorMod.Editor] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def formats(value: js.Array[_]): this.type = set("formats", value.asInstanceOf[js.Any])
    @scala.inline
    def headerTemplate(value: ReactElement): this.type = set("headerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def modules(value: js.Any): this.type = set("modules", value.asInstanceOf[js.Any])
    @scala.inline
    def onSelectionChange(value: /* e */ AnonOldRange => Unit): this.type = set("onSelectionChange", js.Any.fromFunction1(value))
    @scala.inline
    def onTextChange(value: /* e */ AnonHtmlValue => Unit): this.type = set("onTextChange", js.Any.fromFunction1(value))
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def readonly(value: Boolean): this.type = set("readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: String): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: EditorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Editor.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

