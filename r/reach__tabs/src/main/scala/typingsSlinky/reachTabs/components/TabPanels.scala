package typingsSlinky.reachTabs.components

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.reachTabs.mod.TabContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabPanels {
  @JSImport("@reach/tabs", "TabPanels")
  @js.native
  object component extends js.Object
  
  def withProps(p: TabContainerProps): SharedBuilder_TabContainerProps1057700810[HTMLElement] = new SharedBuilder_TabContainerProps1057700810[HTMLElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TabPanels.type): SharedBuilder_TabContainerProps1057700810[HTMLElement] = new SharedBuilder_TabContainerProps1057700810[HTMLElement](js.Array(this.component, js.Dictionary.empty))()
}

