package typingsSlinky.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsAccessKey extends js.Object {
  // AWS access key ID
  var aws_access_key_id: String = js.native
  // AWS secret access key
  var aws_secret_access_key: String = js.native
}

object AwsAccessKey {
  @scala.inline
  def apply(aws_access_key_id: String, aws_secret_access_key: String): AwsAccessKey = {
    val __obj = js.Dynamic.literal(aws_access_key_id = aws_access_key_id.asInstanceOf[js.Any], aws_secret_access_key = aws_secret_access_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsAccessKey]
  }
  @scala.inline
  implicit class AwsAccessKeyOps[Self <: AwsAccessKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAws_access_key_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aws_access_key_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAws_secret_access_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aws_secret_access_key")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

