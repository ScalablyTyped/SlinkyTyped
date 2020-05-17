package typingsSlinky.botvs.mod.global

import typingsSlinky.botvs.botvsStrings.base64
import typingsSlinky.botvs.botvsStrings.hex
import typingsSlinky.botvs.botvsStrings.md5
import typingsSlinky.botvs.botvsStrings.raw
import typingsSlinky.botvs.botvsStrings.sha1
import typingsSlinky.botvs.botvsStrings.sha256
import typingsSlinky.botvs.botvsStrings.sha512
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Hash")
@js.native
object Hash extends js.Object {
  def apply(Algo: md5, OutputAlgo: base64, Data: String): String = js.native
  /**
    * 支持 md5/sha256/sha512/sha1 的哈希计算, 只支持实盘
    *
    * 第二个参数可设置为raw/hex/base64, 分别指输出加密后的 原始内容/hex编码过的/base64编码过的
    * Log(Hash('md5', 'hex', 'hello'));
    * Log(Hash('sha512', 'base64', 'hello'));
    *
    * @param {"md5" | "sha256" | "sha512" | "sha1"} Algo
    * @param {"hex" | "base64"} OutputAlgo
    * @param {string} Data
    * @return {string}
    */
  def apply(Algo: md5, OutputAlgo: hex, Data: String): String = js.native
  def apply(Algo: md5, OutputAlgo: raw, Data: String): String = js.native
  def apply(Algo: sha1, OutputAlgo: base64, Data: String): String = js.native
  def apply(Algo: sha1, OutputAlgo: hex, Data: String): String = js.native
  def apply(Algo: sha1, OutputAlgo: raw, Data: String): String = js.native
  def apply(Algo: sha256, OutputAlgo: base64, Data: String): String = js.native
  def apply(Algo: sha256, OutputAlgo: hex, Data: String): String = js.native
  def apply(Algo: sha256, OutputAlgo: raw, Data: String): String = js.native
  def apply(Algo: sha512, OutputAlgo: base64, Data: String): String = js.native
  def apply(Algo: sha512, OutputAlgo: hex, Data: String): String = js.native
  def apply(Algo: sha512, OutputAlgo: raw, Data: String): String = js.native
}

