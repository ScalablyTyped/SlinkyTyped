package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISharedLinkInfo extends js.Object {
  val AccessKey: String = js.native
  val CreatedByUser: Double = js.native
  val CreationTime: ITimestamp = js.native
  var Description: String = js.native
  var ExpirationTime: ITimestamp = js.native
  var FileVer: IFileVer = js.native
  var ObjVer: IObjVer = js.native
  def Clone(): ISharedLinkInfo = js.native
  def Set(ObjVer: IObjVer, FileVer: IFileVer): Unit = js.native
}

object ISharedLinkInfo {
  @scala.inline
  def apply(
    AccessKey: String,
    Clone: () => ISharedLinkInfo,
    CreatedByUser: Double,
    CreationTime: ITimestamp,
    Description: String,
    ExpirationTime: ITimestamp,
    FileVer: IFileVer,
    ObjVer: IObjVer,
    Set: (IObjVer, IFileVer) => Unit
  ): ISharedLinkInfo = {
    val __obj = js.Dynamic.literal(AccessKey = AccessKey.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), CreatedByUser = CreatedByUser.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], ExpirationTime = ExpirationTime.asInstanceOf[js.Any], FileVer = FileVer.asInstanceOf[js.Any], ObjVer = ObjVer.asInstanceOf[js.Any], Set = js.Any.fromFunction2(Set))
    __obj.asInstanceOf[ISharedLinkInfo]
  }
  @scala.inline
  implicit class ISharedLinkInfoOps[Self <: ISharedLinkInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => ISharedLinkInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreatedByUser(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedByUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationTime(value: ITimestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpirationTime(value: ITimestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileVer(value: IFileVer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileVer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjVer(value: IObjVer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjVer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet(value: (IObjVer, IFileVer) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Set")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

