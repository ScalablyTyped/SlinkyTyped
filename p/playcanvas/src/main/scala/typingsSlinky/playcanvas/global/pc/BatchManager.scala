package typingsSlinky.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Glues many mesh instances into a single one for better performance.
  * @param device - The graphics device used by the batch manager.
  * @param root - The entity under which batched models are added.
  * @param scene - The scene that the batch manager affects.
  */
@JSGlobal("pc.BatchManager")
@js.native
class BatchManager protected ()
  extends typingsSlinky.playcanvas.pc.BatchManager {
  def this(
    device: typingsSlinky.playcanvas.pc.GraphicsDevice,
    root: typingsSlinky.playcanvas.pc.Entity,
    scene: typingsSlinky.playcanvas.pc.Scene
  ) = this()
}
