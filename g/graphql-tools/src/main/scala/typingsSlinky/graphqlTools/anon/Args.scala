package typingsSlinky.graphqlTools.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlTools.schemaVisitorMod.VisitableSchemaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Args extends js.Object {
  var args: StringDictionary[js.Any] = js.native
  var context: StringDictionary[js.Any] = js.native
  var name: String = js.native
  var schema: GraphQLSchema = js.native
  var visitedType: VisitableSchemaType = js.native
}

object Args {
  @scala.inline
  def apply(
    args: StringDictionary[js.Any],
    context: StringDictionary[js.Any],
    name: String,
    schema: GraphQLSchema,
    visitedType: VisitableSchemaType
  ): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], visitedType = visitedType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  @scala.inline
  implicit class ArgsOps[Self <: Args] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchema(value: GraphQLSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisitedType(value: VisitableSchemaType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitedType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

