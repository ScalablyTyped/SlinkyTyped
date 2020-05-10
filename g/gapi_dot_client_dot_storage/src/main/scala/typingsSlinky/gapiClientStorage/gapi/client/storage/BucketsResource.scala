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

@js.native
trait BucketsResource extends js.Object {
  /** Permanently deletes an empty bucket. */
  def delete(request: AnonFields): Request_[Unit] = js.native
  /** Returns metadata for the specified bucket. */
  def get(request: AnonIfMetagenerationMatch): Request_[Bucket] = js.native
  /** Returns an IAM policy for the specified bucket. */
  def getIamPolicy(request: AnonBucket): Request_[Policy] = js.native
  /** Creates a new bucket. */
  def insert(request: AnonKey): Request_[Bucket] = js.native
  /** Retrieves a list of buckets for a given project. */
  def list(request: AnonMaxResults): Request_[Buckets] = js.native
  /**
    * Updates a bucket. Changes to the bucket will be readable immediately after writing, but configuration changes may take time to propagate. This method
    * supports patch semantics.
    */
  def patch(request: AnonIfMetagenerationNotMatch): Request_[Bucket] = js.native
  /** Updates an IAM policy for the specified bucket. */
  def setIamPolicy(request: AnonBucket): Request_[Policy] = js.native
  /** Tests a set of permissions on the given bucket to see which, if any, are held by the caller. */
  def testIamPermissions(request: AnonOauthtoken): Request_[TestIamPermissionsResponse] = js.native
  /** Updates a bucket. Changes to the bucket will be readable immediately after writing, but configuration changes may take time to propagate. */
  def update(request: AnonIfMetagenerationNotMatch): Request_[Bucket] = js.native
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
  @scala.inline
  implicit class BucketsResourceOps[Self <: BucketsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonFields => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonIfMetagenerationMatch => Request_[Bucket]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetIamPolicy(value: AnonBucket => Request_[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonKey => Request_[Bucket]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonMaxResults => Request_[Buckets]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonIfMetagenerationNotMatch => Request_[Bucket]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIamPolicy(value: AnonBucket => Request_[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTestIamPermissions(value: AnonOauthtoken => Request_[TestIamPermissionsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testIamPermissions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonIfMetagenerationNotMatch => Request_[Bucket]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

