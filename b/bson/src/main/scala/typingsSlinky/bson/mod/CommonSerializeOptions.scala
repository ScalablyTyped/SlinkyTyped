package typingsSlinky.bson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonSerializeOptions extends js.Object {
  /** {default:false}, the serializer will check if keys are valid. */
  var checkKeys: js.UndefOr[Boolean] = js.native
  /** {default:true}, ignore undefined fields. */
  var ignoreUndefined: js.UndefOr[Boolean] = js.native
  /** {default:false}, serialize the javascript functions. */
  var serializeFunctions: js.UndefOr[Boolean] = js.native
}

object CommonSerializeOptions {
  @scala.inline
  def apply(): CommonSerializeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonSerializeOptions]
  }
  @scala.inline
  implicit class CommonSerializeOptionsOps[Self <: CommonSerializeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckKeys(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreUndefined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUndefined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreUndefined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUndefined")(js.undefined)
        ret
    }
    @scala.inline
    def withSerializeFunctions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializeFunctions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerializeFunctions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializeFunctions")(js.undefined)
        ret
    }
  }
  
}

