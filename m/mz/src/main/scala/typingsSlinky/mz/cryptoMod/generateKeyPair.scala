package typingsSlinky.mz.cryptoMod

import typingsSlinky.mz.mzStrings.der
import typingsSlinky.mz.mzStrings.dsa
import typingsSlinky.mz.mzStrings.ec
import typingsSlinky.mz.mzStrings.pem
import typingsSlinky.mz.mzStrings.rsa
import typingsSlinky.node.AnonPrivateKey
import typingsSlinky.node.Buffer
import typingsSlinky.node.cryptoMod.DSAKeyPairKeyObjectOptions
import typingsSlinky.node.cryptoMod.DSAKeyPairOptions
import typingsSlinky.node.cryptoMod.ECKeyPairKeyObjectOptions
import typingsSlinky.node.cryptoMod.ECKeyPairOptions
import typingsSlinky.node.cryptoMod.KeyPairKeyObjectResult
import typingsSlinky.node.cryptoMod.RSAKeyPairKeyObjectOptions
import typingsSlinky.node.cryptoMod.RSAKeyPairOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/crypto", "generateKeyPair")
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
  @JSName("__promisify__")
  def promisify(`type`: dsa, options: DSAKeyPairOptions[der | pem, der | pem]): js.Promise[AnonPrivateKey] = js.native
  @JSName("__promisify__")
  def promisify(`type`: ec, options: ECKeyPairOptions[der | pem, der | pem]): js.Promise[AnonPrivateKey] = js.native
  @JSName("__promisify__")
  def promisify(`type`: rsa, options: RSAKeyPairOptions[der | pem, der | pem]): js.Promise[AnonPrivateKey] = js.native
  @JSName("__promisify__")
  def promisify_dsa(`type`: dsa, options: DSAKeyPairKeyObjectOptions): js.Promise[KeyPairKeyObjectResult] = js.native
  @JSName("__promisify__")
  def promisify_ec(`type`: ec, options: ECKeyPairKeyObjectOptions): js.Promise[KeyPairKeyObjectResult] = js.native
  @JSName("__promisify__")
  def promisify_rsa(`type`: rsa, options: RSAKeyPairKeyObjectOptions): js.Promise[KeyPairKeyObjectResult] = js.native
}

