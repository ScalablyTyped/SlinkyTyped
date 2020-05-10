package typingsSlinky.baiduApp.swan

import typingsSlinky.baiduApp.baiduAppStrings.game
import typingsSlinky.baiduApp.baiduAppStrings.normal
import typingsSlinky.baiduApp.baiduAppStrings.ui
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccelerometerOptions
  extends BaseOptions[js.Any, js.Any] {
  var interval: game | ui | normal = js.native
}

object AccelerometerOptions {
  @scala.inline
  def apply(interval: game | ui | normal): AccelerometerOptions = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerOptions]
  }
  @scala.inline
  implicit class AccelerometerOptionsOps[Self <: AccelerometerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInterval(value: game | ui | normal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

