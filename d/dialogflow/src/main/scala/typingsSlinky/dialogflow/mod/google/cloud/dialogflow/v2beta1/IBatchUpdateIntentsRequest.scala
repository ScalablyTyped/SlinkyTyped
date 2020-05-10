package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typingsSlinky.dialogflow.mod.google.protobuf.IFieldMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a BatchUpdateIntentsRequest. */
@js.native
trait IBatchUpdateIntentsRequest extends js.Object {
  /** BatchUpdateIntentsRequest intentBatchInline */
  var intentBatchInline: js.UndefOr[IIntentBatch | Null] = js.native
  /** BatchUpdateIntentsRequest intentBatchUri */
  var intentBatchUri: js.UndefOr[String | Null] = js.native
  /** BatchUpdateIntentsRequest intentView */
  var intentView: js.UndefOr[IntentView | Null] = js.native
  /** BatchUpdateIntentsRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.native
  /** BatchUpdateIntentsRequest parent */
  var parent: js.UndefOr[String | Null] = js.native
  /** BatchUpdateIntentsRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.native
}

object IBatchUpdateIntentsRequest {
  @scala.inline
  def apply(): IBatchUpdateIntentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatchUpdateIntentsRequest]
  }
  @scala.inline
  implicit class IBatchUpdateIntentsRequestOps[Self <: IBatchUpdateIntentsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntentBatchInline(value: IIntentBatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentBatchInline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntentBatchInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentBatchInline")(js.undefined)
        ret
    }
    @scala.inline
    def withIntentBatchInlineNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentBatchInline")(null)
        ret
    }
    @scala.inline
    def withIntentBatchUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentBatchUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntentBatchUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentBatchUri")(js.undefined)
        ret
    }
    @scala.inline
    def withIntentBatchUriNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentBatchUri")(null)
        ret
    }
    @scala.inline
    def withIntentView(value: IntentView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntentView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentView")(js.undefined)
        ret
    }
    @scala.inline
    def withIntentViewNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentView")(null)
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

