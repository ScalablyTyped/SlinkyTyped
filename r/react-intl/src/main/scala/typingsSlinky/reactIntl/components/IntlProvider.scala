package typingsSlinky.reactIntl.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.intlMessageformatParser.mod.MessageFormatElement
import typingsSlinky.reactIntl.mod.CustomFormats
import typingsSlinky.reactIntl.mod.OptionalIntlConfig
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IntlProvider {
  @JSImport("react-intl", "IntlProvider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactIntl.mod.IntlProvider] {
    @scala.inline
    def defaultFormats(value: CustomFormats): this.type = set("defaultFormats", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultLocale(value: String): this.type = set("defaultLocale", value.asInstanceOf[js.Any])
    @scala.inline
    def formats(value: CustomFormats): this.type = set("formats", value.asInstanceOf[js.Any])
    @scala.inline
    def messages(value: Record[String, js.Array[MessageFormatElement] | String]): this.type = set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def onError(value: /* err */ String => Unit): this.type = set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def textComponent(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any): this.type = set("textComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def timeZone(value: String): this.type = set("timeZone", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: OptionalIntlConfig): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(locale: String): Builder = {
    val __props = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[OptionalIntlConfig]))
  }
}

