package typingsSlinky.parse.mod._Global_.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseMasterKeyOption extends js.Object {
  /**
    * In Cloud Code and Node only, causes the Master Key to be used for this request.
    */
  var useMasterKey: js.UndefOr[Boolean] = js.native
}

object UseMasterKeyOption {
  @scala.inline
  def apply(): UseMasterKeyOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseMasterKeyOption]
  }
  @scala.inline
  implicit class UseMasterKeyOptionOps[Self <: UseMasterKeyOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUseMasterKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMasterKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseMasterKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMasterKey")(js.undefined)
        ret
    }
  }
  
}

