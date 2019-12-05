package typingsSlinky.cryptojs.CryptoJS.algo

import typingsSlinky.cryptojs.CryptoJS.lib.CipherParamsData
import typingsSlinky.cryptojs.CryptoJS.lib.IBlockCipherCfg
import typingsSlinky.cryptojs.CryptoJS.lib.IStreamCipher
import typingsSlinky.cryptojs.CryptoJS.lib.WordArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBlockCipherImpl extends IStreamCipher[IBlockCipherCfg] {
  def createDecryptor(key: WordArray, cfg: CipherParamsData): IBlockCipherImpl = js.native
  def createEncryptor(key: WordArray, cfg: CipherParamsData): IBlockCipherImpl = js.native
  def decryptBlock(M: js.Array[Double], offset: Double): Unit = js.native
  def encryptBlock(M: js.Array[Double], offset: Double): Unit = js.native
}

