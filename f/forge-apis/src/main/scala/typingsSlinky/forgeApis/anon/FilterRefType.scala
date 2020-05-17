package typingsSlinky.forgeApis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterRefType extends js.Object {
  var filterDirection: js.UndefOr[String] = js.native
  var filterExtensionType: js.UndefOr[js.Array[String]] = js.native
  var filterId: js.UndefOr[js.Array[String]] = js.native
  var filterRefType: js.UndefOr[String] = js.native
  var filterType: js.UndefOr[js.Array[String]] = js.native
}

object FilterRefType {
  @scala.inline
  def apply(): FilterRefType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterRefType]
  }
  @scala.inline
  implicit class FilterRefTypeOps[Self <: FilterRefType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterDirection")(js.undefined)
        ret
    }
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
    def withFilterRefType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterRefType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterRefType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterRefType")(js.undefined)
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
  }
  
}

