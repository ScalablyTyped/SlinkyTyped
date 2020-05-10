package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicKeyConfig extends js.Object {
  /**
    * A unique number that ensures that the request can't be replayed.
    */
  var CallerReference: String = js.native
  /**
    * An optional comment about a public key.
    */
  var Comment: js.UndefOr[String] = js.native
  /**
    * The encoded public key that you want to add to CloudFront to use with features like field-level encryption.
    */
  var EncodedKey: String = js.native
  /**
    * The name for a public key you add to CloudFront to use with features like field-level encryption.
    */
  var Name: String = js.native
}

object PublicKeyConfig {
  @scala.inline
  def apply(CallerReference: String, EncodedKey: String, Name: String): PublicKeyConfig = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference.asInstanceOf[js.Any], EncodedKey = EncodedKey.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyConfig]
  }
  @scala.inline
  implicit class PublicKeyConfigOps[Self <: PublicKeyConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallerReference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallerReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncodedKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncodedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comment")(js.undefined)
        ret
    }
  }
  
}

