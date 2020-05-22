package typingsSlinky.ckeditor.anon

import typingsSlinky.ckeditor.CKEDITOR.filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  var filter: js.UndefOr[typingsSlinky.ckeditor.CKEDITOR.filter] = js.undefined
}

object Filter {
  @scala.inline
  def apply(filter: filter = null): Filter = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

