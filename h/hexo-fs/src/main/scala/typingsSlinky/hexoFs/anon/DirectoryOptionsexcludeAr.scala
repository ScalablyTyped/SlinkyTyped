package typingsSlinky.hexoFs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined hexo-fs.hexo-fs.DirectoryOptions & {  exclude ? :std.Array<string>} */
@js.native
trait DirectoryOptionsexcludeAr extends js.Object {
  var exclude: js.UndefOr[js.Array[String]] = js.native
  var ignoreHidden: js.UndefOr[Boolean] = js.native
  var ignorePattern: js.UndefOr[js.RegExp] = js.native
}

object DirectoryOptionsexcludeAr {
  @scala.inline
  def apply(): DirectoryOptionsexcludeAr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryOptionsexcludeAr]
  }
  @scala.inline
  implicit class DirectoryOptionsexcludeArOps[Self <: DirectoryOptionsexcludeAr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExclude(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
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

