package typingsSlinky.googleapis.v2alpha1Mod.genomicsV2alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The status of a disk on a VM.
  */
@js.native
trait SchemaDiskStatus extends js.Object {
  /**
    * Free disk space.
    */
  var freeSpaceBytes: js.UndefOr[String] = js.native
  /**
    * Total disk space.
    */
  var totalSpaceBytes: js.UndefOr[String] = js.native
}

object SchemaDiskStatus {
  @scala.inline
  def apply(): SchemaDiskStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiskStatus]
  }
  @scala.inline
  implicit class SchemaDiskStatusOps[Self <: SchemaDiskStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFreeSpaceBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeSpaceBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreeSpaceBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeSpaceBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalSpaceBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSpaceBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalSpaceBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSpaceBytes")(js.undefined)
        ret
    }
  }
  
}

