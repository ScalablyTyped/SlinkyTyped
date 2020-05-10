package typingsSlinky.gapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageContext extends js.Object {
  /** Parameters for crop hints annotation request. */
  var cropHintsParams: js.UndefOr[CropHintsParams] = js.native
  /**
    * List of languages to use for TEXT_DETECTION. In most cases, an empty value
    * yields the best results since it enables automatic language detection. For
    * languages based on the Latin alphabet, setting `language_hints` is not
    * needed. In rare cases, when the language of the text in the image is known,
    * setting a hint will help get better results (although it will be a
    * significant hindrance if the hint is wrong). Text detection returns an
    * error if one or more of the specified languages is not one of the
    * [supported languages](/vision/docs/languages).
    */
  var languageHints: js.UndefOr[js.Array[String]] = js.native
  /** lat/long rectangle that specifies the location of the image. */
  var latLongRect: js.UndefOr[LatLongRect] = js.native
}

object ImageContext {
  @scala.inline
  def apply(): ImageContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageContext]
  }
  @scala.inline
  implicit class ImageContextOps[Self <: ImageContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCropHintsParams(value: CropHintsParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropHintsParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCropHintsParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropHintsParams")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageHints(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageHints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageHints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageHints")(js.undefined)
        ret
    }
    @scala.inline
    def withLatLongRect(value: LatLongRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latLongRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatLongRect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latLongRect")(js.undefined)
        ret
    }
  }
  
}

