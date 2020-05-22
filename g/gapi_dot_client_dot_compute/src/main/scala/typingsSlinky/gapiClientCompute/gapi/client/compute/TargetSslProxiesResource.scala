package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCompute.anon.Alt
import typingsSlinky.gapiClientCompute.anon.AltFields
import typingsSlinky.gapiClientCompute.anon.QuotaUserTargetSslProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetSslProxiesResource extends js.Object {
  /** Deletes the specified TargetSslProxy resource. */
  def delete(request: typingsSlinky.gapiClientCompute.anon.TargetSslProxy): Request[Operation]
  /** Returns the specified TargetSslProxy resource. Get a list of available target SSL proxies by making a list() request. */
  def get(request: QuotaUserTargetSslProxy): Request[TargetSslProxy]
  /** Creates a TargetSslProxy resource in the specified project using the data included in the request. */
  def insert(request: AltFields): Request[Operation]
  /** Retrieves the list of TargetSslProxy resources available to the specified project. */
  def list(request: Alt): Request[TargetSslProxyList]
  /** Changes the BackendService for TargetSslProxy. */
  def setBackendService(request: typingsSlinky.gapiClientCompute.anon.TargetSslProxy): Request[Operation]
  /** Changes the ProxyHeaderType for TargetSslProxy. */
  def setProxyHeader(request: typingsSlinky.gapiClientCompute.anon.TargetSslProxy): Request[Operation]
  /** Changes SslCertificates for TargetSslProxy. */
  def setSslCertificates(request: typingsSlinky.gapiClientCompute.anon.TargetSslProxy): Request[Operation]
}

object TargetSslProxiesResource {
  @scala.inline
  def apply(
    delete: typingsSlinky.gapiClientCompute.anon.TargetSslProxy => Request[Operation],
    get: QuotaUserTargetSslProxy => Request[TargetSslProxy],
    insert: AltFields => Request[Operation],
    list: Alt => Request[TargetSslProxyList],
    setBackendService: typingsSlinky.gapiClientCompute.anon.TargetSslProxy => Request[Operation],
    setProxyHeader: typingsSlinky.gapiClientCompute.anon.TargetSslProxy => Request[Operation],
    setSslCertificates: typingsSlinky.gapiClientCompute.anon.TargetSslProxy => Request[Operation]
  ): TargetSslProxiesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setBackendService = js.Any.fromFunction1(setBackendService), setProxyHeader = js.Any.fromFunction1(setProxyHeader), setSslCertificates = js.Any.fromFunction1(setSslCertificates))
    __obj.asInstanceOf[TargetSslProxiesResource]
  }
}

