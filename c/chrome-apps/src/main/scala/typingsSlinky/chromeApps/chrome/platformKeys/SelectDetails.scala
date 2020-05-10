package typingsSlinky.chromeApps.chrome.platformKeys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectDetails extends js.Object {
  /**
    * If given, the *selectClientCertificates* operates on this
    * list. Otherwise, obtains the list of all certificates from the platform's
    * certificate stores that are available to this extensions.
    * Entries that the extension doesn't have permission for or which doesn't
    * match the request, are removed.
    */
  var clientCerts: js.UndefOr[js.Array[js.typedarray.ArrayBuffer]] = js.native
  /** If true, the filtered list is presented to the user to manually select a
    * certificate and thereby granting the extension access to the
    * certificate(s) and key(s).Only the selected certificate(s) will be
    * returned. If is false, the list is reduced to all certificates that the
    * extension has been granted access to (automatically or manually). */
  var interactive: Boolean = js.native
  /** Only certificates that match this request will be returned. */
  var request: ClientCertificateRequest = js.native
}

object SelectDetails {
  @scala.inline
  def apply(interactive: Boolean, request: ClientCertificateRequest): SelectDetails = {
    val __obj = js.Dynamic.literal(interactive = interactive.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectDetails]
  }
  @scala.inline
  implicit class SelectDetailsOps[Self <: SelectDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInteractive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: ClientCertificateRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientCerts(value: js.Array[js.typedarray.ArrayBuffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientCerts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientCerts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientCerts")(js.undefined)
        ret
    }
  }
  
}

