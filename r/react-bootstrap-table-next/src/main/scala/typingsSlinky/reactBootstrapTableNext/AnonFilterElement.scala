package typingsSlinky.reactBootstrapTableNext

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFilterElement extends js.Object {
  var filterElement: ReactElement = js.native
  var sortElement: ReactElement = js.native
}

object AnonFilterElement {
  @scala.inline
  def apply(filterElement: ReactElement, sortElement: ReactElement): AnonFilterElement = {
    val __obj = js.Dynamic.literal(filterElement = filterElement.asInstanceOf[js.Any], sortElement = sortElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilterElement]
  }
  @scala.inline
  implicit class AnonFilterElementOps[Self <: AnonFilterElement] (val x: Self) extends AnyVal {
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

