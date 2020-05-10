package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagePropertiesSuggestionState extends js.Object {
  var angleSuggested: js.UndefOr[Boolean] = js.native
  var brightnessSuggested: js.UndefOr[Boolean] = js.native
  var contentUriSuggested: js.UndefOr[Boolean] = js.native
  var contrastSuggested: js.UndefOr[Boolean] = js.native
  var cropPropertiesSuggestionState: js.UndefOr[CropPropertiesSuggestionState] = js.native
  var sourceUriSuggested: js.UndefOr[Boolean] = js.native
  var transparencySuggested: js.UndefOr[Boolean] = js.native
}

object ImagePropertiesSuggestionState {
  @scala.inline
  def apply(): ImagePropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagePropertiesSuggestionState]
  }
  @scala.inline
  implicit class ImagePropertiesSuggestionStateOps[Self <: ImagePropertiesSuggestionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngleSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angleSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngleSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angleSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withBrightnessSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightnessSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrightnessSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightnessSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withContentUriSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentUriSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentUriSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentUriSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withContrastSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contrastSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContrastSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contrastSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withCropPropertiesSuggestionState(value: CropPropertiesSuggestionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropPropertiesSuggestionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCropPropertiesSuggestionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropPropertiesSuggestionState")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceUriSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceUriSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceUriSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceUriSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withTransparencySuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparencySuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransparencySuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparencySuggested")(js.undefined)
        ret
    }
  }
  
}

