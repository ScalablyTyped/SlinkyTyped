package typingsSlinky.reactNavigationStack.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactNavigationStack.anon.OnPageChangeCancel
import typingsSlinky.reactNavigationStack.keyboardManagerMod.Props
import typingsSlinky.reactNavigationStack.keyboardManagerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object KeyboardManager {
  
  @scala.inline
  def apply(children: OnPageChangeCancel => ReactElement, enabled: Boolean): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), enabled = enabled.asInstanceOf[js.Any])
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/KeyboardManager", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
