package typingsSlinky.mkdirp.mod

import typingsSlinky.mkdirp.Typeofmkdir
import typingsSlinky.mkdirp.Typeofstat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FsImplementation extends js.Object {
  var mkdir: Typeofmkdir = js.native
  var stat: Typeofstat = js.native
}

object FsImplementation {
  @scala.inline
  def apply(mkdir: Typeofmkdir, stat: Typeofstat): FsImplementation = {
    val __obj = js.Dynamic.literal(mkdir = mkdir.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[FsImplementation]
  }
  @scala.inline
  implicit class FsImplementationOps[Self <: FsImplementation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMkdir(value: Typeofmkdir): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mkdir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStat(value: Typeofstat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stat")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

