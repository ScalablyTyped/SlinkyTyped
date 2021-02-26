package typingsSlinky.resolveProtobufSchema

import typingsSlinky.protocolBuffersSchema.typesMod.Schema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("resolve-protobuf-schema", JSImport.Namespace)
  @js.native
  def apply(
    file: String,
    callback: js.Function2[/* error */ js.Error | Null, /* schema */ js.UndefOr[Schema], Unit]
  ): Unit = js.native
  
  @JSImport("resolve-protobuf-schema", "sync")
  @js.native
  def sync(file: String): Schema = js.native
}
