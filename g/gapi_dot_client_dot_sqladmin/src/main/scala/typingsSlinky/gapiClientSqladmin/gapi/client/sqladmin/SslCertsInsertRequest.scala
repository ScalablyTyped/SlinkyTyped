package typingsSlinky.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SslCertsInsertRequest extends js.Object {
  /**
    * User supplied name. Must be a distinct name from the other certificates for this instance. New certificates will not be usable until the instance is
    * restarted.
    */
  var commonName: js.UndefOr[String] = js.native
}

object SslCertsInsertRequest {
  @scala.inline
  def apply(): SslCertsInsertRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslCertsInsertRequest]
  }
  @scala.inline
  implicit class SslCertsInsertRequestOps[Self <: SslCertsInsertRequest] (val x: Self) extends AnyVal {
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

