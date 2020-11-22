package typingsSlinky.mz.mod.crypto

import typingsSlinky.mz.mzStrings.der
import typingsSlinky.mz.mzStrings.dsa
import typingsSlinky.mz.mzStrings.ec
import typingsSlinky.mz.mzStrings.ed25519
import typingsSlinky.mz.mzStrings.ed448
import typingsSlinky.mz.mzStrings.pem
import typingsSlinky.mz.mzStrings.rsa
import typingsSlinky.mz.mzStrings.x25519
import typingsSlinky.mz.mzStrings.x448
import typingsSlinky.node.Buffer
import typingsSlinky.node.cryptoMod.DSAKeyPairKeyObjectOptions
import typingsSlinky.node.cryptoMod.DSAKeyPairOptions
import typingsSlinky.node.cryptoMod.ECKeyPairKeyObjectOptions
import typingsSlinky.node.cryptoMod.ECKeyPairOptions
import typingsSlinky.node.cryptoMod.ED25519KeyPairKeyObjectOptions
import typingsSlinky.node.cryptoMod.ED25519KeyPairOptions
import typingsSlinky.node.cryptoMod.ED448KeyPairKeyObjectOptions
import typingsSlinky.node.cryptoMod.ED448KeyPairOptions
import typingsSlinky.node.cryptoMod.RSAKeyPairKeyObjectOptions
import typingsSlinky.node.cryptoMod.RSAKeyPairOptions
import typingsSlinky.node.cryptoMod.X25519KeyPairKeyObjectOptions
import typingsSlinky.node.cryptoMod.X25519KeyPairOptions
import typingsSlinky.node.cryptoMod.X448KeyPairKeyObjectOptions
import typingsSlinky.node.cryptoMod.X448KeyPairOptions
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
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* publicKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      /* privateKey */ typingsSlinky.node.cryptoMod.KeyObject, 
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
    `type`: ed448,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* publicKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      /* privateKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    `type`: ed448,
    options: ED448KeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* publicKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      /* privateKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      Unit
    ]
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
  def apply(
    `type`: x25519,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* publicKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      /* privateKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    `type`: x25519,
    options: X25519KeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* publicKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      /* privateKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      Unit
    ]
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
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* publicKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      /* privateKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    `type`: x448,
    options: X448KeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ js.Error | Null, 
      /* publicKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      /* privateKey */ typingsSlinky.node.cryptoMod.KeyObject, 
      Unit
    ]
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
