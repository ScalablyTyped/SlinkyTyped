package typingsSlinky.jsonschema.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaContext extends js.Object {
  var base: String = js.native
  var options: Options = js.native
  var propertyPath: String = js.native
  var schema: Schema = js.native
  var schemas: StringDictionary[Schema] = js.native
}

object SchemaContext {
  @scala.inline
  def apply(
    base: String,
    options: Options,
    propertyPath: String,
    schema: Schema,
    schemas: StringDictionary[Schema]
  ): SchemaContext = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], propertyPath = propertyPath.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaContext]
  }
  @scala.inline
  implicit class SchemaContextOps[Self <: SchemaContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchema(value: Schema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchemas(value: StringDictionary[Schema]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemas")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

