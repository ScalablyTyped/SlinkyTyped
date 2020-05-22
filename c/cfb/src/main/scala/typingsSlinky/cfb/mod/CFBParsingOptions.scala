package typingsSlinky.cfb.mod

import typingsSlinky.cfb.cfbStrings.array
import typingsSlinky.cfb.cfbStrings.base64
import typingsSlinky.cfb.cfbStrings.binary
import typingsSlinky.cfb.cfbStrings.buffer
import typingsSlinky.cfb.cfbStrings.file
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CFBParsingOptions extends CFBCommonOptions {
  /** If true, include raw data in output */
  var raw: js.UndefOr[Boolean] = js.undefined
}

object CFBParsingOptions {
  @scala.inline
  def apply(
    WTF: js.UndefOr[Boolean] = js.undefined,
    raw: js.UndefOr[Boolean] = js.undefined,
    `type`: base64 | binary | buffer | file | array = null
  ): CFBParsingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(WTF)) __obj.updateDynamic("WTF")(WTF.get.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CFBParsingOptions]
  }
}

