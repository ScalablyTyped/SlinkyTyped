package typingsSlinky.pdfjsDist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalWorkerOptions extends js.Object {
  var workerSrc: String = js.native
}

object GlobalWorkerOptions {
  @scala.inline
  def apply(workerSrc: String): GlobalWorkerOptions = {
    val __obj = js.Dynamic.literal(workerSrc = workerSrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalWorkerOptions]
  }
  @scala.inline
  implicit class GlobalWorkerOptionsOps[Self <: GlobalWorkerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorkerSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerSrc")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

