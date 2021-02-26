package typingsSlinky.pixiSpine.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathConstraint extends Updatable {
  
  var active: Boolean = js.native
  
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
  
  var bones: js.Array[Bone] = js.native
  
  def computeWorldPositions(
    path: PathAttachment,
    spacesCount: Double,
    tangents: Boolean,
    percentPosition: Boolean,
    percentSpacing: Boolean
  ): js.Array[Double] = js.native
  
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
  implicit class PathConstraintMutableBuilder[Self <: PathConstraint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddAfterPosition(value: (Double, js.Array[Double], Double, js.Array[Double], Double) => Unit): Self = StObject.set(x, "addAfterPosition", js.Any.fromFunction5(value))
    
    @scala.inline
    def setAddBeforePosition(value: (Double, js.Array[Double], Double, js.Array[Double], Double) => Unit): Self = StObject.set(x, "addBeforePosition", js.Any.fromFunction5(value))
    
    @scala.inline
    def setAddCurvePosition(
      value: (Double, Double, Double, Double, Double, Double, Double, Double, Double, js.Array[Double], Double, Boolean) => Unit
    ): Self = StObject.set(x, "addCurvePosition", js.Any.fromFunction12(value))
    
    @scala.inline
    def setApply(value: () => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBones(value: js.Array[Bone]): Self = StObject.set(x, "bones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBonesVarargs(value: Bone*): Self = StObject.set(x, "bones", js.Array(value :_*))
    
    @scala.inline
    def setComputeWorldPositions(value: (PathAttachment, Double, Boolean, Boolean, Boolean) => js.Array[Double]): Self = StObject.set(x, "computeWorldPositions", js.Any.fromFunction5(value))
    
    @scala.inline
    def setCurves(value: js.Array[Double]): Self = StObject.set(x, "curves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurvesVarargs(value: Double*): Self = StObject.set(x, "curves", js.Array(value :_*))
    
    @scala.inline
    def setData(value: PathConstraintData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengths(value: js.Array[Double]): Self = StObject.set(x, "lengths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthsVarargs(value: Double*): Self = StObject.set(x, "lengths", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositions(value: js.Array[Double]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionsVarargs(value: Double*): Self = StObject.set(x, "positions", js.Array(value :_*))
    
    @scala.inline
    def setRotateMix(value: Double): Self = StObject.set(x, "rotateMix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegments(value: js.Array[Double]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsVarargs(value: Double*): Self = StObject.set(x, "segments", js.Array(value :_*))
    
    @scala.inline
    def setSpaces(value: js.Array[Double]): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacesVarargs(value: Double*): Self = StObject.set(x, "spaces", js.Array(value :_*))
    
    @scala.inline
    def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Slot): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateMix(value: Double): Self = StObject.set(x, "translateMix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorld(value: js.Array[Double]): Self = StObject.set(x, "world", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldVarargs(value: Double*): Self = StObject.set(x, "world", js.Array(value :_*))
  }
}
