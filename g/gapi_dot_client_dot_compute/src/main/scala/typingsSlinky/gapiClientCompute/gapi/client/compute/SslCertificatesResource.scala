package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCompute.AnonAlt
import typingsSlinky.gapiClientCompute.AnonAltFields
import typingsSlinky.gapiClientCompute.AnonQuotaUserSslCertificate
import typingsSlinky.gapiClientCompute.AnonSslCertificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SslCertificatesResource extends js.Object {
  /** Deletes the specified SslCertificate resource. */
  def delete(request: AnonSslCertificate): Request_[Operation] = js.native
  /** Returns the specified SslCertificate resource. Get a list of available SSL certificates by making a list() request. */
  def get(request: AnonQuotaUserSslCertificate): Request_[SslCertificate] = js.native
  /** Creates a SslCertificate resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFields): Request_[Operation] = js.native
  /** Retrieves the list of SslCertificate resources available to the specified project. */
  def list(request: AnonAlt): Request_[SslCertificateList] = js.native
}

object SslCertificatesResource {
  @scala.inline
  def apply(
    delete: AnonSslCertificate => Request_[Operation],
    get: AnonQuotaUserSslCertificate => Request_[SslCertificate],
    insert: AnonAltFields => Request_[Operation],
    list: AnonAlt => Request_[SslCertificateList]
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
    def withDelete(value: AnonSslCertificate => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonQuotaUserSslCertificate => Request_[SslCertificate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonAltFields => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAlt => Request_[SslCertificateList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

