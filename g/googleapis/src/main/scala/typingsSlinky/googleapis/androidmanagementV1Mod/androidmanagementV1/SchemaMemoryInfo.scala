package typingsSlinky.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about device memory and storage.
  */
@js.native
trait SchemaMemoryInfo extends js.Object {
  /**
    * Total internal storage on device in bytes.
    */
  var totalInternalStorage: js.UndefOr[String] = js.native
  /**
    * Total RAM on device in bytes.
    */
  var totalRam: js.UndefOr[String] = js.native
}

object SchemaMemoryInfo {
  @scala.inline
  def apply(): SchemaMemoryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMemoryInfo]
  }
  @scala.inline
  implicit class SchemaMemoryInfoOps[Self <: SchemaMemoryInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTotalInternalStorage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalInternalStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalInternalStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalInternalStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalRam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalRam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalRam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalRam")(js.undefined)
        ret
    }
  }
  
}

