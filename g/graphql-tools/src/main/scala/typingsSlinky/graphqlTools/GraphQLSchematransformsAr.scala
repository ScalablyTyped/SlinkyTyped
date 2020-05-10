package typingsSlinky.graphqlTools

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.GraphQLSchemaConfigtypesA
import typingsSlinky.graphql.astMod.SchemaDefinitionNode
import typingsSlinky.graphql.astMod.SchemaExtensionNode
import typingsSlinky.graphql.definitionMod.GraphQLAbstractType
import typingsSlinky.graphql.definitionMod.GraphQLNamedType
import typingsSlinky.graphql.definitionMod.GraphQLObjectType
import typingsSlinky.graphql.directivesMod.GraphQLDirective
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphql.schemaMod.GraphQLSchemaConfig
import typingsSlinky.graphql.schemaMod.TypeMap
import typingsSlinky.graphqlTools.interfacesMod.Transform
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql.GraphQLSchema & {  transforms  :std.Array<graphql-tools.graphql-tools/dist/transforms/transforms.Transform>} */
@js.native
trait GraphQLSchematransformsAr extends js.Object {
  var astNode: Maybe[SchemaDefinitionNode] = js.native
  var extensionASTNodes: Maybe[js.Array[SchemaExtensionNode]] = js.native
  var extensions: Maybe[Record[String, _]] = js.native
  var transforms: js.Array[Transform] = js.native
  def getDirective(name: String): Maybe[GraphQLDirective] = js.native
  def getDirectives(): js.Array[GraphQLDirective] = js.native
  def getMutationType(): Maybe[GraphQLObjectType[_, _, StringDictionary[_]]] = js.native
  def getPossibleTypes(abstractType: GraphQLAbstractType): js.Array[GraphQLObjectType[_, _, StringDictionary[_]]] = js.native
  def getQueryType(): Maybe[GraphQLObjectType[_, _, StringDictionary[_]]] = js.native
  def getSubscriptionType(): Maybe[GraphQLObjectType[_, _, StringDictionary[_]]] = js.native
  def getType(name: String): Maybe[GraphQLNamedType] = js.native
  def getTypeMap(): TypeMap = js.native
  def isPossibleType(abstractType: GraphQLAbstractType, possibleType: GraphQLObjectType[_, _, StringDictionary[_]]): Boolean = js.native
  def toConfig(): GraphQLSchemaConfigtypesA = js.native
}

object GraphQLSchematransformsAr {
  @scala.inline
  def apply(
    getDirective: String => Maybe[GraphQLDirective],
    getDirectives: () => js.Array[GraphQLDirective],
    getMutationType: () => Maybe[GraphQLObjectType[_, _, StringDictionary[_]]],
    getPossibleTypes: GraphQLAbstractType => js.Array[GraphQLObjectType[_, _, StringDictionary[_]]],
    getQueryType: () => Maybe[GraphQLObjectType[_, _, StringDictionary[_]]],
    getSubscriptionType: () => Maybe[GraphQLObjectType[_, _, StringDictionary[_]]],
    getType: String => Maybe[GraphQLNamedType],
    getTypeMap: () => TypeMap,
    isPossibleType: (GraphQLAbstractType, GraphQLObjectType[_, _, StringDictionary[_]]) => Boolean,
    toConfig: () => GraphQLSchemaConfigtypesA,
    transforms: js.Array[Transform]
  ): GraphQLSchematransformsAr = {
    val __obj = js.Dynamic.literal(getDirective = js.Any.fromFunction1(getDirective), getDirectives = js.Any.fromFunction0(getDirectives), getMutationType = js.Any.fromFunction0(getMutationType), getPossibleTypes = js.Any.fromFunction1(getPossibleTypes), getQueryType = js.Any.fromFunction0(getQueryType), getSubscriptionType = js.Any.fromFunction0(getSubscriptionType), getType = js.Any.fromFunction1(getType), getTypeMap = js.Any.fromFunction0(getTypeMap), isPossibleType = js.Any.fromFunction2(isPossibleType), toConfig = js.Any.fromFunction0(toConfig), transforms = transforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLSchematransformsAr]
  }
  @scala.inline
  implicit class GraphQLSchematransformsArOps[Self <: GraphQLSchematransformsAr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDirective(value: String => Maybe[GraphQLDirective]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDirective")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDirectives(value: () => js.Array[GraphQLDirective]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDirectives")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMutationType(value: () => Maybe[GraphQLObjectType[_, _, StringDictionary[_]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMutationType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPossibleTypes(value: GraphQLAbstractType => js.Array[GraphQLObjectType[_, _, StringDictionary[_]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPossibleTypes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetQueryType(value: () => Maybe[GraphQLObjectType[_, _, StringDictionary[_]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getQueryType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSubscriptionType(value: () => Maybe[GraphQLObjectType[_, _, StringDictionary[_]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubscriptionType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetType(value: String => Maybe[GraphQLNamedType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTypeMap(value: () => TypeMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTypeMap")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsPossibleType(value: (GraphQLAbstractType, GraphQLObjectType[_, _, StringDictionary[_]]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPossibleType")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withToConfig(value: () => GraphQLSchemaConfigtypesA): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toConfig")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTransforms(value: js.Array[Transform]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transforms")(value.asInstanceOf[js.Any])
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
    def withExtensionASTNodes(value: Maybe[js.Array[SchemaExtensionNode]]): Self = {
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
    def withExtensionASTNodesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionASTNodes")(null)
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
  }
  
}

