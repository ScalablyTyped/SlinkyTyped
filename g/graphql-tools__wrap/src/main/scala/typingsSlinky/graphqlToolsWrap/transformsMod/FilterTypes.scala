package typingsSlinky.graphqlToolsWrap.transformsMod

import typingsSlinky.graphql.definitionMod.GraphQLNamedType
import typingsSlinky.graphqlToolsWrap.filterTypesMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/wrap/transforms", "FilterTypes")
@js.native
class FilterTypes protected () extends default {
  def this(filter: js.Function1[/* type */ GraphQLNamedType, Boolean]) = this()
}
