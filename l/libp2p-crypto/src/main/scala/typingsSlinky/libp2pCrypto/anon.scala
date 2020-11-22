package typingsSlinky.libp2pCrypto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait GenSharedKey extends js.Object {
    
    def genSharedKey(theirPub: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = js.native
    def genSharedKey(theirPub: js.typedarray.Uint8Array, forcePrivate: js.Any): js.Promise[js.typedarray.Uint8Array] = js.native
    
    var key: js.typedarray.Uint8Array = js.native
  }
}
