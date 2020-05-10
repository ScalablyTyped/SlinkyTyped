package typingsSlinky.dialogflow.mod.google.longrunning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an OperationInfo. */
@js.native
trait IOperationInfo extends js.Object {
  /** OperationInfo metadataType */
  var metadataType: js.UndefOr[String | Null] = js.native
  /** OperationInfo responseType */
  var responseType: js.UndefOr[String | Null] = js.native
}

object IOperationInfo {
  @scala.inline
  def apply(): IOperationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOperationInfo]
  }
  @scala.inline
  implicit class IOperationInfoOps[Self <: IOperationInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetadataType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadataType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataType")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadataTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataType")(null)
        ret
    }
    @scala.inline
    def withResponseType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(null)
        ret
    }
  }
  
}

