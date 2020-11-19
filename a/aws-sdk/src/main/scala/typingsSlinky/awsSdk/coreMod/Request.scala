package typingsSlinky.awsSdk.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/lib/core", "Request")
@js.native
class Request[D, E] protected ()
  extends typingsSlinky.awsSdk.requestMod.Request[D, E] {
  /**
    * Creates a request for an operation on a given service with a set of input parameters.
    *
    * @param {AWS.Service} service - The service to perform the operation on.
    * @param {string} operation - The operation to perform on the service.
    * @param {object} params - Parameters to send to the operation.
    */
  def this(service: typingsSlinky.awsSdk.serviceMod.Service, operation: String) = this()
  def this(service: typingsSlinky.awsSdk.serviceMod.Service, operation: String, params: js.Any) = this()
}
