package typingsSlinky.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathConstraint extends Updatable {
  var active: Boolean = js.native
  var bones: js.Array[Bone] = js.native
  var curves: js.Array[Double] = js.native
  var data: PathConstraintData = js.native
  var lengths: js.Array[Double] = js.native
  var position: Double = js.native
  var positions: js.Array[Double] = js.native
  var rotateMix: Double = js.native
  var segments: js.Array[Double] = js.native
  var spaces: js.Array[Double] = js.native
  var spacing: Double = js.native
  var target: Slot = js.native
  var translateMix: Double = js.native
  var world: js.Array[Double] = js.native
  def addAfterPosition(p: Double, temp: js.Array[Double], i: Double, out: js.Array[Double], o: Double): Unit = js.native
  def addBeforePosition(p: Double, temp: js.Array[Double], i: Double, out: js.Array[Double], o: Double): Unit = js.native
  def addCurvePosition(
    p: Double,
    x1: Double,
    y1: Double,
    cx1: Double,
    cy1: Double,
    cx2: Double,
    cy2: Double,
    x2: Double,
    y2: Double,
    out: js.Array[Double],
    o: Double,
    tangents: Boolean
  ): Unit = js.native
  @JSName("apply")
  def apply(): Unit = js.native
  def computeWorldPositions(
    path: PathAttachment,
    spacesCount: Double,
    tangents: Boolean,
    percentPosition: Boolean,
    percentSpacing: Boolean
  ): js.Array[Double] = js.native
}

object PathConstraint {
  @scala.inline
  def apply(
    active: Boolean,
    addAfterPosition: (Double, js.Array[Double], Double, js.Array[Double], Double) => Unit,
    addBeforePosition: (Double, js.Array[Double], Double, js.Array[Double], Double) => Unit,
    addCurvePosition: (Double, Double, Double, Double, Double, Double, Double, Double, Double, js.Array[Double], Double, Boolean) => Unit,
    apply: () => Unit,
    bones: js.Array[Bone],
    computeWorldPositions: (PathAttachment, Double, Boolean, Boolean, Boolean) => js.Array[Double],
    curves: js.Array[Double],
    data: PathConstraintData,
    isActive: () => Boolean,
    lengths: js.Array[Double],
    position: Double,
    positions: js.Array[Double],
    rotateMix: Double,
    segments: js.Array[Double],
    spaces: js.Array[Double],
    spacing: Double,
    target: Slot,
    translateMix: Double,
    update: () => Unit,
    world: js.Array[Double]
  ): PathConstraint = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], addAfterPosition = js.Any.fromFunction5(addAfterPosition), addBeforePosition = js.Any.fromFunction5(addBeforePosition), addCurvePosition = js.Any.fromFunction12(addCurvePosition), apply = js.Any.fromFunction0(apply), bones = bones.asInstanceOf[js.Any], computeWorldPositions = js.Any.fromFunction5(computeWorldPositions), curves = curves.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), lengths = lengths.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any], rotateMix = rotateMix.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], translateMix = translateMix.asInstanceOf[js.Any], update = js.Any.fromFunction0(update), world = world.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathConstraint]
  }
  @scala.inline
  implicit class PathConstraintOps[Self <: PathConstraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddAfterPosition(value: (Double, js.Array[Double], Double, js.Array[Double], Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAfterPosition")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withAddBeforePosition(value: (Double, js.Array[Double], Double, js.Array[Double], Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addBeforePosition")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withAddCurvePosition(
      value: (Double, Double, Double, Double, Double, Double, Double, Double, Double, js.Array[Double], Double, Boolean) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCurvePosition")(js.Any.fromFunction12(value))
        ret
    }
    @scala.inline
    def withApply(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBones(value: js.Array[Bone]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComputeWorldPositions(value: (PathAttachment, Double, Boolean, Boolean, Boolean) => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeWorldPositions")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withCurves(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curves")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: PathConstraintData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLengths(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositions(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotateMix(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateMix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSegments(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaces(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: Slot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslateMix(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateMix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorld(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("world")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

