package typingsSlinky.cipherBase.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CipherBase extends js.Object {
  
  def `final`(): Buffer = js.native
  
  def update(value: Buffer): Buffer = js.native
  def update(value: Buffer, inputEnc: js.UndefOr[scala.Nothing], outputEnc: String): Buffer = js.native
  def update(value: Buffer, inputEnc: String): Buffer = js.native
  def update(value: Buffer, inputEnc: String, outputEnc: String): Buffer = js.native
}
