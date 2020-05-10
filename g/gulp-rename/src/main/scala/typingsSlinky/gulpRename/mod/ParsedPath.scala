package typingsSlinky.gulpRename.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedPath extends js.Object {
  var basename: js.UndefOr[String] = js.native
  var dirname: js.UndefOr[String] = js.native
  var extname: js.UndefOr[String] = js.native
}

object ParsedPath {
  @scala.inline
  def apply(): ParsedPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParsedPath]
  }
  @scala.inline
  implicit class ParsedPathOps[Self <: ParsedPath] (val x: Self) extends AnyVal {
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
    def withoutBasename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basename")(js.undefined)
        ret
    }
    @scala.inline
    def withDirname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirname")(js.undefined)
        ret
    }
    @scala.inline
    def withExtname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extname")(js.undefined)
        ret
    }
  }
  
}

