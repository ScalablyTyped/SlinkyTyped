package typingsSlinky.constantinople

import typingsSlinky.constantinople.constantinopleBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonResult extends js.Object {
  var constant: `false` = js.native
  var result: js.UndefOr[Unit] = js.native
}

object AnonResult {
  @scala.inline
  def apply(constant: `false`): AnonResult = {
    val __obj = js.Dynamic.literal(constant = constant.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResult]
  }
  @scala.inline
  implicit class AnonResultOps[Self <: AnonResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstant(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
  }
  
}

