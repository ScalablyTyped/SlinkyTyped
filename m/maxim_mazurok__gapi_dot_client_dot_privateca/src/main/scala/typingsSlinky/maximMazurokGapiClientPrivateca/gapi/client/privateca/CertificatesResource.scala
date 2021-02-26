package typingsSlinky.maximMazurokGapiClientPrivateca.gapi.client.privateca

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientPrivateca.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientPrivateca.anon.Callback
import typingsSlinky.maximMazurokGapiClientPrivateca.anon.CertificateId
import typingsSlinky.maximMazurokGapiClientPrivateca.anon.Key
import typingsSlinky.maximMazurokGapiClientPrivateca.anon.Name
import typingsSlinky.maximMazurokGapiClientPrivateca.anon.Parent
import typingsSlinky.maximMazurokGapiClientPrivateca.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificatesResource extends StObject {
  
  /** Create a new Certificate in a given Project, Location from a particular CertificateAuthority. */
  def create(request: CertificateId): Request[Certificate] = js.native
  def create(request: Parent, body: Certificate): Request[Certificate] = js.native
  
  /** Returns a Certificate. */
  def get(): Request[Certificate] = js.native
  def get(request: Accesstoken): Request[Certificate] = js.native
  
  /** Lists Certificates. */
  def list(): Request[ListCertificatesResponse] = js.native
  def list(request: Callback): Request[ListCertificatesResponse] = js.native
  
  def patch(request: Key, body: Certificate): Request[Certificate] = js.native
  /** Update a Certificate. Currently, the only field you can update is the labels field. */
  def patch(request: Name): Request[Certificate] = js.native
  
  def revoke(request: Accesstoken, body: RevokeCertificateRequest): Request[Certificate] = js.native
  /** Revoke a Certificate. */
  def revoke(request: PrettyPrint): Request[Certificate] = js.native
}
