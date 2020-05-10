package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s email address.
  */
@js.native
trait SchemaEmailAddress extends js.Object {
  /**
    * The email address.
    */
  var emailAddress: js.UndefOr[String] = js.native
}

object SchemaEmailAddress {
  @scala.inline
  def apply(): SchemaEmailAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEmailAddress]
  }
  @scala.inline
  implicit class SchemaEmailAddressOps[Self <: SchemaEmailAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmailAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(js.undefined)
        ret
    }
  }
  
}

