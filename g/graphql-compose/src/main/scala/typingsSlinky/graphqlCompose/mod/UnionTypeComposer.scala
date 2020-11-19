package typingsSlinky.graphqlCompose.mod

import typingsSlinky.graphql.mod.GraphQLUnionType
import typingsSlinky.graphqlCompose.schemaComposerMod.SchemaComposer
import typingsSlinky.graphqlCompose.unionTypeComposerMod.UnionTypeComposeDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-compose", "UnionTypeComposer")
@js.native
class UnionTypeComposer[TSource, TContext] protected ()
  extends typingsSlinky.graphqlCompose.unionTypeComposerMod.UnionTypeComposer[TSource, TContext] {
  def this(gqType: GraphQLUnionType, schemaComposer: SchemaComposer[TContext]) = this()
}
/* static members */
@JSImport("graphql-compose", "UnionTypeComposer")
@js.native
object UnionTypeComposer extends js.Object {
  
  /**
    * Create `UnionTypeComposer` with adding it by name to the `SchemaComposer`.
    */
  def create[TSrc, TCtx](typeDef: UnionTypeComposeDefinition[TSrc, TCtx], schemaComposer: SchemaComposer[TCtx]): typingsSlinky.graphqlCompose.unionTypeComposerMod.UnionTypeComposer[TSrc, TCtx] = js.native
  
  /**
    * Create `UnionTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TSrc, TCtx](typeDef: UnionTypeComposeDefinition[TSrc, TCtx]): typingsSlinky.graphqlCompose.unionTypeComposerMod.UnionTypeComposer[TSrc, TCtx] = js.native
  def createTemp[TSrc, TCtx](typeDef: UnionTypeComposeDefinition[TSrc, TCtx], schemaComposer: SchemaComposer[TCtx]): typingsSlinky.graphqlCompose.unionTypeComposerMod.UnionTypeComposer[TSrc, TCtx] = js.native
}
