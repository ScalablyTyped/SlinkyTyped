package typingsSlinky.graphqlToolsMerge.mergeSchemasMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.buildASTSchemaMod.BuildSchemaOptions
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsMerge.anon.TypeofSchemaDirectiveVisi
import typingsSlinky.graphqlToolsMerge.mergeTypedefsMod.CompareFn
import typingsSlinky.graphqlToolsSchema.typesMod.ILogger
import typingsSlinky.graphqlToolsUtils.interfacesMod.IResolverValidationOptions
import typingsSlinky.graphqlToolsUtils.interfacesMod.IResolvers
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.graphqlToolsMerge.mergeTypedefsMod.Config because var conflicts: commentDescriptions. Inlined useSchemaDefinition, forceSchemaDefinition, throwOnConflict, reverseDirectives, exclusions, sort, convertExtensions */ @js.native
trait MergeSchemasConfig[Resolvers /* <: IResolvers[_, _, Record[String, _], _] */] extends BuildSchemaOptions {
  
  var convertExtensions: js.UndefOr[Boolean] = js.native
  
  var exclusions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Creates schema definition, even when no types are available
    * Produces: `schema { query: Query }`
    *
    * Default: false
    */
  var forceSchemaDefinition: js.UndefOr[Boolean] = js.native
  
  /**
    * Custom logger instance
    */
  var logger: js.UndefOr[ILogger] = js.native
  
  /**
    * Options to validate the resolvers being merged, if provided
    */
  var resolverValidationOptions: js.UndefOr[IResolverValidationOptions] = js.native
  
  /**
    * Additional resolvers to also merge
    */
  var resolvers: js.UndefOr[Resolvers | js.Array[Resolvers]] = js.native
  
  /**
    * Puts the next directive first.
    *
    * Default: false
    *
    * @example:
    * Given:
    * ```graphql
    *  type User { a: String @foo }
    *  type User { a: String @bar }
    * ```
    *
    * Results:
    * ```
    *  type User { a: @bar @foo }
    * ```
    */
  var reverseDirectives: js.UndefOr[Boolean] = js.native
  
  /**
    * Schema directives to apply to the type definitions being merged, if provided
    */
  var schemaDirectives: js.UndefOr[StringDictionary[TypeofSchemaDirectiveVisi]] = js.native
  
  /**
    * The schemas to be merged
    */
  var schemas: js.Array[GraphQLSchema] = js.native
  
  var sort: js.UndefOr[Boolean | CompareFn[String]] = js.native
  
  /**
    * Throws an error on a merge conflict
    *
    * Default: false
    */
  var throwOnConflict: js.UndefOr[Boolean] = js.native
  
  /**
    * Additional type definitions to also merge
    */
  var typeDefs: js.UndefOr[(js.Array[DocumentNode | String]) | DocumentNode | String] = js.native
  
  /**
    * Produces `schema { query: ..., mutation: ..., subscription: ... }`
    *
    * Default: true
    */
  var useSchemaDefinition: js.UndefOr[Boolean] = js.native
}
object MergeSchemasConfig {
  
  @scala.inline
  def apply[Resolvers /* <: IResolvers[_, _, Record[String, _], _] */](schemas: js.Array[GraphQLSchema]): MergeSchemasConfig[Resolvers] = {
    val __obj = js.Dynamic.literal(schemas = schemas.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeSchemasConfig[Resolvers]]
  }
  
  @scala.inline
  implicit class MergeSchemasConfigOps[Self <: MergeSchemasConfig[_], Resolvers /* <: IResolvers[_, _, Record[String, _], _] */] (val x: Self with MergeSchemasConfig[Resolvers]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSchemasVarargs(value: GraphQLSchema*): Self = this.set("schemas", js.Array(value :_*))
    
    @scala.inline
    def setSchemas(value: js.Array[GraphQLSchema]): Self = this.set("schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertExtensions(value: Boolean): Self = this.set("convertExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvertExtensions: Self = this.set("convertExtensions", js.undefined)
    
    @scala.inline
    def setExclusionsVarargs(value: String*): Self = this.set("exclusions", js.Array(value :_*))
    
    @scala.inline
    def setExclusions(value: js.Array[String]): Self = this.set("exclusions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusions: Self = this.set("exclusions", js.undefined)
    
    @scala.inline
    def setForceSchemaDefinition(value: Boolean): Self = this.set("forceSchemaDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceSchemaDefinition: Self = this.set("forceSchemaDefinition", js.undefined)
    
    @scala.inline
    def setLogger(value: ILogger): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setResolverValidationOptions(value: IResolverValidationOptions): Self = this.set("resolverValidationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolverValidationOptions: Self = this.set("resolverValidationOptions", js.undefined)
    
    @scala.inline
    def setResolversVarargs(value: Resolvers*): Self = this.set("resolvers", js.Array(value :_*))
    
    @scala.inline
    def setResolvers(value: Resolvers | js.Array[Resolvers]): Self = this.set("resolvers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolvers: Self = this.set("resolvers", js.undefined)
    
    @scala.inline
    def setReverseDirectives(value: Boolean): Self = this.set("reverseDirectives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverseDirectives: Self = this.set("reverseDirectives", js.undefined)
    
    @scala.inline
    def setSchemaDirectives(value: StringDictionary[TypeofSchemaDirectiveVisi]): Self = this.set("schemaDirectives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaDirectives: Self = this.set("schemaDirectives", js.undefined)
    
    @scala.inline
    def setSortFunction2(value: (String, String) => Double): Self = this.set("sort", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSort(value: Boolean | CompareFn[String]): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setThrowOnConflict(value: Boolean): Self = this.set("throwOnConflict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrowOnConflict: Self = this.set("throwOnConflict", js.undefined)
    
    @scala.inline
    def setTypeDefsVarargs(value: (DocumentNode | String)*): Self = this.set("typeDefs", js.Array(value :_*))
    
    @scala.inline
    def setTypeDefs(value: (js.Array[DocumentNode | String]) | DocumentNode | String): Self = this.set("typeDefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeDefs: Self = this.set("typeDefs", js.undefined)
    
    @scala.inline
    def setUseSchemaDefinition(value: Boolean): Self = this.set("useSchemaDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSchemaDefinition: Self = this.set("useSchemaDefinition", js.undefined)
  }
}
