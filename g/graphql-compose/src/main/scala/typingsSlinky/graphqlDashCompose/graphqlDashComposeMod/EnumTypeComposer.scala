package typingsSlinky.graphqlDashCompose.graphqlDashComposeMod

import typingsSlinky.graphqlDashCompose.libEnumTypeComposerMod.EnumTypeComposeDefinition
import typingsSlinky.graphqlDashCompose.libGraphqlMod.GraphQLEnumType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "EnumTypeComposer")
@js.native
class EnumTypeComposer[TContext] protected ()
  extends typingsSlinky.graphqlDashCompose.libEnumTypeComposerMod.EnumTypeComposer[TContext] {
  def this(
    gqType: GraphQLEnumType,
    schemaComposer: typingsSlinky.graphqlDashCompose.libSchemaComposerMod.SchemaComposer[TContext]
  ) = this()
}

/* static members */
@JSImport("graphql-compose", "EnumTypeComposer")
@js.native
object EnumTypeComposer extends js.Object {
  /**
    * Create `EnumTypeComposer` with adding it by name to the `SchemaComposer`. This type became avaliable in SDL by its name.
    */
  def create[TCtx](
    typeDef: EnumTypeComposeDefinition,
    schemaComposer: typingsSlinky.graphqlDashCompose.libSchemaComposerMod.SchemaComposer[TCtx]
  ): typingsSlinky.graphqlDashCompose.libEnumTypeComposerMod.EnumTypeComposer[TCtx] = js.native
  /**
    * Create `EnumTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TCtx](typeDef: EnumTypeComposeDefinition): typingsSlinky.graphqlDashCompose.libEnumTypeComposerMod.EnumTypeComposer[TCtx] = js.native
  def createTemp[TCtx](
    typeDef: EnumTypeComposeDefinition,
    schemaComposer: typingsSlinky.graphqlDashCompose.libSchemaComposerMod.SchemaComposer[TCtx]
  ): typingsSlinky.graphqlDashCompose.libEnumTypeComposerMod.EnumTypeComposer[TCtx] = js.native
}

