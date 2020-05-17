package typingsSlinky.hexoUtil.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoDetect extends js.Object {
  var autoDetect: js.UndefOr[Boolean] = js.native
  var caption: js.UndefOr[String] = js.native
  var firstLine: js.UndefOr[Double] = js.native
  var gutter: js.UndefOr[Boolean] = js.native
  var hljs: js.UndefOr[Boolean] = js.native
  var lang: js.UndefOr[String] = js.native
  var mark: js.UndefOr[js.Array[Double]] = js.native
  var tab: js.UndefOr[String] = js.native
  var wrap: js.UndefOr[Boolean] = js.native
}

object AutoDetect {
  @scala.inline
  def apply(): AutoDetect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoDetect]
  }
  @scala.inline
  implicit class AutoDetectOps[Self <: AutoDetect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoDetect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDetect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDetect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDetect")(js.undefined)
        ret
    }
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstLine")(js.undefined)
        ret
    }
    @scala.inline
    def withGutter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGutter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutter")(js.undefined)
        ret
    }
    @scala.inline
    def withHljs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hljs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHljs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hljs")(js.undefined)
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
    def withMark(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark")(js.undefined)
        ret
    }
    @scala.inline
    def withTab(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab")(js.undefined)
        ret
    }
    @scala.inline
    def withWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(js.undefined)
        ret
    }
  }
  
}

