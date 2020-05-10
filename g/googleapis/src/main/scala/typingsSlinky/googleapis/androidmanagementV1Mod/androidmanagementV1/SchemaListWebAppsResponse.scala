package typingsSlinky.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a request to list web apps for a given enterprise.
  */
@js.native
trait SchemaListWebAppsResponse extends js.Object {
  /**
    * If there are more results, a token to retrieve next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of web apps.
    */
  var webApps: js.UndefOr[js.Array[SchemaWebApp]] = js.native
}

object SchemaListWebAppsResponse {
  @scala.inline
  def apply(): SchemaListWebAppsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListWebAppsResponse]
  }
  @scala.inline
  implicit class SchemaListWebAppsResponseOps[Self <: SchemaListWebAppsResponse] (val x: Self) extends AnyVal {
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
    def withWebApps(value: js.Array[SchemaWebApp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webApps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebApps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webApps")(js.undefined)
        ret
    }
  }
  
}

