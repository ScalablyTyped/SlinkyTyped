package typingsSlinky.browserSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagNamesOptions extends js.Object {
  var css: js.UndefOr[String] = js.native
  var gif: js.UndefOr[String] = js.native
  var jpeg: js.UndefOr[String] = js.native
  var jpg: js.UndefOr[String] = js.native
  @JSName("js")
  var js_ : js.UndefOr[String] = js.native
  var less: js.UndefOr[String] = js.native
  var png: js.UndefOr[String] = js.native
  var scss: js.UndefOr[String] = js.native
  var svg: js.UndefOr[String] = js.native
}

object TagNamesOptions {
  @scala.inline
  def apply(): TagNamesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagNamesOptions]
  }
  @scala.inline
  implicit class TagNamesOptionsOps[Self <: TagNamesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCss(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(js.undefined)
        ret
    }
    @scala.inline
    def withGif(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gif")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGif: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gif")(js.undefined)
        ret
    }
    @scala.inline
    def withJpeg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jpeg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJpeg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jpeg")(js.undefined)
        ret
    }
    @scala.inline
    def withJpg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jpg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJpg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jpg")(js.undefined)
        ret
    }
    @scala.inline
    def withJs_(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("js")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJs_ : Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("js")(js.undefined)
        ret
    }
    @scala.inline
    def withLess(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("less")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("less")(js.undefined)
        ret
    }
    @scala.inline
    def withPng(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("png")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPng: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("png")(js.undefined)
        ret
    }
    @scala.inline
    def withScss(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scss")(js.undefined)
        ret
    }
    @scala.inline
    def withSvg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svg")(js.undefined)
        ret
    }
  }
  
}

