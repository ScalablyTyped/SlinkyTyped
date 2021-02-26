package typingsSlinky.nodePhpass

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-phpass", "CRYPT_BLOWFISH")
  @js.native
  val CRYPT_BLOWFISH: /* 1 */ Double = js.native
  
  @JSImport("node-phpass", "CRYPT_EXT_DES")
  @js.native
  val CRYPT_EXT_DES: /* 2 */ Double = js.native
  
  @JSImport("node-phpass", "PasswordHash")
  @js.native
  class PasswordHash () extends StObject {
    def this(length: Double) = this()
    def this(length: js.UndefOr[scala.Nothing], portable: Boolean) = this()
    def this(length: Double, portable: Boolean) = this()
    def this(length: js.UndefOr[scala.Nothing], portable: js.UndefOr[scala.Nothing], phpVersion: Double) = this()
    def this(length: js.UndefOr[scala.Nothing], portable: Boolean, phpVersion: Double) = this()
    def this(length: Double, portable: js.UndefOr[scala.Nothing], phpVersion: Double) = this()
    def this(length: Double, portable: Boolean, phpVersion: Double) = this()
    
    def CheckPassword(password: String, hash: String): Boolean = js.native
    
    def HashPassword(password: String): js.Promise[String] = js.native
    def HashPassword(password: String, method: /* 1 */ Double): js.Promise[String] = js.native
  }
}
