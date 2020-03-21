package typingsSlinky.dialogflow.mod.google.protobuf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an Any. */
trait IAny extends js.Object {
  /** Any type_url */
  var type_url: js.UndefOr[String | Null] = js.undefined
  /** Any value */
  var value: js.UndefOr[scala.scalajs.js.typedarray.Uint8Array | Null] = js.undefined
}

object IAny {
  @scala.inline
  def apply(type_url: String = null, value: scala.scalajs.js.typedarray.Uint8Array = null): IAny = {
    val __obj = js.Dynamic.literal()
    if (type_url != null) __obj.updateDynamic("type_url")(type_url.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAny]
  }
}

