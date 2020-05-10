package typingsSlinky.nodePgMigrate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyOptions extends js.Object {
  var check: String = js.native
  var role: String | js.Array[String] = js.native
  var using: String = js.native
}

object PolicyOptions {
  @scala.inline
  def apply(check: String, role: String | js.Array[String], using: String): PolicyOptions = {
    val __obj = js.Dynamic.literal(check = check.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], using = using.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyOptions]
  }
  @scala.inline
  implicit class PolicyOptionsOps[Self <: PolicyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheck(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("using")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

