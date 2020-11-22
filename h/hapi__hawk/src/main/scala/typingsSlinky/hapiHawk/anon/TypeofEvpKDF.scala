package typingsSlinky.hapiHawk.anon

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.cryptoJs.anon.Hasher
import typingsSlinky.cryptoJs.mod.algo.EvpKDF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofEvpKDF extends Instantiable0[EvpKDF] {
  
  /**
    * Initializes a newly created key derivation function.
    *
    * @param cfg (Optional) The configuration options to use for the derivation.
    *
    * @example
    *
    *     var kdf = CryptoJS.algo.EvpKDF.create();
    *     var kdf = CryptoJS.algo.EvpKDF.create({ keySize: 8 });
    *     var kdf = CryptoJS.algo.EvpKDF.create({ keySize: 8, iterations: 1000 });
    */
  def create(): typingsSlinky.cryptoJs.mod.global.CryptoJS.algo.EvpKDF = js.native
  def create(cfg: Hasher): typingsSlinky.cryptoJs.mod.global.CryptoJS.algo.EvpKDF = js.native
}
