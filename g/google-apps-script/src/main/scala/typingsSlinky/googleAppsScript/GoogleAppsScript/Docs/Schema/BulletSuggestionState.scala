package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulletSuggestionState extends js.Object {
  var listIdSuggested: js.UndefOr[Boolean] = js.native
  var nestingLevelSuggested: js.UndefOr[Boolean] = js.native
  var textStyleSuggestionState: js.UndefOr[TextStyleSuggestionState] = js.native
}

object BulletSuggestionState {
  @scala.inline
  def apply(): BulletSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulletSuggestionState]
  }
  @scala.inline
  implicit class BulletSuggestionStateOps[Self <: BulletSuggestionState] (val x: Self) extends AnyVal {
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
    def withTextStyleSuggestionState(value: TextStyleSuggestionState): Self = {
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

