package typingsSlinky.reactIntl.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.react.mod.ProviderProps
import typingsSlinky.reactIntl.srcTypesMod.IntlShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RawIntlProvider {
  
  @scala.inline
  def apply(value: IntlShape): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[IntlShape]]))
  }
  
  @JSImport("react-intl", "RawIntlProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ProviderProps[IntlShape]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
