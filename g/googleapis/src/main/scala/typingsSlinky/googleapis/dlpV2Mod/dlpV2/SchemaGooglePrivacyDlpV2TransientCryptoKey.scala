package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Use this to have a random data crypto key generated. It will be discarded
  * after the request finishes.
  */
@js.native
trait SchemaGooglePrivacyDlpV2TransientCryptoKey extends js.Object {
  /**
    * Name of the key. [required] This is an arbitrary string used to
    * differentiate different keys. A unique key is generated per name: two
    * separate `TransientCryptoKey` protos share the same generated key if
    * their names are the same. When the data crypto key is generated, this
    * name is not used in any way (repeating the api call will result in a
    * different key being generated).
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2TransientCryptoKey {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2TransientCryptoKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2TransientCryptoKey]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2TransientCryptoKeyOps[Self <: SchemaGooglePrivacyDlpV2TransientCryptoKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

