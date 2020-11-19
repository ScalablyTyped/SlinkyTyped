package typingsSlinky.protocolBuffersSchema

import typingsSlinky.node.Buffer
import typingsSlinky.protocolBuffersSchema.typesMod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protocol-buffers-schema", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(buffer: String): Schema = js.native
  def apply(buffer: Buffer): Schema = js.native
  
  def parse(buffer: String): Schema = js.native
  def parse(buffer: Buffer): Schema = js.native
  
  def stringify(schema: Schema): String = js.native
}
