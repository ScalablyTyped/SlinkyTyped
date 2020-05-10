package typingsSlinky.magicString

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<magic-string.magic-string.SourceMapOptions> */
@js.native
trait PartialSourceMapOptions extends js.Object {
  var file: js.UndefOr[String] = js.native
  var hires: js.UndefOr[Boolean] = js.native
  var includeContent: js.UndefOr[Boolean] = js.native
  var source: js.UndefOr[String] = js.native
}

object PartialSourceMapOptions {
  @scala.inline
  def apply(): PartialSourceMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSourceMapOptions]
  }
  @scala.inline
  implicit class PartialSourceMapOptionsOps[Self <: PartialSourceMapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(js.undefined)
        ret
    }
    @scala.inline
    def withHires(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hires")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeContent")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

