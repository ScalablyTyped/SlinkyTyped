package typingsSlinky.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Glues many mesh instances into a single one for better performance.
  * @param device - The graphics device used by the batch manager.
  * @param root - The entity under which batched models are added.
  * @param scene - The scene that the batch manager affects.
  */
@JSImport("playcanvas", "BatchManager")
@js.native
class BatchManager protected ()
  extends typingsSlinky.playcanvas.pc.BatchManager {
  def this(
    device: typingsSlinky.playcanvas.pc.GraphicsDevice,
    root: typingsSlinky.playcanvas.pc.Entity,
    scene: typingsSlinky.playcanvas.pc.Scene
  ) = this()
}

