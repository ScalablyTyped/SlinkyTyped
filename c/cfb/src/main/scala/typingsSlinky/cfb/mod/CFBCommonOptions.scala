package typingsSlinky.cfb.mod

import typingsSlinky.cfb.cfbStrings.array
import typingsSlinky.cfb.cfbStrings.base64
import typingsSlinky.cfb.cfbStrings.binary
import typingsSlinky.cfb.cfbStrings.buffer
import typingsSlinky.cfb.cfbStrings.file
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CFBCommonOptions extends js.Object {
  /** If true, throw errors when features are not understood */
  var WTF: js.UndefOr[Boolean] = js.undefined
  /** Input data encoding */
  var `type`: js.UndefOr[base64 | binary | buffer | file | array] = js.undefined
}

object CFBCommonOptions {
  @scala.inline
  def apply(WTF: js.UndefOr[Boolean] = js.undefined, `type`: base64 | binary | buffer | file | array = null): CFBCommonOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(WTF)) __obj.updateDynamic("WTF")(WTF.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CFBCommonOptions]
  }
}

