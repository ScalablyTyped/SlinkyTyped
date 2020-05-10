package typingsSlinky.graphqlTools.filterTypesMod

import typingsSlinky.graphql.definitionMod.GraphQLNamedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms/FilterTypes", JSImport.Default)
@js.native
class default protected () extends FilterTypes {
  def this(filter: js.Function1[/* type */ GraphQLNamedType, Boolean]) = this()
}

