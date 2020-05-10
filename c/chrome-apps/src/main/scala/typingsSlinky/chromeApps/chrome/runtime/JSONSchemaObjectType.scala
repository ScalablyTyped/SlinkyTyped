package typingsSlinky.chromeApps.chrome.runtime

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.chromeApps.chromeAppsStrings.`object`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONSchemaObjectType extends js.Object {
  var additionalProperties: js.UndefOr[JSONSchemaObjectType] = js.native
  var properties: js.UndefOr[StringDictionary[JSONSchemaBasicType | JSONSchemaRefType]] = js.native
  /**
    * An 'object' can have known properties listed as 'properties', and can
    * optionally have 'additionalProperties' indicating a schema to apply to
    * keys that aren't found in 'properties'.
    */
  var `type`: `object` = js.native
}

object JSONSchemaObjectType {
  @scala.inline
  def apply(`type`: `object`): JSONSchemaObjectType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONSchemaObjectType]
  }
  @scala.inline
  implicit class JSONSchemaObjectTypeOps[Self <: JSONSchemaObjectType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: `object`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionalProperties(value: JSONSchemaObjectType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: StringDictionary[JSONSchemaBasicType | JSONSchemaRefType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
  }
  
}

