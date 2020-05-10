package typingsSlinky.reactIntl.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactIntl.pluralMod.Props
import typingsSlinky.reactIntl.typesMod.IntlShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PluralWrappedComponent {
  @JSImport("react-intl/lib/components/plural", "default.WrappedComponent")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def fewReactElement(value: ReactElement): this.type = set("few", value.asInstanceOf[js.Any])
    @scala.inline
    def few(value: TagMod[Any]): this.type = set("few", value.asInstanceOf[js.Any])
    @scala.inline
    def format(value: String): this.type = set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def manyReactElement(value: ReactElement): this.type = set("many", value.asInstanceOf[js.Any])
    @scala.inline
    def many(value: TagMod[Any]): this.type = set("many", value.asInstanceOf[js.Any])
    @scala.inline
    def oneReactElement(value: ReactElement): this.type = set("one", value.asInstanceOf[js.Any])
    @scala.inline
    def one(value: TagMod[Any]): this.type = set("one", value.asInstanceOf[js.Any])
    @scala.inline
    def other(value: TagMod[Any]): this.type = set("other", value.asInstanceOf[js.Any])
    @scala.inline
    def twoReactElement(value: ReactElement): this.type = set("two", value.asInstanceOf[js.Any])
    @scala.inline
    def two(value: TagMod[Any]): this.type = set("two", value.asInstanceOf[js.Any])
    @scala.inline
    def zeroReactElement(value: ReactElement): this.type = set("zero", value.asInstanceOf[js.Any])
    @scala.inline
    def zero(value: TagMod[Any]): this.type = set("zero", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(intl: IntlShape, value: Double): Builder = {
    val __props = js.Dynamic.literal(intl = intl.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

