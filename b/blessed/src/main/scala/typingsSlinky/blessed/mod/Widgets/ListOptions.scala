package typingsSlinky.blessed.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOptions[TStyle /* <: ListElementStyle */] extends BoxOptions {
  /**
    * Whether the list is interactive and can have items selected (Default: true).
    */
  var interactive: js.UndefOr[Boolean] = js.native
  /**
    * Whether to automatically override tags and invert fg of item when selected (Default: true).
    */
  var invertSelected: js.UndefOr[Boolean] = js.native
  /**
    * An array of strings which become the list's items.
    */
  var items: js.UndefOr[js.Array[String]] = js.native
  /**
    * A function that is called when vi mode is enabled and the key / is pressed. This function accepts a
    * callback function which should be called with the search string. The search string is then used to
    * jump to an item that is found in items.
    */
  var search: js.UndefOr[js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]] = js.native
  /**
    * Style for a selected item. Style for an unselected item.
    */
  @JSName("style")
  var style_ListOptions: js.UndefOr[TStyle] = js.native
}

object ListOptions {
  @scala.inline
  def apply[TStyle](): ListOptions[TStyle] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOptions[TStyle]]
  }
  @scala.inline
  implicit class ListOptionsOps[Self[tstyle] <: ListOptions[tstyle], TStyle] (val x: Self[TStyle]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TStyle] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TStyle]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TStyle] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TStyle] with Other]
    @scala.inline
    def withInteractive(value: Boolean): Self[TStyle] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractive: Self[TStyle] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(js.undefined)
        ret
    }
    @scala.inline
    def withInvertSelected(value: Boolean): Self[TStyle] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invertSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvertSelected: Self[TStyle] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invertSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[String]): Self[TStyle] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self[TStyle] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch(value: (/* err */ js.Any, /* value */ js.UndefOr[String]) => Unit): Self[TStyle] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSearch: Self[TStyle] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: TStyle): Self[TStyle] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self[TStyle] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

