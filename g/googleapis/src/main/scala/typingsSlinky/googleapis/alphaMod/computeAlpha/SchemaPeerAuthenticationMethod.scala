package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for the peer authentication method.
  */
@js.native
trait SchemaPeerAuthenticationMethod extends js.Object {
  /**
    * Set if mTLS is used for peer authentication.
    */
  var mtls: js.UndefOr[SchemaMutualTls] = js.native
}

object SchemaPeerAuthenticationMethod {
  @scala.inline
  def apply(): SchemaPeerAuthenticationMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPeerAuthenticationMethod]
  }
  @scala.inline
  implicit class SchemaPeerAuthenticationMethodOps[Self <: SchemaPeerAuthenticationMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMtls(value: SchemaMutualTls): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mtls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMtls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mtls")(js.undefined)
        ret
    }
  }
  
}

