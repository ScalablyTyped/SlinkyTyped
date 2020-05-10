package typingsSlinky.graphqlRelay.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLFieldConfig
import typingsSlinky.graphql.mod.GraphQLInterfaceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLNodeDefinitions extends js.Object {
  var nodeField: GraphQLFieldConfig[_, _, StringDictionary[_]] = js.native
  var nodeInterface: GraphQLInterfaceType = js.native
  var nodesField: GraphQLFieldConfig[_, _, StringDictionary[_]] = js.native
}

object GraphQLNodeDefinitions {
  @scala.inline
  def apply(
    nodeField: GraphQLFieldConfig[_, _, StringDictionary[_]],
    nodeInterface: GraphQLInterfaceType,
    nodesField: GraphQLFieldConfig[_, _, StringDictionary[_]]
  ): GraphQLNodeDefinitions = {
    val __obj = js.Dynamic.literal(nodeField = nodeField.asInstanceOf[js.Any], nodeInterface = nodeInterface.asInstanceOf[js.Any], nodesField = nodesField.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLNodeDefinitions]
  }
  @scala.inline
  implicit class GraphQLNodeDefinitionsOps[Self <: GraphQLNodeDefinitions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodeField(value: GraphQLFieldConfig[_, _, StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeInterface(value: GraphQLInterfaceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeInterface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodesField(value: GraphQLFieldConfig[_, _, StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodesField")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

