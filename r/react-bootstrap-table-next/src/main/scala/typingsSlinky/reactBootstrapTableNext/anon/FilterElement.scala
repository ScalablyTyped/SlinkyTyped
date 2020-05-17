package typingsSlinky.reactBootstrapTableNext.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterElement extends js.Object {
  var filterElement: ReactElement = js.native
  var sortElement: ReactElement = js.native
}

object FilterElement {
  @scala.inline
  def apply(filterElement: ReactElement, sortElement: ReactElement): FilterElement = {
    val __obj = js.Dynamic.literal(filterElement = filterElement.asInstanceOf[js.Any], sortElement = sortElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterElement]
  }
  @scala.inline
  implicit class FilterElementOps[Self <: FilterElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortElement")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

