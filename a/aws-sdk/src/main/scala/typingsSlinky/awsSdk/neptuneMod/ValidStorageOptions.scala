package typingsSlinky.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidStorageOptions extends js.Object {
  /**
    * The valid range of Provisioned IOPS to gibibytes of storage multiplier. For example, 3-10, which means that provisioned IOPS can be between 3 and 10 times storage.
    */
  var IopsToStorageRatio: js.UndefOr[DoubleRangeList] = js.native
  /**
    * The valid range of provisioned IOPS. For example, 1000-20000.
    */
  var ProvisionedIops: js.UndefOr[RangeList] = js.native
  /**
    * The valid range of storage in gibibytes. For example, 100 to 16384.
    */
  var StorageSize: js.UndefOr[RangeList] = js.native
  /**
    * The valid storage types for your DB instance. For example, gp2, io1.
    */
  var StorageType: js.UndefOr[String] = js.native
}

object ValidStorageOptions {
  @scala.inline
  def apply(): ValidStorageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidStorageOptions]
  }
  @scala.inline
  implicit class ValidStorageOptionsOps[Self <: ValidStorageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIopsToStorageRatio(value: DoubleRangeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IopsToStorageRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIopsToStorageRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IopsToStorageRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisionedIops(value: RangeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedIops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionedIops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedIops")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageSize(value: RangeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageType")(js.undefined)
        ret
    }
  }
  
}

