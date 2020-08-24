package typingsSlinky.linguiReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.linguiReact.i18nMod.I18nComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object I18n {
  @JSImport("@lingui/react", "I18n")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.linguiReact.mod.I18n] {
    @scala.inline
    def update(value: Boolean): this.type = set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def withHash(value: Boolean): this.type = set("withHash", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: I18nComponentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(children: typingsSlinky.linguiReact.anon.I18n => ReactElement): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[I18nComponentProps]))
  }
}

