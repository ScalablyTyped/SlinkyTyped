package typingsSlinky.mongoose.mongooseMod.SchemaTypeOpts

import typingsSlinky.mongoose.mongooseNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateOpts extends ValidateOptsBase {
  /** deprecated */
  var isAsync: js.UndefOr[`false`] = js.undefined
  var validator: js.UndefOr[js.RegExp | ValidateFn[_]] = js.undefined
}

object ValidateOpts {
  @scala.inline
  def apply(
    isAsync: `false` = null,
    message: String = null,
    msg: String = null,
    `type`: String = null,
    validator: js.RegExp | ValidateFn[_] = null
  ): ValidateOpts = {
    val __obj = js.Dynamic.literal()
    if (isAsync != null) __obj.updateDynamic("isAsync")(isAsync.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (msg != null) __obj.updateDynamic("msg")(msg.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validator != null) __obj.updateDynamic("validator")(validator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateOpts]
  }
}

