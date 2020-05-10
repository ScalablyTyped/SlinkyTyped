package typingsSlinky.nuclearJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactorConfig extends js.Object {
  /** If true it will log the entire app state for every dispatch. */
  var debug: js.UndefOr[Boolean] = js.native
}

object ReactorConfig {
  @scala.inline
  def apply(): ReactorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactorConfig]
  }
  @scala.inline
  implicit class ReactorConfigOps[Self <: ReactorConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
  }
  
}

