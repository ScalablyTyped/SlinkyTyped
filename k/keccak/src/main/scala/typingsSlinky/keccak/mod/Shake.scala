package typingsSlinky.keccak.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.streamMod.Transform
import typingsSlinky.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("keccak", "Shake")
@js.native
class Shake protected () extends Transform {
  def this(rate: Double, capacity: Double, delimitedSuffix: Double, options: TransformOptions) = this()
  def this(rate: Double, capacity: Double, delimitedSuffix: Null, options: TransformOptions) = this()
  
  def squeeze(dataByteLength: Double): Buffer = js.native
  def squeeze(dataByteLength: Double, encoding: BufferEncoding): String = js.native
  
  def update(data: String): Shake = js.native
  def update(data: String, encoding: BufferEncoding): Shake = js.native
  def update(data: Buffer): Shake = js.native
  def update(data: Buffer, encoding: BufferEncoding): Shake = js.native
}
