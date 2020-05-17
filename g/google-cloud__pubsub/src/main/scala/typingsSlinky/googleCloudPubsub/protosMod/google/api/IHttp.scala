package typingsSlinky.googleCloudPubsub.protosMod.google.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Http. */
@js.native
trait IHttp extends js.Object {
  /** Http fullyDecodeReservedExpansion */
  var fullyDecodeReservedExpansion: js.UndefOr[Boolean | Null] = js.native
  /** Http rules */
  var rules: js.UndefOr[js.Array[IHttpRule] | Null] = js.native
}

object IHttp {
  @scala.inline
  def apply(): IHttp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHttp]
  }
  @scala.inline
  implicit class IHttpOps[Self <: IHttp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFullyDecodeReservedExpansion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullyDecodeReservedExpansion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullyDecodeReservedExpansion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullyDecodeReservedExpansion")(js.undefined)
        ret
    }
    @scala.inline
    def withFullyDecodeReservedExpansionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullyDecodeReservedExpansion")(null)
        ret
    }
    @scala.inline
    def withRules(value: js.Array[IHttpRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(js.undefined)
        ret
    }
    @scala.inline
    def withRulesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(null)
        ret
    }
  }
  
}

