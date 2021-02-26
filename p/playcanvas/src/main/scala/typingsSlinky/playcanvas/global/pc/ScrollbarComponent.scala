package typingsSlinky.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new ScrollbarComponent.
  * @property orientation - Whether the scrollbar moves horizontally or vertically. Can be:
  *
  * * {@link pc.ORIENTATION_HORIZONTAL}: The scrollbar animates in the horizontal axis.
  * * {@link pc.ORIENTATION_VERTICAL}: The scrollbar animates in the vertical axis.
  *
  * Defaults to pc.ORIENTATION_HORIZONTAL.
  * @property value - The current position value of the scrollbar, in the range 0 to 1. Defaults to 0.
  * @property handleSize - The size of the handle relative to the size of the track, in the range
  * 0 to 1. For a vertical scrollbar, a value of 1 means that the handle will take up the full height of
  * the track.
  * @property handleEntity - The entity to be used as the scrollbar handle. This entity must
  * have a Scrollbar component.
  * @param system - The ComponentSystem that created this Component.
  * @param entity - The Entity that this Component is attached to.
  */
@JSGlobal("pc.ScrollbarComponent")
@js.native
class ScrollbarComponent protected ()
  extends typingsSlinky.playcanvas.pc.ScrollbarComponent {
  def this(
    system: typingsSlinky.playcanvas.pc.ScrollbarComponentSystem,
    entity: typingsSlinky.playcanvas.pc.Entity
  ) = this()
}
