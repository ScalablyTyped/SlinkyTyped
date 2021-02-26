package typingsSlinky.reactVirtualized.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactVirtualized.esScrollSyncMod.ScrollSyncChildProps
import typingsSlinky.reactVirtualized.esScrollSyncMod.ScrollSyncProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScrollSync {
  
  @scala.inline
  def apply(children: ScrollSyncChildProps => ReactElement): Default[tag.type, typingsSlinky.reactVirtualized.mod.ScrollSync] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[tag.type, typingsSlinky.reactVirtualized.mod.ScrollSync](js.Array(this.component, __props.asInstanceOf[ScrollSyncProps]))
  }
  
  @JSImport("react-virtualized", "ScrollSync")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ScrollSyncProps): Default[tag.type, typingsSlinky.reactVirtualized.mod.ScrollSync] = new Default[tag.type, typingsSlinky.reactVirtualized.mod.ScrollSync](js.Array(this.component, p.asInstanceOf[js.Any]))
}
