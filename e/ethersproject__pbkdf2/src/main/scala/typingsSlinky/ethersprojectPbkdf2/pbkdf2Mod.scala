package typingsSlinky.ethersprojectPbkdf2

import typingsSlinky.ethersprojectBytes.mod.BytesLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/pbkdf2/lib/pbkdf2", JSImport.Namespace)
@js.native
object pbkdf2Mod extends js.Object {
  
  def pbkdf2(password: BytesLike, salt: BytesLike, iterations: Double, keylen: Double, hashAlgorithm: String): String = js.native
}
