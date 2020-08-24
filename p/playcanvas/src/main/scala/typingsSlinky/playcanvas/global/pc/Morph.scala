package typingsSlinky.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains a list of pc.MorphTarget, a combined delta AABB and some associated data.
  * @param targets - A list of morph targets.
  * @param graphicsDevice - The graphics device used to manage this morph target. If it is not provided, a device is obtained
  * from the {@link pc.Application}.
  */
@JSGlobal("pc.Morph")
@js.native
class Morph protected ()
  extends typingsSlinky.playcanvas.pc.Morph {
  def this(
    targets: js.Array[typingsSlinky.playcanvas.pc.MorphTarget],
    graphicsDevice: typingsSlinky.playcanvas.pc.GraphicsDevice
  ) = this()
}

