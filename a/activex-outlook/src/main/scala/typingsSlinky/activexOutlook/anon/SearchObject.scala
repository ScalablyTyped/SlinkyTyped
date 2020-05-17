package typingsSlinky.activexOutlook.anon

import typingsSlinky.activexOutlook.Outlook.Search
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchObject extends js.Object {
  val SearchObject: Search = js.native
}

object SearchObject {
  @scala.inline
  def apply(SearchObject: Search): SearchObject = {
    val __obj = js.Dynamic.literal(SearchObject = SearchObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchObject]
  }
  @scala.inline
  implicit class SearchObjectOps[Self <: SearchObject] (val x: Self) extends AnyVal {
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

