package typingsSlinky.maximMazurokGapiClientDrive.gapi.client.drive

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDrive.anon.AcknowledgeAbuse
import typingsSlinky.maximMazurokGapiClientDrive.anon.AddParents
import typingsSlinky.maximMazurokGapiClientDrive.anon.AltEnforceSingleParent
import typingsSlinky.maximMazurokGapiClientDrive.anon.AltFields
import typingsSlinky.maximMazurokGapiClientDrive.anon.Corpora
import typingsSlinky.maximMazurokGapiClientDrive.anon.Count
import typingsSlinky.maximMazurokGapiClientDrive.anon.EnforceSingleParent
import typingsSlinky.maximMazurokGapiClientDrive.anon.IgnoreDefaultVisibility
import typingsSlinky.maximMazurokGapiClientDrive.anon.IncludePermissionsForView
import typingsSlinky.maximMazurokGapiClientDrive.anon.KeepRevisionForever
import typingsSlinky.maximMazurokGapiClientDrive.anon.OcrLanguage
import typingsSlinky.maximMazurokGapiClientDrive.anon.SupportsAllDrives
import typingsSlinky.maximMazurokGapiClientDrive.anon.SupportsTeamDrives
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilesResource extends js.Object {
  
  /** Creates a copy of a file and applies any requested updates with patch semantics. Folders cannot be copied. */
  def copy(request: EnforceSingleParent): Request[File] = js.native
  def copy(request: IgnoreDefaultVisibility, body: File): Request[File] = js.native
  
  /** Creates a new file. */
  def create(request: IncludePermissionsForView): Request[File] = js.native
  def create(request: KeepRevisionForever, body: File): Request[File] = js.native
  
  /**
    * Permanently deletes a file owned by the user without moving it to the trash. If the file belongs to a shared drive the user must be an organizer on the parent. If the target is a
    * folder, all descendants owned by the user are also deleted.
    */
  def delete(): Request[Unit] = js.native
  def delete(request: SupportsAllDrives): Request[Unit] = js.native
  
  /** Permanently deletes all of the user's trashed files. */
  def emptyTrash(): Request[Unit] = js.native
  def emptyTrash(request: AltEnforceSingleParent): Request[Unit] = js.native
  
  /** Exports a Google Doc to the requested MIME type and returns the exported content. Please note that the exported content is limited to 10MB. */
  def export(): Request[Unit] = js.native
  def export(request: AltFields): Request[Unit] = js.native
  
  /** Generates a set of file IDs which can be provided in create or copy requests. */
  def generateIds(): Request[GeneratedIds] = js.native
  def generateIds(request: Count): Request[GeneratedIds] = js.native
  
  /** Gets a file's metadata or content by ID. */
  def get(): Request[File] = js.native
  def get(request: AcknowledgeAbuse): Request[File] = js.native
  
  /** Lists or searches files. */
  def list(): Request[FileList] = js.native
  def list(request: Corpora): Request[FileList] = js.native
  
  /** Updates a file's metadata and/or content. This method supports patch semantics. */
  def update(request: AddParents): Request[File] = js.native
  def update(request: OcrLanguage, body: File): Request[File] = js.native
  
  def watch(request: AcknowledgeAbuse, body: Channel): Request[Channel] = js.native
  /** Subscribes to changes to a file */
  def watch(request: SupportsTeamDrives): Request[Channel] = js.native
}
