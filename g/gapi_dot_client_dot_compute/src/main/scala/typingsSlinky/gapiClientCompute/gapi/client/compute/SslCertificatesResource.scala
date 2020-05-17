package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCompute.anon.Alt
import typingsSlinky.gapiClientCompute.anon.AltFields
import typingsSlinky.gapiClientCompute.anon.QuotaUserSslCertificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SslCertificatesResource extends js.Object {
  /** Deletes the specified SslCertificate resource. */
  def delete(request: typingsSlinky.gapiClientCompute.anon.SslCertificate): Request[Operation] = js.native
  /** Returns the specified SslCertificate resource. Get a list of available SSL certificates by making a list() request. */
  def get(request: QuotaUserSslCertificate): Request[SslCertificate] = js.native
  /** Creates a SslCertificate resource in the specified project using the data included in the request. */
  def insert(request: AltFields): Request[Operation] = js.native
  /** Retrieves the list of SslCertificate resources available to the specified project. */
  def list(request: Alt): Request[SslCertificateList] = js.native
}

object SslCertificatesResource {
  @scala.inline
  def apply(
    delete: typingsSlinky.gapiClientCompute.anon.SslCertificate => Request[Operation],
    get: QuotaUserSslCertificate => Request[SslCertificate],
    insert: AltFields => Request[Operation],
    list: Alt => Request[SslCertificateList]
  ): SslCertificatesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[SslCertificatesResource]
  }
  @scala.inline
  implicit class SslCertificatesResourceOps[Self <: SslCertificatesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: typingsSlinky.gapiClientCompute.anon.SslCertificate => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: QuotaUserSslCertificate => Request[SslCertificate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AltFields => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Alt => Request[SslCertificateList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

