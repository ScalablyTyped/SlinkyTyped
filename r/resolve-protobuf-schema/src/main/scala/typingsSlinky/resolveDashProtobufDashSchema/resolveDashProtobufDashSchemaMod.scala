package typingsSlinky.resolveDashProtobufDashSchema

import typingsSlinky.protocolDashBuffersDashSchema.typesMod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("resolve-protobuf-schema", JSImport.Namespace)
@js.native
object resolveDashProtobufDashSchemaMod extends js.Object {
  def apply(
    file: String,
    callback: js.Function2[/* error */ js.Error | Null, /* schema */ js.UndefOr[Schema], Unit]
  ): Unit = js.native
  def sync(file: String): Schema = js.native
}

