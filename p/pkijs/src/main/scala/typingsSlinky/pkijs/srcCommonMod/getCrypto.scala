package typingsSlinky.pkijs.srcCommonMod

import org.scalajs.dom.crypto.SubtleCrypto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/common", "getCrypto")
@js.native
object getCrypto extends js.Object {
  /**
    * Get crypto subtle from current "crypto engine" or "undefined"
    * 
    * @returns {(SubtleCrypto | undefined)}
    */
  def apply(): js.UndefOr[SubtleCrypto] = js.native
}

