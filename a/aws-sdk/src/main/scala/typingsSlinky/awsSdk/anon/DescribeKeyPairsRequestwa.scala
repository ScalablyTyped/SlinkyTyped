package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.ec2Mod.Boolean
import typingsSlinky.awsSdk.ec2Mod.FilterList
import typingsSlinky.awsSdk.ec2Mod.KeyNameStringList
import typingsSlinky.awsSdk.ec2Mod.KeyPairIdStringList
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/ec2.DescribeKeyPairsRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeKeyPairsRequestwa extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The filters.    fingerprint - The fingerprint of the key pair.    key-name - The name of the key pair.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The key pair names. Default: Describes all your key pairs.
    */
  var KeyNames: js.UndefOr[KeyNameStringList] = js.native
  /**
    * The IDs of the key pairs.
    */
  var KeyPairIds: js.UndefOr[KeyPairIdStringList] = js.native
}

object DescribeKeyPairsRequestwa {
  @scala.inline
  def apply(): DescribeKeyPairsRequestwa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeKeyPairsRequestwa]
  }
  @scala.inline
  implicit class DescribeKeyPairsRequestwaOps[Self <: DescribeKeyPairsRequestwa] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$waiter(value: WaiterConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$waiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$waiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$waiter")(js.undefined)
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: FilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyNames(value: KeyNameStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyNames")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyPairIds(value: KeyPairIdStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyPairIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyPairIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyPairIds")(js.undefined)
        ret
    }
  }
  
}

