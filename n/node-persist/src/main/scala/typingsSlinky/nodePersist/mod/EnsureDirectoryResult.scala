package typingsSlinky.nodePersist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnsureDirectoryResult extends js.Object {
  var dir: String = js.native
}

object EnsureDirectoryResult {
  @scala.inline
  def apply(dir: String): EnsureDirectoryResult = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnsureDirectoryResult]
  }
  @scala.inline
  implicit class EnsureDirectoryResultOps[Self <: EnsureDirectoryResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

