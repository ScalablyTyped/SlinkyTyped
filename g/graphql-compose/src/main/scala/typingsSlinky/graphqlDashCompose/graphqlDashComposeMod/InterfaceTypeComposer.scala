package typingsSlinky.graphqlDashCompose.graphqlDashComposeMod

import typingsSlinky.graphql.graphqlMod.GraphQLInterfaceType
import typingsSlinky.graphqlDashCompose.libInterfaceTypeComposerMod.InterfaceTypeComposeDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "InterfaceTypeComposer")
@js.native
class InterfaceTypeComposer[TSource, TContext] protected ()
  extends typingsSlinky.graphqlDashCompose.libInterfaceTypeComposerMod.InterfaceTypeComposer[TSource, TContext] {
  def this(
    gqType: GraphQLInterfaceType,
    schemaComposer: typingsSlinky.graphqlDashCompose.libSchemaComposerMod.SchemaComposer[TContext]
  ) = this()
}

/* static members */
@JSImport("graphql-compose", "InterfaceTypeComposer")
@js.native
object InterfaceTypeComposer extends js.Object {
  /**
    * Create `InterfaceTypeComposer` with adding it by name to the `SchemaComposer`.
    */
  def create[TSrc, TCtx](
    typeDef: InterfaceTypeComposeDefinition[TSrc, TCtx],
    schemaComposer: typingsSlinky.graphqlDashCompose.libSchemaComposerMod.SchemaComposer[TCtx]
  ): typingsSlinky.graphqlDashCompose.libInterfaceTypeComposerMod.InterfaceTypeComposer[TSrc, TCtx] = js.native
  /**
    * Create `InterfaceTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TSrc, TCtx](typeDef: InterfaceTypeComposeDefinition[TSrc, TCtx]): typingsSlinky.graphqlDashCompose.libInterfaceTypeComposerMod.InterfaceTypeComposer[TSrc, TCtx] = js.native
  def createTemp[TSrc, TCtx](
    typeDef: InterfaceTypeComposeDefinition[TSrc, TCtx],
    schemaComposer: typingsSlinky.graphqlDashCompose.libSchemaComposerMod.SchemaComposer[TCtx]
  ): typingsSlinky.graphqlDashCompose.libInterfaceTypeComposerMod.InterfaceTypeComposer[TSrc, TCtx] = js.native
}

