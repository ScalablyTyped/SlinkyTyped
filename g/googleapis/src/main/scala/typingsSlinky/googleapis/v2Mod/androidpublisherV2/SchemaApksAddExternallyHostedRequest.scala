package typingsSlinky.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaApksAddExternallyHostedRequest extends js.Object {
  /**
    * The definition of the externally-hosted APK and where it is located.
    */
  var externallyHostedApk: js.UndefOr[SchemaExternallyHostedApk] = js.native
}

object SchemaApksAddExternallyHostedRequest {
  @scala.inline
  def apply(): SchemaApksAddExternallyHostedRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApksAddExternallyHostedRequest]
  }
  @scala.inline
  implicit class SchemaApksAddExternallyHostedRequestOps[Self <: SchemaApksAddExternallyHostedRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExternallyHostedApk(value: SchemaExternallyHostedApk): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externallyHostedApk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternallyHostedApk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externallyHostedApk")(js.undefined)
        ret
    }
  }
  
}

