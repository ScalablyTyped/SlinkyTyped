package typingsSlinky.graphql

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.astMod.ASTNode
import typingsSlinky.graphql.astMod.FieldNode
import typingsSlinky.graphql.definitionMod.GraphQLArgument
import typingsSlinky.graphql.definitionMod.GraphQLCompositeType
import typingsSlinky.graphql.definitionMod.GraphQLEnumValue
import typingsSlinky.graphql.definitionMod.GraphQLField
import typingsSlinky.graphql.definitionMod.GraphQLInputType
import typingsSlinky.graphql.definitionMod.GraphQLOutputType
import typingsSlinky.graphql.definitionMod.GraphQLType
import typingsSlinky.graphql.directivesMod.GraphQLDirective
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/TypeInfo", JSImport.Namespace)
@js.native
object typeInfoMod extends js.Object {
  @js.native
  class TypeInfo protected () extends js.Object {
    def this(schema: GraphQLSchema) = this()
    def this(
      schema: GraphQLSchema,
      // NOTE: this experimental optional second parameter is only needed in order
    // to support non-spec-compliant codebases. You should never need to use it.
    // It may disappear in the future.
    getFieldDefFn: getFieldDef
    ) = this()
    def this(
      schema: GraphQLSchema,
      // NOTE: this experimental optional second parameter is only needed in order
    // to support non-spec-compliant codebases. You should never need to use it.
    // It may disappear in the future.
    getFieldDefFn: getFieldDef,
      // Initial type may be provided in rare cases to facilitate traversals
    // beginning somewhere other than documents.
    initialType: GraphQLType
    ) = this()
    def enter(node: ASTNode): js.Any = js.native
    def getArgument(): Maybe[GraphQLArgument] = js.native
    def getDefaultValue(): Maybe[_] = js.native
    def getDirective(): Maybe[GraphQLDirective] = js.native
    def getEnumValue(): Maybe[GraphQLEnumValue] = js.native
    def getFieldDef(): GraphQLField[_, Maybe[_], StringDictionary[_]] = js.native
    def getInputType(): Maybe[GraphQLInputType] = js.native
    def getParentInputType(): Maybe[GraphQLInputType] = js.native
    def getParentType(): Maybe[GraphQLCompositeType] = js.native
    def getType(): Maybe[GraphQLOutputType] = js.native
    def leave(node: ASTNode): js.Any = js.native
  }
  
  type getFieldDef = js.Function3[
    /* schema */ GraphQLSchema, 
    /* parentType */ GraphQLType, 
    /* fieldNode */ FieldNode, 
    Maybe[GraphQLField[js.Any, js.Any, StringDictionary[js.Any]]]
  ]
}

