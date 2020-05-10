package typingsSlinky.chromeApps.chrome.runtime

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.chromeApps.chromeAppsStrings.`object`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The top-level object can't have additionalProperties.
  * The properties declared are the policies for this app.
  */
@js.native
trait ManagedSchema extends js.Object {
  /** Each schema must have either a $ref value or exactly one type. */
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.native
  /**
    * 'properties' maps an optional key of this object to its schema. At the
    * top-level object, these keys are the policy names supported.
    */
  var properties: js.UndefOr[
    StringDictionary[
      JSONSchemaBasicType | JSONSchemaArrayType | JSONSchemaObjectType | JSONSchemaRefType
    ]
  ] = js.native
  /** The top-level schema must have type object. */
  var `type`: `object` = js.native
}

object ManagedSchema {
  @scala.inline
  def apply(`type`: `object`): ManagedSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedSchema]
  }
  @scala.inline
  implicit class ManagedSchemaOps[Self <: ManagedSchema] (val x: Self) extends AnyVal {
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
    def with$ref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$ref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$ref")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(
      value: StringDictionary[
          JSONSchemaBasicType | JSONSchemaArrayType | JSONSchemaObjectType | JSONSchemaRefType
        ]
    ): Self = {
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

