package typingsSlinky.extendedListbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBoxSettings extends js.Object {
  /** function which returns a array of items */
  var getItems: js.UndefOr[js.Function0[js.Array[String | ListBoxItem]]] = js.native
  /** callback for searchBar text changes */
  var onFilterChanged: js.UndefOr[js.Function1[/* event */ ListBoxEvent, Unit]] = js.native
  /** callback for doubleClick event on an item */
  var onItemDoubleClicked: js.UndefOr[js.Function1[/* event */ ListBoxEvent, Unit]] = js.native
  /** callback for enter keyPress event on an item */
  var onItemEnterPressed: js.UndefOr[js.Function1[/* event */ ListBoxEvent, Unit]] = js.native
  /** callback for item changes (item added, item removed, item order) */
  var onItemsChanged: js.UndefOr[js.Function1[/* event */ ListBoxEvent, Unit]] = js.native
  /** callback for selection changes */
  var onValueChanged: js.UndefOr[js.Function1[/* event */ ListBoxEvent, Unit]] = js.native
  /** determines if the searchBar is visible */
  var searchBar: js.UndefOr[Boolean] = js.native
  /** settings for the searchBar button */
  var searchBarButton: js.UndefOr[ListBoxSearchBarButtonOptions] = js.native
  /** watermark (placeholder) for the searchBar */
  var searchBarWatermark: js.UndefOr[String] = js.native
}

object ListBoxSettings {
  @scala.inline
  def apply(): ListBoxSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBoxSettings]
  }
  @scala.inline
  implicit class ListBoxSettingsOps[Self <: ListBoxSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetItems(value: () => js.Array[String | ListBoxItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItems")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFilterChanged(value: /* event */ ListBoxEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilterChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFilterChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilterChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemDoubleClicked(value: /* event */ ListBoxEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemDoubleClicked")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemDoubleClicked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemDoubleClicked")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemEnterPressed(value: /* event */ ListBoxEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemEnterPressed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemEnterPressed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemEnterPressed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemsChanged(value: /* event */ ListBoxEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemsChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemsChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemsChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValueChanged(value: /* event */ ListBoxEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnValueChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchBar")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchBarButton(value: ListBoxSearchBarButtonOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchBarButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchBarButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchBarButton")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchBarWatermark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchBarWatermark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchBarWatermark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchBarWatermark")(js.undefined)
        ret
    }
  }
  
}

