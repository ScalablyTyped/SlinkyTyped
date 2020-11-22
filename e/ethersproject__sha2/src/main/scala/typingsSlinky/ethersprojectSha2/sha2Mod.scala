package typingsSlinky.ethersprojectSha2

import typingsSlinky.ethersprojectBytes.mod.BytesLike
import typingsSlinky.ethersprojectSha2.typesMod.SupportedAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/sha2/lib/sha2", JSImport.Namespace)
@js.native
object sha2Mod extends js.Object {
  
  def computeHmac(algorithm: SupportedAlgorithm, key: BytesLike, data: BytesLike): String = js.native
  
  def ripemd160(data: BytesLike): String = js.native
  
  def sha256(data: BytesLike): String = js.native
  
  def sha512(data: BytesLike): String = js.native
}
