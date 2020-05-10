package typingsSlinky.linguiReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.linguiReact.i18nMod.I18nComponentProps
import typingsSlinky.linguiReact.i18nMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object I18n {
  @JSImport("@lingui/react/I18n", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def update(value: Boolean): this.type = set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def withHash(value: Boolean): this.type = set("withHash", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: I18nComponentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: I18n.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

