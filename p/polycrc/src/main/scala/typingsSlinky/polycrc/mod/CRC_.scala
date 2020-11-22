package typingsSlinky.polycrc.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("polycrc", "CRC")
@js.native
class CRC_ protected () extends js.Object {
  def this(width: Double, poly: Double, xor_in: Double, xor_out: Double, reflect: Boolean) = this()
  
  def calculate(buffer: Buffer): Double = js.native
  
  def calculate_no_table(buffer: Buffer): Double = js.native
  
  def gen_table(): js.typedarray.Int32Array = js.native
  
  def print_table(): String = js.native
}
