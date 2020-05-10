package typingsSlinky.googleapis.cloudtraceV2Mod.cloudtraceV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of attributes, each in the format `[KEY]:[VALUE]`.
  */
@js.native
trait SchemaAttributes extends js.Object {
  /**
    * The set of attributes. Each attribute&#39;s key can be up to 128 bytes
    * long. The value can be a string up to 256 bytes, a signed 64-bit integer,
    * or the Boolean values `true` and `false`. For example:
    * &quot;/instance_id&quot;: &quot;my-instance&quot;
    * &quot;/http/user_agent&quot;: &quot;&quot;
    * &quot;/http/request_bytes&quot;: 300     &quot;abc.com/myattribute&quot;:
    * true
    */
  var attributeMap: js.UndefOr[StringDictionary[SchemaAttributeValue]] = js.native
  /**
    * The number of attributes that were discarded. Attributes can be discarded
    * because their keys are too long or because there are too many attributes.
    * If this value is 0 then all attributes are valid.
    */
  var droppedAttributesCount: js.UndefOr[Double] = js.native
}

object SchemaAttributes {
  @scala.inline
  def apply(): SchemaAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttributes]
  }
  @scala.inline
  implicit class SchemaAttributesOps[Self <: SchemaAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeMap(value: StringDictionary[SchemaAttributeValue]): Self = {
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

