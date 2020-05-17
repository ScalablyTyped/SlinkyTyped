package typingsSlinky.googleCloudPubsub.iamMod.google.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a HttpRule. */
@js.native
trait IHttpRule extends js.Object {
  /** HttpRule additionalBindings */
  var additionalBindings: js.UndefOr[js.Array[IHttpRule] | Null] = js.native
  /** HttpRule body */
  var body: js.UndefOr[String | Null] = js.native
  /** HttpRule custom */
  var custom: js.UndefOr[ICustomHttpPattern | Null] = js.native
  /** HttpRule delete */
  var delete: js.UndefOr[String | Null] = js.native
  /** HttpRule get */
  var get: js.UndefOr[String | Null] = js.native
  /** HttpRule patch */
  var patch: js.UndefOr[String | Null] = js.native
  /** HttpRule post */
  var post: js.UndefOr[String | Null] = js.native
  /** HttpRule put */
  var put: js.UndefOr[String | Null] = js.native
  /** HttpRule selector */
  var selector: js.UndefOr[String | Null] = js.native
}

object IHttpRule {
  @scala.inline
  def apply(): IHttpRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHttpRule]
  }
  @scala.inline
  implicit class IHttpRuleOps[Self <: IHttpRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalBindings(value: js.Array[IHttpRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalBindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalBindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalBindings")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditionalBindingsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalBindings")(null)
        ret
    }
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(null)
        ret
    }
    @scala.inline
    def withCustom(value: ICustomHttpPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(null)
        ret
    }
    @scala.inline
    def withDelete(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(null)
        ret
    }
    @scala.inline
    def withGet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.undefined)
        ret
    }
    @scala.inline
    def withGetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(null)
        ret
    }
    @scala.inline
    def withPatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.undefined)
        ret
    }
    @scala.inline
    def withPatchNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(null)
        ret
    }
    @scala.inline
    def withPost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(js.undefined)
        ret
    }
    @scala.inline
    def withPostNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(null)
        ret
    }
    @scala.inline
    def withPut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("put")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("put")(js.undefined)
        ret
    }
    @scala.inline
    def withPutNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("put")(null)
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(null)
        ret
    }
  }
  
}

