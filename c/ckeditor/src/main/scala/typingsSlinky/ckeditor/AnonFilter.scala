package typingsSlinky.ckeditor

import typingsSlinky.ckeditor.CKEDITOR.filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilter extends js.Object {
  var filter: js.UndefOr[typingsSlinky.ckeditor.CKEDITOR.filter] = js.undefined
}

object AnonFilter {
  @scala.inline
  def apply(filter: filter = null): AnonFilter = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilter]
  }
}

