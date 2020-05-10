package typingsSlinky.linguiReact.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.linguiReact.transMod.TransPropsWithoutI18n
import typingsSlinky.linguiReact.transMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Trans {
  @JSImport("@lingui/react/Trans", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def components(value: js.Array[ReactElement]): this.type = set("components", value.asInstanceOf[js.Any])
    @scala.inline
    def defaults(value: String): this.type = set("defaults", value.asInstanceOf[js.Any])
    @scala.inline
    def formats(value: js.Object): this.type = set("formats", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def renderReactElement(value: ReactElement): this.type = set("render", value.asInstanceOf[js.Any])
    @scala.inline
    def render(value: TagMod[Any]): this.type = set("render", value.asInstanceOf[js.Any])
    @scala.inline
    def values(value: js.Object): this.type = set("values", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TransPropsWithoutI18n): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Trans.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

