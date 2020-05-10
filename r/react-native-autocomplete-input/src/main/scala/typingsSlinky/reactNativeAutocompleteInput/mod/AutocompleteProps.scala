package typingsSlinky.reactNativeAutocompleteInput.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.FlatListProps
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextInputProperties
import typingsSlinky.reactNative.mod.TextInputProps
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeAutocompleteInput.AnonIndex
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutocompleteProps[T] extends TextInputProps {
  /**
    * style
    * These styles will be applied to the container which surrounds the autocomplete component.
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * array
    * An array with suggestion items to be rendered in renderItem({ item, index }). Any array with length > 0 will open the suggestion list and any array with length < 1 will hide the list.
    */
  var data: js.Array[T] = js.native
  /**
    * object
    * Props to pass on to the underlying FlatList.
    */
  var flatListProps: js.UndefOr[Partial[FlatListProps[T]]] = js.native
  /**
    * bool
    * Set to true to hide the suggestion list.
    */
  var hideResults: js.UndefOr[Boolean] = js.native
  /**
    * style
    * These styles will be applied to the container which surrounds the textInput component.
    */
  var inputContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * function
    * keyExtractor will be called to get key for each item. It's up to you which string to return as a key.
    */
  var keyExtractor: js.UndefOr[js.Function2[/* item */ T, /* i */ Double, String]] = js.native
  /**
    * style
    * These styles will be applied to the container which surrounds the result list.
    */
  var listContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * style
    * These style will be applied to the result list.
    */
  var listStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * function
    * onShowResult will be called when the autocomplete suggestions appear or disappear.
    */
  var onShowResult: js.UndefOr[js.Function1[/* showResults */ Boolean, Unit]] = js.native
  /**
    * function
    * renderSeparator will be called to render the list separators which will be displayed between the list elements in the result view below the text input.
    */
  var renderSeparator: js.UndefOr[
    js.Function3[
      /* sectionID */ String | Double, 
      /* rowID */ String | Double, 
      /* adjacentRowHighlighted */ js.UndefOr[Boolean], 
      ReactElement
    ]
  ] = js.native
  /**
    * function
    * render custom TextInput. All props passed to this function.
    */
  var renderTextInput: js.UndefOr[js.Function1[/* props */ TextInputProperties, TagMod[Any]]] = js.native
  /**
    * function
    * renderItem will be called to render the data objects which will be displayed in the result view below the text input.
    */
  def renderItem(itemWithIndex: AnonIndex[T]): TagMod[Any] = js.native
}

object AutocompleteProps {
  @scala.inline
  def apply[T](data: js.Array[T], renderItem: AnonIndex[T] => TagMod[Any]): AutocompleteProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], renderItem = js.Any.fromFunction1(renderItem))
    __obj.asInstanceOf[AutocompleteProps[T]]
  }
  @scala.inline
  implicit class AutocompletePropsOps[Self[t] <: AutocompleteProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withData(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderItem(value: AnonIndex[T] => TagMod[Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContainerStyle(value: StyleProp[ViewStyle]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerStyleNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(null)
        ret
    }
    @scala.inline
    def withFlatListProps(value: Partial[FlatListProps[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatListProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlatListProps: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatListProps")(js.undefined)
        ret
    }
    @scala.inline
    def withHideResults(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideResults: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideResults")(js.undefined)
        ret
    }
    @scala.inline
    def withInputContainerStyle(value: StyleProp[ViewStyle]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputContainerStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withInputContainerStyleNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputContainerStyle")(null)
        ret
    }
    @scala.inline
    def withKeyExtractor(value: (/* item */ T, /* i */ Double) => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyExtractor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutKeyExtractor: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyExtractor")(js.undefined)
        ret
    }
    @scala.inline
    def withListContainerStyle(value: StyleProp[ViewStyle]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListContainerStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withListContainerStyleNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listContainerStyle")(null)
        ret
    }
    @scala.inline
    def withListStyle(value: StyleProp[ViewStyle]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withListStyleNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listStyle")(null)
        ret
    }
    @scala.inline
    def withOnShowResult(value: /* showResults */ Boolean => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowResult")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnShowResult: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowResult")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderSeparator(
      value: (/* sectionID */ String | Double, /* rowID */ String | Double, /* adjacentRowHighlighted */ js.UndefOr[Boolean]) => ReactElement
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSeparator")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRenderSeparator: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderTextInput(value: /* props */ TextInputProperties => TagMod[Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTextInput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderTextInput: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTextInput")(js.undefined)
        ret
    }
  }
  
}

