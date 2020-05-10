package typingsSlinky.reactIntl.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactIntl.IntlListFormatOptionsvalu
import typingsSlinky.reactIntl.reactIntlStrings.`best fit`
import typingsSlinky.reactIntl.reactIntlStrings.conjunction
import typingsSlinky.reactIntl.reactIntlStrings.disjunction
import typingsSlinky.reactIntl.reactIntlStrings.long
import typingsSlinky.reactIntl.reactIntlStrings.lookup
import typingsSlinky.reactIntl.reactIntlStrings.narrow
import typingsSlinky.reactIntl.reactIntlStrings.short
import typingsSlinky.reactIntl.reactIntlStrings.unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormattedList {
  @JSImport("react-intl", "FormattedList")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def localeMatcher(value: (`best fit`) | lookup): this.type = set("localeMatcher", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: long | short | narrow): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: conjunction | disjunction | unit): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IntlListFormatOptionsvalu): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(value: js.Array[TagMod[Any]]): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IntlListFormatOptionsvalu]))
  }
}

