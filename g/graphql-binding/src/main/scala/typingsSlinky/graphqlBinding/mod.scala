package typingsSlinky.graphqlBinding

import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlBinding.distTypesMod.BindingOptions
import typingsSlinky.graphqlBinding.distTypesMod.FragmentReplacement
import typingsSlinky.graphqlBinding.distTypesMod.Operation
import typingsSlinky.graphqlTools.interfacesMod.IResolvers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-binding", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Binding protected ()
    extends typingsSlinky.graphqlBinding.bindingMod.Binding {
    def this(hasSchemaFragmentReplacementsBeforeDisableCache: BindingOptions) = this()
  }
  
  @js.native
  class Delegate protected ()
    extends typingsSlinky.graphqlBinding.delegateMod.Delegate {
    def this(hasSchemaFragmentReplacementsBeforeDisableCache: BindingOptions) = this()
  }
  
  @js.native
  class FlowGenerator protected ()
    extends typingsSlinky.graphqlBinding.flowGeneratorMod.FlowGenerator {
    def this(hasSchemaInputSchemaPathOutputBindingPathIsDefaultExport: AnonInputSchemaPath) = this()
  }
  
  @js.native
  class Generator protected ()
    extends typingsSlinky.graphqlBinding.generatorMod.Generator {
    def this(hasSchemaInputSchemaPathOutputBindingPathIsDefaultExport: AnonInputSchemaPath) = this()
  }
  
  @js.native
  class TypescriptGenerator protected ()
    extends typingsSlinky.graphqlBinding.typescriptGeneratorMod.TypescriptGenerator {
    def this(hasSchemaInputSchemaPathOutputBindingPathIsDefaultExport: AnonInputSchemaPath) = this()
  }
  
  def addFragmentToInfo(info: GraphQLResolveInfo, fragment: String): GraphQLResolveInfo = js.native
  def buildInfo(rootFieldName: String, operation: Operation, schema: GraphQLSchema): GraphQLResolveInfo = js.native
  def buildInfo(rootFieldName: String, operation: Operation, schema: GraphQLSchema, info: String): GraphQLResolveInfo = js.native
  def buildInfo(rootFieldName: String, operation: Operation, schema: GraphQLSchema, info: DocumentNode): GraphQLResolveInfo = js.native
  def buildInfo(rootFieldName: String, operation: Operation, schema: GraphQLSchema, info: GraphQLResolveInfo): GraphQLResolveInfo = js.native
  def extractFragmentReplacements(resolvers: IResolvers[_, _]): js.Array[FragmentReplacement] = js.native
  def forwardTo(bindingName: String): js.Function4[
    /* parent */ js.Any, 
    /* args */ js.Any, 
    /* context */ js.Any, 
    /* info */ GraphQLResolveInfo, 
    _
  ] = js.native
  def makeBindingClass[T](hasSchema: AnonSchema): T = js.native
}

