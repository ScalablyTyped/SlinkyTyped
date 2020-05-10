package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base ImageProperties have
  * been changed in this suggestion. For any field set to true, there is a new
  * suggested value.
  */
@js.native
trait SchemaImagePropertiesSuggestionState extends js.Object {
  /**
    * Indicates if there was a suggested change to angle.
    */
  var angleSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to brightness.
    */
  var brightnessSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to content_uri.
    */
  var contentUriSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to contrast.
    */
  var contrastSuggested: js.UndefOr[Boolean] = js.native
  /**
    * A mask that indicates which of the fields in crop_properties have been
    * changed in this suggestion.
    */
  var cropPropertiesSuggestionState: js.UndefOr[SchemaCropPropertiesSuggestionState] = js.native
  /**
    * Indicates if there was a suggested change to source_uri.
    */
  var sourceUriSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to transparency.
    */
  var transparencySuggested: js.UndefOr[Boolean] = js.native
}

object SchemaImagePropertiesSuggestionState {
  @scala.inline
  def apply(): SchemaImagePropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImagePropertiesSuggestionState]
  }
  @scala.inline
  implicit class SchemaImagePropertiesSuggestionStateOps[Self <: SchemaImagePropertiesSuggestionState] (val x: Self) extends AnyVal {
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
    def withCropPropertiesSuggestionState(value: SchemaCropPropertiesSuggestionState): Self = {
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

