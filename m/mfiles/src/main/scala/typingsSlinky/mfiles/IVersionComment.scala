package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVersionComment extends js.Object {
  val LastModifiedBy: IPropertyValue = js.native
  val ObjVer: IObjVer = js.native
  val StatusChanged: IPropertyValue = js.native
  val VersionComment: IPropertyValue = js.native
}

object IVersionComment {
  @scala.inline
  def apply(
    LastModifiedBy: IPropertyValue,
    ObjVer: IObjVer,
    StatusChanged: IPropertyValue,
    VersionComment: IPropertyValue
  ): IVersionComment = {
    val __obj = js.Dynamic.literal(LastModifiedBy = LastModifiedBy.asInstanceOf[js.Any], ObjVer = ObjVer.asInstanceOf[js.Any], StatusChanged = StatusChanged.asInstanceOf[js.Any], VersionComment = VersionComment.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVersionComment]
  }
  @scala.inline
  implicit class IVersionCommentOps[Self <: IVersionComment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastModifiedBy(value: IPropertyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjVer(value: IObjVer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjVer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusChanged(value: IPropertyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersionComment(value: IPropertyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionComment")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

