package typingsSlinky.octokitGraphql

import typingsSlinky.octokitGraphql.anon.Data
import typingsSlinky.octokitGraphql.typesMod.GraphQlEndpointOptions
import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod {
  
  @JSImport("@octokit/graphql/dist-types/error", "GraphqlError")
  @js.native
  class GraphqlError[ResponseData] protected () extends Error {
    def this(request: GraphQlEndpointOptions, response: Data[ResponseData]) = this()
    
    var request: GraphQlEndpointOptions = js.native
  }
}
