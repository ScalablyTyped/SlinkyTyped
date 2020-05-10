package typingsSlinky.ionicons.stencilCoreMod.JSXBase

import typingsSlinky.ionicons.ioniconsStrings.`lazy`
import typingsSlinky.ionicons.ioniconsStrings.async
import typingsSlinky.ionicons.ioniconsStrings.auto
import typingsSlinky.ionicons.ioniconsStrings.eager
import typingsSlinky.ionicons.ioniconsStrings.high
import typingsSlinky.ionicons.ioniconsStrings.low
import typingsSlinky.ionicons.ioniconsStrings.sync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImgHTMLAttributes[T] extends HTMLAttributes[T] {
  var alt: js.UndefOr[String] = js.native
  var decoding: js.UndefOr[async | auto | sync] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var importance: js.UndefOr[low | auto | high] = js.native
  var loading: js.UndefOr[`lazy` | auto | eager] = js.native
  var sizes: js.UndefOr[String] = js.native
  var src: js.UndefOr[String] = js.native
  var srcSet: js.UndefOr[String] = js.native
  var srcset: js.UndefOr[String] = js.native
  var useMap: js.UndefOr[String] = js.native
  var usemap: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double | String] = js.native
}

object ImgHTMLAttributes {
  @scala.inline
  def apply[T](): ImgHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImgHTMLAttributes[T]]
  }
  @scala.inline
  implicit class ImgHTMLAttributesOps[Self[t] <: ImgHTMLAttributes[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAlt(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlt: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(js.undefined)
        ret
    }
    @scala.inline
    def withDecoding(value: async | auto | sync): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecoding: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoding")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double | String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withImportance(value: low | auto | high): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportance: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importance")(js.undefined)
        ret
    }
    @scala.inline
    def withLoading(value: `lazy` | auto | eager): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoading: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.undefined)
        ret
    }
    @scala.inline
    def withSizes(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizes: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(js.undefined)
        ret
    }
    @scala.inline
    def withSrc(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrc: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(js.undefined)
        ret
    }
    @scala.inline
    def withSrcSet(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrcSet: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcSet")(js.undefined)
        ret
    }
    @scala.inline
    def withUseMap(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseMap: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMap")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

