package typingsSlinky.grpcProtoLoader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Deserialize[T] = js.Function1[/* bytes */ typingsSlinky.node.Buffer, T]
  type PackageDefinition = org.scalablytyped.runtime.StringDictionary[typingsSlinky.grpcProtoLoader.mod.AnyDefinition]
  type Serialize[T] = js.Function1[/* value */ T, typingsSlinky.node.Buffer]
  type ServiceDefinition = org.scalablytyped.runtime.StringDictionary[typingsSlinky.grpcProtoLoader.mod.MethodDefinition[js.Object, js.Object]]
}
