package typingsSlinky.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Persistent Disk resource that will be created and attached to each
  * Replica in the Pool. Each Replica will have a unique persistent disk that
  * is created and attached to that Replica in READ_WRITE mode.
  */
@js.native
trait SchemaNewDisk extends js.Object {
  /**
    * How the disk will be attached to the Replica.
    */
  var attachment: js.UndefOr[SchemaDiskAttachment] = js.native
  /**
    * If true, then this disk will be deleted when the instance is deleted. The
    * default value is true.
    */
  var autoDelete: js.UndefOr[Boolean] = js.native
  /**
    * If true, indicates that this is the root persistent disk.
    */
  var boot: js.UndefOr[Boolean] = js.native
  /**
    * Create the new disk using these parameters. The name of the disk will be
    * &lt;instance_name&gt;-&lt;four_random_charactersgt;.
    */
  var initializeParams: js.UndefOr[SchemaNewDiskInitializeParams] = js.native
}

object SchemaNewDisk {
  @scala.inline
  def apply(): SchemaNewDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNewDisk]
  }
  @scala.inline
  implicit class SchemaNewDiskOps[Self <: SchemaNewDisk] (val x: Self) extends AnyVal {
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
    def withAutoDelete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withBoot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boot")(js.undefined)
        ret
    }
    @scala.inline
    def withInitializeParams(value: SchemaNewDiskInitializeParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initializeParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitializeParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initializeParams")(js.undefined)
        ret
    }
  }
  
}

