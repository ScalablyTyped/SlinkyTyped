package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base
  * PositionedObjectProperties have been changed in this suggestion. For any
  * field set to true, there is a new suggested value.
  */
@js.native
trait SchemaPositionedObjectPropertiesSuggestionState extends js.Object {
  /**
    * A mask that indicates which of the fields in embedded_object have been
    * changed in this suggestion.
    */
  var embeddedObjectSuggestionState: js.UndefOr[SchemaEmbeddedObjectSuggestionState] = js.native
  /**
    * A mask that indicates which of the fields in positioning have been
    * changed in this suggestion.
    */
  var positioningSuggestionState: js.UndefOr[SchemaPositionedObjectPositioningSuggestionState] = js.native
}

object SchemaPositionedObjectPropertiesSuggestionState {
  @scala.inline
  def apply(): SchemaPositionedObjectPropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPositionedObjectPropertiesSuggestionState]
  }
  @scala.inline
  implicit class SchemaPositionedObjectPropertiesSuggestionStateOps[Self <: SchemaPositionedObjectPropertiesSuggestionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmbeddedObjectSuggestionState(value: SchemaEmbeddedObjectSuggestionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddedObjectSuggestionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbeddedObjectSuggestionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddedObjectSuggestionState")(js.undefined)
        ret
    }
    @scala.inline
    def withPositioningSuggestionState(value: SchemaPositionedObjectPositioningSuggestionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positioningSuggestionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositioningSuggestionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positioningSuggestionState")(js.undefined)
        ret
    }
  }
  
}

