package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackInstance extends js.Object {
  /**
    * The name of the AWS account that the stack instance is associated with.
    */
  var Account: js.UndefOr[AccountId] = js.native
  /**
    * The name of the AWS region that the stack instance is associated with.
    */
  var Region: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.Region] = js.native
  /**
    * The status of the stack instance, in terms of its synchronization with its associated stack set.     INOPERABLE: A DeleteStackInstances operation has failed and left the stack in an unstable state. Stacks in this state are excluded from further UpdateStackSet operations. You might need to perform a DeleteStackInstances operation, with RetainStacks set to true, to delete the stack instance, and then delete the stack manually.     OUTDATED: The stack isn't currently up to date with the stack set because either the associated stack failed during a CreateStackSet or UpdateStackSet operation, or the stack was part of a CreateStackSet or UpdateStackSet operation that failed or was stopped before the stack was created or updated.    CURRENT: The stack is currently up to date with the stack set.  
    */
  var StackInstanceStatus: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.StackInstanceStatus] = js.native
}

object StackInstance {
  @scala.inline
  def apply(): StackInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackInstance]
  }
  @scala.inline
  implicit class StackInstanceOps[Self <: StackInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Account")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: Region): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(js.undefined)
        ret
    }
    @scala.inline
    def withStackInstanceStatus(value: StackInstanceStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackInstanceStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackInstanceStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackInstanceStatus")(js.undefined)
        ret
    }
  }
  
}

