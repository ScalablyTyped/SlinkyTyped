package typingsSlinky.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityUsage extends js.Object {
  /**
    * Total data storage for this identity.
    */
  var DataStorage: js.UndefOr[Long] = js.native
  /**
    * Number of datasets for the identity.
    */
  var DatasetCount: js.UndefOr[Integer] = js.native
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityId: js.UndefOr[typingsSlinky.awsSdk.cognitosyncMod.IdentityId] = js.native
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityPoolId: js.UndefOr[typingsSlinky.awsSdk.cognitosyncMod.IdentityPoolId] = js.native
  /**
    * Date on which the identity was last modified.
    */
  var LastModifiedDate: js.UndefOr[js.Date] = js.native
}

object IdentityUsage {
  @scala.inline
  def apply(): IdentityUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityUsage]
  }
  @scala.inline
  implicit class IdentityUsageOps[Self <: IdentityUsage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataStorage(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withDatasetCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatasetCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasetCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatasetCount")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentityId(value: IdentityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentityId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityId")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentityPoolId(value: IdentityPoolId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentityPoolId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityPoolId")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedDate")(js.undefined)
        ret
    }
  }
  
}

