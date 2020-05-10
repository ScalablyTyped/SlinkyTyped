package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base EmbeddedObjectBorder
  * have been changed in this suggestion. For any field set to true, there is a
  * new suggested value.
  */
@js.native
trait SchemaEmbeddedObjectBorderSuggestionState extends js.Object {
  /**
    * Indicates if there was a suggested change to color.
    */
  var colorSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to dash_style.
    */
  var dashStyleSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to property_state.
    */
  var propertyStateSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to width.
    */
  var widthSuggested: js.UndefOr[Boolean] = js.native
}

object SchemaEmbeddedObjectBorderSuggestionState {
  @scala.inline
  def apply(): SchemaEmbeddedObjectBorderSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEmbeddedObjectBorderSuggestionState]
  }
  @scala.inline
  implicit class SchemaEmbeddedObjectBorderSuggestionStateOps[Self <: SchemaEmbeddedObjectBorderSuggestionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withDashStyleSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashStyleSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashStyleSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashStyleSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withPropertyStateSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyStateSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropertyStateSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyStateSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withWidthSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidthSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthSuggested")(js.undefined)
        ret
    }
  }
  
}

