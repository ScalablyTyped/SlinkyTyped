package typingsSlinky.graphql.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.astMod.SchemaDefinitionNode
import typingsSlinky.graphql.astMod.SchemaExtensionNode
import typingsSlinky.graphql.definitionMod.GraphQLNamedType
import typingsSlinky.graphql.definitionMod.GraphQLObjectType
import typingsSlinky.graphql.directivesMod.GraphQLDirective
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql/type/schema.GraphQLSchemaConfig & {  types  :std.Array<graphql.graphql/type/definition.GraphQLNamedType>,   directives  :std.Array<graphql.graphql/type/directives.GraphQLDirective>,   extensions  :graphql.graphql/tsutils/Maybe.default<std.Readonly<std.Record<string, any>>>,   extensionASTNodes  :std.ReadonlyArray<graphql.graphql/language/ast.SchemaExtensionNode>,   assumeValid  :boolean,   allowedLegacyNames  :std.ReadonlyArray<string>} */
@js.native
trait GraphQLSchemaConfigtypesA extends js.Object {
  /**
    * If provided, the schema will consider fields or types with names included
    * in this list valid, even if they do not adhere to the specification's
    * schema validation rules.
    *
    * This option is provided to ease adoption and will be removed in v15.
    */
  var allowedLegacyNames: js.UndefOr[Maybe[js.Array[String]] with js.Array[String]] = js.native
  /**
    * When building a schema from a GraphQL service's introspection result, it
    * might be safe to assume the schema is valid. Set to true to assume the
    * produced schema is valid.
    *
    * Default: false
    */
  var assumeValid: js.UndefOr[Boolean] = js.native
  var astNode: js.UndefOr[Maybe[SchemaDefinitionNode]] = js.native
  var directives: js.UndefOr[Maybe[js.Array[GraphQLDirective]] with js.Array[GraphQLDirective]] = js.native
  var extensionASTNodes: js.UndefOr[Maybe[js.Array[SchemaExtensionNode]] with js.Array[SchemaExtensionNode]] = js.native
  var extensions: js.UndefOr[Maybe[Record[String, _]]] = js.native
  var mutation: js.UndefOr[Maybe[GraphQLObjectType[_, _, StringDictionary[_]]]] = js.native
  var query: Maybe[GraphQLObjectType[_, _, StringDictionary[_]]] = js.native
  var subscription: js.UndefOr[Maybe[GraphQLObjectType[_, _, StringDictionary[_]]]] = js.native
  var types: js.UndefOr[Maybe[js.Array[GraphQLNamedType]] with js.Array[GraphQLNamedType]] = js.native
}

object GraphQLSchemaConfigtypesA {
  @scala.inline
  def apply(): GraphQLSchemaConfigtypesA = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQLSchemaConfigtypesA]
  }
  @scala.inline
  implicit class GraphQLSchemaConfigtypesAOps[Self <: GraphQLSchemaConfigtypesA] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedLegacyNames(value: Maybe[js.Array[String]] with js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedLegacyNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedLegacyNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedLegacyNames")(js.undefined)
        ret
    }
    @scala.inline
    def withAssumeValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assumeValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssumeValid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assumeValid")(js.undefined)
        ret
    }
    @scala.inline
    def withAstNode(value: Maybe[SchemaDefinitionNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("astNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAstNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("astNode")(js.undefined)
        ret
    }
    @scala.inline
    def withAstNodeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("astNode")(null)
        ret
    }
    @scala.inline
    def withDirectives(value: Maybe[js.Array[GraphQLDirective]] with js.Array[GraphQLDirective]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directives")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensionASTNodes(value: Maybe[js.Array[SchemaExtensionNode]] with js.Array[SchemaExtensionNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionASTNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensionASTNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionASTNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: Maybe[Record[String, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(null)
        ret
    }
    @scala.inline
    def withMutation(value: Maybe[GraphQLObjectType[_, _, StringDictionary[_]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMutation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutation")(js.undefined)
        ret
    }
    @scala.inline
    def withMutationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutation")(null)
        ret
    }
    @scala.inline
    def withQuery(value: Maybe[GraphQLObjectType[_, _, StringDictionary[_]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(null)
        ret
    }
    @scala.inline
    def withSubscription(value: Maybe[GraphQLObjectType[_, _, StringDictionary[_]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(null)
        ret
    }
    @scala.inline
    def withTypes(value: Maybe[js.Array[GraphQLNamedType]] with js.Array[GraphQLNamedType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(js.undefined)
        ret
    }
  }
  
}

