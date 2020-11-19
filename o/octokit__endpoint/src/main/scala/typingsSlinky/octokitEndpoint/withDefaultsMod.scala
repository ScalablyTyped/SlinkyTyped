package typingsSlinky.octokitEndpoint

import typingsSlinky.octokitTypes.endpointDefaultsMod.EndpointDefaults
import typingsSlinky.octokitTypes.endpointInterfaceMod.EndpointInterface
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@octokit/endpoint/dist-types/with-defaults", JSImport.Namespace)
@js.native
object withDefaultsMod extends js.Object {
  
  def withDefaults(oldDefaults: Null, newDefaults: RequestParameters): EndpointInterface[js.Object] = js.native
  def withDefaults(oldDefaults: EndpointDefaults, newDefaults: RequestParameters): EndpointInterface[js.Object] = js.native
}
