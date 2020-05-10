package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for the origin authentication method.
  */
@js.native
trait SchemaOriginAuthenticationMethod extends js.Object {
  var jwt: js.UndefOr[SchemaJwt] = js.native
}

object SchemaOriginAuthenticationMethod {
  @scala.inline
  def apply(): SchemaOriginAuthenticationMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOriginAuthenticationMethod]
  }
  @scala.inline
  implicit class SchemaOriginAuthenticationMethodOps[Self <: SchemaOriginAuthenticationMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJwt(value: SchemaJwt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jwt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJwt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jwt")(js.undefined)
        ret
    }
  }
  
}

