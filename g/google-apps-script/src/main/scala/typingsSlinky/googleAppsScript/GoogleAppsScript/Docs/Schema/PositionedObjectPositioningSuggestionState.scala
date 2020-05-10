package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PositionedObjectPositioningSuggestionState extends js.Object {
  var layoutSuggested: js.UndefOr[Boolean] = js.native
  var leftOffsetSuggested: js.UndefOr[Boolean] = js.native
  var topOffsetSuggested: js.UndefOr[Boolean] = js.native
}

object PositionedObjectPositioningSuggestionState {
  @scala.inline
  def apply(): PositionedObjectPositioningSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionedObjectPositioningSuggestionState]
  }
  @scala.inline
  implicit class PositionedObjectPositioningSuggestionStateOps[Self <: PositionedObjectPositioningSuggestionState] (val x: Self) extends AnyVal {
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

