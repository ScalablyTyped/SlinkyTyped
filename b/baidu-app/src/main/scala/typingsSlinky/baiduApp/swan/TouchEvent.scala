package typingsSlinky.baiduApp.swan

import typingsSlinky.baiduApp.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchEvent[T /* <: TouchEventType */] extends BaseEvent[T, X] {
  
  var changedTouches: js.Array[Touch] = js.native
  
  var touches: js.Array[Touch] = js.native
}
object TouchEvent {
  
  @scala.inline
  def apply[T /* <: TouchEventType */](
    changedTouches: js.Array[Touch],
    currentTarget: EventTarget,
    detail: X,
    target: EventTarget,
    timeStamp: Double,
    touches: js.Array[Touch],
    `type`: T
  ): TouchEvent[T] = {
    val __obj = js.Dynamic.literal(changedTouches = changedTouches.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchEvent[T]]
  }
  
  @scala.inline
  implicit class TouchEventOps[Self <: TouchEvent[_], T /* <: TouchEventType */] (val x: Self with TouchEvent[T]) extends AnyVal {
    
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
    def setChangedTouchesVarargs(value: Touch*): Self = this.set("changedTouches", js.Array(value :_*))
    
    @scala.inline
    def setChangedTouches(value: js.Array[Touch]): Self = this.set("changedTouches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchesVarargs(value: Touch*): Self = this.set("touches", js.Array(value :_*))
    
    @scala.inline
    def setTouches(value: js.Array[Touch]): Self = this.set("touches", value.asInstanceOf[js.Any])
  }
}
