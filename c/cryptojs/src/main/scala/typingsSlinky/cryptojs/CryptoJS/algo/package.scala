package typingsSlinky.cryptojs.CryptoJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object algo {
  type AES = typingsSlinky.cryptojs.CryptoJS.algo.IBlockCipherImpl
  type DES = typingsSlinky.cryptojs.CryptoJS.algo.IBlockCipherImpl
  type MD5 = typingsSlinky.cryptojs.CryptoJS.lib.Hasher
  type PBKDF2 = typingsSlinky.cryptojs.CryptoJS.algo.EvpKDF
  type RC4 = typingsSlinky.cryptojs.CryptoJS.lib.StreamCipher
  //PBKDF2 is same as EvpKDF
  type RC4Drop = typingsSlinky.cryptojs.CryptoJS.algo.RC4
  type RIPEMD160 = typingsSlinky.cryptojs.CryptoJS.lib.Hasher
  type Rabbit = typingsSlinky.cryptojs.CryptoJS.lib.StreamCipher
  type RabbitLegacy = typingsSlinky.cryptojs.CryptoJS.lib.StreamCipher
  type SHA1 = typingsSlinky.cryptojs.CryptoJS.lib.Hasher
  type SHA224 = typingsSlinky.cryptojs.CryptoJS.lib.Hasher
  type SHA256 = typingsSlinky.cryptojs.CryptoJS.lib.Hasher
  type SHA3 = typingsSlinky.cryptojs.CryptoJS.lib.IHasher[typingsSlinky.cryptojs.CryptoJS.algo.ISHA3Cfg]
  type SHA384 = typingsSlinky.cryptojs.CryptoJS.lib.Hasher
  type SHA512 = typingsSlinky.cryptojs.CryptoJS.lib.Hasher
  type TripleDES = typingsSlinky.cryptojs.CryptoJS.algo.IBlockCipherImpl
}
