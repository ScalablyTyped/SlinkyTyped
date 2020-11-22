package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.FileId
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.ReportId
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Scope
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilesResource extends js.Object {
  
  /** Retrieves a report file by its report ID and file ID. This method supports media download. */
  def get(): Request[File] = js.native
  def get(request: FileId): Request[File] = js.native
  def get(request: ReportId): Request[File] = js.native
  
  /** Lists files for a user profile. */
  def list(): Request[FileList] = js.native
  def list(request: Scope): Request[FileList] = js.native
  def list(request: SortOrder): Request[FileList] = js.native
}
