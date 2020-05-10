package typingsSlinky.ckeditorCkeditor5Engine.mod.model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaItemDefinition extends js.Object {
  var allowAttributes: String | js.Array[String] = js.native
  var allowAttributesOf: String | js.Array[String] = js.native
  var allowContentOf: String | js.Array[String] = js.native
  var allowIn: String | js.Array[String] = js.native
  var allowWhere: String | js.Array[String] = js.native
  var inheritAllFrom: String | js.Array[String] = js.native
  var inheritTypesFrom: String | js.Array[String] = js.native
  var isBlock: Boolean = js.native
  var isLimit: Boolean = js.native
  var isObject: Boolean = js.native
}

object SchemaItemDefinition {
  @scala.inline
  def apply(
    allowAttributes: String | js.Array[String],
    allowAttributesOf: String | js.Array[String],
    allowContentOf: String | js.Array[String],
    allowIn: String | js.Array[String],
    allowWhere: String | js.Array[String],
    inheritAllFrom: String | js.Array[String],
    inheritTypesFrom: String | js.Array[String],
    isBlock: Boolean,
    isLimit: Boolean,
    isObject: Boolean
  ): SchemaItemDefinition = {
    val __obj = js.Dynamic.literal(allowAttributes = allowAttributes.asInstanceOf[js.Any], allowAttributesOf = allowAttributesOf.asInstanceOf[js.Any], allowContentOf = allowContentOf.asInstanceOf[js.Any], allowIn = allowIn.asInstanceOf[js.Any], allowWhere = allowWhere.asInstanceOf[js.Any], inheritAllFrom = inheritAllFrom.asInstanceOf[js.Any], inheritTypesFrom = inheritTypesFrom.asInstanceOf[js.Any], isBlock = isBlock.asInstanceOf[js.Any], isLimit = isLimit.asInstanceOf[js.Any], isObject = isObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaItemDefinition]
  }
  @scala.inline
  implicit class SchemaItemDefinitionOps[Self <: SchemaItemDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowAttributes(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowAttributesOf(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAttributesOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowContentOf(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowContentOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowIn(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowWhere(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowWhere")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInheritAllFrom(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritAllFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInheritTypesFrom(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritTypesFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBlock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLimit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsObject(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isObject")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

