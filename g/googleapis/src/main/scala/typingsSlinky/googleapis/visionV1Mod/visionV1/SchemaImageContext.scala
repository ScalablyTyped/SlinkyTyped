package typingsSlinky.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Image context and/or feature-specific parameters.
  */
@js.native
trait SchemaImageContext extends js.Object {
  /**
    * Parameters for crop hints annotation request.
    */
  var cropHintsParams: js.UndefOr[SchemaCropHintsParams] = js.native
  /**
    * List of languages to use for TEXT_DETECTION. In most cases, an empty
    * value yields the best results since it enables automatic language
    * detection. For languages based on the Latin alphabet, setting
    * `language_hints` is not needed. In rare cases, when the language of the
    * text in the image is known, setting a hint will help get better results
    * (although it will be a significant hindrance if the hint is wrong). Text
    * detection returns an error if one or more of the specified languages is
    * not one of the [supported languages](/vision/docs/languages).
    */
  var languageHints: js.UndefOr[js.Array[String]] = js.native
  /**
    * Not used.
    */
  var latLongRect: js.UndefOr[SchemaLatLongRect] = js.native
  /**
    * Parameters for product search.
    */
  var productSearchParams: js.UndefOr[SchemaProductSearchParams] = js.native
  /**
    * Parameters for web detection.
    */
  var webDetectionParams: js.UndefOr[SchemaWebDetectionParams] = js.native
}

object SchemaImageContext {
  @scala.inline
  def apply(): SchemaImageContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageContext]
  }
  @scala.inline
  implicit class SchemaImageContextOps[Self <: SchemaImageContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCropHintsParams(value: SchemaCropHintsParams): Self = {
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
    def withLatLongRect(value: SchemaLatLongRect): Self = {
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
    @scala.inline
    def withProductSearchParams(value: SchemaProductSearchParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productSearchParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductSearchParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productSearchParams")(js.undefined)
        ret
    }
    @scala.inline
    def withWebDetectionParams(value: SchemaWebDetectionParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webDetectionParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebDetectionParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webDetectionParams")(js.undefined)
        ret
    }
  }
  
}

