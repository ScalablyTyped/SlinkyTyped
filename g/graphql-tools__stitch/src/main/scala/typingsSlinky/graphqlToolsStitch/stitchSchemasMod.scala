package typingsSlinky.graphqlToolsStitch

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsStitch.typesMod.IStitchSchemasOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/stitch/stitchSchemas", JSImport.Namespace)
@js.native
object stitchSchemasMod extends js.Object {
  
  def isDocumentNode(`object`: js.Any): /* is graphql.graphql/language/ast.DocumentNode */ Boolean = js.native
  
  def stitchSchemas(
    hasSubschemasTypesTypeDefsSchemasOnTypeConflictResolversSchemaDirectivesInheritResolversFromInterfacesMergeTypesMergeDirectivesLoggerAllowUndefinedInResolveResolverValidationOptionsDirectiveResolversSchemaTransformsParseOptionsPruningOptions: IStitchSchemasOptions[_]
  ): GraphQLSchema = js.native
}
