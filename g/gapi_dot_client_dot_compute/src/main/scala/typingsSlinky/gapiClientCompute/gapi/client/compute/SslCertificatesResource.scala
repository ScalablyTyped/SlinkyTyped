package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCompute.anon.Alt
import typingsSlinky.gapiClientCompute.anon.AltFields
import typingsSlinky.gapiClientCompute.anon.QuotaUserSslCertificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SslCertificatesResource extends js.Object {
  /** Deletes the specified SslCertificate resource. */
  def delete(request: typingsSlinky.gapiClientCompute.anon.SslCertificate): Request[Operation]
  /** Returns the specified SslCertificate resource. Get a list of available SSL certificates by making a list() request. */
  def get(request: QuotaUserSslCertificate): Request[SslCertificate]
  /** Creates a SslCertificate resource in the specified project using the data included in the request. */
  def insert(request: AltFields): Request[Operation]
  /** Retrieves the list of SslCertificate resources available to the specified project. */
  def list(request: Alt): Request[SslCertificateList]
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
}

