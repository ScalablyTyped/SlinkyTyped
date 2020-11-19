package typingsSlinky.mz.mod.crypto

import typingsSlinky.mz.mzStrings.der
import typingsSlinky.mz.mzStrings.dsa
import typingsSlinky.mz.mzStrings.ec
import typingsSlinky.mz.mzStrings.ed25519
import typingsSlinky.mz.mzStrings.pem
import typingsSlinky.mz.mzStrings.rsa
import typingsSlinky.node.Buffer
import typingsSlinky.node.cryptoMod.DSAKeyPairKeyObjectOptions
import typingsSlinky.node.cryptoMod.DSAKeyPairOptions
import typingsSlinky.node.cryptoMod.ECKeyPairKeyObjectOptions
import typingsSlinky.node.cryptoMod.ECKeyPairOptions
import typingsSlinky.node.cryptoMod.ED25519KeyPairKeyObjectOptions
import typingsSlinky.node.cryptoMod.ED25519KeyPairOptions
import typingsSlinky.node.cryptoMod.RSAKeyPairKeyObjectOptions
import typingsSlinky.node.cryptoMod.RSAKeyPairOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mz", "crypto.generateKeyPair")
@js.native
object generateKeyPair extends js.Object {
  
  def apply(
    `type`: dsa,
    options: DSAKeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* publicKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      /* privateKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    `type`: dsa,
    options: DSAKeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      js.Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ String), 
      (/* privateKey */ Buffer) | (/* privateKey */ String), 
      Unit
    ]
  ): Unit = js.native
  def apply(
    `type`: ec,
    options: ECKeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* publicKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      /* privateKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    `type`: ec,
    options: ECKeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      js.Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ String), 
      (/* privateKey */ Buffer) | (/* privateKey */ String), 
      Unit
    ]
  ): Unit = js.native
  def apply(
    `type`: ed25519,
    options: ED25519KeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* publicKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      /* privateKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    `type`: ed25519,
    options: ED25519KeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      js.Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ String), 
      (/* privateKey */ Buffer) | (/* privateKey */ String), 
      Unit
    ]
  ): Unit = js.native
  def apply(
    `type`: rsa,
    options: RSAKeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* publicKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      /* privateKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    `type`: rsa,
    options: RSAKeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      js.Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ String), 
      (/* privateKey */ Buffer) | (/* privateKey */ String), 
      Unit
    ]
  ): Unit = js.native
}
