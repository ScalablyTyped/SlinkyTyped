package typingsSlinky.jestReporters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBasename extends js.Object {
  var basename: String = js.native
  var dirname: String = js.native
}

object AnonBasename {
  @scala.inline
  def apply(basename: String, dirname: String): AnonBasename = {
    val __obj = js.Dynamic.literal(basename = basename.asInstanceOf[js.Any], dirname = dirname.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBasename]
  }
  @scala.inline
  implicit class AnonBasenameOps[Self <: AnonBasename] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirname")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

