package typingsSlinky.forkTsCheckerWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCancellationFileName extends js.Object {
  var cancellationFileName: String = js.native
  var isCancelled: Boolean = js.native
}

object AnonCancellationFileName {
  @scala.inline
  def apply(cancellationFileName: String, isCancelled: Boolean): AnonCancellationFileName = {
    val __obj = js.Dynamic.literal(cancellationFileName = cancellationFileName.asInstanceOf[js.Any], isCancelled = isCancelled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancellationFileName]
  }
  @scala.inline
  implicit class AnonCancellationFileNameOps[Self <: AnonCancellationFileName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancellationFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancellationFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCancelled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCancelled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

