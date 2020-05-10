package typingsSlinky.graphqlRelay.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLFieldConfigMap
import typingsSlinky.graphql.definitionMod.GraphQLFieldResolver
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphql.definitionMod.Thunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionConfig extends js.Object {
  var connectionFields: js.UndefOr[(Thunk[GraphQLFieldConfigMap[_, _, StringDictionary[_]]]) | Null] = js.native
  var edgeFields: js.UndefOr[(Thunk[GraphQLFieldConfigMap[_, _, StringDictionary[_]]]) | Null] = js.native
  var name: js.UndefOr[String | Null] = js.native
  var nodeType: ConnectionConfigNodeType = js.native
  var resolveCursor: js.UndefOr[(GraphQLFieldResolver[_, _, StringDictionary[_]]) | Null] = js.native
  var resolveNode: js.UndefOr[(GraphQLFieldResolver[_, _, StringDictionary[_]]) | Null] = js.native
}

object ConnectionConfig {
  @scala.inline
  def apply(nodeType: ConnectionConfigNodeType): ConnectionConfig = {
    val __obj = js.Dynamic.literal(nodeType = nodeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionConfig]
  }
  @scala.inline
  implicit class ConnectionConfigOps[Self <: ConnectionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodeType(value: ConnectionConfigNodeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionFieldsFunction0(value: () => GraphQLFieldConfigMap[_, _, StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionFields")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withConnectionFields(value: Thunk[GraphQLFieldConfigMap[_, _, StringDictionary[_]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionFields")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionFieldsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionFields")(null)
        ret
    }
    @scala.inline
    def withEdgeFieldsFunction0(value: () => GraphQLFieldConfigMap[_, _, StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeFields")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEdgeFields(value: Thunk[GraphQLFieldConfigMap[_, _, StringDictionary[_]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeFields")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeFieldsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeFields")(null)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(null)
        ret
    }
    @scala.inline
    def withResolveCursor(value: (_, StringDictionary[_], _, /* info */ GraphQLResolveInfo) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveCursor")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutResolveCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveCursor")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveCursorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveCursor")(null)
        ret
    }
    @scala.inline
    def withResolveNode(value: (_, StringDictionary[_], _, /* info */ GraphQLResolveInfo) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveNode")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutResolveNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveNode")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveNodeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveNode")(null)
        ret
    }
  }
  
}

