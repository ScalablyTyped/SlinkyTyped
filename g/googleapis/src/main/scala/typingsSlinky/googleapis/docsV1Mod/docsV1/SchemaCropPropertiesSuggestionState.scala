package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base CropProperties have
  * been changed in this suggestion. For any field set to true, there is a new
  * suggested value.
  */
@js.native
trait SchemaCropPropertiesSuggestionState extends js.Object {
  /**
    * Indicates if there was a suggested change to angle.
    */
  var angleSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to offset_bottom.
    */
  var offsetBottomSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to offset_left.
    */
  var offsetLeftSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to offset_right.
    */
  var offsetRightSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to offset_top.
    */
  var offsetTopSuggested: js.UndefOr[Boolean] = js.native
}

object SchemaCropPropertiesSuggestionState {
  @scala.inline
  def apply(): SchemaCropPropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCropPropertiesSuggestionState]
  }
  @scala.inline
  implicit class SchemaCropPropertiesSuggestionStateOps[Self <: SchemaCropPropertiesSuggestionState] (val x: Self) extends AnyVal {
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
    def withOffsetBottomSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetBottomSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetBottomSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetBottomSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetLeftSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetLeftSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetLeftSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetLeftSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetRightSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetRightSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetRightSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetRightSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetTopSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetTopSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetTopSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetTopSuggested")(js.undefined)
        ret
    }
  }
  
}

