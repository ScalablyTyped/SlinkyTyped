package typingsSlinky.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationStateData extends js.Object {
  var animationToMixTime: Map[Double] = js.native
  var defaultMix: Double = js.native
  var skeletonData: SkeletonData = js.native
  def getMix(from: Animation, to: Animation): Double = js.native
  def setMix(fromName: String, toName: String, duration: Double): Unit = js.native
  def setMixByName(fromName: String, toName: String, duration: Double): Unit = js.native
  def setMixWith(from: Animation, to: Animation, duration: Double): Unit = js.native
}

object AnimationStateData {
  @scala.inline
  def apply(
    animationToMixTime: Map[Double],
    defaultMix: Double,
    getMix: (Animation, Animation) => Double,
    setMix: (String, String, Double) => Unit,
    setMixByName: (String, String, Double) => Unit,
    setMixWith: (Animation, Animation, Double) => Unit,
    skeletonData: SkeletonData
  ): AnimationStateData = {
    val __obj = js.Dynamic.literal(animationToMixTime = animationToMixTime.asInstanceOf[js.Any], defaultMix = defaultMix.asInstanceOf[js.Any], getMix = js.Any.fromFunction2(getMix), setMix = js.Any.fromFunction3(setMix), setMixByName = js.Any.fromFunction3(setMixByName), setMixWith = js.Any.fromFunction3(setMixWith), skeletonData = skeletonData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationStateData]
  }
  @scala.inline
  implicit class AnimationStateDataOps[Self <: AnimationStateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationToMixTime(value: Map[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationToMixTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultMix(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetMix(value: (Animation, Animation) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMix")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetMix(value: (String, String, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMix")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetMixByName(value: (String, String, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMixByName")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetMixWith(value: (Animation, Animation, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMixWith")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSkeletonData(value: SkeletonData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skeletonData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

