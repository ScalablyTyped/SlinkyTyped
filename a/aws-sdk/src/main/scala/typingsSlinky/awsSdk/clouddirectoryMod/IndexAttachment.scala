package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexAttachment extends js.Object {
  /**
    * The indexed attribute values.
    */
  var IndexedAttributes: js.UndefOr[AttributeKeyAndValueList] = js.native
  /**
    * In response to ListIndex, the ObjectIdentifier of the object attached to the index. In response to ListAttachedIndices, the ObjectIdentifier of the index attached to the object. This field will always contain the ObjectIdentifier of the object on the opposite side of the attachment specified in the query.
    */
  var ObjectIdentifier: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.ObjectIdentifier] = js.native
}

object IndexAttachment {
  @scala.inline
  def apply(): IndexAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexAttachment]
  }
  @scala.inline
  implicit class IndexAttachmentOps[Self <: IndexAttachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexedAttributes(value: AttributeKeyAndValueList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexedAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexedAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexedAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectIdentifier(value: ObjectIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectIdentifier")(js.undefined)
        ret
    }
  }
  
}

