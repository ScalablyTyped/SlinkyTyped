package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of of content files (Information about the list of content files)
  */
@js.native
trait IStaticContentList extends js.Object {
  var qItems: IStaticContentListItem = js.native
}

object IStaticContentList {
  @scala.inline
  def apply(qItems: IStaticContentListItem): IStaticContentList = {
    val __obj = js.Dynamic.literal(qItems = qItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStaticContentList]
  }
  @scala.inline
  implicit class IStaticContentListOps[Self <: IStaticContentList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQItems(value: IStaticContentListItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qItems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

