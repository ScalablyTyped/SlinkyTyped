package typingsSlinky.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedImigixAndSourceProps extends CommonProps {
  var attributeConfig: js.UndefOr[AttributeConfig] = js.native
  var disableLibraryParam: js.UndefOr[Boolean] = js.native
  var disableQualityByDPR: js.UndefOr[Boolean] = js.native
  var disableSrcSet: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var imgixParams: js.UndefOr[ImigixParams] = js.native
  var sizes: js.UndefOr[String] = js.native
  var src: String = js.native
  var width: js.UndefOr[Double] = js.native
}

object SharedImigixAndSourceProps {
  @scala.inline
  def apply(src: String): SharedImigixAndSourceProps = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedImigixAndSourceProps]
  }
  @scala.inline
  implicit class SharedImigixAndSourcePropsOps[Self <: SharedImigixAndSourceProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributeConfig(value: AttributeConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableLibraryParam(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableLibraryParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableLibraryParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableLibraryParam")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableQualityByDPR(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableQualityByDPR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableQualityByDPR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableQualityByDPR")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableSrcSet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSrcSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableSrcSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSrcSet")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withImgixParams(value: ImigixParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgixParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImgixParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgixParams")(js.undefined)
        ret
    }
    @scala.inline
    def withSizes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

