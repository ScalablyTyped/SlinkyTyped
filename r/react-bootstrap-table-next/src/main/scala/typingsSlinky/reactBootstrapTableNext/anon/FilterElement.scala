package typingsSlinky.reactBootstrapTableNext.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterElement extends js.Object {
  var filterElement: ReactElement
  var sortElement: ReactElement
}

object FilterElement {
  @scala.inline
  def apply(filterElement: ReactElement, sortElement: ReactElement): FilterElement = {
    val __obj = js.Dynamic.literal(filterElement = filterElement.asInstanceOf[js.Any], sortElement = sortElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterElement]
  }
}

