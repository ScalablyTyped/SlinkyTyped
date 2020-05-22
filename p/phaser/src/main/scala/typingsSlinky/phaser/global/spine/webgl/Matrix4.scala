package typingsSlinky.phaser.global.spine.webgl

import typingsSlinky.phaser.spine.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.Matrix4")
@js.native
class Matrix4 ()
  extends typingsSlinky.phaser.spine.webgl.Matrix4 {
  /* CompleteClass */
  override var temp: js.typedarray.Float32Array = js.native
  /* CompleteClass */
  override var values: js.typedarray.Float32Array = js.native
  /* CompleteClass */
  override def copy(): typingsSlinky.phaser.spine.webgl.Matrix4 = js.native
  /* CompleteClass */
  override def determinant(): Double = js.native
  /* CompleteClass */
  override def identity(): typingsSlinky.phaser.spine.webgl.Matrix4 = js.native
  /* CompleteClass */
  override def invert(): typingsSlinky.phaser.spine.webgl.Matrix4 = js.native
  /* CompleteClass */
  override def lookAt(
    position: typingsSlinky.phaser.spine.webgl.Vector3,
    direction: typingsSlinky.phaser.spine.webgl.Vector3,
    up: typingsSlinky.phaser.spine.webgl.Vector3
  ): this.type = js.native
  /* CompleteClass */
  override def multiply(matrix: typingsSlinky.phaser.spine.webgl.Matrix4): typingsSlinky.phaser.spine.webgl.Matrix4 = js.native
  /* CompleteClass */
  override def multiplyLeft(matrix: typingsSlinky.phaser.spine.webgl.Matrix4): typingsSlinky.phaser.spine.webgl.Matrix4 = js.native
  /* CompleteClass */
  override def ortho(left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): typingsSlinky.phaser.spine.webgl.Matrix4 = js.native
  /* CompleteClass */
  override def ortho2d(x: Double, y: Double, width: Double, height: Double): typingsSlinky.phaser.spine.webgl.Matrix4 = js.native
  /* CompleteClass */
  override def projection(near: Double, far: Double, fovy: Double, aspectRatio: Double): typingsSlinky.phaser.spine.webgl.Matrix4 = js.native
  /* CompleteClass */
  override def set(values: ArrayLike[Double]): typingsSlinky.phaser.spine.webgl.Matrix4 = js.native
  /* CompleteClass */
  override def translate(x: Double, y: Double, z: Double): typingsSlinky.phaser.spine.webgl.Matrix4 = js.native
  /* CompleteClass */
  override def transpose(): typingsSlinky.phaser.spine.webgl.Matrix4 = js.native
}

/* static members */
@JSGlobal("spine.webgl.Matrix4")
@js.native
object Matrix4 extends js.Object {
  var tmpMatrix: js.Any = js.native
  var xAxis: js.Any = js.native
  var yAxis: js.Any = js.native
  var zAxis: js.Any = js.native
  def initTemps(): Unit = js.native
}

