package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILayerMouseEventArgs extends js.Object {
  /** 
  		* @deprecated use target
  		* The IPrimitive shape (pushpin, polyline, polygon) that the event occurred on. 
  		*/
  var primitive: IPrimitive = js.native
}

object ILayerMouseEventArgs {
  @scala.inline
  def apply(primitive: IPrimitive): ILayerMouseEventArgs = {
    val __obj = js.Dynamic.literal(primitive = primitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILayerMouseEventArgs]
  }
  @scala.inline
  implicit class ILayerMouseEventArgsOps[Self <: ILayerMouseEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrimitive(value: IPrimitive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primitive")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

