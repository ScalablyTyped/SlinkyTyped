package typingsSlinky.chunkedDc.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XSpec extends js.Object {
  var id: Double = js.native
  def runs(): Unit = js.native
}

object XSpec {
  @scala.inline
  def apply(id: Double, runs: () => Unit): XSpec = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], runs = js.Any.fromFunction0(runs))
    __obj.asInstanceOf[XSpec]
  }
  @scala.inline
  implicit class XSpecOps[Self <: XSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuns(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runs")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

