package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The version of the SDK used to run the job.
  */
@js.native
trait SchemaSdkVersion extends js.Object {
  /**
    * The support status for this SDK version.
    */
  var sdkSupportStatus: js.UndefOr[String] = js.native
  /**
    * The version of the SDK used to run the job.
    */
  var version: js.UndefOr[String] = js.native
  /**
    * A readable string describing the version of the SDK.
    */
  var versionDisplayName: js.UndefOr[String] = js.native
}

object SchemaSdkVersion {
  @scala.inline
  def apply(): SchemaSdkVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSdkVersion]
  }
  @scala.inline
  implicit class SchemaSdkVersionOps[Self <: SchemaSdkVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSdkSupportStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdkSupportStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSdkSupportStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdkSupportStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionDisplayName")(js.undefined)
        ret
    }
  }
  
}

