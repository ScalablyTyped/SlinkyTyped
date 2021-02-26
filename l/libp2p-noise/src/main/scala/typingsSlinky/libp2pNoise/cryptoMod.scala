package typingsSlinky.libp2pNoise

import typingsSlinky.libp2pNoise.handshakeInterfaceMod.IHandshake
import typingsSlinky.std.AsyncIterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cryptoMod {
  
  @JSImport("libp2p-noise/dist/src/crypto", "decryptStream")
  @js.native
  def decryptStream(handshake: IHandshake): IReturnEncryptionWrapper = js.native
  
  @JSImport("libp2p-noise/dist/src/crypto", "encryptStream")
  @js.native
  def encryptStream(handshake: IHandshake): IReturnEncryptionWrapper = js.native
  
  type IReturnEncryptionWrapper = js.Function1[
    /* source */ js.Iterable[js.typedarray.Uint8Array], 
    AsyncIterableIterator[js.typedarray.Uint8Array]
  ]
}
