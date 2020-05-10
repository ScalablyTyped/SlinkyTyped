package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VersioningConfiguration extends js.Object {
  /**
    * How many versions of data set contents will be kept. The "unlimited" parameter must be false.
    */
  var maxVersions: js.UndefOr[MaxVersions] = js.native
  /**
    * If true, unlimited versions of data set contents will be kept.
    */
  var unlimited: js.UndefOr[UnlimitedVersioning] = js.native
}

object VersioningConfiguration {
  @scala.inline
  def apply(): VersioningConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VersioningConfiguration]
  }
  @scala.inline
  implicit class VersioningConfigurationOps[Self <: VersioningConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxVersions(value: MaxVersions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVersions")(js.undefined)
        ret
    }
    @scala.inline
    def withUnlimited(value: UnlimitedVersioning): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlimited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnlimited: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlimited")(js.undefined)
        ret
    }
  }
  
}

