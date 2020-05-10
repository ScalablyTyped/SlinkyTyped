package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityContext extends js.Object {
  /** The security types in this context. */
  var securities: js.UndefOr[js.Array[String]] = js.native
}

object SecurityContext {
  @scala.inline
  def apply(): SecurityContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityContext]
  }
  @scala.inline
  implicit class SecurityContextOps[Self <: SecurityContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecurities(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securities")(js.undefined)
        ret
    }
  }
  
}

