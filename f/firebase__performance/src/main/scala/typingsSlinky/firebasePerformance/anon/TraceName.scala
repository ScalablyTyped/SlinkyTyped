package typingsSlinky.firebasePerformance.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraceName extends js.Object {
  var traceName: String = js.native
}

object TraceName {
  @scala.inline
  def apply(traceName: String): TraceName = {
    val __obj = js.Dynamic.literal(traceName = traceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TraceName]
  }
  @scala.inline
  implicit class TraceNameOps[Self <: TraceName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTraceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

