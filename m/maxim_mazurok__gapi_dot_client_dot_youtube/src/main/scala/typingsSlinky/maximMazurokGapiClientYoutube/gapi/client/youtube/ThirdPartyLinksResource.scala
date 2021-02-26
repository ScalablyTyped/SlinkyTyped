package typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientYoutube.anon.Alt
import typingsSlinky.maximMazurokGapiClientYoutube.anon.LinkingToken
import typingsSlinky.maximMazurokGapiClientYoutube.anon.Type
import typingsSlinky.maximMazurokGapiClientYoutube.anon.UploadTypeUploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThirdPartyLinksResource extends StObject {
  
  /** Deletes a resource. */
  def delete(): Request[Unit] = js.native
  def delete(request: LinkingToken): Request[Unit] = js.native
  
  def insert(request: Alt, body: ThirdPartyLink): Request[ThirdPartyLink] = js.native
  /** Inserts a new resource into this collection. */
  def insert(request: UploadTypeUploadprotocol): Request[ThirdPartyLink] = js.native
  
  /** Retrieves a list of resources, possibly filtered. */
  def list(): Request[ThirdPartyLink] = js.native
  def list(request: Type): Request[ThirdPartyLink] = js.native
  
  def update(request: Alt, body: ThirdPartyLink): Request[ThirdPartyLink] = js.native
  /** Updates an existing resource. */
  def update(request: UploadTypeUploadprotocol): Request[ThirdPartyLink] = js.native
}
