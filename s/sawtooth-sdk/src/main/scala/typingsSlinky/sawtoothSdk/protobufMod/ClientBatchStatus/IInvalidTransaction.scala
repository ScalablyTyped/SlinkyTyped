package typingsSlinky.sawtoothSdk.protobufMod.ClientBatchStatus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an InvalidTransaction. */
trait IInvalidTransaction extends js.Object {
  /** InvalidTransaction extendedData */
  var extendedData: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
  /** InvalidTransaction message */
  var message: js.UndefOr[String | Null] = js.undefined
  /** InvalidTransaction transactionId */
  var transactionId: js.UndefOr[String | Null] = js.undefined
}

object IInvalidTransaction {
  @scala.inline
  def apply(
    extendedData: js.UndefOr[Null | js.typedarray.Uint8Array] = js.undefined,
    message: js.UndefOr[Null | String] = js.undefined,
    transactionId: js.UndefOr[Null | String] = js.undefined
  ): IInvalidTransaction = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(extendedData)) __obj.updateDynamic("extendedData")(extendedData.asInstanceOf[js.Any])
    if (!js.isUndefined(message)) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(transactionId)) __obj.updateDynamic("transactionId")(transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInvalidTransaction]
  }
}

