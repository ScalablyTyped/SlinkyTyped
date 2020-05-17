package typingsSlinky.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait COMPLETIONSTATUSKHR extends js.Object {
  var COMPLETION_STATUS_KHR: Double = js.native
}

object COMPLETIONSTATUSKHR {
  @scala.inline
  def apply(COMPLETION_STATUS_KHR: Double): COMPLETIONSTATUSKHR = {
    val __obj = js.Dynamic.literal(COMPLETION_STATUS_KHR = COMPLETION_STATUS_KHR.asInstanceOf[js.Any])
    __obj.asInstanceOf[COMPLETIONSTATUSKHR]
  }
  @scala.inline
  implicit class COMPLETIONSTATUSKHROps[Self <: COMPLETIONSTATUSKHR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCOMPLETION_STATUS_KHR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("COMPLETION_STATUS_KHR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

