package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFFolderContentItemType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFolderContentItem extends js.Object {
  val FolderContentItemType: MFFolderContentItemType = js.native
  val ObjectVersion: IObjectVersion = js.native
  val PropertyFolder: ITypedValue = js.native
  val TraditionalFolder: ILookup = js.native
  val View: IView = js.native
}

object IFolderContentItem {
  @scala.inline
  def apply(
    FolderContentItemType: MFFolderContentItemType,
    ObjectVersion: IObjectVersion,
    PropertyFolder: ITypedValue,
    TraditionalFolder: ILookup,
    View: IView
  ): IFolderContentItem = {
    val __obj = js.Dynamic.literal(FolderContentItemType = FolderContentItemType.asInstanceOf[js.Any], ObjectVersion = ObjectVersion.asInstanceOf[js.Any], PropertyFolder = PropertyFolder.asInstanceOf[js.Any], TraditionalFolder = TraditionalFolder.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFolderContentItem]
  }
  @scala.inline
  implicit class IFolderContentItemOps[Self <: IFolderContentItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFolderContentItemType(value: MFFolderContentItemType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FolderContentItemType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectVersion(value: IObjectVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyFolder(value: ITypedValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropertyFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTraditionalFolder(value: ILookup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TraditionalFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withView(value: IView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("View")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

