package typingsSlinky.firebaseFirestore

import typingsSlinky.grpcGrpcJs.makeClientMod.GrpcObject
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/platform_node/load_protos", JSImport.Namespace)
@js.native
object platformNodeLoadProtosMod extends js.Object {
  val protoLoaderOptions: IConversionOptions = js.native
  def loadProtos(): GrpcObject = js.native
  def loadRawProtos(): Root = js.native
}

