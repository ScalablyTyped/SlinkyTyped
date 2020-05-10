package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectFile extends js.Object {
  val ChangeTimeUtc: js.Date = js.native
  val CreationTimeUtc: js.Date = js.native
  val Extension: String = js.native
  val FileGUID: String = js.native
  val FileVer: IFileVer = js.native
  val ID: Double = js.native
  val LastAccessTimeUtc: js.Date = js.native
  val LastWriteTimeUtc: js.Date = js.native
  val LogicalSize: Double = js.native
  val LogicalSize_32bit: Double = js.native
  val Title: String = js.native
  val Version: Double = js.native
  def GetNameForFileSystem(): String = js.native
  def ToJSON(): String = js.native
}

object IObjectFile {
  @scala.inline
  def apply(
    ChangeTimeUtc: js.Date,
    CreationTimeUtc: js.Date,
    Extension: String,
    FileGUID: String,
    FileVer: IFileVer,
    GetNameForFileSystem: () => String,
    ID: Double,
    LastAccessTimeUtc: js.Date,
    LastWriteTimeUtc: js.Date,
    LogicalSize: Double,
    LogicalSize_32bit: Double,
    Title: String,
    ToJSON: () => String,
    Version: Double
  ): IObjectFile = {
    val __obj = js.Dynamic.literal(ChangeTimeUtc = ChangeTimeUtc.asInstanceOf[js.Any], CreationTimeUtc = CreationTimeUtc.asInstanceOf[js.Any], Extension = Extension.asInstanceOf[js.Any], FileGUID = FileGUID.asInstanceOf[js.Any], FileVer = FileVer.asInstanceOf[js.Any], GetNameForFileSystem = js.Any.fromFunction0(GetNameForFileSystem), ID = ID.asInstanceOf[js.Any], LastAccessTimeUtc = LastAccessTimeUtc.asInstanceOf[js.Any], LastWriteTimeUtc = LastWriteTimeUtc.asInstanceOf[js.Any], LogicalSize = LogicalSize.asInstanceOf[js.Any], LogicalSize_32bit = LogicalSize_32bit.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], ToJSON = js.Any.fromFunction0(ToJSON), Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectFile]
  }
  @scala.inline
  implicit class IObjectFileOps[Self <: IObjectFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeTimeUtc(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeTimeUtc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationTimeUtc(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTimeUtc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileGUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileGUID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileVer(value: IFileVer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileVer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetNameForFileSystem(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetNameForFileSystem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastAccessTimeUtc(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastAccessTimeUtc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastWriteTimeUtc(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastWriteTimeUtc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogicalSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicalSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogicalSize_32bit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicalSize_32bit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

