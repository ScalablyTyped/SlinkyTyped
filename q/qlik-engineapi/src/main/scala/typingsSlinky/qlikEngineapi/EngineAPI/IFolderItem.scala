package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FolderItem...
  */
@js.native
trait IFolderItem extends js.Object {
  /**
    * Name of the folder item.
    */
  var qName: String = js.native
  /**
    * Type of the folder item.
    */
  var qType: FolderItemType = js.native
}

object IFolderItem {
  @scala.inline
  def apply(qName: String, qType: FolderItemType): IFolderItem = {
    val __obj = js.Dynamic.literal(qName = qName.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFolderItem]
  }
  @scala.inline
  implicit class IFolderItemOps[Self <: IFolderItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQType(value: FolderItemType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

