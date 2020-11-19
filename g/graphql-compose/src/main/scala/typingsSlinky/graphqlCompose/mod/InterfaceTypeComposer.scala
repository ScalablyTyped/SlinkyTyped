package typingsSlinky.graphqlCompose.mod

import typingsSlinky.graphql.mod.GraphQLInterfaceType
import typingsSlinky.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposeDefinition
import typingsSlinky.graphqlCompose.schemaComposerMod.SchemaComposer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-compose", "InterfaceTypeComposer")
@js.native
class InterfaceTypeComposer[TSource, TContext] protected ()
  extends typingsSlinky.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[TSource, TContext] {
  def this(gqType: GraphQLInterfaceType, schemaComposer: SchemaComposer[TContext]) = this()
}
/* static members */
@JSImport("graphql-compose", "InterfaceTypeComposer")
@js.native
object InterfaceTypeComposer extends js.Object {
  
  /**
    * Create `InterfaceTypeComposer` with adding it by name to the `SchemaComposer`.
    */
  def create[TSrc, TCtx](typeDef: InterfaceTypeComposeDefinition[TSrc, TCtx], schemaComposer: SchemaComposer[TCtx]): typingsSlinky.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[TSrc, TCtx] = js.native
  
  /**
    * Create `InterfaceTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TSrc, TCtx](typeDef: InterfaceTypeComposeDefinition[TSrc, TCtx]): typingsSlinky.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[TSrc, TCtx] = js.native
  def createTemp[TSrc, TCtx](typeDef: InterfaceTypeComposeDefinition[TSrc, TCtx], schemaComposer: SchemaComposer[TCtx]): typingsSlinky.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[TSrc, TCtx] = js.native
}
