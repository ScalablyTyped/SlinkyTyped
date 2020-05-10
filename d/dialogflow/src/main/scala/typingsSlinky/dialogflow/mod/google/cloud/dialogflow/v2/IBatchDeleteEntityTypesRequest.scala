package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a BatchDeleteEntityTypesRequest. */
@js.native
trait IBatchDeleteEntityTypesRequest extends js.Object {
  /** BatchDeleteEntityTypesRequest entityTypeNames */
  var entityTypeNames: js.UndefOr[js.Array[String] | Null] = js.native
  /** BatchDeleteEntityTypesRequest parent */
  var parent: js.UndefOr[String | Null] = js.native
}

object IBatchDeleteEntityTypesRequest {
  @scala.inline
  def apply(): IBatchDeleteEntityTypesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatchDeleteEntityTypesRequest]
  }
  @scala.inline
  implicit class IBatchDeleteEntityTypesRequestOps[Self <: IBatchDeleteEntityTypesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntityTypeNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityTypeNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityTypeNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityTypeNames")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityTypeNamesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityTypeNames")(null)
        ret
    }
    @scala.inline
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withParentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(null)
        ret
    }
  }
  
}

