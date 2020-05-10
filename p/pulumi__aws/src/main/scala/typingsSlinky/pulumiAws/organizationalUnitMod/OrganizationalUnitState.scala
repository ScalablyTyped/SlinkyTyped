package typingsSlinky.pulumiAws.organizationalUnitMod

import typingsSlinky.pulumiAws.inputMod.organizations.OrganizationalUnitAccount
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationalUnitState extends js.Object {
  /**
    * List of child accounts for this Organizational Unit. Does not return account information for child Organizational Units. All elements have these attributes:
    */
  val accounts: js.UndefOr[Input[js.Array[Input[OrganizationalUnitAccount]]]] = js.native
  /**
    * ARN of the organizational unit
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The name for the organizational unit
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * ID of the parent organizational unit, which may be the root
    */
  val parentId: js.UndefOr[Input[String]] = js.native
}

object OrganizationalUnitState {
  @scala.inline
  def apply(): OrganizationalUnitState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationalUnitState]
  }
  @scala.inline
  implicit class OrganizationalUnitStateOps[Self <: OrganizationalUnitState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccounts(value: Input[js.Array[Input[OrganizationalUnitAccount]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accounts")(js.undefined)
        ret
    }
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withParentId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(js.undefined)
        ret
    }
  }
  
}

