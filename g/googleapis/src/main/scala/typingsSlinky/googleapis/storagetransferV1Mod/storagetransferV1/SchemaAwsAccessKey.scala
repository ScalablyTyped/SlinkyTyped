package typingsSlinky.googleapis.storagetransferV1Mod.storagetransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AWS access key (see [AWS Security
  * Credentials](http://docs.aws.amazon.com/general/latest/gr/aws-security-credentials.html)).
  */
@js.native
trait SchemaAwsAccessKey extends js.Object {
  /**
    * AWS access key ID. Required.
    */
  var accessKeyId: js.UndefOr[String] = js.native
  /**
    * AWS secret access key. This field is not returned in RPC responses.
    * Required.
    */
  var secretAccessKey: js.UndefOr[String] = js.native
}

object SchemaAwsAccessKey {
  @scala.inline
  def apply(): SchemaAwsAccessKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAwsAccessKey]
  }
  @scala.inline
  implicit class SchemaAwsAccessKeyOps[Self <: SchemaAwsAccessKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withSecretAccessKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretAccessKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretAccessKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretAccessKey")(js.undefined)
        ret
    }
  }
  
}

