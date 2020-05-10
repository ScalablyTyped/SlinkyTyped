package typingsSlinky.hyperlorisTyson.jsonPropertyMod

import typingsSlinky.hyperlorisTyson.typeTokenMod.ClassType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonPropertyOptions extends js.Object {
  /**
    * It can be used to force Tyson to ignore this property during
    * the serialization or deserialization process.
    */
  var access: js.UndefOr[Access] = js.native
  /**
    * Ignore the type of this property.
    * This means that during the deserialization process the content of the
    * json will be copied directly without any kind of check. The same thing
    * during serialization.
    * Default value: false
    */
  var ignoreType: js.UndefOr[Boolean] = js.native
  /**
    * Indicates the name of the key on the JSON, this is very useful
    * if you need to have a different name on the class.
    * Eg. If you mark your private property with "_"
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Property that indicates whether a value is expected for property
    * during deserialization or not. If the value is missing on the JSON,
    * an exception is thrown.
    * Default value: false
    */
  var required: js.UndefOr[Boolean] = js.native
  /**
    * Specifies a type of the property.
    * This is mandatory for arrays (single and multi-type).
    * NOTE: if it's a Date object, you MUST specify the type!
    */
  var `type`: js.UndefOr[ClassType[_] | js.Array[_]] = js.native
}

object JsonPropertyOptions {
  @scala.inline
  def apply(): JsonPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonPropertyOptions]
  }
  @scala.inline
  implicit class JsonPropertyOptionsOps[Self <: JsonPropertyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccess(value: Access): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreType")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ClassType[_] | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

