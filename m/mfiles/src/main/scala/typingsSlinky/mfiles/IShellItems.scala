package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShellItems extends js.Object {
  val Count: Double = js.native
  val Folders: IFolderDefs = js.native
  val ObjectFiles: IObjectFileAndObjVerOfMultipleFiles = js.native
  val ObjectVersions: IObjectVersions = js.native
  val ObjectVersionsAndProperties: IObjectVersionAndPropertiesOfMultipleObjects = js.native
  def GetObjectVersionsCount(): Double = js.native
}

object IShellItems {
  @scala.inline
  def apply(
    Count: Double,
    Folders: IFolderDefs,
    GetObjectVersionsCount: () => Double,
    ObjectFiles: IObjectFileAndObjVerOfMultipleFiles,
    ObjectVersions: IObjectVersions,
    ObjectVersionsAndProperties: IObjectVersionAndPropertiesOfMultipleObjects
  ): IShellItems = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Folders = Folders.asInstanceOf[js.Any], GetObjectVersionsCount = js.Any.fromFunction0(GetObjectVersionsCount), ObjectFiles = ObjectFiles.asInstanceOf[js.Any], ObjectVersions = ObjectVersions.asInstanceOf[js.Any], ObjectVersionsAndProperties = ObjectVersionsAndProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShellItems]
  }
  @scala.inline
  implicit class IShellItemsOps[Self <: IShellItems] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFolders(value: IFolderDefs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Folders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetObjectVersionsCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetObjectVersionsCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withObjectFiles(value: IObjectFileAndObjVerOfMultipleFiles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectVersions(value: IObjectVersions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectVersionsAndProperties(value: IObjectVersionAndPropertiesOfMultipleObjects): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectVersionsAndProperties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

