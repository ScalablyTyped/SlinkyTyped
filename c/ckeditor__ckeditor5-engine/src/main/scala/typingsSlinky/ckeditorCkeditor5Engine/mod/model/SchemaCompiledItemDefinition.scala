package typingsSlinky.ckeditorCkeditor5Engine.mod.model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCompiledItemDefinition extends js.Object {
  var allowAttributes: String | js.Array[String] = js.native
  var allowIn: String | js.Array[String] = js.native
  var isBlock: Boolean = js.native
  var isLimit: Boolean = js.native
  var isObject: Boolean = js.native
  var name: String = js.native
}

object SchemaCompiledItemDefinition {
  @scala.inline
  def apply(
    allowAttributes: String | js.Array[String],
    allowIn: String | js.Array[String],
    isBlock: Boolean,
    isLimit: Boolean,
    isObject: Boolean,
    name: String
  ): SchemaCompiledItemDefinition = {
    val __obj = js.Dynamic.literal(allowAttributes = allowAttributes.asInstanceOf[js.Any], allowIn = allowIn.asInstanceOf[js.Any], isBlock = isBlock.asInstanceOf[js.Any], isLimit = isLimit.asInstanceOf[js.Any], isObject = isObject.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCompiledItemDefinition]
  }
  @scala.inline
  implicit class SchemaCompiledItemDefinitionOps[Self <: SchemaCompiledItemDefinition] (val x: Self) extends AnyVal {
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
    def withAllowIn(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowIn")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

