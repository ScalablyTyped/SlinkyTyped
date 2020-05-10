package typingsSlinky.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies how to attach a disk to a Replica.
  */
@js.native
trait SchemaDiskAttachment extends js.Object {
  /**
    * The device name of this disk.
    */
  var deviceName: js.UndefOr[String] = js.native
  /**
    * A zero-based index to assign to this disk, where 0 is reserved for the
    * boot disk. If not specified, this is assigned by the server.
    */
  var index: js.UndefOr[Double] = js.native
}

object SchemaDiskAttachment {
  @scala.inline
  def apply(): SchemaDiskAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiskAttachment]
  }
  @scala.inline
  implicit class SchemaDiskAttachmentOps[Self <: SchemaDiskAttachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceName")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
  }
  
}

