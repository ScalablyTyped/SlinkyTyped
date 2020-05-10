package typingsSlinky.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A product label represented as a key-value pair.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1ProductKeyValue extends js.Object {
  /**
    * The key of the label attached to the product. Cannot be empty and cannot
    * exceed 128 bytes.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * The value of the label attached to the product. Cannot be empty and
    * cannot exceed 128 bytes.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVisionV1p1beta1ProductKeyValue {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p1beta1ProductKeyValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1ProductKeyValue]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p1beta1ProductKeyValueOps[Self <: SchemaGoogleCloudVisionV1p1beta1ProductKeyValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

