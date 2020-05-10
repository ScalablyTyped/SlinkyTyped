package typingsSlinky.pulumiAws.rdsDbInstanceMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RdsDbInstanceState extends js.Object {
  /**
    * A db password
    */
  val dbPassword: js.UndefOr[Input[String]] = js.native
  /**
    * A db username
    */
  val dbUser: js.UndefOr[Input[String]] = js.native
  /**
    * The db instance to register for this stack. Changing this will force a new resource.
    */
  val rdsDbInstanceArn: js.UndefOr[Input[String]] = js.native
  /**
    * The stack to register a db instance for. Changing this will force a new resource.
    */
  val stackId: js.UndefOr[Input[String]] = js.native
}

object RdsDbInstanceState {
  @scala.inline
  def apply(): RdsDbInstanceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RdsDbInstanceState]
  }
  @scala.inline
  implicit class RdsDbInstanceStateOps[Self <: RdsDbInstanceState] (val x: Self) extends AnyVal {
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
    def withoutDbPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withDbUser(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbUser")(js.undefined)
        ret
    }
    @scala.inline
    def withRdsDbInstanceArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rdsDbInstanceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRdsDbInstanceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rdsDbInstanceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withStackId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackId")(js.undefined)
        ret
    }
  }
  
}

