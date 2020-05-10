package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentContent extends js.Object {
  /**
    * The cryptographic hash value of the document content.
    */
  var Hash: js.UndefOr[AttachmentHash] = js.native
  /**
    * The hash algorithm used to calculate the hash value.
    */
  var HashType: js.UndefOr[AttachmentHashType] = js.native
  /**
    * The name of an attachment.
    */
  var Name: js.UndefOr[AttachmentName] = js.native
  /**
    * The size of an attachment in bytes.
    */
  var Size: js.UndefOr[ContentLength] = js.native
  /**
    * The URL location of the attachment content.
    */
  var Url: js.UndefOr[AttachmentUrl] = js.native
}

object AttachmentContent {
  @scala.inline
  def apply(): AttachmentContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentContent]
  }
  @scala.inline
  implicit class AttachmentContentOps[Self <: AttachmentContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHash(value: AttachmentHash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hash")(js.undefined)
        ret
    }
    @scala.inline
    def withHashType(value: AttachmentHashType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HashType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HashType")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: AttachmentName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: ContentLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: AttachmentUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(js.undefined)
        ret
    }
  }
  
}

