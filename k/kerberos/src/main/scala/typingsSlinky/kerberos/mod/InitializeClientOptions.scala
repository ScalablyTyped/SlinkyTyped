package typingsSlinky.kerberos.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitializeClientOptions extends js.Object {
  /**
    * @description Optional integer used to set GSS flags. (e.g. GSS_C_DELEG_FLAG|GSS_C_MUTUAL_FLAG|GSS_C_SEQUENCE_FLAG will allow for forwarding credentials to the remote host)
    */
  var gssFlag: js.UndefOr[Double] = js.native
  /**
    * @description Optional GSS mech OID. Defaults to None (GSS_C_NO_OID). Other possible values are `GSS_MECH_OID_KRB5`, `GSS_MECH_OID_SPNEGO`
    */
  var mechOID: js.UndefOr[Double] = js.native
  /**
    * @description Optional string containing the client principal in the form '`user@realm`'
    */
  var principal: js.UndefOr[String] = js.native
}

object InitializeClientOptions {
  @scala.inline
  def apply(): InitializeClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitializeClientOptions]
  }
  @scala.inline
  implicit class InitializeClientOptionsOps[Self <: InitializeClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGssFlag(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gssFlag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGssFlag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gssFlag")(js.undefined)
        ret
    }
    @scala.inline
    def withMechOID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mechOID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMechOID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mechOID")(js.undefined)
        ret
    }
    @scala.inline
    def withPrincipal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrincipal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principal")(js.undefined)
        ret
    }
  }
  
}

