package typingsSlinky.awsSdkLocationConstraintMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLocationConstraint extends js.Object {
  var LocationConstraint: js.UndefOr[String] = js.native
}

object AnonLocationConstraint {
  @scala.inline
  def apply(): AnonLocationConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLocationConstraint]
  }
  @scala.inline
  implicit class AnonLocationConstraintOps[Self <: AnonLocationConstraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocationConstraint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocationConstraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationConstraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocationConstraint")(js.undefined)
        ret
    }
  }
  
}

