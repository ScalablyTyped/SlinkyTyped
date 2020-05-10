package typingsSlinky.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Third Party Authentication Token
  */
@js.native
trait SchemaThirdPartyAuthenticationToken extends js.Object {
  /**
    * Name of the third-party authentication token.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Value of the third-party authentication token. This is a read-only,
    * auto-generated field.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaThirdPartyAuthenticationToken {
  @scala.inline
  def apply(): SchemaThirdPartyAuthenticationToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThirdPartyAuthenticationToken]
  }
  @scala.inline
  implicit class SchemaThirdPartyAuthenticationTokenOps[Self <: SchemaThirdPartyAuthenticationToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
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
  }
  
}

