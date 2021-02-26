package typingsSlinky.ethjsSigner

import typingsSlinky.ethjsSigner.ethjsSignerBooleans.`false`
import typingsSlinky.ethjsSigner.ethjsSignerBooleans.`true`
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ethjs-signer", "recover")
  @js.native
  def recover(rawTx: String, v: Double, r: Buffer, s: Buffer): Buffer = js.native
  @JSImport("ethjs-signer", "recover")
  @js.native
  def recover(rawTx: Buffer, v: Double, r: Buffer, s: Buffer): Buffer = js.native
  
  @JSImport("ethjs-signer", "sign")
  @js.native
  def sign(transaction: js.Object, privateKey: String): String = js.native
  @JSImport("ethjs-signer", "sign")
  @js.native
  def sign_false(transaction: js.Object, privateKey: String, toObject: `false`): String = js.native
  @JSImport("ethjs-signer", "sign")
  @js.native
  def sign_true(transaction: js.Object, privateKey: String, toObject: `true`): js.Array[_] = js.native
}
