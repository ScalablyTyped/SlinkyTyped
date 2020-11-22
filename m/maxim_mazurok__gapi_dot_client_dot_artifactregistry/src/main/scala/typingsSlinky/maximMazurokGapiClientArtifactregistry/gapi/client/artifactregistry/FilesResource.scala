package typingsSlinky.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientArtifactregistry.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientArtifactregistry.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilesResource extends js.Object {
  
  /** Gets a file. */
  def get(): Request[File] = js.native
  def get(request: Accesstoken): Request[File] = js.native
  
  /** Lists files. */
  def list(): Request[ListFilesResponse] = js.native
  def list(request: Callback): Request[ListFilesResponse] = js.native
}
