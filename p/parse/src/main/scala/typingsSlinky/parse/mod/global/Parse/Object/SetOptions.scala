package typingsSlinky.parse.mod.global.Parse.Object

import typingsSlinky.parse.mod.global.Parse.ErrorOption
import typingsSlinky.parse.mod.global.Parse.SilentOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetOptions
  extends ErrorOption
     with SilentOption {
  var promise: js.UndefOr[js.Any] = js.native
}

object SetOptions {
  @scala.inline
  def apply(): SetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetOptions]
  }
  @scala.inline
  implicit class SetOptionsOps[Self <: SetOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPromise(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromise: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promise")(js.undefined)
        ret
    }
  }
  
}

