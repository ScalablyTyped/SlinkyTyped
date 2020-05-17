package typingsSlinky.gatsbyImage.mod

import typingsSlinky.gatsbyImage.anon.WasCached
import typingsSlinky.gatsbyImage.gatsbyImageStrings.`lazy`
import typingsSlinky.gatsbyImage.gatsbyImageStrings.auto
import typingsSlinky.gatsbyImage.gatsbyImageStrings.eager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatsbyImageProps extends js.Object {
  var Tag: js.UndefOr[String] = js.native
  var alt: js.UndefOr[String] = js.native
  var backgroundColor: js.UndefOr[String | Boolean] = js.native
  var className: js.UndefOr[String | js.Object] = js.native
  var critical: js.UndefOr[Boolean] = js.native
  var crossOrigin: js.UndefOr[String | Boolean] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var durationFadeIn: js.UndefOr[Double] = js.native
  var fadeIn: js.UndefOr[Boolean] = js.native
  var fixed: js.UndefOr[FixedObject | js.Array[FixedObject]] = js.native
  var fluid: js.UndefOr[FluidObject | js.Array[FluidObject]] = js.native
  var imgStyle: js.UndefOr[js.Object] = js.native
  var itemProp: js.UndefOr[String] = js.native
  var loading: js.UndefOr[auto | `lazy` | eager] = js.native
  var onError: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.native
  var onStartLoad: js.UndefOr[js.Function1[/* param */ WasCached, Unit]] = js.native
  var placeholderClassName: js.UndefOr[String] = js.native
  var placeholderStyle: js.UndefOr[js.Object] = js.native
  var resolutions: js.UndefOr[FixedObject] = js.native
  var sizes: js.UndefOr[FluidObject] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var title: js.UndefOr[String] = js.native
}

object GatsbyImageProps {
  @scala.inline
  def apply(): GatsbyImageProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatsbyImageProps]
  }
  @scala.inline
  implicit class GatsbyImagePropsOps[Self <: GatsbyImageProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(js.undefined)
        ret
    }
    @scala.inline
    def withAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCritical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("critical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCritical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("critical")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossOrigin(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationFadeIn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationFadeIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationFadeIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationFadeIn")(js.undefined)
        ret
    }
    @scala.inline
    def withFadeIn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFadeIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeIn")(js.undefined)
        ret
    }
    @scala.inline
    def withFixed(value: FixedObject | js.Array[FixedObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(js.undefined)
        ret
    }
    @scala.inline
    def withFluid(value: FluidObject | js.Array[FluidObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fluid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFluid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fluid")(js.undefined)
        ret
    }
    @scala.inline
    def withImgStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImgStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withItemProp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemProp")(js.undefined)
        ret
    }
    @scala.inline
    def withLoading(value: auto | `lazy` | eager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: /* event */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStartLoad(value: /* param */ WasCached => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStartLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholderClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholderStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withResolutions(value: FixedObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutions")(js.undefined)
        ret
    }
    @scala.inline
    def withSizes(value: FluidObject): Self = {
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
    def withStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

