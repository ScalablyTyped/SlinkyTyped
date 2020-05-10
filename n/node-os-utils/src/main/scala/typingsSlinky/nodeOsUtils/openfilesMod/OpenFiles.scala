package typingsSlinky.nodeOsUtils.openfilesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenFiles extends js.Object {
  def openFd(): js.Promise[Double] = js.native
}

object OpenFiles {
  @scala.inline
  def apply(openFd: () => js.Promise[Double]): OpenFiles = {
    val __obj = js.Dynamic.literal(openFd = js.Any.fromFunction0(openFd))
    __obj.asInstanceOf[OpenFiles]
  }
  @scala.inline
  implicit class OpenFilesOps[Self <: OpenFiles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpenFd(value: () => js.Promise[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openFd")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

