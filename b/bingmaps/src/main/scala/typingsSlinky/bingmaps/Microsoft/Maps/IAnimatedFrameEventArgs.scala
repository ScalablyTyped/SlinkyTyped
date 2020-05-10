package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAnimatedFrameEventArgs extends js.Object {
  /** The animated tile layer that the frame belongs to. **/
  var animatedTileLayer: AnimatedTileLayer = js.native
  /** The index of the frame being loaded. **/
  var index: Double = js.native
}

object IAnimatedFrameEventArgs {
  @scala.inline
  def apply(animatedTileLayer: AnimatedTileLayer, index: Double): IAnimatedFrameEventArgs = {
    val __obj = js.Dynamic.literal(animatedTileLayer = animatedTileLayer.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnimatedFrameEventArgs]
  }
  @scala.inline
  implicit class IAnimatedFrameEventArgsOps[Self <: IAnimatedFrameEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimatedTileLayer(value: AnimatedTileLayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animatedTileLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

