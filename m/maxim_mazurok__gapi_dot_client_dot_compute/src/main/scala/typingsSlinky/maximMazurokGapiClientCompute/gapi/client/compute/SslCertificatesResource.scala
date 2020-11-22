package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.Alt
import typingsSlinky.maximMazurokGapiClientCompute.anon.FieldsKey
import typingsSlinky.maximMazurokGapiClientCompute.anon.FieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdResource
import typingsSlinky.maximMazurokGapiClientCompute.anon.MaxResults
import typingsSlinky.maximMazurokGapiClientCompute.anon.QuotaUserSslCertificate
import typingsSlinky.maximMazurokGapiClientCompute.anon.RequestIdSslCertificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SslCertificatesResource extends js.Object {
  
  /** Retrieves the list of all SslCertificate resources, regional and global, available to the specified project. */
  def aggregatedList(): Request[SslCertificateAggregatedList] = js.native
  def aggregatedList(request: Alt): Request[SslCertificateAggregatedList] = js.native
  
  /** Deletes the specified SslCertificate resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: RequestIdSslCertificate): Request[Operation] = js.native
  
  /** Returns the specified SslCertificate resource. Gets a list of available SSL certificates by making a list() request. */
  def get(): Request[SslCertificate] = js.native
  def get(request: QuotaUserSslCertificate): Request[SslCertificate] = js.native
  
  /** Creates a SslCertificate resource in the specified project using the data included in the request. */
  def insert(request: FieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdResource): Request[Operation] = js.native
  def insert(request: FieldsKey, body: SslCertificate): Request[Operation] = js.native
  
  /** Retrieves the list of SslCertificate resources available to the specified project. */
  def list(): Request[SslCertificateList] = js.native
  def list(request: MaxResults): Request[SslCertificateList] = js.native
}
