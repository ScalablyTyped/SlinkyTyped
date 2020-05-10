package typingsSlinky.googleapis.alphaMod.computeAlpha

import typingsSlinky.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSslCertificatesScopedList extends js.Object {
  /**
    * List of SslCertificates contained in this scope.
    */
  var sslCertificates: js.UndefOr[js.Array[SchemaSslCertificate]] = js.native
  /**
    * Informational warning which replaces the list of backend services when
    * the list is empty.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaSslCertificatesScopedList {
  @scala.inline
  def apply(): SchemaSslCertificatesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslCertificatesScopedList]
  }
  @scala.inline
  implicit class SchemaSslCertificatesScopedListOps[Self <: SchemaSslCertificatesScopedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSslCertificates(value: js.Array[SchemaSslCertificate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslCertificates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslCertificates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslCertificates")(js.undefined)
        ret
    }
    @scala.inline
    def withWarning(value: AnonCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.undefined)
        ret
    }
  }
  
}

