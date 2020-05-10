package typingsSlinky.googleapis.surveysV2Mod.surveysV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Container object for image data and alt_text.
  */
@js.native
trait SchemaSurveyQuestionImage extends js.Object {
  /**
    * The alt text property used in image tags is required for all images.
    */
  var altText: js.UndefOr[String] = js.native
  /**
    * Inline jpeg, gif, tiff, bmp, or png image raw bytes for an image question
    * types.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * The read-only URL for the hosted images.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaSurveyQuestionImage {
  @scala.inline
  def apply(): SchemaSurveyQuestionImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSurveyQuestionImage]
  }
  @scala.inline
  implicit class SchemaSurveyQuestionImageOps[Self <: SchemaSurveyQuestionImage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altText")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

