package typingsSlinky.graphql

import typingsSlinky.graphql.graphQLErrorMod.GraphQLError
import typingsSlinky.graphql.sourceMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql/error/syntaxError", JSImport.Namespace)
@js.native
object syntaxErrorMod extends js.Object {
  
  def syntaxError(source: Source, position: Double, description: String): GraphQLError = js.native
}
