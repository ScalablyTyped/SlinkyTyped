package typingsSlinky.cfb.mod

import typingsSlinky.cfb.cfbStrings.array
import typingsSlinky.cfb.cfbStrings.base64
import typingsSlinky.cfb.cfbStrings.binary
import typingsSlinky.cfb.cfbStrings.buffer
import typingsSlinky.cfb.cfbStrings.cfb
import typingsSlinky.cfb.cfbStrings.file
import typingsSlinky.cfb.cfbStrings.zip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CFBWritingOptions extends CFBCommonOptions {
  /** Enable compression (ZIP only) */
  var compression: js.UndefOr[Boolean] = js.undefined
  /** Output file type */
  var fileType: js.UndefOr[cfb | zip] = js.undefined
  /** Override default root entry name (CFB only) */
  var root: js.UndefOr[String] = js.undefined
}

object CFBWritingOptions {
  @scala.inline
  def apply(
    WTF: js.UndefOr[Boolean] = js.undefined,
    compression: js.UndefOr[Boolean] = js.undefined,
    fileType: cfb | zip = null,
    root: String = null,
    `type`: base64 | binary | buffer | file | array = null
  ): CFBWritingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(WTF)) __obj.updateDynamic("WTF")(WTF.asInstanceOf[js.Any])
    if (!js.isUndefined(compression)) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CFBWritingOptions]
  }
}

