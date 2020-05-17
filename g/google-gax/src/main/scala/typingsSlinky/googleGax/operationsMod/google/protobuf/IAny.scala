package typingsSlinky.googleGax.operationsMod.google.protobuf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an Any. */
@js.native
trait IAny extends js.Object {
  /** Any type_url */
  var type_url: js.UndefOr[String | Null] = js.native
  /** Any value */
  var value: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
}

object IAny {
  @scala.inline
  def apply(): IAny = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAny]
  }
  @scala.inline
  implicit class IAnyOps[Self <: IAny] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type_url")(js.undefined)
        ret
    }
    @scala.inline
    def withType_urlNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type_url")(null)
        ret
    }
    @scala.inline
    def withValue(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(null)
        ret
    }
  }
  
}

