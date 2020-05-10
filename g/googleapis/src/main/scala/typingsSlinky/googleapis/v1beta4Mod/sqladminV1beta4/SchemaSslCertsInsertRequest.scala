package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SslCerts insert request.
  */
@js.native
trait SchemaSslCertsInsertRequest extends js.Object {
  /**
    * User supplied name. Must be a distinct name from the other certificates
    * for this instance.
    */
  var commonName: js.UndefOr[String] = js.native
}

object SchemaSslCertsInsertRequest {
  @scala.inline
  def apply(): SchemaSslCertsInsertRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslCertsInsertRequest]
  }
  @scala.inline
  implicit class SchemaSslCertsInsertRequestOps[Self <: SchemaSslCertsInsertRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommonName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommonName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonName")(js.undefined)
        ret
    }
  }
  
}

