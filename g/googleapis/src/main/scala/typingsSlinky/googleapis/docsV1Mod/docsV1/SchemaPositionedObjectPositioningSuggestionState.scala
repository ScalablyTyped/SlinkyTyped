package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base
  * PositionedObjectPositioning have been changed in this suggestion. For any
  * field set to true, there is a new suggested value.
  */
@js.native
trait SchemaPositionedObjectPositioningSuggestionState extends js.Object {
  /**
    * Indicates if there was a suggested change to layout.
    */
  var layoutSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to left_offset.
    */
  var leftOffsetSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to top_offset.
    */
  var topOffsetSuggested: js.UndefOr[Boolean] = js.native
}

object SchemaPositionedObjectPositioningSuggestionState {
  @scala.inline
  def apply(): SchemaPositionedObjectPositioningSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPositionedObjectPositioningSuggestionState]
  }
  @scala.inline
  implicit class SchemaPositionedObjectPositioningSuggestionStateOps[Self <: SchemaPositionedObjectPositioningSuggestionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayoutSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftOffsetSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftOffsetSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftOffsetSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftOffsetSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withTopOffsetSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topOffsetSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopOffsetSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topOffsetSuggested")(js.undefined)
        ret
    }
  }
  
}

