package typingsSlinky.officeUiFabricReact.imageTypesMod

import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IImageStyleProps extends js.Object {
  /**
    * Accept custom classNames
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Image height value
    */
  var height: js.UndefOr[Double | String] = js.native
  /**
    * ImageFit booleans for center, cover, contain, centerContain, centerCover, none
    */
  var isCenter: js.UndefOr[Boolean] = js.native
  var isCenterContain: js.UndefOr[Boolean] = js.native
  var isCenterCover: js.UndefOr[Boolean] = js.native
  var isContain: js.UndefOr[Boolean] = js.native
  var isCover: js.UndefOr[Boolean] = js.native
  /**
    * if true image load is in error
    */
  var isError: js.UndefOr[Boolean] = js.native
  /**
    * If true the image is coverStyle landscape instead of portrait
    */
  var isLandscape: js.UndefOr[Boolean] = js.native
  /**
    * If true, the image is loaded
    */
  var isLoaded: js.UndefOr[Boolean] = js.native
  var isNone: js.UndefOr[Boolean] = js.native
  /**
    * if true, imageFit is undefined
    */
  var isNotImageFit: js.UndefOr[Boolean] = js.native
  /**
    * If true, the image frame will expand to fill its parent container.
    */
  var maximizeFrame: js.UndefOr[Boolean] = js.native
  /**
    * If true, fades the image in when loaded.
    * @defaultvalue true
    */
  var shouldFadeIn: js.UndefOr[Boolean] = js.native
  /**
    * If true, the image starts as visible and is hidden on error. Otherwise, the image is hidden until
    * it is successfully loaded. This disables shouldFadeIn.
    * @defaultvalue false;
    */
  var shouldStartVisible: js.UndefOr[Boolean] = js.native
  /**
    * Accept theme prop.
    */
  var theme: ITheme = js.native
  /**
    * Image width value
    */
  var width: js.UndefOr[Double | String] = js.native
}

object IImageStyleProps {
  @scala.inline
  def apply(theme: ITheme): IImageStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IImageStyleProps]
  }
  @scala.inline
  implicit class IImageStylePropsOps[Self <: IImageStyleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
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
    def withHeight(value: Double | String): Self = {
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
    def withIsCenter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCenter")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCenterContain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCenterContain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCenterContain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCenterContain")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCenterCover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCenterCover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCenterCover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCenterCover")(js.undefined)
        ret
    }
    @scala.inline
    def withIsContain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isContain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsContain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isContain")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCover")(js.undefined)
        ret
    }
    @scala.inline
    def withIsError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isError")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLandscape(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLandscape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLandscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLandscape")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLoaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoaded")(js.undefined)
        ret
    }
    @scala.inline
    def withIsNone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsNone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNone")(js.undefined)
        ret
    }
    @scala.inline
    def withIsNotImageFit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNotImageFit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsNotImageFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNotImageFit")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximizeFrame(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximizeFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximizeFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximizeFrame")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldFadeIn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldFadeIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldFadeIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldFadeIn")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldStartVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldStartVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldStartVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldStartVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self = {
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

