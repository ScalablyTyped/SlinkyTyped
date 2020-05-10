package typingsSlinky.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Scan authentication configuration.
  */
@js.native
trait SchemaAuthentication extends js.Object {
  /**
    * Authentication using a custom account.
    */
  var customAccount: js.UndefOr[SchemaCustomAccount] = js.native
  /**
    * Authentication using a Google account.
    */
  var googleAccount: js.UndefOr[SchemaGoogleAccount] = js.native
}

object SchemaAuthentication {
  @scala.inline
  def apply(): SchemaAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthentication]
  }
  @scala.inline
  implicit class SchemaAuthenticationOps[Self <: SchemaAuthentication] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomAccount(value: SchemaCustomAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAccount")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogleAccount(value: SchemaGoogleAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleAccount")(js.undefined)
        ret
    }
  }
  
}

