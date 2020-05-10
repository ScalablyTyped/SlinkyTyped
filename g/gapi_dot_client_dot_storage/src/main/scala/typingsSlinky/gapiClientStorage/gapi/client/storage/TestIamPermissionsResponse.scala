package typingsSlinky.gapiClientStorage.gapi.client.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestIamPermissionsResponse extends js.Object {
  /** The kind of item this is. */
  var kind: js.UndefOr[String] = js.native
  /**
    * The permissions held by the caller. Permissions are always of the format storage.resource.capability, where resource is one of buckets or objects. The
    * supported permissions are as follows:
    * - storage.buckets.delete — Delete bucket.
    * - storage.buckets.get — Read bucket metadata.
    * - storage.buckets.getIamPolicy — Read bucket IAM policy.
    * - storage.buckets.create — Create bucket.
    * - storage.buckets.list — List buckets.
    * - storage.buckets.setIamPolicy — Update bucket IAM policy.
    * - storage.buckets.update — Update bucket metadata.
    * - storage.objects.delete — Delete object.
    * - storage.objects.get — Read object data and metadata.
    * - storage.objects.getIamPolicy — Read object IAM policy.
    * - storage.objects.create — Create object.
    * - storage.objects.list — List objects.
    * - storage.objects.setIamPolicy — Update object IAM policy.
    * - storage.objects.update — Update object metadata.
    */
  var permissions: js.UndefOr[js.Array[String]] = js.native
}

object TestIamPermissionsResponse {
  @scala.inline
  def apply(): TestIamPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestIamPermissionsResponse]
  }
  @scala.inline
  implicit class TestIamPermissionsResponseOps[Self <: TestIamPermissionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(js.undefined)
        ret
    }
  }
  
}

