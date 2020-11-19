package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDfareporting.anon.FileId
import typingsSlinky.gapiClientDfareporting.anon.ReportId
import typingsSlinky.gapiClientDfareporting.anon.Scope
import typingsSlinky.gapiClientDfareporting.anon.SortField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilesResource extends js.Object {
  
  /** Retrieves a report file by its report ID and file ID. This method supports media download. */
  def get(request: FileId): Request[File] = js.native
  /** Retrieves a report file. This method supports media download. */
  def get(request: ReportId): Request[File] = js.native
  
  /** Lists files for a user profile. */
  def list(request: Scope): Request[FileList] = js.native
  /** Lists files for a report. */
  def list(request: SortField): Request[FileList] = js.native
}
