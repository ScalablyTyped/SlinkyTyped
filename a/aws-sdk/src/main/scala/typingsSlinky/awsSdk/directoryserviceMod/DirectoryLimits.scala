package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryLimits extends js.Object {
  /**
    * The current number of cloud directories in the Region.
    */
  var CloudOnlyDirectoriesCurrentCount: js.UndefOr[Limit] = js.native
  /**
    * The maximum number of cloud directories allowed in the Region.
    */
  var CloudOnlyDirectoriesLimit: js.UndefOr[Limit] = js.native
  /**
    * Indicates if the cloud directory limit has been reached.
    */
  var CloudOnlyDirectoriesLimitReached: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.CloudOnlyDirectoriesLimitReached] = js.native
  /**
    * The current number of AWS Managed Microsoft AD directories in the region.
    */
  var CloudOnlyMicrosoftADCurrentCount: js.UndefOr[Limit] = js.native
  /**
    * The maximum number of AWS Managed Microsoft AD directories allowed in the region.
    */
  var CloudOnlyMicrosoftADLimit: js.UndefOr[Limit] = js.native
  /**
    * Indicates if the AWS Managed Microsoft AD directory limit has been reached.
    */
  var CloudOnlyMicrosoftADLimitReached: js.UndefOr[CloudOnlyDirectoriesLimitReached] = js.native
  /**
    * The current number of connected directories in the Region.
    */
  var ConnectedDirectoriesCurrentCount: js.UndefOr[Limit] = js.native
  /**
    * The maximum number of connected directories allowed in the Region.
    */
  var ConnectedDirectoriesLimit: js.UndefOr[Limit] = js.native
  /**
    * Indicates if the connected directory limit has been reached.
    */
  var ConnectedDirectoriesLimitReached: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.ConnectedDirectoriesLimitReached] = js.native
}

object DirectoryLimits {
  @scala.inline
  def apply(): DirectoryLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryLimits]
  }
  @scala.inline
  implicit class DirectoryLimitsOps[Self <: DirectoryLimits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudOnlyDirectoriesCurrentCount(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudOnlyDirectoriesCurrentCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudOnlyDirectoriesCurrentCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudOnlyDirectoriesCurrentCount")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudOnlyDirectoriesLimit(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudOnlyDirectoriesLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudOnlyDirectoriesLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudOnlyDirectoriesLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudOnlyDirectoriesLimitReached(value: CloudOnlyDirectoriesLimitReached): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudOnlyDirectoriesLimitReached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudOnlyDirectoriesLimitReached: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudOnlyDirectoriesLimitReached")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudOnlyMicrosoftADCurrentCount(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudOnlyMicrosoftADCurrentCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudOnlyMicrosoftADCurrentCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudOnlyMicrosoftADCurrentCount")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudOnlyMicrosoftADLimit(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudOnlyMicrosoftADLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudOnlyMicrosoftADLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudOnlyMicrosoftADLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudOnlyMicrosoftADLimitReached(value: CloudOnlyDirectoriesLimitReached): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudOnlyMicrosoftADLimitReached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudOnlyMicrosoftADLimitReached: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudOnlyMicrosoftADLimitReached")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectedDirectoriesCurrentCount(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectedDirectoriesCurrentCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectedDirectoriesCurrentCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectedDirectoriesCurrentCount")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectedDirectoriesLimit(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectedDirectoriesLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectedDirectoriesLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectedDirectoriesLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectedDirectoriesLimitReached(value: ConnectedDirectoriesLimitReached): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectedDirectoriesLimitReached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectedDirectoriesLimitReached: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectedDirectoriesLimitReached")(js.undefined)
        ret
    }
  }
  
}

