package typingsSlinky.reactEmailEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactEmailEditor.mod.AppearanceConfig
import typingsSlinky.reactEmailEditor.mod.EmailEditorProps
import typingsSlinky.reactEmailEditor.mod.ToolsConfig
import typingsSlinky.reactEmailEditor.mod.UnlayerOptions
import typingsSlinky.reactEmailEditor.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactEmailEditor {
  @JSImport("react-email-editor", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def appearance(value: AppearanceConfig): this.type = set("appearance", value.asInstanceOf[js.Any])
    @scala.inline
    def minHeight(value: Double): this.type = set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def onLoad(value: () => Unit): this.type = set("onLoad", js.Any.fromFunction0(value))
    @scala.inline
    def options(value: UnlayerOptions): this.type = set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def projectId(value: Double): this.type = set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def tools(value: ToolsConfig): this.type = set("tools", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: EmailEditorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactEmailEditor.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

