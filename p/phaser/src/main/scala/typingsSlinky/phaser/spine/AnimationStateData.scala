package typingsSlinky.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationStateData extends StObject {
  
  var animationToMixTime: Map[Double] = js.native
  
  var defaultMix: Double = js.native
  
  def getMix(from: Animation, to: Animation): Double = js.native
  
  def setMix(fromName: String, toName: String, duration: Double): Unit = js.native
  
  def setMixWith(from: Animation, to: Animation, duration: Double): Unit = js.native
  
  var skeletonData: SkeletonData = js.native
}
object AnimationStateData {
  
  @scala.inline
  def apply(
    animationToMixTime: Map[Double],
    defaultMix: Double,
    getMix: (Animation, Animation) => Double,
    setMix: (String, String, Double) => Unit,
    setMixWith: (Animation, Animation, Double) => Unit,
    skeletonData: SkeletonData
  ): AnimationStateData = {
    val __obj = js.Dynamic.literal(animationToMixTime = animationToMixTime.asInstanceOf[js.Any], defaultMix = defaultMix.asInstanceOf[js.Any], getMix = js.Any.fromFunction2(getMix), setMix = js.Any.fromFunction3(setMix), setMixWith = js.Any.fromFunction3(setMixWith), skeletonData = skeletonData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationStateData]
  }
  
  @scala.inline
  implicit class AnimationStateDataMutableBuilder[Self <: AnimationStateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationToMixTime(value: Map[Double]): Self = StObject.set(x, "animationToMixTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultMix(value: Double): Self = StObject.set(x, "defaultMix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetMix(value: (Animation, Animation) => Double): Self = StObject.set(x, "getMix", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetMix(value: (String, String, Double) => Unit): Self = StObject.set(x, "setMix", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetMixWith(value: (Animation, Animation, Double) => Unit): Self = StObject.set(x, "setMixWith", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSkeletonData(value: SkeletonData): Self = StObject.set(x, "skeletonData", value.asInstanceOf[js.Any])
  }
}
