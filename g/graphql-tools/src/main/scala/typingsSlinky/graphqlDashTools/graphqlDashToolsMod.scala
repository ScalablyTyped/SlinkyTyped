package typingsSlinky.graphqlDashTools

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloDashLink.apolloDashLinkMod.ApolloLink
import typingsSlinky.graphql.graphqlMod.GraphQLDirective
import typingsSlinky.graphql.graphqlMod.GraphQLSchema
import typingsSlinky.graphql.languageAstMod.DocumentNode
import typingsSlinky.graphql.typeDefinitionMod.GraphQLField
import typingsSlinky.graphql.typeDefinitionMod.GraphQLFieldResolver
import typingsSlinky.graphql.typeDefinitionMod.GraphQLNamedType
import typingsSlinky.graphql.typeDefinitionMod.GraphQLResolveInfo
import typingsSlinky.graphqlDashTools.distInterfacesMod.GraphQLParseOptions
import typingsSlinky.graphqlDashTools.distInterfacesMod.IAddResolveFunctionsToSchemaOptions
import typingsSlinky.graphqlDashTools.distInterfacesMod.IDelegateToSchemaOptions
import typingsSlinky.graphqlDashTools.distInterfacesMod.IDirectiveResolvers
import typingsSlinky.graphqlDashTools.distInterfacesMod.IExecutableSchemaDefinition
import typingsSlinky.graphqlDashTools.distInterfacesMod.IFieldIteratorFn
import typingsSlinky.graphqlDashTools.distInterfacesMod.ILogger
import typingsSlinky.graphqlDashTools.distInterfacesMod.IMockOptions
import typingsSlinky.graphqlDashTools.distInterfacesMod.IMockServer
import typingsSlinky.graphqlDashTools.distInterfacesMod.IMocks
import typingsSlinky.graphqlDashTools.distInterfacesMod.IResolverValidationOptions
import typingsSlinky.graphqlDashTools.distInterfacesMod.IResolvers
import typingsSlinky.graphqlDashTools.distInterfacesMod.ITypeDefinitions
import typingsSlinky.graphqlDashTools.distInterfacesMod.ITypedef
import typingsSlinky.graphqlDashTools.distInterfacesMod.Transform
import typingsSlinky.graphqlDashTools.distStitchingMakeRemoteExecutableSchemaMod.Fetcher
import typingsSlinky.graphqlDashTools.distTransformsFilterRootFieldsMod.RootFilter
import typingsSlinky.graphqlDashTools.distTransformsRenameTypesMod.RenameOptions
import typingsSlinky.graphqlDashTools.distTransformsTransformRootFieldsMod.RootTransformer
import typingsSlinky.graphqlDashTools.distTransformsWrapQueryMod.QueryWrapper
import typingsSlinky.graphqlDashTools.graphqlDashToolsStrings.Mutation
import typingsSlinky.graphqlDashTools.graphqlDashToolsStrings.Query
import typingsSlinky.graphqlDashTools.graphqlDashToolsStrings.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", JSImport.Namespace)
@js.native
object graphqlDashToolsMod extends js.Object {
  @js.native
  class AddArgumentsAsVariables protected ()
    extends typingsSlinky.graphqlDashTools.distTransformsMod.AddArgumentsAsVariables {
    def this(schema: GraphQLSchema, args: StringDictionary[js.Any]) = this()
  }
  
  @js.native
  class AddTypenameToAbstract protected ()
    extends typingsSlinky.graphqlDashTools.distTransformsMod.AddTypenameToAbstract {
    def this(targetSchema: GraphQLSchema) = this()
  }
  
  @js.native
  class CheckResultAndHandleErrors protected ()
    extends typingsSlinky.graphqlDashTools.distTransformsMod.CheckResultAndHandleErrors {
    def this(info: GraphQLResolveInfo) = this()
    def this(info: GraphQLResolveInfo, fieldName: String) = this()
  }
  
  @js.native
  class ExpandAbstractTypes protected ()
    extends typingsSlinky.graphqlDashTools.distTransformsMod.ExpandAbstractTypes {
    def this(transformedSchema: GraphQLSchema, targetSchema: GraphQLSchema) = this()
  }
  
  @js.native
  class ExtractField protected ()
    extends typingsSlinky.graphqlDashTools.distTransformsMod.ExtractField {
    def this(hasFromTo: Anon_From) = this()
  }
  
  @js.native
  class FilterRootFields protected ()
    extends typingsSlinky.graphqlDashTools.distTransformsMod.FilterRootFields {
    def this(filter: RootFilter) = this()
  }
  
  @js.native
  class FilterToSchema protected ()
    extends typingsSlinky.graphqlDashTools.distTransformsMod.FilterToSchema {
    def this(targetSchema: GraphQLSchema) = this()
  }
  
