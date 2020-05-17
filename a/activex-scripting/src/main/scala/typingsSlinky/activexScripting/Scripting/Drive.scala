package typingsSlinky.activexScripting.Scripting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Drive Object */
@js.native
trait Drive extends js.Object {
  /** Get available space */
  val AvailableSpace: Double = js.native
  /** Drive letter */
  val DriveLetter: String = js.native
  /** Drive type */
  val DriveType: DriveTypeConst = js.native
  /** Filesystem type */
  val FileSystem: String = js.native
  /** Get drive free space */
  val FreeSpace: Double = js.native
  /** Check if disk is available */
  val IsReady: Boolean = js.native
  /** Path */
  val Path: String = js.native
  /** Root folder */
  val RootFolder: Folder = js.native
  @JSName("Scripting.Drive_typekey")
  var ScriptingDotDrive_typekey: Drive = js.native
  /** Serial number */
  val SerialNumber: Double = js.native
  /** Share name */
  val ShareName: String = js.native
  /** Get total drive size */
  val TotalSize: Double = js.native
  /** Name of volume */
  var VolumeName: String = js.native
}

object Drive {
  @scala.inline
  def apply(
    AvailableSpace: Double,
    DriveLetter: String,
    DriveType: DriveTypeConst,
    FileSystem: String,
    FreeSpace: Double,
    IsReady: Boolean,
    Path: String,
    RootFolder: Folder,
    ScriptingDotDrive_typekey: Drive,
    SerialNumber: Double,
    ShareName: String,
    TotalSize: Double,
    VolumeName: String
  ): Drive = {
    val __obj = js.Dynamic.literal(AvailableSpace = AvailableSpace.asInstanceOf[js.Any], DriveLetter = DriveLetter.asInstanceOf[js.Any], DriveType = DriveType.asInstanceOf[js.Any], FileSystem = FileSystem.asInstanceOf[js.Any], FreeSpace = FreeSpace.asInstanceOf[js.Any], IsReady = IsReady.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], RootFolder = RootFolder.asInstanceOf[js.Any], SerialNumber = SerialNumber.asInstanceOf[js.Any], ShareName = ShareName.asInstanceOf[js.Any], TotalSize = TotalSize.asInstanceOf[js.Any], VolumeName = VolumeName.asInstanceOf[js.Any])
    __obj.updateDynamic("Scripting.Drive_typekey")(ScriptingDotDrive_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Drive]
  }
  @scala.inline
  implicit class DriveOps[Self <: Drive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailableSpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailableSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDriveLetter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DriveLetter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDriveType(value: DriveTypeConst): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DriveType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileSystem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFreeSpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FreeSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsReady(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsReady")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootFolder(value: Folder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RootFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScriptingDotDrive_typekey(value: Drive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scripting.Drive_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerialNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SerialNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShareName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShareName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolumeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

