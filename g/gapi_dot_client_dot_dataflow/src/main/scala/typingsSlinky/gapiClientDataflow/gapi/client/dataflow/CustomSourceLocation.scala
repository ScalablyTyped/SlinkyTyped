package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomSourceLocation extends js.Object {
  /** Whether this source is stateful. */
  var stateful: js.UndefOr[Boolean] = js.native
}

object CustomSourceLocation {
  @scala.inline
  def apply(): CustomSourceLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomSourceLocation]
  }
  @scala.inline
  implicit class CustomSourceLocationOps[Self <: CustomSourceLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStateful(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateful")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateful: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateful")(js.undefined)
        ret
    }
  }
  
}

