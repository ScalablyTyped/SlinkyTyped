package typingsSlinky.gapiClientStorage.gapi.client.storage

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientStorage.anon.Fields
import typingsSlinky.gapiClientStorage.anon.IfMetagenerationMatch
import typingsSlinky.gapiClientStorage.anon.IfMetagenerationNotMatch
import typingsSlinky.gapiClientStorage.anon.Key
import typingsSlinky.gapiClientStorage.anon.MaxResults
import typingsSlinky.gapiClientStorage.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketsResource extends js.Object {
  /** Permanently deletes an empty bucket. */
  def delete(request: Fields): Request[Unit] = js.native
  /** Returns metadata for the specified bucket. */
  def get(request: IfMetagenerationMatch): Request[Bucket] = js.native
  /** Returns an IAM policy for the specified bucket. */
  def getIamPolicy(request: typingsSlinky.gapiClientStorage.anon.Bucket): Request[Policy] = js.native
  /** Creates a new bucket. */
  def insert(request: Key): Request[Bucket] = js.native
  /** Retrieves a list of buckets for a given project. */
  def list(request: MaxResults): Request[Buckets] = js.native
  /**
    * Updates a bucket. Changes to the bucket will be readable immediately after writing, but configuration changes may take time to propagate. This method
    * supports patch semantics.
    */
  def patch(request: IfMetagenerationNotMatch): Request[Bucket] = js.native
  /** Updates an IAM policy for the specified bucket. */
  def setIamPolicy(request: typingsSlinky.gapiClientStorage.anon.Bucket): Request[Policy] = js.native
  /** Tests a set of permissions on the given bucket to see which, if any, are held by the caller. */
  def testIamPermissions(request: Oauthtoken): Request[TestIamPermissionsResponse] = js.native
  /** Updates a bucket. Changes to the bucket will be readable immediately after writing, but configuration changes may take time to propagate. */
  def update(request: IfMetagenerationNotMatch): Request[Bucket] = js.native
}

object BucketsResource {
  @scala.inline
  def apply(
    delete: Fields => Request[Unit],
    get: IfMetagenerationMatch => Request[Bucket],
    getIamPolicy: typingsSlinky.gapiClientStorage.anon.Bucket => Request[Policy],
    insert: Key => Request[Bucket],
    list: MaxResults => Request[Buckets],
    patch: IfMetagenerationNotMatch => Request[Bucket],
    setIamPolicy: typingsSlinky.gapiClientStorage.anon.Bucket => Request[Policy],
    testIamPermissions: Oauthtoken => Request[TestIamPermissionsResponse],
    update: IfMetagenerationNotMatch => Request[Bucket]
  ): BucketsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[BucketsResource]
  }
  @scala.inline
  implicit class BucketsResourceOps[Self <: BucketsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: Fields => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: IfMetagenerationMatch => Request[Bucket]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetIamPolicy(value: typingsSlinky.gapiClientStorage.anon.Bucket => Request[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Key => Request[Bucket]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: MaxResults => Request[Buckets]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: IfMetagenerationNotMatch => Request[Bucket]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIamPolicy(value: typingsSlinky.gapiClientStorage.anon.Bucket => Request[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTestIamPermissions(value: Oauthtoken => Request[TestIamPermissionsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testIamPermissions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: IfMetagenerationNotMatch => Request[Bucket]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

