package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JWT credentials for a service account.
  */
@js.native
trait SchemaServiceAccountJwtAccessCredentials extends js.Object {
  /**
    * Service account key.
    */
  var jsonKey: js.UndefOr[String] = js.native
  /**
    * The token lifetime seconds.
    */
  var tokenLifetimeSeconds: js.UndefOr[String] = js.native
}

object SchemaServiceAccountJwtAccessCredentials {
  @scala.inline
  def apply(): SchemaServiceAccountJwtAccessCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceAccountJwtAccessCredentials]
  }
  @scala.inline
  implicit class SchemaServiceAccountJwtAccessCredentialsOps[Self <: SchemaServiceAccountJwtAccessCredentials] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJsonKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonKey")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenLifetimeSeconds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenLifetimeSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenLifetimeSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenLifetimeSeconds")(js.undefined)
        ret
    }
  }
  
}

