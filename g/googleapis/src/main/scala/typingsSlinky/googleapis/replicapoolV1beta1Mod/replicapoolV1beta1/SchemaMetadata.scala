package typingsSlinky.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Compute Engine metadata entry. Identical to the metadata on the
  * corresponding Compute Engine resource.
  */
@js.native
trait SchemaMetadata extends js.Object {
  /**
    * The fingerprint of the metadata. Required for updating the metadata
    * entries for this instance.
    */
  var fingerPrint: js.UndefOr[String] = js.native
  /**
    * A list of metadata items.
    */
  var items: js.UndefOr[js.Array[SchemaMetadataItem]] = js.native
}

object SchemaMetadata {
  @scala.inline
  def apply(): SchemaMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetadata]
  }
  @scala.inline
  implicit class SchemaMetadataOps[Self <: SchemaMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFingerPrint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerPrint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFingerPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerPrint")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[SchemaMetadataItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
  }
  
}

