package typingsSlinky.less.Less_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceMapOption extends js.Object {
  var outputSourceFiles: js.UndefOr[Boolean] = js.native
  var sourceMapBasepath: js.UndefOr[String] = js.native
  var sourceMapFileInline: js.UndefOr[Boolean] = js.native
  var sourceMapRootpath: js.UndefOr[String] = js.native
  var sourceMapURL: js.UndefOr[String] = js.native
}

object SourceMapOption {
  @scala.inline
  def apply(): SourceMapOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceMapOption]
  }
  @scala.inline
  implicit class SourceMapOptionOps[Self <: SourceMapOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutputSourceFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputSourceFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputSourceFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputSourceFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMapBasepath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapBasepath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMapBasepath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapBasepath")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMapFileInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapFileInline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMapFileInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapFileInline")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMapRootpath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapRootpath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMapRootpath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapRootpath")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMapURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMapURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapURL")(js.undefined)
        ret
    }
  }
  
}

