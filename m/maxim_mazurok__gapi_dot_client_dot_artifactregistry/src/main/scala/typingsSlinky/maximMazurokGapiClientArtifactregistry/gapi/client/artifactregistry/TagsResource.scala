package typingsSlinky.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientArtifactregistry.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientArtifactregistry.anon.Callback
import typingsSlinky.maximMazurokGapiClientArtifactregistry.anon.Fields
import typingsSlinky.maximMazurokGapiClientArtifactregistry.anon.Key
import typingsSlinky.maximMazurokGapiClientArtifactregistry.anon.Name
import typingsSlinky.maximMazurokGapiClientArtifactregistry.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagsResource extends StObject {
  
  /** Creates a tag. */
  def create(request: Fields): Request[Tag] = js.native
  def create(request: Key, body: Tag): Request[Tag] = js.native
  
  /** Deletes a tag. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Accesstoken): Request[js.Object] = js.native
  
  /** Gets a tag. */
  def get(): Request[Tag] = js.native
  def get(request: Accesstoken): Request[Tag] = js.native
  
  /** Lists tags. */
  def list(): Request[ListTagsResponse] = js.native
  def list(request: Callback): Request[ListTagsResponse] = js.native
  
  /** Updates a tag. */
  def patch(request: Name): Request[Tag] = js.native
  def patch(request: Oauthtoken, body: Tag): Request[Tag] = js.native
}
