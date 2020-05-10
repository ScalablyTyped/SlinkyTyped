package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericBookmarkEntry...
  */
@js.native
trait IGenericBookmarkEntry extends js.Object {
  /**
    * Information about the bookmark.
    */
  var qBookmark: INxBookmark = js.native
  /**
    * Information about the properties of the bookmark.
    */
  var qProperties: IGenericBookmarkProperties = js.native
}

object IGenericBookmarkEntry {
  @scala.inline
  def apply(qBookmark: INxBookmark, qProperties: IGenericBookmarkProperties): IGenericBookmarkEntry = {
    val __obj = js.Dynamic.literal(qBookmark = qBookmark.asInstanceOf[js.Any], qProperties = qProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericBookmarkEntry]
  }
  @scala.inline
  implicit class IGenericBookmarkEntryOps[Self <: IGenericBookmarkEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQBookmark(value: INxBookmark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qBookmark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQProperties(value: IGenericBookmarkProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qProperties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

