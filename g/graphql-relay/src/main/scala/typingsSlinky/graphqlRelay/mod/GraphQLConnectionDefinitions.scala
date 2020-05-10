package typingsSlinky.graphqlRelay.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.mod.GraphQLObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLConnectionDefinitions extends js.Object {
  var connectionType: GraphQLObjectType[_, _, StringDictionary[_]] = js.native
  var edgeType: GraphQLObjectType[_, _, StringDictionary[_]] = js.native
}

object GraphQLConnectionDefinitions {
  @scala.inline
  def apply(
    connectionType: GraphQLObjectType[_, _, StringDictionary[_]],
    edgeType: GraphQLObjectType[_, _, StringDictionary[_]]
  ): GraphQLConnectionDefinitions = {
    val __obj = js.Dynamic.literal(connectionType = connectionType.asInstanceOf[js.Any], edgeType = edgeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLConnectionDefinitions]
  }
  @scala.inline
  implicit class GraphQLConnectionDefinitionsOps[Self <: GraphQLConnectionDefinitions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionType(value: GraphQLObjectType[_, _, StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdgeType(value: GraphQLObjectType[_, _, StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

