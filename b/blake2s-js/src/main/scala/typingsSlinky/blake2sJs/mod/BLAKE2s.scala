package typingsSlinky.blake2sJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BLAKE2s extends js.Object {
  
  def digest(): js.typedarray.Uint8Array = js.native
  
  def hexDigest(): String = js.native
  
  def update(p: ByteArray): this.type = js.native
  def update(p: ByteArray, offset: js.UndefOr[scala.Nothing], length: Double): this.type = js.native
  def update(p: ByteArray, offset: Double): this.type = js.native
  def update(p: ByteArray, offset: Double, length: Double): this.type = js.native
}
