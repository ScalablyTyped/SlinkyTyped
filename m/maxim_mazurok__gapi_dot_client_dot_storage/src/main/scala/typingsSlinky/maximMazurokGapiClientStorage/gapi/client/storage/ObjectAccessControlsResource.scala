package typingsSlinky.maximMazurokGapiClientStorage.gapi.client.storage

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientStorage.anon.BucketEntity
import typingsSlinky.maximMazurokGapiClientStorage.anon.FieldsGeneration
import typingsSlinky.maximMazurokGapiClientStorage.anon.GenerationKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectAccessControlsResource extends StObject {
  
  /** Permanently deletes the ACL entry for the specified entity on the specified object. */
  def delete(): Request[Unit] = js.native
  def delete(request: typingsSlinky.maximMazurokGapiClientStorage.anon.Object): Request[Unit] = js.native
  
  /** Returns the ACL entry for the specified entity on the specified object. */
  def get(): Request[ObjectAccessControl] = js.native
  def get(request: typingsSlinky.maximMazurokGapiClientStorage.anon.Object): Request[ObjectAccessControl] = js.native
  
  /** Creates a new ACL entry on the specified object. */
  def insert(request: FieldsGeneration): Request[ObjectAccessControl] = js.native
  def insert(request: GenerationKey, body: ObjectAccessControl): Request[ObjectAccessControl] = js.native
  
  /** Retrieves ACL entries on the specified object. */
  def list(): Request[ObjectAccessControls] = js.native
  def list(request: GenerationKey): Request[ObjectAccessControls] = js.native
  
  /** Patches an ACL entry on the specified object. */
  def patch(request: BucketEntity): Request[ObjectAccessControl] = js.native
  def patch(request: typingsSlinky.maximMazurokGapiClientStorage.anon.Object, body: ObjectAccessControl): Request[ObjectAccessControl] = js.native
  
  /** Updates an ACL entry on the specified object. */
  def update(request: BucketEntity): Request[ObjectAccessControl] = js.native
  def update(request: typingsSlinky.maximMazurokGapiClientStorage.anon.Object, body: ObjectAccessControl): Request[ObjectAccessControl] = js.native
}
