package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsCloudMapInstanceAttribute extends js.Object {
  /**
    * The name of an AWS Cloud Map service instance attribute key. Any AWS Cloud Map service
    instance that contains the specified key and value is returned.
    */
  var key: AwsCloudMapInstanceAttributeKey = js.native
  /**
    * The value of an AWS Cloud Map service instance attribute key. Any AWS Cloud Map service
    instance that contains the specified key and value is returned.
    */
  var value: AwsCloudMapInstanceAttributeValue = js.native
}

object AwsCloudMapInstanceAttribute {
  @scala.inline
  def apply(key: AwsCloudMapInstanceAttributeKey, value: AwsCloudMapInstanceAttributeValue): AwsCloudMapInstanceAttribute = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsCloudMapInstanceAttribute]
  }
  @scala.inline
  implicit class AwsCloudMapInstanceAttributeOps[Self <: AwsCloudMapInstanceAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: AwsCloudMapInstanceAttributeKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: AwsCloudMapInstanceAttributeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

