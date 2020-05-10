package typingsSlinky.antd.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.localeReceiverMod.LocaleReceiverProps
import typingsSlinky.antd.localeReceiverMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LocaleReceiver {
  @JSImport("antd/lib/locale-provider/LocaleReceiver", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def componentName(value: String): this.type = set("componentName", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultLocale(value: js.Object | js.Function): this.type = set("defaultLocale", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LocaleReceiverProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: LocaleReceiver.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

