package typingsSlinky.grpcProtoLoader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grpcProtoLoader.mod.ServiceDefinition
    - typingsSlinky.grpcProtoLoader.mod.MessageTypeDefinition
    - typingsSlinky.grpcProtoLoader.mod.EnumTypeDefinition
  */
  type AnyDefinition = typingsSlinky.grpcProtoLoader.mod._AnyDefinition | typingsSlinky.grpcProtoLoader.mod.ServiceDefinition
  
  type Deserialize[T] = js.Function1[/* bytes */ typingsSlinky.node.Buffer, T]
  
  type PackageDefinition = org.scalablytyped.runtime.StringDictionary[typingsSlinky.grpcProtoLoader.mod.AnyDefinition]
  
  type Serialize[T] = js.Function1[/* value */ T, typingsSlinky.node.Buffer]
  
  type ServiceDefinition = org.scalablytyped.runtime.StringDictionary[typingsSlinky.grpcProtoLoader.mod.MethodDefinition[js.Object, js.Object]]
}
