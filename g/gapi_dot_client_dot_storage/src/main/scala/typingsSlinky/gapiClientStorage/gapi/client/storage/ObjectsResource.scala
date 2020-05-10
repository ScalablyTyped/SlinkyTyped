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

@js.native
trait ObjectsResource extends js.Object {
  /** Concatenates a list of existing objects into a new object in the same bucket. */
  def compose(request: AnonDestinationBucket): Request_[Object] = js.native
  /** Copies a source object to a destination object. Optionally overrides metadata. */
  def copy(request: AnonDestinationObject): Request_[Object] = js.native
  /** Deletes an object and its metadata. Deletions are permanent if versioning is not enabled for the bucket, or if the generation parameter is used. */
  def delete(request: AnonIfGenerationNotMatch): Request_[Unit] = js.native
  /** Retrieves an object or its metadata. */
  def get(request: AnonProjection): Request_[Object] = js.native
  /** Returns an IAM policy for the specified object. */
  def getIamPolicy(request: AnonQuotaUser): Request_[Policy] = js.native
  /** Stores a new object and metadata. */
  def insert(request: AnonContentEncoding): Request_[Object] = js.native
  /** Retrieves a list of objects matching the criteria. */
  def list(request: AnonDelimiter): Request_[Objects] = js.native
  /** Updates an object's metadata. This method supports patch semantics. */
  def patch(request: AnonPredefinedAcl): Request_[Object] = js.native
  /** Rewrites a source object to a destination object. Optionally overrides metadata. */
  def rewrite(request: AnonDestinationKmsKeyName): Request_[RewriteResponse] = js.native
  /** Updates an IAM policy for the specified object. */
  def setIamPolicy(request: AnonQuotaUser): Request_[Policy] = js.native
  /** Tests a set of permissions on the given object to see which, if any, are held by the caller. */
  def testIamPermissions(request: AnonPermissions): Request_[TestIamPermissionsResponse] = js.native
  /** Updates an object's metadata. */
  def update(request: AnonPredefinedAcl): Request_[Object] = js.native
  /** Watch for changes on all objects in a bucket. */
  def watchAll(request: AnonDelimiter): Request_[Channel] = js.native
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
  @scala.inline
  implicit class ObjectsResourceOps[Self <: ObjectsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompose(value: AnonDestinationBucket => Request_[Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCopy(value: AnonDestinationObject => Request_[Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonIfGenerationNotMatch => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonProjection => Request_[Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetIamPolicy(value: AnonQuotaUser => Request_[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonContentEncoding => Request_[Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonDelimiter => Request_[Objects]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonPredefinedAcl => Request_[Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRewrite(value: AnonDestinationKmsKeyName => Request_[RewriteResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewrite")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIamPolicy(value: AnonQuotaUser => Request_[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTestIamPermissions(value: AnonPermissions => Request_[TestIamPermissionsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testIamPermissions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonPredefinedAcl => Request_[Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWatchAll(value: AnonDelimiter => Request_[Channel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchAll")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

