package typingsSlinky.googleapis.fileV1Mod.fileV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * File share configuration for the instance.
  */
@js.native
trait SchemaFileShareConfig extends js.Object {
  /**
    * File share capacity in gigabytes (GB). Cloud Filestore defines 1 GB as
    * 1024^3 bytes.
    */
  var capacityGb: js.UndefOr[String] = js.native
  /**
    * The name of the file share (must be 16 characters or less).
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaFileShareConfig {
  @scala.inline
  def apply(): SchemaFileShareConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFileShareConfig]
  }
  @scala.inline
  implicit class SchemaFileShareConfigOps[Self <: SchemaFileShareConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapacityGb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacityGb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacityGb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacityGb")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

