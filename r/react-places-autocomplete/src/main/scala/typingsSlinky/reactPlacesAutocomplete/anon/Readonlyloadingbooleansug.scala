package typingsSlinky.reactPlacesAutocomplete.anon

import typingsSlinky.reactPlacesAutocomplete.mod.Suggestion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  loading  :boolean,   suggestions  :std.ReadonlyArray<react-places-autocomplete.react-places-autocomplete.Suggestion>, getInputProps <InputProps extends {}>(options ? : InputProps): {  type  :'text',   autoComplete  :'off',   role  :'combobox',   aria-autocomplete  :'list',   aria-expanded  :boolean,   aria-activedescendant  :string | undefined,   disabled  :boolean,   onKeyDown  :react.react.KeyboardEventHandler<std.Element>,   onBlur  :react.react.FocusEventHandler<std.Element>,   value  :string | undefined, onChange (ev : {  target  :{  value  :string}}): void} & InputProps, getSuggestionItemProps <SuggestionProps extends {}>(suggestion : react-places-autocomplete.react-places-autocomplete.Suggestion, options ? : SuggestionProps): {  key  :number,   id  :string | undefined,   role  :'option',   onMouseEnter  :react.react.MouseEventHandler<std.Element>,   onMouseLeave  :react.react.MouseEventHandler<std.Element>,   onMouseDown  :react.react.MouseEventHandler<std.Element>,   onMouseUp  :react.react.MouseEventHandler<std.Element>,   onTouchStart  :react.react.TouchEventHandler<std.Element>,   onTouchEnd  :react.react.TouchEventHandler<std.Element>,   onClick  :react.react.MouseEventHandler<std.Element>} & SuggestionProps}> */
@js.native
trait Readonlyloadingbooleansug extends js.Object {
  val getInputProps: js.Function1[/* options */ js.UndefOr[js.Object], Ariaactivedescendant with js.Object] = js.native
  val getSuggestionItemProps: js.Function2[/* suggestion */ Suggestion, /* options */ js.UndefOr[js.Object], Id with js.Object] = js.native
  val loading: Boolean = js.native
  val suggestions: js.Array[Suggestion] = js.native
}

object Readonlyloadingbooleansug {
  @scala.inline
  def apply(
    getInputProps: /* options */ js.UndefOr[js.Object] => Ariaactivedescendant with js.Object,
    getSuggestionItemProps: (/* suggestion */ Suggestion, /* options */ js.UndefOr[js.Object]) => Id with js.Object,
    loading: Boolean,
    suggestions: js.Array[Suggestion]
  ): Readonlyloadingbooleansug = {
    val __obj = js.Dynamic.literal(getInputProps = js.Any.fromFunction1(getInputProps), getSuggestionItemProps = js.Any.fromFunction2(getSuggestionItemProps), loading = loading.asInstanceOf[js.Any], suggestions = suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlyloadingbooleansug]
  }
  @scala.inline
  implicit class ReadonlyloadingbooleansugOps[Self <: Readonlyloadingbooleansug] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetInputProps(value: /* options */ js.UndefOr[js.Object] => Ariaactivedescendant with js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInputProps")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSuggestionItemProps(value: (/* suggestion */ Suggestion, /* options */ js.UndefOr[js.Object]) => Id with js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSuggestionItemProps")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggestions(value: js.Array[Suggestion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

