package typingsSlinky.nodeObjectHash.objectSorterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object sorter options
  */
@js.native
trait SorterOptions extends js.Object {
  /**
    * If `true` enables type coercion.
    * Advanced coerce options could be provided as object
    * @default true
    */
  var coerce: js.UndefOr[Boolean | CoerceOptions] = js.native
  /**
    * If `true` enables sorting.
    * Advanced sorting options could be provided as object
    * @default true
    */
  var sort: js.UndefOr[Boolean | SortOptions] = js.native
  /**
    * If `true` enables trimming and multiple whitespace replacement.
    * Advanced sorting options could be provided as object.
    * @default false
    */
  var trim: js.UndefOr[Boolean | TrimOptions] = js.native
}

object SorterOptions {
  @scala.inline
  def apply(): SorterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SorterOptions]
  }
  @scala.inline
  implicit class SorterOptionsOps[Self <: SorterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoerce(value: Boolean | CoerceOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coerce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoerce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coerce")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: Boolean | SortOptions): Self = {
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
    def withTrim(value: Boolean | TrimOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(js.undefined)
        ret
    }
  }
  
}

