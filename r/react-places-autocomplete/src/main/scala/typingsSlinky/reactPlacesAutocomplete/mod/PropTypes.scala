package typingsSlinky.reactPlacesAutocomplete.mod

import slinky.core.TagMod
import typingsSlinky.reactPlacesAutocomplete.anon.Bounds
import typingsSlinky.reactPlacesAutocomplete.anon.Readonlyloadingbooleansug
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropTypes extends js.Object {
  var debounce: js.UndefOr[Double] = js.native
  var googleCallbackName: js.UndefOr[String] = js.native
  var highlightFirstSuggestion: js.UndefOr[Boolean] = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  var onError: js.UndefOr[
    js.Function2[/* status */ String, /* clearSuggestion */ js.Function0[Unit], Unit]
  ] = js.native
  var onSelect: js.UndefOr[js.Function2[/* address */ String, /* placeID */ String, Unit]] = js.native
  var searchOptions: js.UndefOr[Bounds] = js.native
  var shouldFetchSuggestions: js.UndefOr[Boolean] = js.native
  var value: js.UndefOr[String] = js.native
  def children(opts: Readonlyloadingbooleansug): TagMod[Any] = js.native
}

object PropTypes {
  @scala.inline
  def apply(children: Readonlyloadingbooleansug => TagMod[Any]): PropTypes = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[PropTypes]
  }
  @scala.inline
  implicit class PropTypesOps[Self <: PropTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: Readonlyloadingbooleansug => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDebounce(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debounce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebounce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debounce")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogleCallbackName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleCallbackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleCallbackName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleCallbackName")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightFirstSuggestion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightFirstSuggestion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightFirstSuggestion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightFirstSuggestion")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* value */ String => Unit): Self = {
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
    def withOnError(value: (/* status */ String, /* clearSuggestion */ js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: (/* address */ String, /* placeID */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchOptions(value: Bounds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldFetchSuggestions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldFetchSuggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldFetchSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldFetchSuggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

