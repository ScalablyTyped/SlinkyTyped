package typingsSlinky.graphqlTools.renameTypesMod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlTools.interfacesMod.Request
import typingsSlinky.graphqlTools.interfacesMod.Result
import typingsSlinky.graphqlTools.interfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenameTypes extends Transform {
  var renameBuiltins: js.Any = js.native
  var renameScalars: js.Any = js.native
  var renameTypes: js.Any = js.native
  var renamer: js.Any = js.native
  var reverseMap: js.Any = js.native
  @JSName("transformRequest")
  def transformRequest_MRenameTypes(originalRequest: Request): Request = js.native
  @JSName("transformResult")
  def transformResult_MRenameTypes(result: Result): Result = js.native
  @JSName("transformSchema")
  def transformSchema_MRenameTypes(originalSchema: GraphQLSchema): GraphQLSchema = js.native
}

object RenameTypes {
  @scala.inline
  def apply(
    renameBuiltins: js.Any,
    renameScalars: js.Any,
    renameTypes: js.Any,
    renamer: js.Any,
    reverseMap: js.Any,
    transformRequest: Request => Request,
    transformResult: Result => Result,
    transformSchema: GraphQLSchema => GraphQLSchema
  ): RenameTypes = {
    val __obj = js.Dynamic.literal(renameBuiltins = renameBuiltins.asInstanceOf[js.Any], renameScalars = renameScalars.asInstanceOf[js.Any], renameTypes = renameTypes.asInstanceOf[js.Any], renamer = renamer.asInstanceOf[js.Any], reverseMap = reverseMap.asInstanceOf[js.Any], transformRequest = js.Any.fromFunction1(transformRequest), transformResult = js.Any.fromFunction1(transformResult), transformSchema = js.Any.fromFunction1(transformSchema))
    __obj.asInstanceOf[RenameTypes]
  }
  @scala.inline
  implicit class RenameTypesOps[Self <: RenameTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRenameBuiltins(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameBuiltins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenameScalars(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameScalars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenameTypes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenamer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renamer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReverseMap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformRequest(value: Request => Request): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformRequest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTransformResult(value: Result => Result): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformResult")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTransformSchema(value: GraphQLSchema => GraphQLSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformSchema")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

