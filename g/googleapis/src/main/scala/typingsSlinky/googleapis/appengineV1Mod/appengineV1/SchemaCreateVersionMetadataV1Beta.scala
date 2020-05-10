package typingsSlinky.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for the given google.longrunning.Operation during a
  * google.appengine.v1beta.CreateVersionRequest.
  */
@js.native
trait SchemaCreateVersionMetadataV1Beta extends js.Object {
  /**
    * The Cloud Build ID if one was created as part of the version create.
    * @OutputOnly
    */
  var cloudBuildId: js.UndefOr[String] = js.native
}

object SchemaCreateVersionMetadataV1Beta {
  @scala.inline
  def apply(): SchemaCreateVersionMetadataV1Beta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateVersionMetadataV1Beta]
  }
  @scala.inline
  implicit class SchemaCreateVersionMetadataV1BetaOps[Self <: SchemaCreateVersionMetadataV1Beta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudBuildId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudBuildId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudBuildId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudBuildId")(js.undefined)
        ret
    }
  }
  
}

