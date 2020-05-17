package typingsSlinky.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bone extends Updatable {
  var a: Double = js.native
  var active: Boolean = js.native
  var appliedValid: Boolean = js.native
  var arotation: Double = js.native
  var ascaleX: Double = js.native
  var ascaleY: Double = js.native
  var ashearX: Double = js.native
  var ashearY: Double = js.native
  var ax: Double = js.native
  var ay: Double = js.native
  var b: Double = js.native
  var c: Double = js.native
  var children: js.Array[Bone] = js.native
  var d: Double = js.native
  var data: BoneData = js.native
  var parent: Bone = js.native
  var rotation: Double = js.native
  var scaleX: Double = js.native
  var scaleY: Double = js.native
  var shearX: Double = js.native
  var shearY: Double = js.native
  var skeleton: Skeleton = js.native
  var sorted: Boolean = js.native
  var worldX: Double = js.native
  var worldY: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def getWorldRotationX(): Double = js.native
  def getWorldRotationY(): Double = js.native
  def getWorldScaleX(): Double = js.native
  def getWorldScaleY(): Double = js.native
  def localToWorld(local: Vector2): Vector2 = js.native
  def localToWorldRotation(localRotation: Double): Double = js.native
  def rotateWorld(degrees: Double): Unit = js.native
  def setToSetupPose(): Unit = js.native
  def updateAppliedTransform(): Unit = js.native
  def updateWorldTransform(): Unit = js.native
  def updateWorldTransformWith(
    x: Double,
    y: Double,
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    shearX: Double,
    shearY: Double
  ): Unit = js.native
  def worldToLocal(world: Vector2): Vector2 = js.native
  def worldToLocalRotation(worldRotation: Double): Double = js.native
}

object Bone {
  @scala.inline
  def apply(
    a: Double,
    active: Boolean,
    appliedValid: Boolean,
    arotation: Double,
    ascaleX: Double,
    ascaleY: Double,
    ashearX: Double,
    ashearY: Double,
    ax: Double,
    ay: Double,
    b: Double,
    c: Double,
    children: js.Array[Bone],
    d: Double,
    data: BoneData,
    getWorldRotationX: () => Double,
    getWorldRotationY: () => Double,
    getWorldScaleX: () => Double,
    getWorldScaleY: () => Double,
    isActive: () => Boolean,
    localToWorld: Vector2 => Vector2,
    localToWorldRotation: Double => Double,
    parent: Bone,
    rotateWorld: Double => Unit,
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    setToSetupPose: () => Unit,
    shearX: Double,
    shearY: Double,
    skeleton: Skeleton,
    sorted: Boolean,
    update: () => Unit,
    updateAppliedTransform: () => Unit,
    updateWorldTransform: () => Unit,
    updateWorldTransformWith: (Double, Double, Double, Double, Double, Double, Double) => Unit,
    worldToLocal: Vector2 => Vector2,
    worldToLocalRotation: Double => Double,
    worldX: Double,
    worldY: Double,
    x: Double,
    y: Double
  ): Bone = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], active = active.asInstanceOf[js.Any], appliedValid = appliedValid.asInstanceOf[js.Any], arotation = arotation.asInstanceOf[js.Any], ascaleX = ascaleX.asInstanceOf[js.Any], ascaleY = ascaleY.asInstanceOf[js.Any], ashearX = ashearX.asInstanceOf[js.Any], ashearY = ashearY.asInstanceOf[js.Any], ax = ax.asInstanceOf[js.Any], ay = ay.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], getWorldRotationX = js.Any.fromFunction0(getWorldRotationX), getWorldRotationY = js.Any.fromFunction0(getWorldRotationY), getWorldScaleX = js.Any.fromFunction0(getWorldScaleX), getWorldScaleY = js.Any.fromFunction0(getWorldScaleY), isActive = js.Any.fromFunction0(isActive), localToWorld = js.Any.fromFunction1(localToWorld), localToWorldRotation = js.Any.fromFunction1(localToWorldRotation), parent = parent.asInstanceOf[js.Any], rotateWorld = js.Any.fromFunction1(rotateWorld), rotation = rotation.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], setToSetupPose = js.Any.fromFunction0(setToSetupPose), shearX = shearX.asInstanceOf[js.Any], shearY = shearY.asInstanceOf[js.Any], skeleton = skeleton.asInstanceOf[js.Any], sorted = sorted.asInstanceOf[js.Any], update = js.Any.fromFunction0(update), updateAppliedTransform = js.Any.fromFunction0(updateAppliedTransform), updateWorldTransform = js.Any.fromFunction0(updateWorldTransform), updateWorldTransformWith = js.Any.fromFunction7(updateWorldTransformWith), worldToLocal = js.Any.fromFunction1(worldToLocal), worldToLocalRotation = js.Any.fromFunction1(worldToLocalRotation), worldX = worldX.asInstanceOf[js.Any], worldY = worldY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bone]
  }
  @scala.inline
  implicit class BoneOps[Self <: Bone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withA(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppliedValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appliedValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAscaleX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascaleX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAscaleY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascaleY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAshearX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ashearX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAshearY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ashearY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withB(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withC(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("c")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[Bone]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withD(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: BoneData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetWorldRotationX(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWorldRotationX")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWorldRotationY(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWorldRotationY")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWorldScaleX(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWorldScaleX")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWorldScaleY(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWorldScaleY")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLocalToWorld(value: Vector2 => Vector2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localToWorld")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLocalToWorldRotation(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localToWorldRotation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParent(value: Bone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotateWorld(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateWorld")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetToSetupPose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setToSetupPose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShearX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shearX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShearY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shearY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkeleton(value: Skeleton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skeleton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSorted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateAppliedTransform(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateAppliedTransform")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdateWorldTransform(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateWorldTransform")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdateWorldTransformWith(value: (Double, Double, Double, Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateWorldTransformWith")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withWorldToLocal(value: Vector2 => Vector2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worldToLocal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWorldToLocalRotation(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worldToLocalRotation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWorldX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worldX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorldY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worldY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

