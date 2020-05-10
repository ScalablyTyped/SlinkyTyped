package typingsSlinky.reactI18next.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.i18next.mod.i18n
import typingsSlinky.reactI18next.mod.I18nextProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object I18nextProvider {
  @JSImport("react-i18next", "I18nextProvider")
  @js.native
  object component extends js.Object
  
  def withProps(p: I18nextProviderProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(i18n: i18n): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[I18nextProviderProps]))
  }
}

