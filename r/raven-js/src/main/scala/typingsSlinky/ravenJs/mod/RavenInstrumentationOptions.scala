package typingsSlinky.ravenJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RavenInstrumentationOptions extends js.Object {
  var tryCatch: js.UndefOr[Boolean] = js.native
}

object RavenInstrumentationOptions {
  @scala.inline
  def apply(): RavenInstrumentationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RavenInstrumentationOptions]
  }
  @scala.inline
  implicit class RavenInstrumentationOptionsOps[Self <: RavenInstrumentationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTryCatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryCatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTryCatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryCatch")(js.undefined)
        ret
    }
  }
  
}

