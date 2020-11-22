package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.FieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegion
import typingsSlinky.maximMazurokGapiClientCompute.anon.Filter
import typingsSlinky.maximMazurokGapiClientCompute.anon.RegionSslCertificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionSslCertificatesResource extends js.Object {
  
  /** Deletes the specified SslCertificate resource in the region. */
  def delete(): Request[Operation] = js.native
  def delete(request: typingsSlinky.maximMazurokGapiClientCompute.anon.SslCertificate): Request[Operation] = js.native
  
  /** Returns the specified SslCertificate resource in the specified region. Get a list of available SSL certificates by making a list() request. */
  def get(): Request[SslCertificate] = js.native
  def get(request: RegionSslCertificate): Request[SslCertificate] = js.native
  
  /** Creates a SslCertificate resource in the specified project and region using the data included in the request */
  def insert(request: FieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegion): Request[Operation] = js.native
  def insert(request: typingsSlinky.maximMazurokGapiClientCompute.anon.Project, body: SslCertificate): Request[Operation] = js.native
  
  /** Retrieves the list of SslCertificate resources available to the specified project in the specified region. */
  def list(): Request[SslCertificateList] = js.native
  def list(request: Filter): Request[SslCertificateList] = js.native
}
