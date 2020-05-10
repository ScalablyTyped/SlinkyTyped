package typingsSlinky.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response of setting the project configuration.
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse extends js.Object {
  /**
    * Project ID of the relying party.
    */
  var projectId: js.UndefOr[String] = js.native
}

object SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse {
  @scala.inline
  def apply(): SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse]
  }
  @scala.inline
  implicit class SchemaIdentitytoolkitRelyingpartySetProjectConfigResponseOps[Self <: SchemaIdentitytoolkitRelyingpartySetProjectConfigResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(js.undefined)
        ret
    }
  }
  
}

