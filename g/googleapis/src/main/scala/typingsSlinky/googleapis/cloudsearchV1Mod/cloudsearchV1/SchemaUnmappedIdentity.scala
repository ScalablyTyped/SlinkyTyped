package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUnmappedIdentity extends js.Object {
  /**
    * The resource name for an external user.
    */
  var externalIdentity: js.UndefOr[SchemaPrincipal] = js.native
  /**
    * The resolution status for the external identity.
    */
  var resolutionStatusCode: js.UndefOr[String] = js.native
}

object SchemaUnmappedIdentity {
  @scala.inline
  def apply(): SchemaUnmappedIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnmappedIdentity]
  }
  @scala.inline
  implicit class SchemaUnmappedIdentityOps[Self <: SchemaUnmappedIdentity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExternalIdentity(value: SchemaPrincipal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalIdentity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalIdentity")(js.undefined)
        ret
    }
    @scala.inline
    def withResolutionStatusCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutionStatusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolutionStatusCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutionStatusCode")(js.undefined)
        ret
    }
  }
  
}

