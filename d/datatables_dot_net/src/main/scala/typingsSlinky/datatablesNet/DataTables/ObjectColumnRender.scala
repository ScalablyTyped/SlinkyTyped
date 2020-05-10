package typingsSlinky.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectColumnRender extends js.Object {
  @JSName("_")
  var _underscore: js.UndefOr[String | Double | FunctionColumnRender] = js.native
  var display: js.UndefOr[String | Double | FunctionColumnRender] = js.native
  var filter: js.UndefOr[String | Double | FunctionColumnRender] = js.native
  var sort: js.UndefOr[String | Double | FunctionColumnRender] = js.native
  var `type`: js.UndefOr[String | Double | FunctionColumnRender] = js.native
}

object ObjectColumnRender {
  @scala.inline
  def apply(): ObjectColumnRender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectColumnRender]
  }
  @scala.inline
  implicit class ObjectColumnRenderOps[Self <: ObjectColumnRender] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_underscoreFunction4(
      value: (/* data */ js.Any, /* type */ js.Any, /* row */ js.Any, /* meta */ CellMetaSettings) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def with_underscore(value: String | Double | FunctionColumnRender): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_underscore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayFunction4(
      value: (/* data */ js.Any, /* type */ js.Any, /* row */ js.Any, /* meta */ CellMetaSettings) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withDisplay(value: String | Double | FunctionColumnRender): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterFunction4(
      value: (/* data */ js.Any, /* type */ js.Any, /* row */ js.Any, /* meta */ CellMetaSettings) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withFilter(value: String | Double | FunctionColumnRender): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withSortFunction4(
      value: (/* data */ js.Any, /* type */ js.Any, /* row */ js.Any, /* meta */ CellMetaSettings) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSort(value: String | Double | FunctionColumnRender): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeFunction4(
      value: (/* data */ js.Any, /* type */ js.Any, /* row */ js.Any, /* meta */ CellMetaSettings) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withType(value: String | Double | FunctionColumnRender): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

