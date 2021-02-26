package typingsSlinky.sccBrokerClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hasherMod {
  
  @JSImport("scc-broker-client/hasher", JSImport.Namespace)
  @js.native
  class ^ () extends Hasher
  
  @js.native
  trait Hasher extends StObject {
    
    def hashToHex(key: String): String = js.native
    def hashToHex(key: String, algorithm: String): String = js.native
    
    def hashToIndex(key: js.UndefOr[scala.Nothing], modulo: Double): Double = js.native
    def hashToIndex(key: String, modulo: Double): Double = js.native
    def hashToIndex(key: Null, modulo: Double): Double = js.native
  }
}
