package typingsSlinky.phaser.global.spine.webgl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.OrthoCamera")
@js.native
class OrthoCamera protected ()
  extends typingsSlinky.phaser.spine.webgl.OrthoCamera {
  def this(viewportWidth: Double, viewportHeight: Double) = this()
  /* CompleteClass */
  override var direction: typingsSlinky.phaser.spine.webgl.Vector3 = js.native
  /* CompleteClass */
  override var far: Double = js.native
  /* CompleteClass */
  override var inverseProjectionView: typingsSlinky.phaser.spine.webgl.Matrix4 = js.native
  /* CompleteClass */
  override var near: Double = js.native
  /* CompleteClass */
  override var position: typingsSlinky.phaser.spine.webgl.Vector3 = js.native
  /* CompleteClass */
  override var projection: typingsSlinky.phaser.spine.webgl.Matrix4 = js.native
  /* CompleteClass */
  override var projectionView: typingsSlinky.phaser.spine.webgl.Matrix4 = js.native
  /* CompleteClass */
  override var tmp: js.Any = js.native
  /* CompleteClass */
  override var up: typingsSlinky.phaser.spine.webgl.Vector3 = js.native
  /* CompleteClass */
  override var view: typingsSlinky.phaser.spine.webgl.Matrix4 = js.native
  /* CompleteClass */
  override var viewportHeight: Double = js.native
  /* CompleteClass */
  override var viewportWidth: Double = js.native
  /* CompleteClass */
  override var zoom: Double = js.native
  /* CompleteClass */
  override def screenToWorld(screenCoords: typingsSlinky.phaser.spine.webgl.Vector3, screenWidth: Double, screenHeight: Double): typingsSlinky.phaser.spine.webgl.Vector3 = js.native
  /* CompleteClass */
  override def setViewport(viewportWidth: Double, viewportHeight: Double): Unit = js.native
  /* CompleteClass */
  override def update(): Unit = js.native
}

