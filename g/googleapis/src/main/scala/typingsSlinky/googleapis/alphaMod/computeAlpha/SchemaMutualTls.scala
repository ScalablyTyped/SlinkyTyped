package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for the mutual Tls mode for peer authentication.
  */
@js.native
trait SchemaMutualTls extends js.Object {
  /**
    * Specifies if the server TLS is configured to be strict or permissive.
    * This field can be set to one of the following: STRICT: Client certificate
    * must be presented, connection is in TLS. PERMISSIVE: Client certificate
    * can be omitted, connection can be either plaintext or TLS.
    */
  var mode: js.UndefOr[String] = js.native
}

object SchemaMutualTls {
  @scala.inline
  def apply(): SchemaMutualTls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMutualTls]
  }
  @scala.inline
  implicit class SchemaMutualTlsOps[Self <: SchemaMutualTls] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
  }
  
}

