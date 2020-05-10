package typingsSlinky.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExpectUserCallback extends js.Object {
  var expectUserCallback: js.UndefOr[Boolean] = js.native
  var keepInQueue: js.UndefOr[Boolean] = js.native
}

object AnonExpectUserCallback {
  @scala.inline
  def apply(): AnonExpectUserCallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonExpectUserCallback]
  }
  @scala.inline
  implicit class AnonExpectUserCallbackOps[Self <: AnonExpectUserCallback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpectUserCallback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectUserCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpectUserCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectUserCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepInQueue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepInQueue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepInQueue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepInQueue")(js.undefined)
        ret
    }
  }
  
}

