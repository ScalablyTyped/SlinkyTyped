package typingsSlinky.maximMazurokGapiClientStorage.gapi.client.storage

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientStorage.anon.Fields
import typingsSlinky.maximMazurokGapiClientStorage.anon.IfMetagenerationMatch
import typingsSlinky.maximMazurokGapiClientStorage.anon.IfMetagenerationNotMatch
import typingsSlinky.maximMazurokGapiClientStorage.anon.MaxResults
import typingsSlinky.maximMazurokGapiClientStorage.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientStorage.anon.Permissions
import typingsSlinky.maximMazurokGapiClientStorage.anon.PredefinedAcl
import typingsSlinky.maximMazurokGapiClientStorage.anon.PredefinedDefaultObjectAcl
import typingsSlinky.maximMazurokGapiClientStorage.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientStorage.anon.Projection
import typingsSlinky.maximMazurokGapiClientStorage.anon.ProvisionalUserProject
import typingsSlinky.maximMazurokGapiClientStorage.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketsResource extends js.Object {
  
  /** Permanently deletes an empty bucket. */
  def delete(): Request[Unit] = js.native
  def delete(request: IfMetagenerationMatch): Request[Unit] = js.native
  
  /** Returns metadata for the specified bucket. */
  def get(): Request[Bucket] = js.native
  def get(request: IfMetagenerationNotMatch): Request[Bucket] = js.native
  
  /** Returns an IAM policy for the specified bucket. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: Oauthtoken): Request[Policy] = js.native
  
  /** Creates a new bucket. */
  def insert(request: PredefinedAcl): Request[Bucket] = js.native
  def insert(request: PredefinedDefaultObjectAcl, body: Bucket): Request[Bucket] = js.native
  
  /** Retrieves a list of buckets for a given project. */
  def list(): Request[Buckets] = js.native
  def list(request: MaxResults): Request[Buckets] = js.native
  
  /** Locks retention policy on a bucket. */
  def lockRetentionPolicy(): Request[Bucket] = js.native
  def lockRetentionPolicy(request: PrettyPrint): Request[Bucket] = js.native
  
  /** Patches a bucket. Changes to the bucket will be readable immediately after writing, but configuration changes may take time to propagate. */
  def patch(request: Projection): Request[Bucket] = js.native
  def patch(request: ProvisionalUserProject, body: Bucket): Request[Bucket] = js.native
  
  def setIamPolicy(request: Fields, body: Policy): Request[Policy] = js.native
  /** Updates an IAM policy for the specified bucket. */
  def setIamPolicy(request: QuotaUser): Request[Policy] = js.native
  
  /** Tests a set of permissions on the given bucket to see which, if any, are held by the caller. */
  def testIamPermissions(): Request[TestIamPermissionsResponse] = js.native
  def testIamPermissions(request: Permissions): Request[TestIamPermissionsResponse] = js.native
  
  /** Updates a bucket. Changes to the bucket will be readable immediately after writing, but configuration changes may take time to propagate. */
  def update(request: Projection): Request[Bucket] = js.native
  def update(request: ProvisionalUserProject, body: Bucket): Request[Bucket] = js.native
}
