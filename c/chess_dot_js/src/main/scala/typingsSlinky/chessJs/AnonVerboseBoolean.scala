package typingsSlinky.chessJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonVerboseBoolean extends js.Object {
  /**
    * Pass true if you want this function to output verbose objects
    * instead of strings.
    */
  var verbose: js.UndefOr[Boolean] = js.native
}

object AnonVerboseBoolean {
  @scala.inline
  def apply(): AnonVerboseBoolean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonVerboseBoolean]
  }
  @scala.inline
  implicit class AnonVerboseBooleanOps[Self <: AnonVerboseBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
  }
  
}

