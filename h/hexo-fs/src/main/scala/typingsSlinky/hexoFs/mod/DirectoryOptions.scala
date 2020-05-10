package typingsSlinky.hexoFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryOptions extends js.Object {
  var ignoreHidden: js.UndefOr[Boolean] = js.native
  var ignorePattern: js.UndefOr[js.RegExp] = js.native
}

object DirectoryOptions {
  @scala.inline
  def apply(): DirectoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryOptions]
  }
  @scala.inline
  implicit class DirectoryOptionsOps[Self <: DirectoryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnorePattern(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnorePattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePattern")(js.undefined)
        ret
    }
  }
  
}

