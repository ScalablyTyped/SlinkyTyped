package typingsSlinky.gapiClientCloudtrace.gapi.client.cloudtrace

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attributes extends js.Object {
  /**
    * The set of attributes. Each attribute's key can be up to 128 bytes
    * long. The value can be a string up to 256 bytes, an integer, or the
    * Boolean values `true` and `false`. For example:
    *
    * "/instance_id": "my-instance"
    * "/http/user_agent": ""
    * "/http/request_bytes": 300
    * "abc.com/myattribute": true
    */
  var attributeMap: js.UndefOr[Record[String, AttributeValue]] = js.native
  /**
    * The number of attributes that were discarded. Attributes can be discarded
    * because their keys are too long or because there are too many attributes.
    * If this value is 0 then all attributes are valid.
    */
  var droppedAttributesCount: js.UndefOr[Double] = js.native
}

object Attributes {
  @scala.inline
  def apply(): Attributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attributes]
  }
  @scala.inline
  implicit class AttributesOps[Self <: Attributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeMap(value: Record[String, AttributeValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeMap")(js.undefined)
        ret
    }
    @scala.inline
    def withDroppedAttributesCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("droppedAttributesCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDroppedAttributesCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("droppedAttributesCount")(js.undefined)
        ret
    }
  }
  
}

