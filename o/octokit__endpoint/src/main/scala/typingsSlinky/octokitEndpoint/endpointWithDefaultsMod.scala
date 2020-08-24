package typingsSlinky.octokitEndpoint

import typingsSlinky.octokitTypes.endpointDefaultsMod.EndpointDefaults
import typingsSlinky.octokitTypes.endpointOptionsMod.EndpointOptions
import typingsSlinky.octokitTypes.requestOptionsMod.RequestOptions
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.octokitTypes.routeMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@octokit/endpoint/dist-types/endpoint-with-defaults", JSImport.Namespace)
@js.native
object endpointWithDefaultsMod extends js.Object {
  def endpointWithDefaults(defaults: EndpointDefaults, route: EndpointOptions): RequestOptions = js.native
  def endpointWithDefaults(defaults: EndpointDefaults, route: EndpointOptions, options: RequestParameters): RequestOptions = js.native
  def endpointWithDefaults(defaults: EndpointDefaults, route: Route): RequestOptions = js.native
  def endpointWithDefaults(defaults: EndpointDefaults, route: Route, options: RequestParameters): RequestOptions = js.native
}

