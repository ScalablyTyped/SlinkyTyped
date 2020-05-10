package typingsSlinky.dialogflow.mod.google.protobuf

import typingsSlinky.dialogflow.mod.google.api.IHttpRule
import typingsSlinky.dialogflow.mod.google.longrunning.IOperationInfo
import typingsSlinky.dialogflow.mod.google.protobuf.MethodOptions.IdempotencyLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a MethodOptions. */
@js.native
trait IMethodOptions extends js.Object {
  /** MethodOptions .google.api.http */
  @JSName(".google.api.http")
  var DotgoogleDotapiDothttp: js.UndefOr[IHttpRule | Null] = js.native
  /** MethodOptions .google.api.methodSignature */
  @JSName(".google.api.methodSignature")
  var DotgoogleDotapiDotmethodSignature: js.UndefOr[js.Array[String] | Null] = js.native
  /** MethodOptions .google.longrunning.operationInfo */
  @JSName(".google.longrunning.operationInfo")
  var DotgoogleDotlongrunningDotoperationInfo: js.UndefOr[IOperationInfo | Null] = js.native
  /** MethodOptions deprecated */
  var deprecated: js.UndefOr[Boolean | Null] = js.native
  /** MethodOptions idempotencyLevel */
  var idempotencyLevel: js.UndefOr[IdempotencyLevel | Null] = js.native
  /** MethodOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.native
}

object IMethodOptions {
  @scala.inline
  def apply(): IMethodOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMethodOptions]
  }
  @scala.inline
  implicit class IMethodOptionsOps[Self <: IMethodOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDotgoogleDotapiDothttp(value: IHttpRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".google.api.http")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotgoogleDotapiDothttp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".google.api.http")(js.undefined)
        ret
    }
    @scala.inline
    def withDotgoogleDotapiDothttpNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".google.api.http")(null)
        ret
    }
    @scala.inline
    def withDotgoogleDotapiDotmethodSignature(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".google.api.methodSignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotgoogleDotapiDotmethodSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".google.api.methodSignature")(js.undefined)
        ret
    }
    @scala.inline
    def withDotgoogleDotapiDotmethodSignatureNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".google.api.methodSignature")(null)
        ret
    }
    @scala.inline
    def withDotgoogleDotlongrunningDotoperationInfo(value: IOperationInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".google.longrunning.operationInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotgoogleDotlongrunningDotoperationInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".google.longrunning.operationInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withDotgoogleDotlongrunningDotoperationInfoNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".google.longrunning.operationInfo")(null)
        ret
    }
    @scala.inline
    def withDeprecated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(js.undefined)
        ret
    }
    @scala.inline
    def withDeprecatedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(null)
        ret
    }
    @scala.inline
    def withIdempotencyLevel(value: IdempotencyLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idempotencyLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdempotencyLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idempotencyLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withIdempotencyLevelNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idempotencyLevel")(null)
        ret
    }
    @scala.inline
    def withUninterpretedOption(value: js.Array[IUninterpretedOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninterpretedOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUninterpretedOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninterpretedOption")(js.undefined)
        ret
    }
    @scala.inline
    def withUninterpretedOptionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninterpretedOption")(null)
        ret
    }
  }
  
}

