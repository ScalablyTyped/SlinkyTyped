package typingsSlinky.fingerprintjs

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.fingerprintjs.FingerprintJs.FingerprintOption
import typingsSlinky.fingerprintjs.FingerprintJs.FingerprintStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  class Fingerprint ()
    extends typingsSlinky.fingerprintjs.FingerprintJs.Fingerprint {
    /**
      * Create Fingerprint object.
      */
    def this(hasher: js.Function2[/* key */ String, /* seed */ Double, Double]) = this()
    def this(option: FingerprintOption) = this()
  }
  @js.native
  object Fingerprint extends TopLevel[FingerprintStatic]
}
