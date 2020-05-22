package typingsSlinky.cannon.mod

import typingsSlinky.cannon.CANNON.IHightfield
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "Heightfield")
@js.native
class Heightfield protected ()
  extends typingsSlinky.cannon.CANNON.Heightfield {
  def this(data: js.Array[Double]) = this()
  def this(data: js.Array[Double], options: IHightfield) = this()
  /* CompleteClass */
  override var boundingSphereRadius: Double = js.native
  /* CompleteClass */
  override var cacheEnabled: Boolean = js.native
  /* CompleteClass */
  override var collisionResponse: Boolean = js.native
  /* CompleteClass */
  override var data: js.Array[js.Array[Double]] = js.native
  /* CompleteClass */
  override var elementSize: Double = js.native
  /* CompleteClass */
  override var maxValue: Double = js.native
  /* CompleteClass */
  override var minValue: Double = js.native
  /* CompleteClass */
  override var pillarConvex: typingsSlinky.cannon.CANNON.ConvexPolyhedron = js.native
  /* CompleteClass */
  override var pillarOffset: typingsSlinky.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var `type`: Double = js.native
  /* CompleteClass */
  override def calculateLocalInertia(mass: Double, target: typingsSlinky.cannon.CANNON.Vec3): typingsSlinky.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override def getConvexTrianglePillar(xi: Double, yi: Double, getUpperTriangle: Boolean): Unit = js.native
  /* CompleteClass */
  override def getIndexOfPosition(x: Double, y: Double, result: js.Array[_], clamp: Boolean): Boolean = js.native
  /* CompleteClass */
  override def getRectMinMax(iMinX: Double, iMinY: Double, iMaxX: Double, iMaxY: Double, result: js.Array[_]): Unit = js.native
  /* CompleteClass */
  override def setHeightValueAtIndex(xi: Double, yi: Double, value: Double): Unit = js.native
  /* CompleteClass */
  override def update(): Unit = js.native
  /* CompleteClass */
  override def updateBoundingSphereRadius(): Double = js.native
  /* CompleteClass */
  override def updateMaxValue(): Unit = js.native
  /* CompleteClass */
  override def updateMinValue(): Unit = js.native
  /* CompleteClass */
  override def volume(): Double = js.native
}

