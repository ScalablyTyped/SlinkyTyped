package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Content of an item to be indexed and surfaced by Cloud Search.
  */
@js.native
trait SchemaItemContent extends js.Object {
  /**
    * Upload reference ID of a previously uploaded content via write method.
    */
  var contentDataRef: js.UndefOr[SchemaUploadItemRef] = js.native
  var contentFormat: js.UndefOr[String] = js.native
  /**
    * Hashing info calculated and provided by the API client for content. Can
    * be used with the items.push method to calculate modified state. The
    * maximum length is 2048 characters.
    */
  var hash: js.UndefOr[String] = js.native
  /**
    * Content that is supplied inlined within the update method. The maximum
    * length is 102400 bytes (100 KiB).
    */
  var inlineContent: js.UndefOr[String] = js.native
}

object SchemaItemContent {
  @scala.inline
  def apply(): SchemaItemContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaItemContent]
  }
  @scala.inline
  implicit class SchemaItemContentOps[Self <: SchemaItemContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentDataRef(value: SchemaUploadItemRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDataRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentDataRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDataRef")(js.undefined)
        ret
    }
    @scala.inline
    def withContentFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineContent")(js.undefined)
        ret
    }
  }
  
}

