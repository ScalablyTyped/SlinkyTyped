package typingsSlinky.octokitTypes

import typingsSlinky.octokitTypes.endpointOptionsMod.EndpointOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestInterfaceMod.RequestInterface
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.octokitTypes.routeMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authInterfaceMod {
  
  @js.native
  trait AuthInterface[AuthOptions /* <: js.Array[_] */, Authentication /* <: js.Any */] extends StObject {
    
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type AuthOptions is not an array type */ args: AuthOptions
    ): js.Promise[Authentication] = js.native
    
    def hook[T](request: RequestInterface[js.Object], options: EndpointOptions): js.Promise[OctokitResponse[T]] = js.native
    def hook[T](request: RequestInterface[js.Object], route: Route): js.Promise[OctokitResponse[T]] = js.native
    def hook[T](request: RequestInterface[js.Object], route: Route, parameters: RequestParameters): js.Promise[OctokitResponse[T]] = js.native
  }
}
