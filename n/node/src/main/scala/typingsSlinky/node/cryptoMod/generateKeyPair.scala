package typingsSlinky.node.cryptoMod

import typingsSlinky.node.Anon_PrivateKey
import typingsSlinky.node.Buffer
import typingsSlinky.node.nodeStrings.der
import typingsSlinky.node.nodeStrings.dsa
import typingsSlinky.node.nodeStrings.ec
import typingsSlinky.node.nodeStrings.pem
import typingsSlinky.node.nodeStrings.rsa
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "generateKeyPair")
@js.native
object generateKeyPair extends js.Object {
  def apply(
    `type`: dsa,
    options: DSAKeyPairKeyObjectOptions,
    callback: js.Function3[/* err */ Error | Null, /* publicKey */ KeyObject, /* privateKey */ KeyObject, Unit]
  ): Unit = js.native
  def apply(
    `type`: dsa,
    options: DSAKeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ String), 
      (/* privateKey */ Buffer) | (/* privateKey */ String), 
      Unit
    ]
  ): Unit = js.native
  def apply(
    `type`: ec,
    options: ECKeyPairKeyObjectOptions,
    callback: js.Function3[/* err */ Error | Null, /* publicKey */ KeyObject, /* privateKey */ KeyObject, Unit]
  ): Unit = js.native
  def apply(
    `type`: ec,
    options: ECKeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ String), 
      (/* privateKey */ Buffer) | (/* privateKey */ String), 
      Unit
    ]
  ): Unit = js.native
  def apply(
    `type`: rsa,
    options: RSAKeyPairKeyObjectOptions,
    callback: js.Function3[/* err */ Error | Null, /* publicKey */ KeyObject, /* privateKey */ KeyObject, Unit]
  ): Unit = js.native
  def apply(
    `type`: rsa,
    options: RSAKeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ String), 
      (/* privateKey */ Buffer) | (/* privateKey */ String), 
      Unit
    ]
  ): Unit = js.native
  def __promisify__(`type`: dsa, options: DSAKeyPairOptions[der | pem, der | pem]): js.Promise[Anon_PrivateKey] = js.native
  def __promisify__(`type`: ec, options: ECKeyPairOptions[der | pem, der | pem]): js.Promise[Anon_PrivateKey] = js.native
  def __promisify__(`type`: rsa, options: RSAKeyPairOptions[der | pem, der | pem]): js.Promise[Anon_PrivateKey] = js.native
  @JSName("__promisify__")
  def __promisify___dsa(`type`: dsa, options: DSAKeyPairKeyObjectOptions): js.Promise[KeyPairKeyObjectResult] = js.native
  @JSName("__promisify__")
  def __promisify___ec(`type`: ec, options: ECKeyPairKeyObjectOptions): js.Promise[KeyPairKeyObjectResult] = js.native
  @JSName("__promisify__")
  def __promisify___rsa(`type`: rsa, options: RSAKeyPairKeyObjectOptions): js.Promise[KeyPairKeyObjectResult] = js.native
}

