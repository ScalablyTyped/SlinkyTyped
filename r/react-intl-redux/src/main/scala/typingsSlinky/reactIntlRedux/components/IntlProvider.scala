package typingsSlinky.reactIntlRedux.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.reactIntl.componentsProviderMod.OptionalIntlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IntlProvider {
  
  @JSImport("react-intl-redux", "IntlProvider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactIntlRedux.mod.IntlProvider] {
    
    @scala.inline
    def defaultFormats(value: js.Any): this.type = set("defaultFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultLocale(value: js.Any): this.type = set("defaultLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def formats(value: js.Any): this.type = set("formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def messages(value: js.Any): this.type = set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onError(value: js.Any): this.type = set("onError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textComponent(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any): this.type = set("textComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def timeZone(value: js.Any): this.type = set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapRichTextChunksInFragment(value: Boolean): this.type = set("wrapRichTextChunksInFragment", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropsWithChildren[OptionalIntlConfig]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: IntlProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
