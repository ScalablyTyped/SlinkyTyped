package typingsSlinky.cryptoJs

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.cryptoJs.mod.HmacHasherHelper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hmacSha224Mod extends Shortcut {
  
  @JSImport("crypto-js/hmac-sha224", JSImport.Namespace)
  @js.native
  val ^ : HmacHasherHelper = js.native
  
  type _To = HmacHasherHelper
  
  /* This means you don't have to write `^`, but can instead just say `hmacSha224Mod.foo` */
  override def _to: HmacHasherHelper = ^
}
