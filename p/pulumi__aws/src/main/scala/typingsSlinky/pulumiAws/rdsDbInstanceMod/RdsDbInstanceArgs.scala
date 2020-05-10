package typingsSlinky.pulumiAws.rdsDbInstanceMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RdsDbInstanceArgs extends js.Object {
  /**
    * A db password
    */
  val dbPassword: Input[String] = js.native
  /**
    * A db username
    */
  val dbUser: Input[String] = js.native
  /**
    * The db instance to register for this stack. Changing this will force a new resource.
    */
  val rdsDbInstanceArn: Input[String] = js.native
  /**
    * The stack to register a db instance for. Changing this will force a new resource.
    */
  val stackId: Input[String] = js.native
}

object RdsDbInstanceArgs {
  @scala.inline
  def apply(
    dbPassword: Input[String],
    dbUser: Input[String],
    rdsDbInstanceArn: Input[String],
    stackId: Input[String]
  ): RdsDbInstanceArgs = {
    val __obj = js.Dynamic.literal(dbPassword = dbPassword.asInstanceOf[js.Any], dbUser = dbUser.asInstanceOf[js.Any], rdsDbInstanceArn = rdsDbInstanceArn.asInstanceOf[js.Any], stackId = stackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RdsDbInstanceArgs]
  }
  @scala.inline
  implicit class RdsDbInstanceArgsOps[Self <: RdsDbInstanceArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDbPassword(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDbUser(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRdsDbInstanceArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rdsDbInstanceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

