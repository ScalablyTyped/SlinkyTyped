package typingsSlinky.graphqlToolsStitch

import typingsSlinky.graphql.astMod.FieldNode
import typingsSlinky.graphql.astMod.SelectionSetNode
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsStitch.typesMod.IStitchSchemasOptions
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/stitch", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def forwardArgsToSelectionSet(selectionSet: String): js.Function1[/* field */ FieldNode, SelectionSetNode] = js.native
  def forwardArgsToSelectionSet(selectionSet: String, mapping: Record[String, js.Array[String]]): js.Function1[/* field */ FieldNode, SelectionSetNode] = js.native
  
  def stitchSchemas(
    hasSubschemasTypesTypeDefsSchemasOnTypeConflictResolversSchemaDirectivesInheritResolversFromInterfacesMergeTypesMergeDirectivesLoggerAllowUndefinedInResolveResolverValidationOptionsDirectiveResolversSchemaTransformsParseOptionsPruningOptions: IStitchSchemasOptions[_]
  ): GraphQLSchema = js.native
}
