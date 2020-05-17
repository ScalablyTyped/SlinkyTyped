package typingsSlinky.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactInstantsearchCore.anon.Dictkey
import typingsSlinky.reactInstantsearchCore.anon.Max
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchState
  extends /* widgetId */ StringDictionary[js.Any] {
  var configure: js.UndefOr[Dictkey] = js.native
  var hierarchicalMenu: js.UndefOr[StringDictionary[String]] = js.native
  var hitsPerPage: js.UndefOr[Double] = js.native
  var indices: js.UndefOr[StringDictionary[typingsSlinky.reactInstantsearchCore.anon.Configure]] = js.native
  var menu: js.UndefOr[StringDictionary[String]] = js.native
  var multiRange: js.UndefOr[StringDictionary[String]] = js.native
  var page: js.UndefOr[Double] = js.native
  var query: js.UndefOr[String] = js.native
  var range: js.UndefOr[StringDictionary[Max]] = js.native
  var refinementList: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  var sortBy: js.UndefOr[String] = js.native
  var toggle: js.UndefOr[StringDictionary[Boolean]] = js.native
}

object SearchState {
  @scala.inline
  def apply(): SearchState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchState]
  }
  @scala.inline
  implicit class SearchStateOps[Self <: SearchState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigure(value: Dictkey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configure")(js.undefined)
        ret
    }
    @scala.inline
    def withHierarchicalMenu(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hierarchicalMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHierarchicalMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hierarchicalMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withHitsPerPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitsPerPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHitsPerPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitsPerPage")(js.undefined)
        ret
    }
    @scala.inline
    def withIndices(value: StringDictionary[typingsSlinky.reactInstantsearchCore.anon.Configure]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indices")(js.undefined)
        ret
    }
    @scala.inline
    def withMenu(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiRange(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiRange")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: StringDictionary[Max]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withRefinementList(value: StringDictionary[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refinementList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefinementList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refinementList")(js.undefined)
        ret
    }
    @scala.inline
    def withSortBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortBy")(js.undefined)
        ret
    }
    @scala.inline
    def withToggle(value: StringDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.undefined)
        ret
    }
  }
  
}

