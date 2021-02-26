package typingsSlinky.cryptoJs

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.cryptoJs.mod.Encoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encBase64Mod extends Shortcut {
  
  @JSImport("crypto-js/enc-base64", JSImport.Namespace)
  @js.native
  val ^ : Encoder = js.native
  
  type _To = Encoder
  
  /* This means you don't have to write `^`, but can instead just say `encBase64Mod.foo` */
  override def _to: Encoder = ^
}
