package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrantAccessResult extends js.Object {
  /**
    * A TemporaryCredential object that contains the data needed to log in to the instance by RDP clients, such as the Microsoft Remote Desktop Connection.
    */
  var TemporaryCredential: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.TemporaryCredential] = js.native
}

object GrantAccessResult {
  @scala.inline
  def apply(): GrantAccessResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrantAccessResult]
  }
  @scala.inline
  implicit class GrantAccessResultOps[Self <: GrantAccessResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTemporaryCredential(value: TemporaryCredential): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemporaryCredential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemporaryCredential: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemporaryCredential")(js.undefined)
        ret
    }
  }
  
}

