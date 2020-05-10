package typingsSlinky.jwplayer.jwplayer

import typingsSlinky.jwplayer.jwplayerNumbers.`0`
import typingsSlinky.jwplayer.jwplayerNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadyParam extends js.Object {
  var setupTime: Double = js.native
  var viewable: `0` | `1` = js.native
}

object ReadyParam {
  @scala.inline
  def apply(setupTime: Double, viewable: `0` | `1`): ReadyParam = {
    val __obj = js.Dynamic.literal(setupTime = setupTime.asInstanceOf[js.Any], viewable = viewable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadyParam]
  }
  @scala.inline
  implicit class ReadyParamOps[Self <: ReadyParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetupTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupTime")(value.asInstanceOf[js.Any])
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

