package typingsSlinky.encodingDown.mod.EncodingDown

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.abstractLeveldown.mod.AbstractOptions
import typingsSlinky.levelCodec.mod.CodecEncoder
import typingsSlinky.levelCodec.mod.CodecOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DelOptions
  extends AbstractOptions
     with CodecOptions

object DelOptions {
  @scala.inline
  def apply(
    StringDictionary: StringDictionary[js.Any] = null,
    keyEncoding: String | CodecEncoder = null,
    valueEncoding: String | CodecEncoder = null
  ): DelOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (keyEncoding != null) __obj.updateDynamic("keyEncoding")(keyEncoding.asInstanceOf[js.Any])
    if (valueEncoding != null) __obj.updateDynamic("valueEncoding")(valueEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelOptions]
  }
}

