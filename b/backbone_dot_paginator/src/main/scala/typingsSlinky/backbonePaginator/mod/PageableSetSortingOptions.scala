package typingsSlinky.backbonePaginator.mod

import typingsSlinky.backbone.mod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageableSetSortingOptions[TModel /* <: Model */] extends js.Object {
  var full: js.UndefOr[Boolean] = js.native
  var side: js.UndefOr[String] = js.native
  var sortValue: js.UndefOr[js.Function2[/* model */ TModel, /* sortKey */ String, _ | String]] = js.native
}

object PageableSetSortingOptions {
  @scala.inline
  def apply[TModel](): PageableSetSortingOptions[TModel] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageableSetSortingOptions[TModel]]
  }
  @scala.inline
  implicit class PageableSetSortingOptionsOps[Self[tmodel] <: PageableSetSortingOptions[tmodel], TModel] (val x: Self[TModel]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TModel] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TModel]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TModel] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TModel] with Other]
    @scala.inline
    def withFull(value: Boolean): Self[TModel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFull: Self[TModel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full")(js.undefined)
        ret
    }
    @scala.inline
    def withSide(value: String): Self[TModel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSide: Self[TModel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(js.undefined)
        ret
    }
    @scala.inline
    def withSortValue(value: (/* model */ TModel, /* sortKey */ String) => _ | String): Self[TModel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSortValue: Self[TModel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortValue")(js.undefined)
        ret
    }
  }
  
}

