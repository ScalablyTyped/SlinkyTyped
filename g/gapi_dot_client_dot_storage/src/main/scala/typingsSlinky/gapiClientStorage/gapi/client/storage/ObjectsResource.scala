package typingsSlinky.gapiClientStorage.gapi.client.storage

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientStorage.anon.ContentEncoding
import typingsSlinky.gapiClientStorage.anon.Delimiter
import typingsSlinky.gapiClientStorage.anon.DestinationBucket
import typingsSlinky.gapiClientStorage.anon.DestinationKmsKeyName
import typingsSlinky.gapiClientStorage.anon.DestinationObject
import typingsSlinky.gapiClientStorage.anon.IfGenerationNotMatch
import typingsSlinky.gapiClientStorage.anon.Permissions
import typingsSlinky.gapiClientStorage.anon.PredefinedAcl
import typingsSlinky.gapiClientStorage.anon.Projection
import typingsSlinky.gapiClientStorage.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectsResource extends js.Object {
  /** Concatenates a list of existing objects into a new object in the same bucket. */
  def compose(request: DestinationBucket): Request[Object] = js.native
  /** Copies a source object to a destination object. Optionally overrides metadata. */
  def copy(request: DestinationObject): Request[Object] = js.native
  /** Deletes an object and its metadata. Deletions are permanent if versioning is not enabled for the bucket, or if the generation parameter is used. */
  def delete(request: IfGenerationNotMatch): Request[Unit] = js.native
  /** Retrieves an object or its metadata. */
  def get(request: Projection): Request[Object] = js.native
  /** Returns an IAM policy for the specified object. */
  def getIamPolicy(request: QuotaUser): Request[Policy] = js.native
  /** Stores a new object and metadata. */
  def insert(request: ContentEncoding): Request[Object] = js.native
  /** Retrieves a list of objects matching the criteria. */
  def list(request: Delimiter): Request[Objects] = js.native
  /** Updates an object's metadata. This method supports patch semantics. */
  def patch(request: PredefinedAcl): Request[Object] = js.native
  /** Rewrites a source object to a destination object. Optionally overrides metadata. */
  def rewrite(request: DestinationKmsKeyName): Request[RewriteResponse] = js.native
  /** Updates an IAM policy for the specified object. */
  def setIamPolicy(request: QuotaUser): Request[Policy] = js.native
  /** Tests a set of permissions on the given object to see which, if any, are held by the caller. */
  def testIamPermissions(request: Permissions): Request[TestIamPermissionsResponse] = js.native
  /** Updates an object's metadata. */
  def update(request: PredefinedAcl): Request[Object] = js.native
  /** Watch for changes on all objects in a bucket. */
  def watchAll(request: Delimiter): Request[Channel] = js.native
}

object ObjectsResource {
  @scala.inline
  def apply(
    compose: DestinationBucket => Request[Object],
    copy: DestinationObject => Request[Object],
    delete: IfGenerationNotMatch => Request[Unit],
    get: Projection => Request[Object],
    getIamPolicy: QuotaUser => Request[Policy],
    insert: ContentEncoding => Request[Object],
    list: Delimiter => Request[Objects],
    patch: PredefinedAcl => Request[Object],
    rewrite: DestinationKmsKeyName => Request[RewriteResponse],
    setIamPolicy: QuotaUser => Request[Policy],
    testIamPermissions: Permissions => Request[TestIamPermissionsResponse],
    update: PredefinedAcl => Request[Object],
    watchAll: Delimiter => Request[Channel]
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
    def withCompose(value: DestinationBucket => Request[Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCopy(value: DestinationObject => Request[Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: IfGenerationNotMatch => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Projection => Request[Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetIamPolicy(value: QuotaUser => Request[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: ContentEncoding => Request[Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Delimiter => Request[Objects]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: PredefinedAcl => Request[Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRewrite(value: DestinationKmsKeyName => Request[RewriteResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewrite")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIamPolicy(value: QuotaUser => Request[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTestIamPermissions(value: Permissions => Request[TestIamPermissionsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testIamPermissions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: PredefinedAcl => Request[Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWatchAll(value: Delimiter => Request[Channel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchAll")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

