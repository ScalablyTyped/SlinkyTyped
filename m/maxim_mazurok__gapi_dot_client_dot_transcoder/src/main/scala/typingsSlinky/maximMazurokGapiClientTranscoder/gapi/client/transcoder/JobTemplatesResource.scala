package typingsSlinky.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientTranscoder.anon.Callback
import typingsSlinky.maximMazurokGapiClientTranscoder.anon.Fields
import typingsSlinky.maximMazurokGapiClientTranscoder.anon.JobTemplateId
import typingsSlinky.maximMazurokGapiClientTranscoder.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobTemplatesResource extends js.Object {
  
  /** Creates a job template in the specified region. */
  def create(request: JobTemplateId): Request[JobTemplate] = js.native
  def create(request: Key, body: JobTemplate): Request[JobTemplate] = js.native
  
  /** Deletes a job template. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Returns the job template data. */
  def get(): Request[JobTemplate] = js.native
  def get(request: Callback): Request[JobTemplate] = js.native
  
  /** Lists job templates in the specified region. */
  def list(): Request[ListJobTemplatesResponse] = js.native
  def list(request: Fields): Request[ListJobTemplatesResponse] = js.native
}
