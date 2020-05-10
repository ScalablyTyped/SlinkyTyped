package typingsSlinky.googleapis.storagetransferV1Mod.storagetransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google service account
  */
@js.native
trait SchemaGoogleServiceAccount extends js.Object {
  /**
    * Required.
    */
  var accountEmail: js.UndefOr[String] = js.native
}

object SchemaGoogleServiceAccount {
  @scala.inline
  def apply(): SchemaGoogleServiceAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleServiceAccount]
  }
  @scala.inline
  implicit class SchemaGoogleServiceAccountOps[Self <: SchemaGoogleServiceAccount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountEmail")(js.undefined)
        ret
    }
  }
  
}

