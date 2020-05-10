package typingsSlinky.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityPoolUsage extends js.Object {
  /**
    * Data storage information for the identity pool.
    */
  var DataStorage: js.UndefOr[Long] = js.native
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityPoolId: js.UndefOr[typingsSlinky.awsSdk.cognitosyncMod.IdentityPoolId] = js.native
  /**
    * Date on which the identity pool was last modified.
    */
  var LastModifiedDate: js.UndefOr[js.Date] = js.native
  /**
    * Number of sync sessions for the identity pool.
    */
  var SyncSessionsCount: js.UndefOr[Long] = js.native
}

object IdentityPoolUsage {
  @scala.inline
  def apply(): IdentityPoolUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityPoolUsage]
  }
  @scala.inline
  implicit class IdentityPoolUsageOps[Self <: IdentityPoolUsage] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withSyncSessionsCount(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SyncSessionsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncSessionsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SyncSessionsCount")(js.undefined)
        ret
    }
  }
  
}

