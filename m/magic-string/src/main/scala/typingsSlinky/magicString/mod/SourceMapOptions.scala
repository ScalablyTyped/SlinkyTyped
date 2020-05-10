package typingsSlinky.magicString.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceMapOptions extends js.Object {
  var file: String = js.native
  var hires: Boolean = js.native
  var includeContent: Boolean = js.native
  var source: String = js.native
}

object SourceMapOptions {
  @scala.inline
  def apply(file: String, hires: Boolean, includeContent: Boolean, source: String): SourceMapOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], hires = hires.asInstanceOf[js.Any], includeContent = includeContent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMapOptions]
  }
  @scala.inline
  implicit class SourceMapOptionsOps[Self <: SourceMapOptions] (val x: Self) extends AnyVal {
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
    def withHires(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

