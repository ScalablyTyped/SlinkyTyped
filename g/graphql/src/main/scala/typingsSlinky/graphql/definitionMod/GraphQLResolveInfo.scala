package typingsSlinky.graphql.definitionMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.astMod.FieldNode
import typingsSlinky.graphql.astMod.FragmentDefinitionNode
import typingsSlinky.graphql.astMod.OperationDefinitionNode
import typingsSlinky.graphql.pathMod.Path
import typingsSlinky.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLResolveInfo extends js.Object {
  val fieldName: String = js.native
  val fieldNodes: js.Array[FieldNode] = js.native
  val fragments: StringDictionary[FragmentDefinitionNode] = js.native
  val operation: OperationDefinitionNode = js.native
  val parentType: GraphQLObjectType[_, _, StringDictionary[_]] = js.native
  val path: Path = js.native
  val returnType: GraphQLOutputType = js.native
  val rootValue: js.Any = js.native
  val schema: GraphQLSchema = js.native
  val variableValues: StringDictionary[js.Any] = js.native
}

object GraphQLResolveInfo {
  @scala.inline
  def apply(
    fieldName: String,
    fieldNodes: js.Array[FieldNode],
    fragments: StringDictionary[FragmentDefinitionNode],
    operation: OperationDefinitionNode,
    parentType: GraphQLObjectType[_, _, StringDictionary[_]],
    path: Path,
    returnType: GraphQLOutputType,
    rootValue: js.Any,
    schema: GraphQLSchema,
    variableValues: StringDictionary[js.Any]
  ): GraphQLResolveInfo = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], fieldNodes = fieldNodes.asInstanceOf[js.Any], fragments = fragments.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], parentType = parentType.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], rootValue = rootValue.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], variableValues = variableValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLResolveInfo]
  }
  @scala.inline
  implicit class GraphQLResolveInfoOps[Self <: GraphQLResolveInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFieldName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldNodes(value: js.Array[FieldNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFragments(value: StringDictionary[FragmentDefinitionNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperation(value: OperationDefinitionNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentType(value: GraphQLObjectType[_, _, StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnType(value: GraphQLOutputType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchema(value: GraphQLSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariableValues(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableValues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

