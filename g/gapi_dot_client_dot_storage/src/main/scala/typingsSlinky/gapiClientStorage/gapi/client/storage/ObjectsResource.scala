package typingsSlinky.gapiClientStorage.gapi.client.storage

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientStorage.AnonContentEncoding
import typingsSlinky.gapiClientStorage.AnonDelimiter
import typingsSlinky.gapiClientStorage.AnonDestinationBucket
import typingsSlinky.gapiClientStorage.AnonDestinationKmsKeyName
import typingsSlinky.gapiClientStorage.AnonDestinationObject
import typingsSlinky.gapiClientStorage.AnonIfGenerationNotMatch
import typingsSlinky.gapiClientStorage.AnonPermissions
import typingsSlinky.gapiClientStorage.AnonPredefinedAcl
import typingsSlinky.gapiClientStorage.AnonProjection
import typingsSlinky.gapiClientStorage.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectsResource extends js.Object {
  /** Concatenates a list of existing objects into a new object in the same bucket. */
  def compose(request: AnonDestinationBucket): Request_[Object]
  /** Copies a source object to a destination object. Optionally overrides metadata. */
  def copy(request: AnonDestinationObject): Request_[Object]
  /** Deletes an object and its metadata. Deletions are permanent if versioning is not enabled for the bucket, or if the generation parameter is used. */
  def delete(request: AnonIfGenerationNotMatch): Request_[Unit]
  /** Retrieves an object or its metadata. */
  def get(request: AnonProjection): Request_[Object]
  /** Returns an IAM policy for the specified object. */
  def getIamPolicy(request: AnonQuotaUser): Request_[Policy]
  /** Stores a new object and metadata. */
  def insert(request: AnonContentEncoding): Request_[Object]
  /** Retrieves a list of objects matching the criteria. */
  def list(request: AnonDelimiter): Request_[Objects]
  /** Updates an object's metadata. This method supports patch semantics. */
  def patch(request: AnonPredefinedAcl): Request_[Object]
  /** Rewrites a source object to a destination object. Optionally overrides metadata. */
  def rewrite(request: AnonDestinationKmsKeyName): Request_[RewriteResponse]
  /** Updates an IAM policy for the specified object. */
  def setIamPolicy(request: AnonQuotaUser): Request_[Policy]
  /** Tests a set of permissions on the given object to see which, if any, are held by the caller. */
  def testIamPermissions(request: AnonPermissions): Request_[TestIamPermissionsResponse]
  /** Updates an object's metadata. */
  def update(request: AnonPredefinedAcl): Request_[Object]
  /** Watch for changes on all objects in a bucket. */
  def watchAll(request: AnonDelimiter): Request_[Channel]
}

object ObjectsResource {
  @scala.inline
  def apply(
    compose: AnonDestinationBucket => Request_[Object],
    copy: AnonDestinationObject => Request_[Object],
    delete: AnonIfGenerationNotMatch => Request_[Unit],
    get: AnonProjection => Request_[Object],
    getIamPolicy: AnonQuotaUser => Request_[Policy],
    insert: AnonContentEncoding => Request_[Object],
    list: AnonDelimiter => Request_[Objects],
    patch: AnonPredefinedAcl => Request_[Object],
    rewrite: AnonDestinationKmsKeyName => Request_[RewriteResponse],
    setIamPolicy: AnonQuotaUser => Request_[Policy],
    testIamPermissions: AnonPermissions => Request_[TestIamPermissionsResponse],
    update: AnonPredefinedAcl => Request_[Object],
    watchAll: AnonDelimiter => Request_[Channel]
  ): ObjectsResource = {
    val __obj = js.Dynamic.literal(compose = js.Any.fromFunction1(compose), copy = js.Any.fromFunction1(copy), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), rewrite = js.Any.fromFunction1(rewrite), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions), update = js.Any.fromFunction1(update), watchAll = js.Any.fromFunction1(watchAll))
  
    __obj.asInstanceOf[ObjectsResource]
  }
}

