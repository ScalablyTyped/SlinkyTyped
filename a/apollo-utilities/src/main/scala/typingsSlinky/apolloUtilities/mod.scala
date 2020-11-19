package typingsSlinky.apolloUtilities

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.apolloUtilities.directivesMod.DirectiveInfo
import typingsSlinky.apolloUtilities.directivesMod.InclusionDirectives
import typingsSlinky.apolloUtilities.getFromASTMod.FragmentMap
import typingsSlinky.apolloUtilities.mergeDeepMod.TupleToIntersection
import typingsSlinky.apolloUtilities.storeUtilsMod.Directives
import typingsSlinky.apolloUtilities.storeUtilsMod.IdConfig
import typingsSlinky.apolloUtilities.storeUtilsMod.IdValue
import typingsSlinky.apolloUtilities.storeUtilsMod.JsonValue
import typingsSlinky.apolloUtilities.storeUtilsMod.StoreValue
import typingsSlinky.apolloUtilities.storeUtilsMod.VariableValue
import typingsSlinky.apolloUtilities.transformMod.GetDirectiveConfig
import typingsSlinky.apolloUtilities.transformMod.RemoveArgumentsConfig
import typingsSlinky.apolloUtilities.transformMod.RemoveDirectiveConfig
import typingsSlinky.apolloUtilities.transformMod.RemoveFragmentSpreadConfig
import typingsSlinky.graphql.astMod.DirectiveNode
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.astMod.FieldNode
import typingsSlinky.graphql.astMod.FragmentDefinitionNode
import typingsSlinky.graphql.astMod.NameNode
import typingsSlinky.graphql.astMod.OperationDefinitionNode
import typingsSlinky.graphql.astMod.SelectionNode
import typingsSlinky.graphql.astMod.ValueNode
import typingsSlinky.graphql.executeMod.ExecutionResult
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-utilities", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def addTypenameToDocument(doc: DocumentNode): DocumentNode = js.native
  
  def argumentsObjectFromField(field: DirectiveNode, variables: js.Object): js.Object = js.native
  def argumentsObjectFromField(field: FieldNode, variables: js.Object): js.Object = js.native
  
  def assign(target: js.Any, sources: js.Any*): js.Any = js.native
  def assign[A, B](a: A, b: B): A with B = js.native
  def assign[A, B, C](a: A, b: B, c: C): A with B with C = js.native
  def assign[A, B, C, D](a: A, b: B, c: C, d: D): A with B with C with D = js.native
  def assign[A, B, C, D, E](a: A, b: B, c: C, d: D, e: E): A with B with C with D with E = js.native
  
  def buildQueryFromSelectionSet(document: DocumentNode): DocumentNode = js.native
  
  val canUseWeakMap: Boolean = js.native
  
  def checkDocument(doc: DocumentNode): DocumentNode = js.native
  
  def cloneDeep[T](value: T): T = js.native
  
  def createFragmentMap(): FragmentMap = js.native
  def createFragmentMap(fragments: js.Array[FragmentDefinitionNode]): FragmentMap = js.native
  
  def getDefaultValues(): StringDictionary[JsonValue] = js.native
  def getDefaultValues(definition: OperationDefinitionNode): StringDictionary[JsonValue] = js.native
  
  def getDirectiveInfoFromField(field: FieldNode, variables: js.Object): DirectiveInfo = js.native
  
  def getDirectiveNames(doc: DocumentNode): js.Array[String] = js.native
  
  def getDirectivesFromDocument(directives: js.Array[GetDirectiveConfig], doc: DocumentNode): DocumentNode = js.native
  
  def getEnv(): js.UndefOr[String] = js.native
  
  def getFragmentDefinition(doc: DocumentNode): FragmentDefinitionNode = js.native
  
  def getFragmentDefinitions(doc: DocumentNode): js.Array[FragmentDefinitionNode] = js.native
  
  def getFragmentQueryDocument(document: DocumentNode): DocumentNode = js.native
  def getFragmentQueryDocument(document: DocumentNode, fragmentName: String): DocumentNode = js.native
  
  def getInclusionDirectives(directives: js.Array[DirectiveNode]): InclusionDirectives = js.native
  
  def getMainDefinition(queryDoc: DocumentNode): OperationDefinitionNode | FragmentDefinitionNode = js.native
  
  def getMutationDefinition(doc: DocumentNode): OperationDefinitionNode = js.native
  
  def getOperationDefinition(doc: DocumentNode): js.UndefOr[OperationDefinitionNode] = js.native
  
  def getOperationDefinitionOrDie(document: DocumentNode): OperationDefinitionNode = js.native
  
  def getOperationName(doc: DocumentNode): String | Null = js.native
  
  def getQueryDefinition(doc: DocumentNode): OperationDefinitionNode = js.native
  
  def getStoreKeyName(fieldName: String): String = js.native
  def getStoreKeyName(fieldName: String, args: js.UndefOr[scala.Nothing], directives: Directives): String = js.native
  def getStoreKeyName(fieldName: String, args: js.Object): String = js.native
  def getStoreKeyName(fieldName: String, args: js.Object, directives: Directives): String = js.native
  
  def graphQLResultHasError(result: ExecutionResult[StringDictionary[_], StringDictionary[_]]): Double = js.native
  
  def hasClientExports(document: DocumentNode): Boolean = js.native
  
  def hasDirectives(names: js.Array[String], doc: DocumentNode): Boolean = js.native
  
  def isDevelopment(): Boolean = js.native
  
  def isEnv(env: String): Boolean = js.native
  
  def isEqual(a: js.Any, b: js.Any): Boolean = js.native
  
  def isField(selection: SelectionNode): /* is graphql.graphql/language/ast.FieldNode */ Boolean = js.native
  
  def isIdValue(idObject: StoreValue): /* is apollo-utilities.apollo-utilities/lib/storeUtils.IdValue */ Boolean = js.native
  
  def isInlineFragment(selection: SelectionNode): /* is graphql.graphql/language/ast.InlineFragmentNode */ Boolean = js.native
  
  def isJsonValue(jsonObject: StoreValue): /* is apollo-utilities.apollo-utilities/lib/storeUtils.JsonValue */ Boolean = js.native
  
  def isNumberValue(value: ValueNode): /* is apollo-utilities.apollo-utilities/lib/storeUtils.NumberValue */ Boolean = js.native
  
  def isProduction(): Boolean = js.native
  
  def isScalarValue(value: ValueNode): /* is apollo-utilities.apollo-utilities/lib/storeUtils.ScalarValue */ Boolean = js.native
  
  def isTest(): Boolean = js.native
  
  def maybeDeepFreeze(obj: js.Any): js.Any = js.native
  
  def mergeDeep[T /* <: js.Array[_] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param sources because its type T is not an array type */ sources: T
  ): TupleToIntersection[T] = js.native
  
  def mergeDeepArray[T](sources: js.Array[T]): T = js.native
  
  def removeArgumentsFromDocument(config: js.Array[RemoveArgumentsConfig], doc: DocumentNode): DocumentNode = js.native
  
  def removeClientSetsFromDocument(document: DocumentNode): DocumentNode | Null = js.native
  
  def removeConnectionDirectiveFromDocument(doc: DocumentNode): DocumentNode = js.native
  
  def removeDirectivesFromDocument(directives: js.Array[RemoveDirectiveConfig], doc: DocumentNode): DocumentNode | Null = js.native
  
  def removeFragmentSpreadFromDocument(config: js.Array[RemoveFragmentSpreadConfig], doc: DocumentNode): DocumentNode = js.native
  
  def resultKeyNameFromField(field: FieldNode): String = js.native
  
  def shouldInclude(selection: SelectionNode): Boolean = js.native
  def shouldInclude(selection: SelectionNode, variables: StringDictionary[js.Any]): Boolean = js.native
  
  def storeKeyNameFromField(field: FieldNode): String = js.native
  def storeKeyNameFromField(field: FieldNode, variables: js.Object): String = js.native
  
  def stripSymbols[T](data: T): T = js.native
  
  def toIdValue(idConfig: String): IdValue = js.native
  def toIdValue(idConfig: String, generated: Boolean): IdValue = js.native
  def toIdValue(idConfig: IdConfig): IdValue = js.native
  def toIdValue(idConfig: IdConfig, generated: Boolean): IdValue = js.native
  
  def tryFunctionOrLogError(f: js.Function): js.Any = js.native
  
  def valueFromNode(node: ValueNode): js.Any = js.native
  def valueFromNode(node: ValueNode, onVariable: VariableValue): js.Any = js.native
  
  def valueToObjectRepresentation(argObj: js.Any, name: NameNode, value: ValueNode): Unit = js.native
  def valueToObjectRepresentation(argObj: js.Any, name: NameNode, value: ValueNode, variables: js.Object): Unit = js.native
  
  def variablesInOperation(operation: OperationDefinitionNode): Set[String] = js.native
  
  def warnOnceInDevelopment(msg: String): Unit = js.native
  def warnOnceInDevelopment(msg: String, `type`: String): Unit = js.native
}
