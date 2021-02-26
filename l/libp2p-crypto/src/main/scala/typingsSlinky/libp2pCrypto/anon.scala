package typingsSlinky.libp2pCrypto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait GenSharedKey extends StObject {
    
    def genSharedKey(theirPub: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = js.native
    def genSharedKey(theirPub: js.typedarray.Uint8Array, forcePrivate: js.Any): js.Promise[js.typedarray.Uint8Array] = js.native
    
    var key: js.typedarray.Uint8Array = js.native
  }
}
