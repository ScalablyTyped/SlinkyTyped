package typingsSlinky.rusha.mod

import typingsSlinky.node.Buffer
import typingsSlinky.rusha.rushaStrings.hex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hash extends js.Object {
  
  def digest(encoding: js.UndefOr[scala.Nothing]): js.typedarray.ArrayBuffer = js.native
  @JSName("digest")
  def digest_hex(encoding: hex): String = js.native
  
  def update(value: String): Hash = js.native
  def update(value: js.Array[Double]): Hash = js.native
  def update(value: Buffer): Hash = js.native
  def update(value: js.typedarray.ArrayBuffer): Hash = js.native
}
