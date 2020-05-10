package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SslCerts list response.
  */
@js.native
trait SchemaSslCertsListResponse extends js.Object {
  /**
    * List of client certificates for the instance.
    */
  var items: js.UndefOr[js.Array[SchemaSslCert]] = js.native
  /**
    * This is always sql#sslCertsList.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaSslCertsListResponse {
  @scala.inline
  def apply(): SchemaSslCertsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslCertsListResponse]
  }
  @scala.inline
  implicit class SchemaSslCertsListResponseOps[Self <: SchemaSslCertsListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[SchemaSslCert]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
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

