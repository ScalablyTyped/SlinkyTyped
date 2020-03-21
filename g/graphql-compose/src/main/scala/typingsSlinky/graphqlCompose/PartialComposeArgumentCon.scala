package typingsSlinky.graphqlCompose

import typingsSlinky.graphql.astMod.InputValueDefinitionNode
import typingsSlinky.graphql.definitionMod.GraphQLInputType
import typingsSlinky.graphqlCompose.definitionsMod.Extensions
import typingsSlinky.graphqlCompose.definitionsMod.Thunk
import typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeArgumentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<graphql-compose.graphql-compose/lib/ObjectTypeComposer.ComposeArgumentConfigAsObject> */
@js.native
trait PartialComposeArgumentCon extends js.Object {
  @JSName("$call")
  var $call: js.UndefOr[Unit] = js.native
  var astNode: js.UndefOr[InputValueDefinitionNode] = js.native
  var defaultValue: js.UndefOr[js.Any] = js.native
  var description: js.UndefOr[String] = js.native
  var extensions: js.UndefOr[Extensions] = js.native
  var `type`: js.UndefOr[Thunk[ComposeArgumentType] | GraphQLInputType] = js.native
}

