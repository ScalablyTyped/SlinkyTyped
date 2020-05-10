package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Instances ListServerCas response.
  */
@js.native
trait SchemaInstancesListServerCasResponse extends js.Object {
  var activeVersion: js.UndefOr[String] = js.native
  /**
    * List of server CA certificates for the instance.
    */
  var certs: js.UndefOr[js.Array[SchemaSslCert]] = js.native
  /**
    * This is always sql#instancesListServerCas.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaInstancesListServerCasResponse {
  @scala.inline
  def apply(): SchemaInstancesListServerCasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesListServerCasResponse]
  }
  @scala.inline
  implicit class SchemaInstancesListServerCasResponseOps[Self <: SchemaInstancesListServerCasResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withCerts(value: js.Array[SchemaSslCert]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCerts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certs")(js.undefined)
        ret
    }
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
  }
  
}

