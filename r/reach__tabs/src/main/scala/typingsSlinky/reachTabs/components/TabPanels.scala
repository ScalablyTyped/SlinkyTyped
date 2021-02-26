package typingsSlinky.reachTabs.components

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.reachTabs.mod.TabContainerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabPanels {
  
  @JSImport("@reach/tabs", "TabPanels")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: TabPanels.type): SharedBuilder_TabContainerProps1057700810[HTMLElement] = new SharedBuilder_TabContainerProps1057700810[HTMLElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabContainerProps): SharedBuilder_TabContainerProps1057700810[HTMLElement] = new SharedBuilder_TabContainerProps1057700810[HTMLElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
