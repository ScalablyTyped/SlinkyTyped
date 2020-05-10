package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single device file description.
  */
@js.native
trait SchemaDeviceFile extends js.Object {
  /**
    * A reference to an opaque binary blob file
    */
  var obbFile: js.UndefOr[SchemaObbFile] = js.native
  /**
    * A reference to a regular file
    */
  var regularFile: js.UndefOr[SchemaRegularFile] = js.native
}

object SchemaDeviceFile {
  @scala.inline
  def apply(): SchemaDeviceFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceFile]
  }
  @scala.inline
  implicit class SchemaDeviceFileOps[Self <: SchemaDeviceFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObbFile(value: SchemaObbFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obbFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObbFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obbFile")(js.undefined)
        ret
    }
    @scala.inline
    def withRegularFile(value: SchemaRegularFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regularFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegularFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regularFile")(js.undefined)
        ret
    }
  }
  
}

