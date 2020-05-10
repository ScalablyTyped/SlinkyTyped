package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmbeddedObjectBorderSuggestionState extends js.Object {
  var colorSuggested: js.UndefOr[Boolean] = js.native
  var dashStyleSuggested: js.UndefOr[Boolean] = js.native
  var propertyStateSuggested: js.UndefOr[Boolean] = js.native
  var widthSuggested: js.UndefOr[Boolean] = js.native
}

object EmbeddedObjectBorderSuggestionState {
  @scala.inline
  def apply(): EmbeddedObjectBorderSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmbeddedObjectBorderSuggestionState]
  }
  @scala.inline
  implicit class EmbeddedObjectBorderSuggestionStateOps[Self <: EmbeddedObjectBorderSuggestionState] (val x: Self) extends AnyVal {
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

