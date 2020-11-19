package typingsSlinky.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Timeline extends js.Object {
  
  @JSName("apply")
  def apply(
    skeleton: Skeleton,
    lastTime: Double,
    time: Double,
    events: js.Array[Event],
    alpha: Double,
    blend: MixBlend,
    direction: MixDirection
  ): Unit = js.native
  
  def getPropertyId(): Double = js.native
}
object Timeline {
  
  @scala.inline
  def apply(
    apply: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Unit,
    getPropertyId: () => Double
  ): Timeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7(apply), getPropertyId = js.Any.fromFunction0(getPropertyId))
    __obj.asInstanceOf[Timeline]
  }
  
  @scala.inline
  implicit class TimelineOps[Self <: Timeline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApply(value: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Unit): Self = this.set("apply", js.Any.fromFunction7(value))
    
    @scala.inline
    def setGetPropertyId(value: () => Double): Self = this.set("getPropertyId", js.Any.fromFunction0(value))
  }
}
