package typingsSlinky.octokitAuthToken

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type AnyResponse = typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse[js.Any]
  type EndpointDefaults = typingsSlinky.octokitTypes.endpointDefaultsMod.EndpointDefaults
  type EndpointOptions = typingsSlinky.octokitTypes.endpointOptionsMod.EndpointOptions
  type RequestInterface = typingsSlinky.octokitTypes.requestInterfaceMod.RequestInterface[js.Object]
  type RequestParameters = typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
  type Route = typingsSlinky.octokitTypes.routeMod.Route
  type StrategyInterface = typingsSlinky.octokitTypes.strategyInterfaceMod.StrategyInterface[
    js.Array[typingsSlinky.octokitAuthToken.typesMod.Token], 
    js.Array[js.Any], 
    typingsSlinky.octokitAuthToken.typesMod.Authentication
  ]
  type Token = java.lang.String
}
