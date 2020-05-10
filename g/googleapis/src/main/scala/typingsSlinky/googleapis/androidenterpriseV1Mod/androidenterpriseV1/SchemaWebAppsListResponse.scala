package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The web app details for an enterprise.
  */
@js.native
trait SchemaWebAppsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#webAppsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The manifest describing a web app.
    */
  var webApp: js.UndefOr[js.Array[SchemaWebApp]] = js.native
}

object SchemaWebAppsListResponse {
  @scala.inline
  def apply(): SchemaWebAppsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWebAppsListResponse]
  }
  @scala.inline
  implicit class SchemaWebAppsListResponseOps[Self <: SchemaWebAppsListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withWebApp(value: js.Array[SchemaWebApp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webApp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webApp")(js.undefined)
        ret
    }
  }
  
}

