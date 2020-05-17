package typingsSlinky.grpcGrpcJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object makeClientMod {
  type Deserialize[T] = js.Function1[/* bytes */ typingsSlinky.node.Buffer, T]
  type PackageDefinition = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.grpcGrpcJs.makeClientMod.ServiceDefinition | typingsSlinky.grpcGrpcJs.makeClientMod.ProtobufTypeDefinition
  ]
  type Serialize[T] = js.Function1[/* value */ T, typingsSlinky.node.Buffer]
  type ServiceDefinition = org.scalablytyped.runtime.StringDictionary[typingsSlinky.grpcGrpcJs.makeClientMod.MethodDefinition[js.Any, js.Any]]
}
