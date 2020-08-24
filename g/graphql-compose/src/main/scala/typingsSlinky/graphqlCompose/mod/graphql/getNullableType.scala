package typingsSlinky.graphqlCompose.mod.graphql

import typingsSlinky.graphql.definitionMod.GraphQLNullableType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "graphql.getNullableType")
@js.native
object getNullableType extends js.Object {
  def apply(`type`: js.UndefOr[scala.Nothing]): js.UndefOr[scala.Nothing] = js.native
  def apply(`type`: typingsSlinky.graphql.definitionMod.GraphQLEnumType): typingsSlinky.graphql.definitionMod.GraphQLEnumType = js.native
  def apply(`type`: typingsSlinky.graphql.definitionMod.GraphQLInputObjectType): typingsSlinky.graphql.definitionMod.GraphQLInputObjectType = js.native
  def apply(`type`: typingsSlinky.graphql.definitionMod.GraphQLInterfaceType): typingsSlinky.graphql.definitionMod.GraphQLInterfaceType = js.native
  def apply(`type`: typingsSlinky.graphql.definitionMod.GraphQLScalarType): typingsSlinky.graphql.definitionMod.GraphQLScalarType = js.native
  def apply(`type`: typingsSlinky.graphql.definitionMod.GraphQLUnionType): typingsSlinky.graphql.definitionMod.GraphQLUnionType = js.native
  def apply[T /* <: (typingsSlinky.graphql.definitionMod.GraphQLObjectType[_, _]) | typingsSlinky.graphql.definitionMod.GraphQLList[_] */](`type`: T): T = js.native
  def apply[T /* <: GraphQLNullableType */](
    // FIXME Disabled because of https://github.com/yaacovCR/graphql-tools-fork/issues/40#issuecomment-586671219
  // eslint-disable-next-line @typescript-eslint/unified-signatures
  `type`: typingsSlinky.graphql.definitionMod.GraphQLNonNull[T]
  ): T = js.native
}

