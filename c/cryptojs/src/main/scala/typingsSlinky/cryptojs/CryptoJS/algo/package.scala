package typingsSlinky.cryptojs.CryptoJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object algo {
  import typingsSlinky.cryptojs.CryptoJS.lib.Hasher
  import typingsSlinky.cryptojs.CryptoJS.lib.IHasher
  import typingsSlinky.cryptojs.CryptoJS.lib.StreamCipher

  type AES = IBlockCipherImpl
  type DES = IBlockCipherImpl
  type MD5 = Hasher
  type PBKDF2 = EvpKDF
  type RC4 = StreamCipher
  //PBKDF2 is same as EvpKDF
  type RC4Drop = RC4
  type RIPEMD160 = Hasher
  type Rabbit = StreamCipher
  type RabbitLegacy = StreamCipher
  type SHA1 = Hasher
  type SHA224 = Hasher
  type SHA256 = Hasher
  type SHA3 = IHasher[ISHA3Cfg]
  type SHA384 = Hasher
  type SHA512 = Hasher
  type TripleDES = IBlockCipherImpl
}
