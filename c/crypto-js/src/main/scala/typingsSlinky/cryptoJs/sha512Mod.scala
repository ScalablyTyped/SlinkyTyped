package typingsSlinky.cryptoJs

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.cryptoJs.mod.HasherHelper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sha512Mod extends Shortcut {
  
  @JSImport("crypto-js/sha512", JSImport.Namespace)
  @js.native
  val ^ : HasherHelper = js.native
  
  type _To = HasherHelper
  
  /* This means you don't have to write `^`, but can instead just say `sha512Mod.foo` */
  override def _to: HasherHelper = ^
}
