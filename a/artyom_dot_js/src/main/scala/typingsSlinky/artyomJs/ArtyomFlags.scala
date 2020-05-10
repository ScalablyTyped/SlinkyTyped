package typingsSlinky.artyomJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtyomFlags extends js.Object {
  var restartRecognition: js.UndefOr[Boolean] = js.native
}

object ArtyomFlags {
  @scala.inline
  def apply(): ArtyomFlags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtyomFlags]
  }
  @scala.inline
  implicit class ArtyomFlagsOps[Self <: ArtyomFlags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRestartRecognition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restartRecognition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestartRecognition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restartRecognition")(js.undefined)
        ret
    }
  }
  
}

