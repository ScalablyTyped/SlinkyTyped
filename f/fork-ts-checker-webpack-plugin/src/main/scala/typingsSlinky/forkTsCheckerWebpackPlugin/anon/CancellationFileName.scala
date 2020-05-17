package typingsSlinky.forkTsCheckerWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancellationFileName extends js.Object {
  var cancellationFileName: String = js.native
  var isCancelled: Boolean = js.native
}

object CancellationFileName {
  @scala.inline
  def apply(cancellationFileName: String, isCancelled: Boolean): CancellationFileName = {
    val __obj = js.Dynamic.literal(cancellationFileName = cancellationFileName.asInstanceOf[js.Any], isCancelled = isCancelled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancellationFileName]
  }
  @scala.inline
  implicit class CancellationFileNameOps[Self <: CancellationFileName] (val x: Self) extends AnyVal {
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

