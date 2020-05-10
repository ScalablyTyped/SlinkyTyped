package typingsSlinky.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMUGeneralOption extends js.Object {
  var controller: js.UndefOr[String] = js.native
  var freq: js.UndefOr[Double] = js.native
}

object IMUGeneralOption {
  @scala.inline
  def apply(): IMUGeneralOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMUGeneralOption]
  }
  @scala.inline
  implicit class IMUGeneralOptionOps[Self <: IMUGeneralOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withController(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutController: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controller")(js.undefined)
        ret
    }
    @scala.inline
    def withFreq(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freq")(js.undefined)
        ret
    }
  }
  
}

