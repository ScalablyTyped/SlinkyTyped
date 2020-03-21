package typingsSlinky.resolveProtobufSchema

import typingsSlinky.protocolBuffersSchema.typesMod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("resolve-protobuf-schema", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(
    file: String,
    callback: js.Function2[/* error */ js.Error | Null, /* schema */ js.UndefOr[Schema], Unit]
  ): Unit = js.native
  def sync(file: String): Schema = js.native
}

