package typingsSlinky.reactRte.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.draftJs.mod.ContentBlock
import typingsSlinky.reactRte.mod.CustomControl
import typingsSlinky.reactRte.mod.EditorValue
import typingsSlinky.reactRte.mod.Props
import typingsSlinky.reactRte.mod.ToolbarConfig
import typingsSlinky.reactRte.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactRte {
  @JSImport("react-rte", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def blockStyleFn(value: /* block */ ContentBlock => js.UndefOr[String]): this.type = set("blockStyleFn", js.Any.fromFunction1(value))
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def customControls(value: js.Array[CustomControl]): this.type = set("customControls", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def editorClassName(value: String): this.type = set("editorClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def editorStyle(value: js.Object): this.type = set("editorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def handleReturn(value: /* event */ js.Object => Boolean): this.type = set("handleReturn", js.Any.fromFunction1(value))
    @scala.inline
    def keyBindingFn(value: /* event */ js.Object => js.UndefOr[String]): this.type = set("keyBindingFn", js.Any.fromFunction1(value))
    @scala.inline
    def onChange(value: /* value */ EditorValue => js.Any): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def rootStyle(value: js.Object): this.type = set("rootStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def toolbarClassName(value: String): this.type = set("toolbarClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def toolbarConfig(value: ToolbarConfig): this.type = set("toolbarConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def toolbarStyle(value: js.Object): this.type = set("toolbarStyle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(value: EditorValue): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

