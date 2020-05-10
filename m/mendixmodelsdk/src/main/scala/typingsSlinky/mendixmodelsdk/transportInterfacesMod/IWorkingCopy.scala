package typingsSlinky.mendixmodelsdk.transportInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWorkingCopy extends js.Object {
  var changed: Boolean = js.native
  var id: String = js.native
  var isCollaboration: Boolean = js.native
  /**
    * OpenIDs of all users that are granted access.
    */
  var members: js.Array[String] = js.native
  var mergeData: ILockData | Null = js.native
  var metaData: IWorkingCopyMetaData = js.native
  /**
    * The name of the MPR file within the working copy's MPK, relative to its root.
    * This will typically but not necessarily equal `project.mpr`.
    */
  var mprFileName: String = js.native
  var mprMetaData: IMprMetaData = js.native
  var uploadDateTime: Double = js.native
}

object IWorkingCopy {
  @scala.inline
  def apply(
    changed: Boolean,
    id: String,
    isCollaboration: Boolean,
    members: js.Array[String],
    metaData: IWorkingCopyMetaData,
    mprFileName: String,
    mprMetaData: IMprMetaData,
    uploadDateTime: Double
  ): IWorkingCopy = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isCollaboration = isCollaboration.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], metaData = metaData.asInstanceOf[js.Any], mprFileName = mprFileName.asInstanceOf[js.Any], mprMetaData = mprMetaData.asInstanceOf[js.Any], uploadDateTime = uploadDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkingCopy]
  }
  @scala.inline
  implicit class IWorkingCopyOps[Self <: IWorkingCopy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChanged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCollaboration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCollaboration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMembers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetaData(value: IWorkingCopyMetaData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMprFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mprFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMprMetaData(value: IMprMetaData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mprMetaData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploadDateTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergeData(value: ILockData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergeDataNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeData")(null)
        ret
    }
  }
  
}

