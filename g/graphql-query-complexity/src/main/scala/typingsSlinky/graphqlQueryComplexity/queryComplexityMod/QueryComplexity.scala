package typingsSlinky.graphqlQueryComplexity.queryComplexityMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.astMod.FieldNode
import typingsSlinky.graphql.astMod.FragmentDefinitionNode
import typingsSlinky.graphql.astMod.InlineFragmentNode
import typingsSlinky.graphql.astMod.OperationDefinitionNode
import typingsSlinky.graphql.mod.GraphQLError
import typingsSlinky.graphql.mod.GraphQLInterfaceType
import typingsSlinky.graphql.mod.GraphQLObjectType
import typingsSlinky.graphql.mod.GraphQLUnionType
import typingsSlinky.graphql.mod.ValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryComplexity extends js.Object {
  var OperationDefinition: js.Object = js.native
  var complexity: Double = js.native
  var context: ValidationContext = js.native
  var estimators: js.Array[ComplexityEstimator] = js.native
  var options: QueryComplexityOptions = js.native
  def createError(): GraphQLError = js.native
  def nodeComplexity(node: FieldNode, typeDef: GraphQLInterfaceType): Double = js.native
  def nodeComplexity(node: FieldNode, typeDef: GraphQLInterfaceType, complexity: Double): Double = js.native
  def nodeComplexity(node: FieldNode, typeDef: GraphQLObjectType[_, _, StringDictionary[_]]): Double = js.native
  def nodeComplexity(node: FieldNode, typeDef: GraphQLObjectType[_, _, StringDictionary[_]], complexity: Double): Double = js.native
  def nodeComplexity(node: FieldNode, typeDef: GraphQLUnionType): Double = js.native
  def nodeComplexity(node: FieldNode, typeDef: GraphQLUnionType, complexity: Double): Double = js.native
  def nodeComplexity(node: FragmentDefinitionNode, typeDef: GraphQLInterfaceType): Double = js.native
  def nodeComplexity(node: FragmentDefinitionNode, typeDef: GraphQLInterfaceType, complexity: Double): Double = js.native
  def nodeComplexity(node: FragmentDefinitionNode, typeDef: GraphQLObjectType[_, _, StringDictionary[_]]): Double = js.native
  def nodeComplexity(
    node: FragmentDefinitionNode,
    typeDef: GraphQLObjectType[_, _, StringDictionary[_]],
    complexity: Double
  ): Double = js.native
  def nodeComplexity(node: FragmentDefinitionNode, typeDef: GraphQLUnionType): Double = js.native
  def nodeComplexity(node: FragmentDefinitionNode, typeDef: GraphQLUnionType, complexity: Double): Double = js.native
  def nodeComplexity(node: InlineFragmentNode, typeDef: GraphQLInterfaceType): Double = js.native
  def nodeComplexity(node: InlineFragmentNode, typeDef: GraphQLInterfaceType, complexity: Double): Double = js.native
  def nodeComplexity(node: InlineFragmentNode, typeDef: GraphQLObjectType[_, _, StringDictionary[_]]): Double = js.native
  def nodeComplexity(
    node: InlineFragmentNode,
    typeDef: GraphQLObjectType[_, _, StringDictionary[_]],
    complexity: Double
  ): Double = js.native
  def nodeComplexity(node: InlineFragmentNode, typeDef: GraphQLUnionType): Double = js.native
  def nodeComplexity(node: InlineFragmentNode, typeDef: GraphQLUnionType, complexity: Double): Double = js.native
  def nodeComplexity(node: OperationDefinitionNode, typeDef: GraphQLInterfaceType): Double = js.native
  def nodeComplexity(node: OperationDefinitionNode, typeDef: GraphQLInterfaceType, complexity: Double): Double = js.native
  def nodeComplexity(node: OperationDefinitionNode, typeDef: GraphQLObjectType[_, _, StringDictionary[_]]): Double = js.native
  def nodeComplexity(
    node: OperationDefinitionNode,
    typeDef: GraphQLObjectType[_, _, StringDictionary[_]],
    complexity: Double
  ): Double = js.native
  def nodeComplexity(node: OperationDefinitionNode, typeDef: GraphQLUnionType): Double = js.native
  def nodeComplexity(node: OperationDefinitionNode, typeDef: GraphQLUnionType, complexity: Double): Double = js.native
  def onOperationDefinitionEnter(operation: OperationDefinitionNode): Unit = js.native
  def onOperationDefinitionLeave(): js.UndefOr[GraphQLError] = js.native
}

