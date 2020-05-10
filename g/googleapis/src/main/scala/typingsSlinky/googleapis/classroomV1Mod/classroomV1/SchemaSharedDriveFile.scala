package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Drive file that is used as material for course work.
  */
@js.native
trait SchemaSharedDriveFile extends js.Object {
  /**
    * Drive file details.
    */
  var driveFile: js.UndefOr[SchemaDriveFile] = js.native
  /**
    * Mechanism by which students access the Drive item.
    */
  var shareMode: js.UndefOr[String] = js.native
}

object SchemaSharedDriveFile {
  @scala.inline
  def apply(): SchemaSharedDriveFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSharedDriveFile]
  }
  @scala.inline
  implicit class SchemaSharedDriveFileOps[Self <: SchemaSharedDriveFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDriveFile(value: SchemaDriveFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriveFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveFile")(js.undefined)
        ret
    }
    @scala.inline
    def withShareMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareMode")(js.undefined)
        ret
    }
  }
  
}

