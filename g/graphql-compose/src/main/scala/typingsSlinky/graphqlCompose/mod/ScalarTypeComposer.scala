package typingsSlinky.graphqlCompose.mod

import typingsSlinky.graphqlCompose.graphqlMod.GraphQLScalarType
import typingsSlinky.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposeDefinition
import typingsSlinky.graphqlCompose.schemaComposerMod.SchemaComposer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-compose", "ScalarTypeComposer")
@js.native
class ScalarTypeComposer[TContext] protected ()
  extends typingsSlinky.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[TContext] {
  def this(gqType: GraphQLScalarType, schemaComposer: SchemaComposer[TContext]) = this()
}
/* static members */
@JSImport("graphql-compose", "ScalarTypeComposer")
@js.native
object ScalarTypeComposer extends js.Object {
  
  /**
    * Create `ScalarTypeComposer` with adding it by name to the `SchemaComposer`. This type became avaliable in SDL by its name.
    */
  def create[TCtx](typeDef: ScalarTypeComposeDefinition, schemaComposer: SchemaComposer[TCtx]): typingsSlinky.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[TCtx] = js.native
  
  /**
    * Create `ScalarTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TCtx](typeDef: ScalarTypeComposeDefinition): typingsSlinky.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[TCtx] = js.native
  def createTemp[TCtx](typeDef: ScalarTypeComposeDefinition, schemaComposer: SchemaComposer[TCtx]): typingsSlinky.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[TCtx] = js.native
}
