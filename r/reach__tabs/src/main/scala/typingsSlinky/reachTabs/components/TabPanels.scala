package typingsSlinky.reachTabs.components

import typingsSlinky.reachTabs.mod.TabContainerProps
import typingsSlinky.react.mod.LegacyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabPanels {
  @JSImport("@reach/tabs", "TabPanels")
  @js.native
  object component extends js.Object
  
  def withProps(p: TabContainerProps): SharedBuilder_TabContainerProps1057700810[LegacyRef[js.Any]] = new SharedBuilder_TabContainerProps1057700810[LegacyRef[js.Any]](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TabPanels.type): SharedBuilder_TabContainerProps1057700810[LegacyRef[js.Any]] = new SharedBuilder_TabContainerProps1057700810[LegacyRef[js.Any]](js.Array(this.component, js.Dictionary.empty))()
}

