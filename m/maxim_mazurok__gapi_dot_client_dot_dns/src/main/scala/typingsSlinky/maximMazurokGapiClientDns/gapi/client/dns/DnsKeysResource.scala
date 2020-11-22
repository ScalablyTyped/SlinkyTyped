package typingsSlinky.maximMazurokGapiClientDns.gapi.client.dns

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDns.anon.ClientOperationId
import typingsSlinky.maximMazurokGapiClientDns.anon.DigestType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DnsKeysResource extends js.Object {
  
  /** Fetch the representation of an existing DnsKey. */
  def get(): Request[DnsKey] = js.native
  def get(request: ClientOperationId): Request[DnsKey] = js.native
  
  /** Enumerate DnsKeys to a ResourceRecordSet collection. */
  def list(): Request[DnsKeysListResponse] = js.native
  def list(request: DigestType): Request[DnsKeysListResponse] = js.native
}
