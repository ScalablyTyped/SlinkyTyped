package typingsSlinky.jwplayer.jwplayer

import typingsSlinky.jwplayer.jwplayerNumbers.`0`
import typingsSlinky.jwplayer.jwplayerNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirstFrameParam extends js.Object {
  var loadTime: Double = js.native
  var viewable: `0` | `1` = js.native
}

object FirstFrameParam {
  @scala.inline
  def apply(loadTime: Double, viewable: `0` | `1`): FirstFrameParam = {
    val __obj = js.Dynamic.literal(loadTime = loadTime.asInstanceOf[js.Any], viewable = viewable.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstFrameParam]
  }
  @scala.inline
  implicit class FirstFrameParamOps[Self <: FirstFrameParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewable(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

