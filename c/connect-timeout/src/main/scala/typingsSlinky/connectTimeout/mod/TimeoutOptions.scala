package typingsSlinky.connectTimeout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @summary Interface for timeout options.
  * @interface
  */
@js.native
trait TimeoutOptions extends js.Object {
  /**
    * @summary Controls if this module will "respond" in the form of forwarding an error.
    * @type {boolean}
    */
  var respond: js.UndefOr[Boolean] = js.native
}

object TimeoutOptions {
  @scala.inline
  def apply(): TimeoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeoutOptions]
  }
  @scala.inline
  implicit class TimeoutOptionsOps[Self <: TimeoutOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRespond(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("respond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRespond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("respond")(js.undefined)
        ret
    }
  }
  
}

