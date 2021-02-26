package typingsSlinky.pixiSpine.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IkConstraintTimeline extends CurveTimeline {
  
  var frames: ArrayLike[Double] = js.native
  
  var ikConstraintIndex: Double = js.native
  
  def setFrame(
    frameIndex: Double,
    time: Double,
    mix: Double,
    softness: Double,
    bendDirection: Double,
    compress: Boolean,
    stretch: Boolean
  ): Unit = js.native
}
object IkConstraintTimeline {
  
  @scala.inline
  def apply(
    apply: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Unit,
    curves: js.Any,
    frames: ArrayLike[Double],
    getCurvePercent: (Double, Double) => Double,
    getCurveType: Double => Double,
    getFrameCount: () => Double,
    getPropertyId: () => Double,
    ikConstraintIndex: Double,
    setCurve: (Double, Double, Double, Double, Double) => Unit,
    setFrame: (Double, Double, Double, Double, Double, Boolean, Boolean) => Unit,
    setLinear: Double => Unit,
    setStepped: Double => Unit
  ): IkConstraintTimeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7(apply), curves = curves.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], getCurvePercent = js.Any.fromFunction2(getCurvePercent), getCurveType = js.Any.fromFunction1(getCurveType), getFrameCount = js.Any.fromFunction0(getFrameCount), getPropertyId = js.Any.fromFunction0(getPropertyId), ikConstraintIndex = ikConstraintIndex.asInstanceOf[js.Any], setCurve = js.Any.fromFunction5(setCurve), setFrame = js.Any.fromFunction7(setFrame), setLinear = js.Any.fromFunction1(setLinear), setStepped = js.Any.fromFunction1(setStepped))
    __obj.asInstanceOf[IkConstraintTimeline]
  }
  
  @scala.inline
  implicit class IkConstraintTimelineMutableBuilder[Self <: IkConstraintTimeline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrames(value: ArrayLike[Double]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIkConstraintIndex(value: Double): Self = StObject.set(x, "ikConstraintIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFrame(value: (Double, Double, Double, Double, Double, Boolean, Boolean) => Unit): Self = StObject.set(x, "setFrame", js.Any.fromFunction7(value))
  }
}
