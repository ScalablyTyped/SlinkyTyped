package typingsSlinky.reactNativeDatawedgeIntents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterObject extends js.Object {
  var filterActions: js.Array[String] = js.native
  var filterCategories: js.Array[String] = js.native
}

object FilterObject {
  @scala.inline
  def apply(filterActions: js.Array[String], filterCategories: js.Array[String]): FilterObject = {
    val __obj = js.Dynamic.literal(filterActions = filterActions.asInstanceOf[js.Any], filterCategories = filterCategories.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterObject]
  }
  @scala.inline
  implicit class FilterObjectOps[Self <: FilterObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterActions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterCategories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterCategories")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

