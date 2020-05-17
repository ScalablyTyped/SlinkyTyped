package typingsSlinky.grpcGrpcJs.mod

import typingsSlinky.grpcGrpcJs.makeClientMod.ServiceClientConstructor
import typingsSlinky.grpcGrpcJs.makeClientMod.ServiceDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js", "makeClientConstructor")
@js.native
object makeClientConstructor extends js.Object {
  def apply(methods: ServiceDefinition, serviceName: String): ServiceClientConstructor = js.native
  def apply(methods: ServiceDefinition, serviceName: String, classOptions: js.Object): ServiceClientConstructor = js.native
}

