package typingsSlinky.reactIntl.components

import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactIntl.anon.PickPropschildrenotherzer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Plural {
  @JSImport("react-intl/lib/components/plural", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, Ref[js.Any] with js.Object] {
    @scala.inline
    def few(value: js.Any): this.type = set("few", value.asInstanceOf[js.Any])
    @scala.inline
    def format(value: js.Any): this.type = set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def forwardedRefRefObject(value: ReactRef[_]): this.type = set("forwardedRef", value.asInstanceOf[js.Any])
    @scala.inline
    def forwardedRefFunction1(value: /* instance */ js.Any => Unit): this.type = set("forwardedRef", js.Any.fromFunction1(value))
    @scala.inline
    def forwardedRef(value: (js.Function1[/* instance */ js.Any, Unit]) | ReactRef[_]): this.type = set("forwardedRef", value.asInstanceOf[js.Any])
    @scala.inline
    def forwardedRefNull: this.type = set("forwardedRef", null)
    @scala.inline
    def localeMatcher(value: js.Any): this.type = set("localeMatcher", value.asInstanceOf[js.Any])
    @scala.inline
    def many(value: js.Any): this.type = set("many", value.asInstanceOf[js.Any])
    @scala.inline
    def one(value: js.Any): this.type = set("one", value.asInstanceOf[js.Any])
    @scala.inline
    def other(value: js.Any): this.type = set("other", value.asInstanceOf[js.Any])
    @scala.inline
    def two(value: js.Any): this.type = set("two", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: js.Any): this.type = set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: js.Any): this.type = set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def zero(value: js.Any): this.type = set("zero", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PickPropschildrenotherzer): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Plural.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

