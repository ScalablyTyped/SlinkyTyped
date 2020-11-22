package typingsSlinky.hapiHawk.anon

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.cryptoJs.mod.KDFOption
import typingsSlinky.cryptoJs.mod.algo.PBKDF2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPBKDF2 extends Instantiable0[PBKDF2] {
  
  /**
    * Initializes a newly created key derivation function.
    *
    * @param cfg (Optional) The configuration options to use for the derivation.
    *
    * @example
    *
    *     var kdf = CryptoJS.algo.PBKDF2.create();
    *     var kdf = CryptoJS.algo.PBKDF2.create({ keySize: 8 });
    *     var kdf = CryptoJS.algo.PBKDF2.create({ keySize: 8, iterations: 1000 });
    */
  def create(): typingsSlinky.cryptoJs.mod.global.CryptoJS.algo.PBKDF2 = js.native
  def create(cfg: KDFOption): typingsSlinky.cryptoJs.mod.global.CryptoJS.algo.PBKDF2 = js.native
}
