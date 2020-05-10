package typingsSlinky.graphqlTools.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDelegateToSchemaOptions[TContext] extends js.Object {
  var args: js.UndefOr[StringDictionary[js.Any]] = js.native
  var context: TContext = js.native
  var fieldName: String = js.native
  var info: IGraphQLToolsResolveInfo = js.native
  var operation: Operation = js.native
  var schema: GraphQLSchema = js.native
  var skipValidation: js.UndefOr[Boolean] = js.native
  var transforms: js.UndefOr[js.Array[Transform]] = js.native
}

object IDelegateToSchemaOptions {
  @scala.inline
  def apply[TContext](
    context: TContext,
    fieldName: String,
    info: IGraphQLToolsResolveInfo,
    operation: Operation,
    schema: GraphQLSchema
  ): IDelegateToSchemaOptions[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDelegateToSchemaOptions[TContext]]
  }
  @scala.inline
  implicit class IDelegateToSchemaOptionsOps[Self[tcontext] <: IDelegateToSchemaOptions[tcontext], TContext] (val x: Self[TContext]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TContext] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TContext] with Other]
    @scala.inline
    def withContext(value: TContext): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldName(value: String): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfo(value: IGraphQLToolsResolveInfo): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperation(value: Operation): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchema(value: GraphQLSchema): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArgs(value: StringDictionary[js.Any]): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipValidation(value: Boolean): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipValidation: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withTransforms(value: js.Array[Transform]): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransforms: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transforms")(js.undefined)
        ret
    }
  }
  
}

