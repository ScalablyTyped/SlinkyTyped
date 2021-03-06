package typingsSlinky.protocolBuffersSchema

import typingsSlinky.node.Buffer
import typingsSlinky.protocolBuffersSchema.typesMod.Schema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("protocol-buffers-schema", JSImport.Namespace)
  @js.native
  def apply(buffer: String): Schema = js.native
  @JSImport("protocol-buffers-schema", JSImport.Namespace)
  @js.native
  def apply(buffer: Buffer): Schema = js.native
  
  @JSImport("protocol-buffers-schema", "parse")
  @js.native
  def parse(buffer: String): Schema = js.native
  @JSImport("protocol-buffers-schema", "parse")
  @js.native
  def parse(buffer: Buffer): Schema = js.native
  
  @JSImport("protocol-buffers-schema", "stringify")
  @js.native
  def stringify(schema: Schema): String = js.native
}
