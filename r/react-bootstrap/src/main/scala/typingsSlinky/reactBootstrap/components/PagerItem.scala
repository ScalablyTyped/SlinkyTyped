package typingsSlinky.reactBootstrap.components

import typingsSlinky.reactBootstrap.pagerItemMod.PagerItemProps
import typingsSlinky.reactBootstrap.pagerItemMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PagerItem {
  
  @JSImport("react-bootstrap/lib/PagerItem", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: PagerItem.type): SharedBuilder_PagerItemProps_1528535100[^] = new SharedBuilder_PagerItemProps_1528535100[^](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PagerItemProps): SharedBuilder_PagerItemProps_1528535100[^] = new SharedBuilder_PagerItemProps_1528535100[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
