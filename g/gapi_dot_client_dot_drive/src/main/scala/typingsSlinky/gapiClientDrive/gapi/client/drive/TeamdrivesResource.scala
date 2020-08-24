package typingsSlinky.gapiClientDrive.gapi.client.drive

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDrive.anon.FieldsKey
import typingsSlinky.gapiClientDrive.anon.PageToken
import typingsSlinky.gapiClientDrive.anon.PrettyPrintQuotaUser
import typingsSlinky.gapiClientDrive.anon.QuotaUserResource
import typingsSlinky.gapiClientDrive.anon.RequestId
import typingsSlinky.gapiClientDrive.anon.TeamDriveId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamdrivesResource extends js.Object {
  /** Deprecated use drives.create instead. */
  def create(request: FieldsKey): Request[TeamDrive] = js.native
  def create(request: RequestId, body: TeamDrive): Request[TeamDrive] = js.native
  /** Deprecated use drives.delete instead. */
  def delete(): Request[Unit] = js.native
  def delete(request: TeamDriveId): Request[Unit] = js.native
  /** Deprecated use drives.get instead. */
  def get(): Request[TeamDrive] = js.native
  def get(request: PrettyPrintQuotaUser): Request[TeamDrive] = js.native
  /** Deprecated use drives.list instead. */
  def list(): Request[TeamDriveList] = js.native
  def list(request: PageToken): Request[TeamDriveList] = js.native
  def update(request: PrettyPrintQuotaUser, body: TeamDrive): Request[TeamDrive] = js.native
  /** Deprecated use drives.update instead */
  def update(request: QuotaUserResource): Request[TeamDrive] = js.native
}

