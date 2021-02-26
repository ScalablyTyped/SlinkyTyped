package typingsSlinky.reactIntlRedux.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.formatjsIntl.srcErrorMod.InvalidConfigError
import typingsSlinky.formatjsIntl.srcErrorMod.MessageFormatError
import typingsSlinky.formatjsIntl.srcErrorMod.MissingDataError
import typingsSlinky.formatjsIntl.srcErrorMod.MissingTranslationError
import typingsSlinky.formatjsIntl.srcErrorMod.UnsupportedFormatterError
import typingsSlinky.formatjsIntl.srcTypesMod.CustomFormats
import typingsSlinky.intlMessageformat.mod.FormatError
import typingsSlinky.intlMessageformat.srcFormattersMod.FormatXMLElementFn
import typingsSlinky.intlMessageformatParser.srcTypesMod.MessageFormatElement
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.reactIntl.componentsProviderMod.OptionalIntlConfig
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IntlProvider {
  
  @scala.inline
  def apply(locale: String): Builder = {
    val __props = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PropsWithChildren[OptionalIntlConfig]]))
  }
  
  @JSImport("react-intl-redux", "IntlProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactIntlRedux.mod.IntlProvider] {
    
    @scala.inline
    def defaultFormats(value: CustomFormats): this.type = set("defaultFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultLocale(value: String): this.type = set("defaultLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultRichTextElements(
      value: Record[
          String, 
          FormatXMLElementFn[ReactElement, String | ReactElement | (js.Array[String | ReactElement])]
        ]
    ): this.type = set("defaultRichTextElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def formats(value: CustomFormats): this.type = set("formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def messages(value: Record[String, js.Array[MessageFormatElement] | String]): this.type = set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onError(
      value: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError => Unit
    ): this.type = set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def textComponent(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any): this.type = set("textComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def timeZone(value: String): this.type = set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapRichTextChunksInFragment(value: Boolean): this.type = set("wrapRichTextChunksInFragment", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropsWithChildren[OptionalIntlConfig]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
