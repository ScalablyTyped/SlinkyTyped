package typingsSlinky.googleapis.storageV1beta2Mod.storageV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An access-control list.
  */
@js.native
trait SchemaBucketAccessControls extends js.Object {
  /**
    * The list of items.
    */
  var items: js.UndefOr[js.Array[SchemaBucketAccessControl]] = js.native
  /**
    * The kind of item this is. For lists of bucket access control entries,
    * this is always storage#bucketAccessControls.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaBucketAccessControls {
  @scala.inline
  def apply(): SchemaBucketAccessControls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBucketAccessControls]
  }
  @scala.inline
  implicit class SchemaBucketAccessControlsOps[Self <: SchemaBucketAccessControls] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[SchemaBucketAccessControl]): Self = {
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
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

