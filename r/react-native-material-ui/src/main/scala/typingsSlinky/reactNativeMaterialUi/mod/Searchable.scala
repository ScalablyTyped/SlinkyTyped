package typingsSlinky.reactNativeMaterialUi.mod

import typingsSlinky.reactNativeMaterialUi.reactNativeMaterialUiStrings.characters
import typingsSlinky.reactNativeMaterialUi.reactNativeMaterialUiStrings.none
import typingsSlinky.reactNativeMaterialUi.reactNativeMaterialUiStrings.sentences
import typingsSlinky.reactNativeMaterialUi.reactNativeMaterialUiStrings.words
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Searchable extends js.Object {
  var autoCapitalize: js.UndefOr[none | sentences | words | characters] = js.native
  var autoCorrect: js.UndefOr[Boolean] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var onChangeText: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.native
  var onSearchCloseRequested: js.UndefOr[js.Function0[Unit]] = js.native
  var onSearchClosed: js.UndefOr[js.Function0[Unit]] = js.native
  var onSearchPressed: js.UndefOr[js.Function0[Unit]] = js.native
  var onSubmitEditing: js.UndefOr[js.Function0[Unit]] = js.native
  var placeholder: js.UndefOr[String] = js.native
}

object Searchable {
  @scala.inline
  def apply(): Searchable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Searchable]
  }
  @scala.inline
  implicit class SearchableOps[Self <: Searchable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoCapitalize(value: none | sentences | words | characters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCapitalize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCapitalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCapitalize")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCorrect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCorrect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCorrect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCorrect")(js.undefined)
        ret
    }
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
    def withOnChangeText(value: /* text */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChangeText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSearchCloseRequested(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearchCloseRequested")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSearchCloseRequested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearchCloseRequested")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSearchClosed(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearchClosed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSearchClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearchClosed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSearchPressed(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearchPressed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSearchPressed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearchPressed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubmitEditing(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmitEditing")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSubmitEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmitEditing")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
  }
  
}