  @js.native
  class FilterTypes protected ()
    extends typingsSlinky.graphqlDashTools.distTransformsMod.FilterTypes {
    def this(filter: js.Function1[/* type */ GraphQLNamedType, Boolean]) = this()
  }
  
  @js.native
  class MockList protected ()
    extends typingsSlinky.graphqlDashTools.distMockMod.MockList {
    def this(len: js.Array[Double]) = this()
    def this(len: Double) = this()
    def this(len: js.Array[Double], wrappedFunction: GraphQLFieldResolver[_, _, StringDictionary[_]]) = this()
    def this(len: Double, wrappedFunction: GraphQLFieldResolver[_, _, StringDictionary[_]]) = this()
  }
  
  @js.native
  class RenameRootFields protected ()
    extends typingsSlinky.graphqlDashTools.distTransformsMod.RenameRootFields {
    def this(renamer: js.Function3[
            /* operation */ Query | Mutation | Subscription, 
            /* name */ String, 
            /* field */ GraphQLField[_, _, StringDictionary[_]], 
            String
          ]) = this()
  }
  
  @js.native
  class RenameTypes protected ()
    extends typingsSlinky.graphqlDashTools.distTransformsMod.RenameTypes {
    def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]]) = this()
    def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]], options: RenameOptions) = this()
  }
  
  @js.native
  class ReplaceFieldWithFragment protected ()
    extends typingsSlinky.graphqlDashTools.distTransformsMod.ReplaceFieldWithFragment {
    def this(targetSchema: GraphQLSchema, fragments: js.Array[Anon_Field]) = this()
  }
  
  @js.native
  class SchemaDirectiveVisitor protected ()
    extends typingsSlinky.graphqlDashTools.distSchemaVisitorMod.SchemaDirectiveVisitor {
    protected def this(config: Anon_Args) = this()
  }
  
  @js.native
  class SchemaError protected ()
    extends typingsSlinky.graphqlDashTools.distMakeExecutableSchemaMod.SchemaError {
    def this(message: String) = this()
  }
  
  @js.native
  class TransformRootFields protected ()
    extends typingsSlinky.graphqlDashTools.distTransformsMod.TransformRootFields {
    def this(transform: RootTransformer) = this()
  }
  
  @js.native
  class WrapQuery protected ()
    extends typingsSlinky.graphqlDashTools.distTransformsMod.WrapQuery {
    def this(path: js.Array[String], wrapper: QueryWrapper, extractor: js.Function1[/* result */ js.Any, _]) = this()
  }
  
  val attachConnectorsToContext: js.Function = js.native
  val defaultMergedResolver: GraphQLFieldResolver[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  def addCatchUndefinedToSchema(schema: GraphQLSchema): Unit = js.native
  def addErrorLoggingToSchema(schema: GraphQLSchema, logger: ILogger): Unit = js.native
  def addMockFunctionsToSchema(hasSchemaMocksPreserveResolvers: IMockOptions): Unit = js.native
  def addResolveFunctionsToSchema(options: GraphQLSchema): GraphQLSchema = js.native
  def addResolveFunctionsToSchema(options: GraphQLSchema, legacyInputResolvers: IResolvers[_, _]): GraphQLSchema = js.native
  def addResolveFunctionsToSchema(
    options: GraphQLSchema,
    legacyInputResolvers: IResolvers[_, _],
    legacyInputValidationOptions: IResolverValidationOptions
  ): GraphQLSchema = js.native
  def addResolveFunctionsToSchema(options: IAddResolveFunctionsToSchemaOptions): GraphQLSchema = js.native
  def addResolveFunctionsToSchema(options: IAddResolveFunctionsToSchemaOptions, legacyInputResolvers: IResolvers[_, _]): GraphQLSchema = js.native
  def addResolveFunctionsToSchema(
    options: IAddResolveFunctionsToSchemaOptions,
    legacyInputResolvers: IResolvers[_, _],
    legacyInputValidationOptions: IResolverValidationOptions
  ): GraphQLSchema = js.native
  def addSchemaLevelResolveFunction(schema: GraphQLSchema, fn: GraphQLFieldResolver[_, _, StringDictionary[_]]): Unit = js.native
  def assertResolveFunctionsPresent(schema: GraphQLSchema): Unit = js.native
  def assertResolveFunctionsPresent(schema: GraphQLSchema, resolverValidationOptions: IResolverValidationOptions): Unit = js.native
  def attachDirectiveResolvers(schema: GraphQLSchema, directiveResolvers: IDirectiveResolvers[_, _]): Unit = js.native
  def buildSchemaFromTypeDefinitions(typeDefinitions: ITypeDefinitions): GraphQLSchema = js.native
  def buildSchemaFromTypeDefinitions(typeDefinitions: ITypeDefinitions, parseOptions: GraphQLParseOptions): GraphQLSchema = js.native
  def chainResolvers(resolvers: js.Array[GraphQLFieldResolver[_, _, StringDictionary[_]]]): js.Function4[
    /* root */ js.Any, 
    /* args */ StringDictionary[js.Any], 
    /* ctx */ js.Any, 
    /* info */ GraphQLResolveInfo, 
    _
  ] = js.native
  def checkForResolveTypeResolver(schema: GraphQLSchema): Unit = js.native
  def checkForResolveTypeResolver(schema: GraphQLSchema, requireResolversForResolveType: Boolean): Unit = js.native
  def concatenateTypeDefs(typeDefinitionsAry: js.Array[ITypedef]): String = js.native
  def concatenateTypeDefs(typeDefinitionsAry: js.Array[ITypedef], calledFunctionRefs: js.Any): String = js.native
  def decorateWithLogger(fn: js.UndefOr[scala.Nothing], logger: ILogger, hint: String): GraphQLFieldResolver[_, _, StringDictionary[_]] = js.native
  def decorateWithLogger(fn: GraphQLFieldResolver[_, _, StringDictionary[_]], logger: ILogger, hint: String): GraphQLFieldResolver[_, _, StringDictionary[_]] = js.native
  def defaultCreateRemoteResolver(fetcher: Fetcher): GraphQLFieldResolver[_, _, StringDictionary[_]] = js.native
  def delegateToSchema(options: GraphQLSchema, args: js.Any*): js.Promise[_] = js.native
  def delegateToSchema(options: IDelegateToSchemaOptions[StringDictionary[_]], args: js.Any*): js.Promise[_] = js.native
  def extendResolversFromInterfaces(schema: GraphQLSchema, resolvers: IResolvers[_, _]): IResolvers[_, _] = js.native
  def extractExtensionDefinitions(ast: DocumentNode): DocumentNode with Anon_Definitions = js.native
  def forEachField(schema: GraphQLSchema, fn: IFieldIteratorFn): Unit = js.native
  def introspectSchema(fetcher: ApolloLink): js.Promise[GraphQLSchema] = js.native
  def introspectSchema(fetcher: ApolloLink, linkContext: StringDictionary[js.Any]): js.Promise[GraphQLSchema] = js.native
  def introspectSchema(fetcher: Fetcher): js.Promise[GraphQLSchema] = js.native
  def introspectSchema(fetcher: Fetcher, linkContext: StringDictionary[js.Any]): js.Promise[GraphQLSchema] = js.native
  def makeExecutableSchema[TContext](
    hasTypeDefsResolversConnectorsLoggerAllowUndefinedInResolveResolverValidationOptionsDirectiveResolversSchemaDirectivesParseOptionsInheritResolversFromInterfaces: IExecutableSchemaDefinition[TContext]
  ): GraphQLSchema = js.native
  def makeRemoteExecutableSchema(hasSchemaLinkFetcherCreateResolverBuildSchemaOptionsPrintSchemaOptions: Anon_ArgName): GraphQLSchema = js.native
  def mergeSchemas(
    hasSchemasOnTypeConflictResolversSchemaDirectivesInheritResolversFromInterfacesMergeDirectives: Anon_InheritResolversFromInterfaces
  ): GraphQLSchema = js.native
  def mockServer(schema: GraphQLSchema, mocks: IMocks): IMockServer = js.native
  def mockServer(schema: GraphQLSchema, mocks: IMocks, preserveResolvers: Boolean): IMockServer = js.native
  def mockServer(schema: ITypeDefinitions, mocks: IMocks): IMockServer = js.native
  def mockServer(schema: ITypeDefinitions, mocks: IMocks, preserveResolvers: Boolean): IMockServer = js.native
  def transformSchema(targetSchema: GraphQLSchema, transforms: js.Array[Transform]): GraphQLSchema with Anon_Transforms = js.native
  /* static members */
  @js.native
  object SchemaDirectiveVisitor extends js.Object {
    /* protected */ def getDeclaredDirectives(schema: GraphQLSchema, directiveVisitors: StringDictionary[TypeofClassSchemaDirectiveVisitor]): StringDictionary[GraphQLDirective] = js.native
    def getDirectiveDeclaration(directiveName: String, schema: GraphQLSchema): GraphQLDirective = js.native
    def visitSchemaDirectives(schema: GraphQLSchema, directiveVisitors: StringDictionary[TypeofClassSchemaDirectiveVisitor]): StringDictionary[
        js.Array[typingsSlinky.graphqlDashTools.distSchemaVisitorMod.SchemaDirectiveVisitor]
      ] = js.native
    def visitSchemaDirectives(
      schema: GraphQLSchema,
      directiveVisitors: StringDictionary[TypeofClassSchemaDirectiveVisitor],
      context: StringDictionary[js.Any]
    ): StringDictionary[
        js.Array[typingsSlinky.graphqlDashTools.distSchemaVisitorMod.SchemaDirectiveVisitor]
      ] = js.native
  }
  
}

