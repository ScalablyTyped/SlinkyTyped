package typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of scan configs for the project.
  */
@js.native
trait SchemaListScanConfigsResponse extends js.Object {
  /**
    * A page token to pass in order to get more scan configs.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The set of scan configs.
    */
  var scanConfigs: js.UndefOr[js.Array[SchemaScanConfig]] = js.native
}

object SchemaListScanConfigsResponse {
  @scala.inline
  def apply(): SchemaListScanConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListScanConfigsResponse]
  }
  @scala.inline
  implicit class SchemaListScanConfigsResponseOps[Self <: SchemaListScanConfigsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withScanConfigs(value: js.Array[SchemaScanConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScanConfigs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanConfigs")(js.undefined)
        ret
    }
  }
  
}

