package typingsSlinky.activexOutlook

import typingsSlinky.activexOutlook.Outlook.Search
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSearchObject extends js.Object {
  val SearchObject: Search = js.native
}

object AnonSearchObject {
  @scala.inline
  def apply(SearchObject: Search): AnonSearchObject = {
    val __obj = js.Dynamic.literal(SearchObject = SearchObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSearchObject]
  }
  @scala.inline
  implicit class AnonSearchObjectOps[Self <: AnonSearchObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSearchObject(value: Search): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchObject")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

