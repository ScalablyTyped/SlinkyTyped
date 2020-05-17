package typingsSlinky.reactInstantsearchDom.mod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLFormElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchBoxProps extends CommonWidgetProps {
  var autoFocus: js.UndefOr[Boolean] = js.native
  var defaultRefinement: js.UndefOr[String] = js.native
  var focusShortcuts: js.UndefOr[js.Array[String]] = js.native
  var loadingIndicator: js.UndefOr[ReactElement] = js.native
  var onChange: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLInputElement], _]] = js.native
  var onReset: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLFormElement], _]] = js.native
  var onSubmit: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLFormElement], _]] = js.native
  var reset: js.UndefOr[ReactElement] = js.native
  var searchAsYouType: js.UndefOr[Boolean] = js.native
  var showLoadingIndicator: js.UndefOr[Boolean] = js.native
  var submit: js.UndefOr[ReactElement] = js.native
}

object SearchBoxProps {
  @scala.inline
  def apply(): SearchBoxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBoxProps]
  }
  @scala.inline
  implicit class SearchBoxPropsOps[Self <: SearchBoxProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultRefinement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRefinement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRefinement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRefinement")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusShortcuts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusShortcuts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusShortcuts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusShortcuts")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingIndicator(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* event */ SyntheticEvent[Event, HTMLInputElement] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReset(value: /* event */ SyntheticEvent[Event, HTMLFormElement] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReset")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubmit(value: /* event */ SyntheticEvent[Event, HTMLFormElement] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withReset(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchAsYouType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchAsYouType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchAsYouType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchAsYouType")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLoadingIndicator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLoadingIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLoadingIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLoadingIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmit(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submit")(js.undefined)
        ret
    }
  }
  
}

