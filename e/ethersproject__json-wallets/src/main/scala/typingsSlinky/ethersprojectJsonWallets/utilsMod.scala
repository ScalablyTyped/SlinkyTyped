package typingsSlinky.ethersprojectJsonWallets

import typingsSlinky.ethersprojectBytes.mod.Bytes
import typingsSlinky.ethersprojectBytes.mod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@ethersproject/json-wallets/lib/utils", "getPassword")
  @js.native
  def getPassword(password: String): js.typedarray.Uint8Array = js.native
  @JSImport("@ethersproject/json-wallets/lib/utils", "getPassword")
  @js.native
  def getPassword(password: Bytes): js.typedarray.Uint8Array = js.native
  
  @JSImport("@ethersproject/json-wallets/lib/utils", "looseArrayify")
  @js.native
  def looseArrayify(hexString: String): js.typedarray.Uint8Array = js.native
  
  @JSImport("@ethersproject/json-wallets/lib/utils", "searchPath")
  @js.native
  def searchPath(`object`: js.Any, path: String): String = js.native
  
  @JSImport("@ethersproject/json-wallets/lib/utils", "uuidV4")
  @js.native
  def uuidV4(randomBytes: BytesLike): String = js.native
  
  @JSImport("@ethersproject/json-wallets/lib/utils", "zpad")
  @js.native
  def zpad(value: String, length: Double): String = js.native
  @JSImport("@ethersproject/json-wallets/lib/utils", "zpad")
  @js.native
  def zpad(value: Double, length: Double): String = js.native
}
