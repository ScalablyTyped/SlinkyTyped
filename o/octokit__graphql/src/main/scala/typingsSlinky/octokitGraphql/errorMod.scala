package typingsSlinky.octokitGraphql

import typingsSlinky.octokitGraphql.anon.Data
import typingsSlinky.octokitGraphql.typesMod.GraphQlEndpointOptions
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@octokit/graphql/dist-types/error", JSImport.Namespace)
@js.native
object errorMod extends js.Object {
  
  @js.native
  class GraphqlError[ResponseData] protected () extends Error {
    def this(request: GraphQlEndpointOptions, response: Data[ResponseData]) = this()
    
    var request: GraphQlEndpointOptions = js.native
  }
}
