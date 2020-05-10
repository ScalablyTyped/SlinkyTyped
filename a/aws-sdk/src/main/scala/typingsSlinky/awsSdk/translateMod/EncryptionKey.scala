package typingsSlinky.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionKey extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the encryption key being used to encrypt the custom terminology.
    */
  var Id: EncryptionKeyID = js.native
  /**
    * The type of encryption key used by Amazon Translate to encrypt custom terminologies.
    */
  var Type: EncryptionKeyType = js.native
}

object EncryptionKey {
  @scala.inline
  def apply(Id: EncryptionKeyID, Type: EncryptionKeyType): EncryptionKey = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionKey]
  }
  @scala.inline
  implicit class EncryptionKeyOps[Self <: EncryptionKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: EncryptionKeyID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: EncryptionKeyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

