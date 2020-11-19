package typingsSlinky.pkcs7Padding

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pkcs7-padding", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def pad(data: String, size: Double): String = js.native
  def pad(data: Buffer, size: Double): Buffer = js.native
  
  def unpad(data: String): String = js.native
  def unpad(data: Buffer): Buffer = js.native
}
