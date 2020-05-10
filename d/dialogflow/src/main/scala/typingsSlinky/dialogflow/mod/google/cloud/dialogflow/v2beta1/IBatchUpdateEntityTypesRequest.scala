package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typingsSlinky.dialogflow.mod.google.protobuf.IFieldMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a BatchUpdateEntityTypesRequest. */
@js.native
trait IBatchUpdateEntityTypesRequest extends js.Object {
  /** BatchUpdateEntityTypesRequest entityTypeBatchInline */
  var entityTypeBatchInline: js.UndefOr[IEntityTypeBatch | Null] = js.native
  /** BatchUpdateEntityTypesRequest entityTypeBatchUri */
  var entityTypeBatchUri: js.UndefOr[String | Null] = js.native
  /** BatchUpdateEntityTypesRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.native
  /** BatchUpdateEntityTypesRequest parent */
  var parent: js.UndefOr[String | Null] = js.native
  /** BatchUpdateEntityTypesRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.native
}

object IBatchUpdateEntityTypesRequest {
  @scala.inline
  def apply(): IBatchUpdateEntityTypesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatchUpdateEntityTypesRequest]
  }
  @scala.inline
  implicit class IBatchUpdateEntityTypesRequestOps[Self <: IBatchUpdateEntityTypesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntityTypeBatchInline(value: IEntityTypeBatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityTypeBatchInline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityTypeBatchInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityTypeBatchInline")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityTypeBatchInlineNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityTypeBatchInline")(null)
        ret
    }
    @scala.inline
    def withEntityTypeBatchUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityTypeBatchUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityTypeBatchUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityTypeBatchUri")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityTypeBatchUriNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityTypeBatchUri")(null)
        ret
    }
    @scala.inline
    def withLanguageCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageCodeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(null)
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
    @scala.inline
    def withUpdateMask(value: IFieldMask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateMaskNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(null)
        ret
    }
  }
  
}

