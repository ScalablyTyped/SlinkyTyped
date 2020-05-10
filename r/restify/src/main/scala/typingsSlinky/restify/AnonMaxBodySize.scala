package typingsSlinky.restify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaxBodySize extends js.Object {
  var maxBodySize: js.UndefOr[Double] = js.native
}

object AnonMaxBodySize {
  @scala.inline
  def apply(): AnonMaxBodySize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMaxBodySize]
  }
  @scala.inline
  implicit class AnonMaxBodySizeOps[Self <: AnonMaxBodySize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxBodySize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBodySize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBodySize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBodySize")(js.undefined)
        ret
    }
  }
  
}

