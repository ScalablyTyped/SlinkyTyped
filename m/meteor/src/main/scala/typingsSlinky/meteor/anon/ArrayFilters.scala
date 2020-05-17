package typingsSlinky.meteor.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayFilters extends js.Object {
  var arrayFilters: js.UndefOr[js.Array[StringDictionary[_]]] = js.native
  var multi: js.UndefOr[Boolean] = js.native
  var upsert: js.UndefOr[Boolean] = js.native
}

object ArrayFilters {
  @scala.inline
  def apply(): ArrayFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayFilters]
  }
  @scala.inline
  implicit class ArrayFiltersOps[Self <: ArrayFilters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayFilters(value: js.Array[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withMulti(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMulti: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi")(js.undefined)
        ret
    }
    @scala.inline
    def withUpsert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upsert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upsert")(js.undefined)
        ret
    }
  }
  
}

