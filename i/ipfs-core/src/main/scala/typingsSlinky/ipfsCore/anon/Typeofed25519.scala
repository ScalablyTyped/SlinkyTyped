package typingsSlinky.ipfsCore.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.libp2pCrypto.mod.keys.supportedKeys.ed25519.Ed25519PrivateKey
import typingsSlinky.libp2pCrypto.mod.keys.supportedKeys.ed25519.Ed25519PublicKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofed25519 extends js.Object {
  
  var Ed25519PrivateKey: Instantiable2[
    /* key */ js.typedarray.Uint8Array, 
    /* publicKey */ js.typedarray.Uint8Array, 
    typingsSlinky.libp2pCrypto.mod.keys.supportedKeys.ed25519.Ed25519PrivateKey
  ] = js.native
  
  var Ed25519PublicKey: Instantiable1[
    /* key */ js.typedarray.Uint8Array, 
    typingsSlinky.libp2pCrypto.mod.keys.supportedKeys.ed25519.Ed25519PublicKey
  ] = js.native
  
  def generateKeyPair(): js.Promise[Ed25519PrivateKey] = js.native
  
  def generateKeyPairFromSeed(seed: js.typedarray.Uint8Array): js.Promise[Ed25519PrivateKey] = js.native
  
  def unmarshalEd25519PrivateKey(buf: js.typedarray.Uint8Array): js.Promise[Ed25519PrivateKey] = js.native
  
  def unmarshalEd25519PublicKey(buf: js.typedarray.Uint8Array): Ed25519PublicKey = js.native
}
object Typeofed25519 {
  
  @scala.inline
  def apply(
    Ed25519PrivateKey: Instantiable2[
      /* key */ js.typedarray.Uint8Array, 
      /* publicKey */ js.typedarray.Uint8Array, 
      Ed25519PrivateKey
    ],
    Ed25519PublicKey: Instantiable1[/* key */ js.typedarray.Uint8Array, Ed25519PublicKey],
    generateKeyPair: () => js.Promise[Ed25519PrivateKey],
    generateKeyPairFromSeed: js.typedarray.Uint8Array => js.Promise[Ed25519PrivateKey],
    unmarshalEd25519PrivateKey: js.typedarray.Uint8Array => js.Promise[Ed25519PrivateKey],
    unmarshalEd25519PublicKey: js.typedarray.Uint8Array => Ed25519PublicKey
  ): Typeofed25519 = {
    val __obj = js.Dynamic.literal(Ed25519PrivateKey = Ed25519PrivateKey.asInstanceOf[js.Any], Ed25519PublicKey = Ed25519PublicKey.asInstanceOf[js.Any], generateKeyPair = js.Any.fromFunction0(generateKeyPair), generateKeyPairFromSeed = js.Any.fromFunction1(generateKeyPairFromSeed), unmarshalEd25519PrivateKey = js.Any.fromFunction1(unmarshalEd25519PrivateKey), unmarshalEd25519PublicKey = js.Any.fromFunction1(unmarshalEd25519PublicKey))
    __obj.asInstanceOf[Typeofed25519]
  }
  
  @scala.inline
  implicit class Typeofed25519Ops[Self <: Typeofed25519] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEd25519PrivateKey(
      value: Instantiable2[
          /* key */ js.typedarray.Uint8Array, 
          /* publicKey */ js.typedarray.Uint8Array, 
          Ed25519PrivateKey
        ]
    ): Self = this.set("Ed25519PrivateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEd25519PublicKey(value: Instantiable1[/* key */ js.typedarray.Uint8Array, Ed25519PublicKey]): Self = this.set("Ed25519PublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateKeyPair(value: () => js.Promise[Ed25519PrivateKey]): Self = this.set("generateKeyPair", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGenerateKeyPairFromSeed(value: js.typedarray.Uint8Array => js.Promise[Ed25519PrivateKey]): Self = this.set("generateKeyPairFromSeed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnmarshalEd25519PrivateKey(value: js.typedarray.Uint8Array => js.Promise[Ed25519PrivateKey]): Self = this.set("unmarshalEd25519PrivateKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnmarshalEd25519PublicKey(value: js.typedarray.Uint8Array => Ed25519PublicKey): Self = this.set("unmarshalEd25519PublicKey", js.Any.fromFunction1(value))
  }
}
