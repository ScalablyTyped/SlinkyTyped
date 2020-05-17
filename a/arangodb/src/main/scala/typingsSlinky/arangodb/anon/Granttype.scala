package typingsSlinky.arangodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Granttype extends js.Object {
  var grant_type: js.UndefOr[String] = js.native
}

object Granttype {
  @scala.inline
  def apply(): Granttype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Granttype]
  }
  @scala.inline
  implicit class GranttypeOps[Self <: Granttype] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrant_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grant_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrant_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grant_type")(js.undefined)
        ret
    }
  }
  
}

