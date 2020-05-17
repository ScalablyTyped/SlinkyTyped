package typingsSlinky.awsSdkLocationConstraintMiddleware.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationConstraint extends js.Object {
  var LocationConstraint: js.UndefOr[String] = js.native
}

object LocationConstraint {
  @scala.inline
  def apply(): LocationConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationConstraint]
  }
  @scala.inline
  implicit class LocationConstraintOps[Self <: LocationConstraint] (val x: Self) extends AnyVal {
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

