package typingsSlinky.bip174

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bip174/src/lib/converter/varint", JSImport.Namespace)
@js.native
object varintMod extends js.Object {
  
  def decode(buffer: Buffer): Double = js.native
  def decode(buffer: Buffer, offset: Double): Double = js.native
  
  def encode(_number: Double): Buffer = js.native
  def encode(_number: Double, buffer: js.UndefOr[scala.Nothing], offset: Double): Buffer = js.native
  def encode(_number: Double, buffer: Buffer): Buffer = js.native
  def encode(_number: Double, buffer: Buffer, offset: Double): Buffer = js.native
  
  def encodingLength(_number: Double): Double = js.native
}
