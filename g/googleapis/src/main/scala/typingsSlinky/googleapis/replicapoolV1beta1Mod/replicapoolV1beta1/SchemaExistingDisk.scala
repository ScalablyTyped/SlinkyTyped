package typingsSlinky.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A pre-existing persistent disk that will be attached to every Replica in
  * the Pool in READ_ONLY mode.
  */
@js.native
trait SchemaExistingDisk extends js.Object {
  /**
    * How the disk will be attached to the Replica.
    */
  var attachment: js.UndefOr[SchemaDiskAttachment] = js.native
  /**
    * The name of the Persistent Disk resource. The Persistent Disk resource
    * must be in the same zone as the Pool.
    */
  var source: js.UndefOr[String] = js.native
}

object SchemaExistingDisk {
  @scala.inline
  def apply(): SchemaExistingDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExistingDisk]
  }
  @scala.inline
  implicit class SchemaExistingDiskOps[Self <: SchemaExistingDisk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachment(value: SchemaDiskAttachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachment")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

