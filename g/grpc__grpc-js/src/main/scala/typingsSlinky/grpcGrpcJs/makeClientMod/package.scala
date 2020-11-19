package typingsSlinky.grpcGrpcJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object makeClientMod {
  
  type Deserialize[T] = js.Function1[/* bytes */ typingsSlinky.node.Buffer, T]
  
  type PackageDefinition = org.scalablytyped.runtime.StringDictionary[js.Object | typingsSlinky.grpcGrpcJs.makeClientMod.ProtobufTypeDefinition]
  
  type Serialize[T] = js.Function1[/* value */ T, typingsSlinky.node.Buffer]
  
  type ServiceDefinition[ImplementationType] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ index in keyof ImplementationType ]: @grpc/grpc-js.@grpc/grpc-js/build/src/make-client.MethodDefinition<any, any>}
    */ typingsSlinky.grpcGrpcJs.grpcGrpcJsStrings.ServiceDefinition with org.scalablytyped.runtime.TopLevel[js.Any]
}
