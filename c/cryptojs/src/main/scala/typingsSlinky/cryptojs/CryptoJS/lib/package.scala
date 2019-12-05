package typingsSlinky.cryptojs.CryptoJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lib {
  //BlockCipher has interface same as IStreamCipher
  type BlockCipher = IStreamCipher[IBlockCipherCfg]
  type Cipher = ICipher[js.Object]
  type CipherHelper = ICipherHelper[js.Object]
  type Hasher = IHasher[js.Object]
  type HasherHelper = IHasherHelper[js.Object]
  type PasswordBasedCipher = IPasswordBasedCipher[IPasswordBasedCipherCfg]
  type SerializableCipher = ISerializableCipher[ISerializableCipherCfg]
  type SomeArray = scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.Int8Array | scala.scalajs.js.typedarray.Int16Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Uint32Array
  type StreamCipher = IStreamCipher[js.Object]
}
