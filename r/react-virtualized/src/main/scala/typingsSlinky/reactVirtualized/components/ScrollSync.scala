package typingsSlinky.reactVirtualized.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactVirtualized.esScrollSyncMod.ScrollSyncProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ScrollSync {
  @JSImport("react-virtualized", "ScrollSync")
  @js.native
  object component extends js.Object
  
  def withProps(p: ScrollSyncProps): Default[tag.type, typingsSlinky.reactVirtualized.mod.ScrollSync] = new Default[tag.type, typingsSlinky.reactVirtualized.mod.ScrollSync](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ScrollSync.type): Default[tag.type, typingsSlinky.reactVirtualized.mod.ScrollSync] = new Default[tag.type, typingsSlinky.reactVirtualized.mod.ScrollSync](js.Array(this.component, js.Dictionary.empty))()
}

