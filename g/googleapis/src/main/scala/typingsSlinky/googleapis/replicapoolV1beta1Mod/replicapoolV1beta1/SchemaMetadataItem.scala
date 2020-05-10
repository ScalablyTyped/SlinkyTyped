package typingsSlinky.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Compute Engine metadata item, defined as a key:value pair. Identical to
  * the metadata on the corresponding Compute Engine resource.
  */
@js.native
trait SchemaMetadataItem extends js.Object {
  /**
    * A metadata key.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * A metadata value.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaMetadataItem {
  @scala.inline
  def apply(): SchemaMetadataItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetadataItem]
  }
  @scala.inline
  implicit class SchemaMetadataItemOps[Self <: SchemaMetadataItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

