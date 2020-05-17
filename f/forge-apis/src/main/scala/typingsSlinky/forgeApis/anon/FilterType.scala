package typingsSlinky.forgeApis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterType extends js.Object {
  var filterExtensionType: js.UndefOr[js.Array[String]] = js.native
  var filterId: js.UndefOr[js.Array[String]] = js.native
  var filterType: js.UndefOr[js.Array[String]] = js.native
  var filterVersionNumber: js.UndefOr[js.Array[Double]] = js.native
  var pageLimit: js.UndefOr[Double] = js.native
  var pageNumber: js.UndefOr[Double] = js.native
}

object FilterType {
  @scala.inline
  def apply(): FilterType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterType]
  }
  @scala.inline
  implicit class FilterTypeOps[Self <: FilterType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterExtensionType(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterExtensionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterExtensionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterExtensionType")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterId(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterId")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterType(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterType")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterVersionNumber(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterVersionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterVersionNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterVersionNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withPageLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withPageNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageNumber")(js.undefined)
        ret
    }
  }
  
}

