package typingsSlinky.antd.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.localeReceiverMod.LocaleReceiverProps
import typingsSlinky.antd.localeReceiverMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LocaleReceiver {
  
  @scala.inline
  def apply(children: (js.Object, js.UndefOr[String], js.UndefOr[js.Object]) => ReactElement): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction3(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[LocaleReceiverProps]))
  }
  
  @JSImport("antd/lib/locale-provider/LocaleReceiver", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
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
}
