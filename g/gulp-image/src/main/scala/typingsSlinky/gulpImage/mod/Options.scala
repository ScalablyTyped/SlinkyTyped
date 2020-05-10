package typingsSlinky.gulpImage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var concurrent: js.UndefOr[Double] = js.native
  var gifsicle: js.UndefOr[OptimizerSetting] = js.native
  var guetzli: js.UndefOr[OptimizerSetting] = js.native
  var jpegRecompress: js.UndefOr[OptimizerSetting] = js.native
  var mozjpeg: js.UndefOr[OptimizerSetting] = js.native
  var optipng: js.UndefOr[OptimizerSetting] = js.native
  var pngquant: js.UndefOr[OptimizerSetting] = js.native
  var quiet: js.UndefOr[Boolean] = js.native
  var svgo: js.UndefOr[OptimizerSetting] = js.native
  var zopflipng: js.UndefOr[OptimizerSetting] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConcurrent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcurrent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrent")(js.undefined)
        ret
    }
    @scala.inline
    def withGifsicle(value: OptimizerSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gifsicle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGifsicle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gifsicle")(js.undefined)
        ret
    }
    @scala.inline
    def withGuetzli(value: OptimizerSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guetzli")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuetzli: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guetzli")(js.undefined)
        ret
    }
    @scala.inline
    def withJpegRecompress(value: OptimizerSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jpegRecompress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJpegRecompress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jpegRecompress")(js.undefined)
        ret
    }
    @scala.inline
    def withMozjpeg(value: OptimizerSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mozjpeg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozjpeg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mozjpeg")(js.undefined)
        ret
    }
    @scala.inline
    def withOptipng(value: OptimizerSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optipng")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptipng: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optipng")(js.undefined)
        ret
    }
    @scala.inline
    def withPngquant(value: OptimizerSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pngquant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPngquant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pngquant")(js.undefined)
        ret
    }
    @scala.inline
    def withQuiet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quiet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuiet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quiet")(js.undefined)
        ret
    }
    @scala.inline
    def withSvgo(value: OptimizerSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvgo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgo")(js.undefined)
        ret
    }
    @scala.inline
    def withZopflipng(value: OptimizerSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zopflipng")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZopflipng: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zopflipng")(js.undefined)
        ret
    }
  }
  
}

