package typingsSlinky.maximMazurokGapiClientDrive.gapi.client.drive

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDrive.anon.EmailMessage
import typingsSlinky.maximMazurokGapiClientDrive.anon.FieldsFileId
import typingsSlinky.maximMazurokGapiClientDrive.anon.MoveToNewOwnersRoot
import typingsSlinky.maximMazurokGapiClientDrive.anon.PermissionId
import typingsSlinky.maximMazurokGapiClientDrive.anon.RemoveExpiration
import typingsSlinky.maximMazurokGapiClientDrive.anon.TransferOwnership
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermissionsResource extends js.Object {
  
  /** Creates a permission for a file or shared drive. */
  def create(request: EmailMessage): Request[Permission] = js.native
  def create(request: MoveToNewOwnersRoot, body: Permission): Request[Permission] = js.native
  
  /** Deletes a permission. */
  def delete(): Request[Unit] = js.native
  def delete(request: PermissionId): Request[Unit] = js.native
  
  /** Gets a permission by ID. */
  def get(): Request[Permission] = js.native
  def get(request: PermissionId): Request[Permission] = js.native
  
  /** Lists a file's or shared drive's permissions. */
  def list(): Request[PermissionList] = js.native
  def list(request: FieldsFileId): Request[PermissionList] = js.native
  
  /** Updates a permission with patch semantics. */
  def update(request: RemoveExpiration): Request[Permission] = js.native
  def update(request: TransferOwnership, body: Permission): Request[Permission] = js.native
}
