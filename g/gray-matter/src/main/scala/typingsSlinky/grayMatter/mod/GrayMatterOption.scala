package typingsSlinky.grayMatter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrayMatterOption extends js.Object {
  var delims: String = js.native
  var eval: js.UndefOr[Boolean] = js.native
  var lang: js.UndefOr[String] = js.native
  var parser: js.UndefOr[js.Function] = js.native
}

object GrayMatterOption {
  @scala.inline
  def apply(delims: String): GrayMatterOption = {
    val __obj = js.Dynamic.literal(delims = delims.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrayMatterOption]
  }
  @scala.inline
  implicit class GrayMatterOptionOps[Self <: GrayMatterOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelims(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delims")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEval(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eval")(js.undefined)
        ret
    }
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(js.undefined)
        ret
    }
    @scala.inline
    def withParser(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(js.undefined)
        ret
    }
  }
  
}

