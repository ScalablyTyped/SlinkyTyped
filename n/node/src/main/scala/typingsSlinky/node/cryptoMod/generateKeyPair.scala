package typingsSlinky.node.cryptoMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.nodeStrings.der
import typingsSlinky.node.nodeStrings.dsa
import typingsSlinky.node.nodeStrings.ec
import typingsSlinky.node.nodeStrings.ed25519
import typingsSlinky.node.nodeStrings.ed448
import typingsSlinky.node.nodeStrings.pem
import typingsSlinky.node.nodeStrings.rsa
import typingsSlinky.node.nodeStrings.x25519
import typingsSlinky.node.nodeStrings.x448
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crypto", "generateKeyPair")
@js.native
object generateKeyPair extends js.Object {
  
  def apply(
    `type`: dsa,
    options: DSAKeyPairKeyObjectOptions,
    callback: js.Function3[/* err */ js.Error | Null, /* publicKey */ KeyObject, /* privateKey */ KeyObject, Unit]
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
    callback: js.Function3[/* err */ js.Error | Null, /* publicKey */ KeyObject, /* privateKey */ KeyObject, Unit]
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
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ js.Error | Null, /* publicKey */ KeyObject, /* privateKey */ KeyObject, Unit]
  ): Unit = js.native
  def apply(
    `type`: ed25519,
    options: ED25519KeyPairKeyObjectOptions,
    callback: js.Function3[/* err */ js.Error | Null, /* publicKey */ KeyObject, /* privateKey */ KeyObject, Unit]
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
    `type`: ed448,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ js.Error | Null, /* publicKey */ KeyObject, /* privateKey */ KeyObject, Unit]
  ): Unit = js.native
  def apply(
    `type`: ed448,
    options: ED448KeyPairKeyObjectOptions,
    callback: js.Function3[/* err */ js.Error | Null, /* publicKey */ KeyObject, /* privateKey */ KeyObject, Unit]
  ): Unit = js.native
  def apply(
    `type`: ed448,
    options: ED448KeyPairOptions[der | pem, der | pem],
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
    callback: js.Function3[/* err */ js.Error | Null, /* publicKey */ KeyObject, /* privateKey */ KeyObject, Unit]
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
  def apply(
    `type`: x25519,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ js.Error | Null, /* publicKey */ KeyObject, /* privateKey */ KeyObject, Unit]
  ): Unit = js.native
  def apply(
    `type`: x25519,
    options: X25519KeyPairKeyObjectOptions,
    callback: js.Function3[/* err */ js.Error | Null, /* publicKey */ KeyObject, /* privateKey */ KeyObject, Unit]
  ): Unit = js.native
  def apply(
    `type`: x25519,
    options: X25519KeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      js.Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ String), 
      (/* privateKey */ Buffer) | (/* privateKey */ String), 
      Unit
    ]
  ): Unit = js.native
  def apply(
    `type`: x448,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* err */ js.Error | Null, /* publicKey */ KeyObject, /* privateKey */ KeyObject, Unit]
  ): Unit = js.native
  def apply(
    `type`: x448,
    options: X448KeyPairKeyObjectOptions,
    callback: js.Function3[/* err */ js.Error | Null, /* publicKey */ KeyObject, /* privateKey */ KeyObject, Unit]
  ): Unit = js.native
  def apply(
    `type`: x448,
    options: X448KeyPairOptions[der | pem, der | pem],
    callback: js.Function3[
      js.Error | Null, 
      (/* publicKey */ Buffer) | (/* publicKey */ String), 
      (/* privateKey */ Buffer) | (/* privateKey */ String), 
      Unit
    ]
  ): Unit = js.native
}
