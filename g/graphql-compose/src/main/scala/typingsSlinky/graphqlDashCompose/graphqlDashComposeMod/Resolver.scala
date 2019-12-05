package typingsSlinky.graphqlDashCompose.graphqlDashComposeMod

import typingsSlinky.graphqlDashCompose.libResolverMod.ResolverOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "Resolver")
@js.native
class Resolver[TSource, TContext, TArgs, TReturn] protected ()
  extends typingsSlinky.graphqlDashCompose.libResolverMod.Resolver[TSource, TContext, TArgs, TReturn] {
  def this(
    opts: ResolverOpts[TSource, TContext, TArgs, _],
    schemaComposer: typingsSlinky.graphqlDashCompose.libSchemaComposerMod.SchemaComposer[TContext]
  ) = this()
}

