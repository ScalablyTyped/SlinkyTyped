package typingsSlinky.feathersjsSocketioClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeathersSocketIOClientOptions extends js.Object {
  var timeout: js.UndefOr[Double] = js.native
}

object FeathersSocketIOClientOptions {
  @scala.inline
  def apply(): FeathersSocketIOClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeathersSocketIOClientOptions]
  }
  @scala.inline
  implicit class FeathersSocketIOClientOptionsOps[Self <: FeathersSocketIOClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

