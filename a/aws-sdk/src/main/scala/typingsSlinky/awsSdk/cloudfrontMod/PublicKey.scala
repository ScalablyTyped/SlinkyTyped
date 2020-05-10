package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicKey extends js.Object {
  /**
    * A time you added a public key to CloudFront.
    */
  var CreatedTime: js.Date = js.native
  /**
    * A unique ID assigned to a public key you've added to CloudFront.
    */
  var Id: String = js.native
  /**
    * A complex data type for a public key you add to CloudFront to use with features like field-level encryption.
    */
  var PublicKeyConfig: typingsSlinky.awsSdk.cloudfrontMod.PublicKeyConfig = js.native
}

object PublicKey {
  @scala.inline
  def apply(CreatedTime: js.Date, Id: String, PublicKeyConfig: PublicKeyConfig): PublicKey = {
    val __obj = js.Dynamic.literal(CreatedTime = CreatedTime.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], PublicKeyConfig = PublicKeyConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKey]
  }
  @scala.inline
  implicit class PublicKeyOps[Self <: PublicKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicKeyConfig(value: PublicKeyConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicKeyConfig")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

