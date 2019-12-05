package typingsSlinky.graphqlDashCompose.graphqlDashComposeMod

import typingsSlinky.graphql.graphqlMod.GraphQLUnionType
import typingsSlinky.graphqlDashCompose.libUnionTypeComposerMod.UnionTypeComposeDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "UnionTypeComposer")
@js.native
class UnionTypeComposer[TSource, TContext] protected ()
  extends typingsSlinky.graphqlDashCompose.libUnionTypeComposerMod.UnionTypeComposer[TSource, TContext] {
  def this(
    gqType: GraphQLUnionType,
    schemaComposer: typingsSlinky.graphqlDashCompose.libSchemaComposerMod.SchemaComposer[TContext]
  ) = this()
}

/* static members */
@JSImport("graphql-compose", "UnionTypeComposer")
@js.native
object UnionTypeComposer extends js.Object {
  /**
    * Create `UnionTypeComposer` with adding it by name to the `SchemaComposer`.
    */
  def create[TSrc, TCtx](
    typeDef: UnionTypeComposeDefinition[TSrc, TCtx],
    schemaComposer: typingsSlinky.graphqlDashCompose.libSchemaComposerMod.SchemaComposer[TCtx]
  ): typingsSlinky.graphqlDashCompose.libUnionTypeComposerMod.UnionTypeComposer[TSrc, TCtx] = js.native
  /**
    * Create `UnionTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TSrc, TCtx](typeDef: UnionTypeComposeDefinition[TSrc, TCtx]): typingsSlinky.graphqlDashCompose.libUnionTypeComposerMod.UnionTypeComposer[TSrc, TCtx] = js.native
  def createTemp[TSrc, TCtx](
    typeDef: UnionTypeComposeDefinition[TSrc, TCtx],
    schemaComposer: typingsSlinky.graphqlDashCompose.libSchemaComposerMod.SchemaComposer[TCtx]
  ): typingsSlinky.graphqlDashCompose.libUnionTypeComposerMod.UnionTypeComposer[TSrc, TCtx] = js.native
}

