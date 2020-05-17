package typingsSlinky.griddleReact.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.griddleReact.anon.FilterPlaceholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GriddleInitialState
  extends /* x */ StringDictionary[js.Any] {
  var enableSettings: js.UndefOr[Boolean] = js.native
  var pageProperties: js.UndefOr[GriddlePageProperties] = js.native
  var sortMethod: js.UndefOr[
    js.Function3[
      /* data */ js.Array[_], 
      /* column */ String, 
      /* sortAscending */ js.UndefOr[Boolean], 
      Double
    ]
  ] = js.native
  var sortProperties: js.UndefOr[js.Array[GriddleSortKey]] = js.native
  var textProperties: js.UndefOr[FilterPlaceholder] = js.native
}

object GriddleInitialState {
  @scala.inline
  def apply(): GriddleInitialState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddleInitialState]
  }
  @scala.inline
  implicit class GriddleInitialStateOps[Self <: GriddleInitialState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableSettings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withPageProperties(value: GriddlePageProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withSortMethod(
      value: (/* data */ js.Array[_], /* column */ String, /* sortAscending */ js.UndefOr[Boolean]) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortMethod")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSortMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withSortProperties(value: js.Array[GriddleSortKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withTextProperties(value: FilterPlaceholder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textProperties")(js.undefined)
        ret
    }
  }
  
}

