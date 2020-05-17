package typingsSlinky.graphqlBinding.anon

import typingsSlinky.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputSchemaPath extends js.Object {
  var inputSchemaPath: String = js.native
  var isDefaultExport: scala.Boolean = js.native
  var outputBindingPath: String = js.native
  var schema: GraphQLSchema = js.native
}

object InputSchemaPath {
  @scala.inline
  def apply(
    inputSchemaPath: String,
    isDefaultExport: scala.Boolean,
    outputBindingPath: String,
    schema: GraphQLSchema
  ): InputSchemaPath = {
    val __obj = js.Dynamic.literal(inputSchemaPath = inputSchemaPath.asInstanceOf[js.Any], isDefaultExport = isDefaultExport.asInstanceOf[js.Any], outputBindingPath = outputBindingPath.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputSchemaPath]
  }
  @scala.inline
  implicit class InputSchemaPathOps[Self <: InputSchemaPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputSchemaPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputSchemaPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDefaultExport(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefaultExport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputBindingPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputBindingPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchema(value: GraphQLSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

