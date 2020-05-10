package typingsSlinky.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the HTTP configuration for an API service. It contains a list of
  * HttpRule, each specifying the mapping of an RPC method to one or more HTTP
  * REST API methods.
  */
@js.native
trait SchemaHttp extends js.Object {
  /**
    * When set to true, URL path parameters will be fully URI-decoded except in
    * cases of single segment matches in reserved expansion, where
    * &quot;%2F&quot; will be left encoded.  The default behavior is to not
    * decode RFC 6570 reserved characters in multi segment matches.
    */
  var fullyDecodeReservedExpansion: js.UndefOr[Boolean] = js.native
  /**
    * A list of HTTP configuration rules that apply to individual API methods.
    * **NOTE:** All service configuration rules follow &quot;last one
    * wins&quot; order.
    */
  var rules: js.UndefOr[js.Array[SchemaHttpRule]] = js.native
}

object SchemaHttp {
  @scala.inline
  def apply(): SchemaHttp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttp]
  }
  @scala.inline
  implicit class SchemaHttpOps[Self <: SchemaHttp] (val x: Self) extends AnyVal {
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
    def withRules(value: js.Array[SchemaHttpRule]): Self = {
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
  }
  
}

