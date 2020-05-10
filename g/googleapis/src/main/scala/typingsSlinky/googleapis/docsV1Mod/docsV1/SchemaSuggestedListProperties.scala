package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A suggested change to ListProperties.
  */
@js.native
trait SchemaSuggestedListProperties extends js.Object {
  /**
    * A ListProperties that only includes the changes made in this suggestion.
    * This can be used along with the list_properties_suggestion_state to see
    * which fields have changed and their new values.
    */
  var listProperties: js.UndefOr[SchemaListProperties] = js.native
  /**
    * A mask that indicates which of the fields on the base ListProperties have
    * been changed in this suggestion.
    */
  var listPropertiesSuggestionState: js.UndefOr[SchemaListPropertiesSuggestionState] = js.native
}

object SchemaSuggestedListProperties {
  @scala.inline
  def apply(): SchemaSuggestedListProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuggestedListProperties]
  }
  @scala.inline
  implicit class SchemaSuggestedListPropertiesOps[Self <: SchemaSuggestedListProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withListProperties(value: SchemaListProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withListPropertiesSuggestionState(value: SchemaListPropertiesSuggestionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPropertiesSuggestionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListPropertiesSuggestionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listPropertiesSuggestionState")(js.undefined)
        ret
    }
  }
  
}

