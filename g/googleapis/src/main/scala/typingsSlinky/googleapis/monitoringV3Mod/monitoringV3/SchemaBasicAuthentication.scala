package typingsSlinky.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type of authentication to perform against the specified resource or URL
  * that uses username and password. Currently, only Basic authentication is
  * supported in Uptime Monitoring.
  */
@js.native
trait SchemaBasicAuthentication extends js.Object {
  /**
    * The password to authenticate.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * The username to authenticate.
    */
  var username: js.UndefOr[String] = js.native
}

object SchemaBasicAuthentication {
  @scala.inline
  def apply(): SchemaBasicAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasicAuthentication]
  }
  @scala.inline
  implicit class SchemaBasicAuthenticationOps[Self <: SchemaBasicAuthentication] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
  }
  
}

