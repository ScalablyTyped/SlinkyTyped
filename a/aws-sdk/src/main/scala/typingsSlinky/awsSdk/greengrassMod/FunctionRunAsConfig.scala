package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionRunAsConfig extends js.Object {
  /**
    * The group ID whose permissions are used to run a Lambda function.
    */
  var Gid: js.UndefOr[integer] = js.native
  /**
    * The user ID whose permissions are used to run a Lambda function.
    */
  var Uid: js.UndefOr[integer] = js.native
}

object FunctionRunAsConfig {
  @scala.inline
  def apply(): FunctionRunAsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionRunAsConfig]
  }
  @scala.inline
  implicit class FunctionRunAsConfigOps[Self <: FunctionRunAsConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGid(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Gid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Gid")(js.undefined)
        ret
    }
    @scala.inline
    def withUid(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Uid")(js.undefined)
        ret
    }
  }
  
}

