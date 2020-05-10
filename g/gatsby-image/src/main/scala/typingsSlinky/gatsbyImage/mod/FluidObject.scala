package typingsSlinky.gatsbyImage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FluidObject extends js.Object {
  var aspectRatio: Double = js.native
  var base64: js.UndefOr[String] = js.native
  var media: js.UndefOr[String] = js.native
  var sizes: String = js.native
  var src: String = js.native
  var srcSet: String = js.native
  var srcSetWebp: js.UndefOr[String] = js.native
  var srcWebp: js.UndefOr[String] = js.native
  var tracedSVG: js.UndefOr[String] = js.native
}

object FluidObject {
  @scala.inline
  def apply(aspectRatio: Double, sizes: String, src: String, srcSet: String): FluidObject = {
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], srcSet = srcSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[FluidObject]
  }
  @scala.inline
  implicit class FluidObjectOps[Self <: FluidObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAspectRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrcSet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase64(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase64: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base64")(js.undefined)
        ret
    }
    @scala.inline
    def withMedia(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(js.undefined)
        ret
    }
    @scala.inline
    def withSrcSetWebp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcSetWebp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrcSetWebp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcSetWebp")(js.undefined)
        ret
    }
    @scala.inline
    def withSrcWebp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcWebp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrcWebp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcWebp")(js.undefined)
        ret
    }
    @scala.inline
    def withTracedSVG(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracedSVG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTracedSVG: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracedSVG")(js.undefined)
        ret
    }
  }
  
}

