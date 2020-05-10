package typingsSlinky.pkijs.encryptedContentInfoMod

import typingsSlinky.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptedContentInfo extends js.Object {
  var contentEncryptionAlgorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default = js.native
  var eContentType: String = js.native
  var encryptedContent: OctetString = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object EncryptedContentInfo {
  @scala.inline
  def apply(
    contentEncryptionAlgorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default,
    eContentType: String,
    encryptedContent: OctetString,
    fromSchema: js.Any => Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): EncryptedContentInfo = {
    val __obj = js.Dynamic.literal(contentEncryptionAlgorithm = contentEncryptionAlgorithm.asInstanceOf[js.Any], eContentType = eContentType.asInstanceOf[js.Any], encryptedContent = encryptedContent.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[EncryptedContentInfo]
  }
  @scala.inline
  implicit class EncryptedContentInfoOps[Self <: EncryptedContentInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentEncryptionAlgorithm(value: typingsSlinky.pkijs.algorithmIdentifierMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentEncryptionAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eContentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryptedContent(value: OctetString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptedContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromSchema(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromSchema")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToSchema(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toSchema")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

