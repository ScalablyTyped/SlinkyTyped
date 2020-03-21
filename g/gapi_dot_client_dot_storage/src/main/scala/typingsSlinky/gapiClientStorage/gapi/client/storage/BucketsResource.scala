package typingsSlinky.gapiClientStorage.gapi.client.storage

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientStorage.AnonBucket
import typingsSlinky.gapiClientStorage.AnonFields
import typingsSlinky.gapiClientStorage.AnonIfMetagenerationMatch
import typingsSlinky.gapiClientStorage.AnonIfMetagenerationNotMatch
import typingsSlinky.gapiClientStorage.AnonKey
import typingsSlinky.gapiClientStorage.AnonMaxResults
import typingsSlinky.gapiClientStorage.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketsResource extends js.Object {
  /** Permanently deletes an empty bucket. */
  def delete(request: AnonFields): Request_[Unit]
  /** Returns metadata for the specified bucket. */
  def get(request: AnonIfMetagenerationMatch): Request_[Bucket]
  /** Returns an IAM policy for the specified bucket. */
  def getIamPolicy(request: AnonBucket): Request_[Policy]
  /** Creates a new bucket. */
  def insert(request: AnonKey): Request_[Bucket]
  /** Retrieves a list of buckets for a given project. */
  def list(request: AnonMaxResults): Request_[Buckets]
  /**
    * Updates a bucket. Changes to the bucket will be readable immediately after writing, but configuration changes may take time to propagate. This method
    * supports patch semantics.
    */
  def patch(request: AnonIfMetagenerationNotMatch): Request_[Bucket]
  /** Updates an IAM policy for the specified bucket. */
  def setIamPolicy(request: AnonBucket): Request_[Policy]
  /** Tests a set of permissions on the given bucket to see which, if any, are held by the caller. */
  def testIamPermissions(request: AnonOauthtoken): Request_[TestIamPermissionsResponse]
  /** Updates a bucket. Changes to the bucket will be readable immediately after writing, but configuration changes may take time to propagate. */
  def update(request: AnonIfMetagenerationNotMatch): Request_[Bucket]
}

object BucketsResource {
  @scala.inline
  def apply(
    delete: AnonFields => Request_[Unit],
    get: AnonIfMetagenerationMatch => Request_[Bucket],
    getIamPolicy: AnonBucket => Request_[Policy],
    insert: AnonKey => Request_[Bucket],
    list: AnonMaxResults => Request_[Buckets],
    patch: AnonIfMetagenerationNotMatch => Request_[Bucket],
    setIamPolicy: AnonBucket => Request_[Policy],
    testIamPermissions: AnonOauthtoken => Request_[TestIamPermissionsResponse],
    update: AnonIfMetagenerationNotMatch => Request_[Bucket]
  ): BucketsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[BucketsResource]
  }
}

