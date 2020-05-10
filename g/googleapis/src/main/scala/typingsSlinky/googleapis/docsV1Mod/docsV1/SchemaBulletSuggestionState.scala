package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base Bullet have been
  * changed in this suggestion. For any field set to true, there is a new
  * suggested value.
  */
@js.native
trait SchemaBulletSuggestionState extends js.Object {
  /**
    * Indicates if there was a suggested change to the list_id.
    */
  var listIdSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to the nesting_level.
    */
  var nestingLevelSuggested: js.UndefOr[Boolean] = js.native
  /**
    * A mask that indicates which of the fields in text style have been changed
    * in this suggestion.
    */
  var textStyleSuggestionState: js.UndefOr[SchemaTextStyleSuggestionState] = js.native
}

object SchemaBulletSuggestionState {
  @scala.inline
  def apply(): SchemaBulletSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBulletSuggestionState]
  }
  @scala.inline
  implicit class SchemaBulletSuggestionStateOps[Self <: SchemaBulletSuggestionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withListIdSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listIdSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListIdSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listIdSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withNestingLevelSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestingLevelSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNestingLevelSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestingLevelSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStyleSuggestionState(value: SchemaTextStyleSuggestionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyleSuggestionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextStyleSuggestionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyleSuggestionState")(js.undefined)
        ret
    }
  }
  
}

