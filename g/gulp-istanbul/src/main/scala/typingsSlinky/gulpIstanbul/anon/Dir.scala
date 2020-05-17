package typingsSlinky.gulpIstanbul.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dir extends js.Object {
  var dir: js.UndefOr[String] = js.native
}

object Dir {
  @scala.inline
  def apply(): Dir = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dir]
  }
  @scala.inline
  implicit class DirOps[Self <: Dir] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(js.undefined)
        ret
    }
  }
  
}

