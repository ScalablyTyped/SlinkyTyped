package typingsSlinky.antd.cascaderMod

import slinky.core.TagMod
import typingsSlinky.antd.antdBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShowSearchType extends js.Object {
  var filter: js.UndefOr[
    js.Function3[
      /* inputValue */ String, 
      /* path */ js.Array[CascaderOptionType], 
      /* names */ FilledFieldNamesType, 
      Boolean
    ]
  ] = js.native
  var limit: js.UndefOr[Double | `false`] = js.native
  var matchInputWidth: js.UndefOr[Boolean] = js.native
  var render: js.UndefOr[
    js.Function4[
      /* inputValue */ String, 
      /* path */ js.Array[CascaderOptionType], 
      /* prefixCls */ js.UndefOr[String], 
      /* names */ FilledFieldNamesType, 
      TagMod[Any]
    ]
  ] = js.native
  var sort: js.UndefOr[
    js.Function4[
      /* a */ js.Array[CascaderOptionType], 
      /* b */ js.Array[CascaderOptionType], 
      /* inputValue */ String, 
      /* names */ FilledFieldNamesType, 
      Double
    ]
  ] = js.native
}

object ShowSearchType {
  @scala.inline
  def apply(): ShowSearchType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowSearchType]
  }
  @scala.inline
  implicit class ShowSearchTypeOps[Self <: ShowSearchType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(
      value: (/* inputValue */ String, /* path */ js.Array[CascaderOptionType], /* names */ FilledFieldNamesType) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchInputWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchInputWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchInputWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchInputWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(
      value: (/* inputValue */ String, /* path */ js.Array[CascaderOptionType], /* prefixCls */ js.UndefOr[String], /* names */ FilledFieldNamesType) => TagMod[Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(
      value: (/* a */ js.Array[CascaderOptionType], /* b */ js.Array[CascaderOptionType], /* inputValue */ String, /* names */ FilledFieldNamesType) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
  }
  
}

