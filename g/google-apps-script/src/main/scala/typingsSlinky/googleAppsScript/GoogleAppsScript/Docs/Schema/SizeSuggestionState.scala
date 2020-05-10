package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeSuggestionState extends js.Object {
  var heightSuggested: js.UndefOr[Boolean] = js.native
  var widthSuggested: js.UndefOr[Boolean] = js.native
}

object SizeSuggestionState {
  @scala.inline
  def apply(): SizeSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeSuggestionState]
  }
  @scala.inline
  implicit class SizeSuggestionStateOps[Self <: SizeSuggestionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeightSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeightSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightSuggested")(js.undefined)
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

