package typingsSlinky.gapiClientStorage.gapi.client.storage

import typingsSlinky.gapiClientStorage.anon.Condition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Policy extends js.Object {
  /** An association between a role, which comes with a set of permissions, and members who may assume that role. */
  var bindings: js.UndefOr[js.Array[Condition]] = js.native
  /** HTTP 1.1  Entity tag for the policy. */
  var etag: js.UndefOr[String] = js.native
  /** The kind of item this is. For policies, this is always storage#policy. This field is ignored on input. */
  var kind: js.UndefOr[String] = js.native
  /**
    * The ID of the resource to which this policy belongs. Will be of the form projects/_/buckets/bucket for buckets, and
    * projects/_/buckets/bucket/objects/object for objects. A specific generation may be specified by appending #generationNumber to the end of the object
    * name, e.g. projects/_/buckets/my-bucket/objects/data.txt#17. The current generation can be denoted with #0. This field is ignored on input.
    */
  var resourceId: js.UndefOr[String] = js.native
}

object Policy {
  @scala.inline
  def apply(): Policy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Policy]
  }
  @scala.inline
  implicit class PolicyOps[Self <: Policy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindings(value: js.Array[Condition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindings")(js.undefined)
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
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
    def withResourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(js.undefined)
        ret
    }
  }
  
}

