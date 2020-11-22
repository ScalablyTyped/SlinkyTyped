package typingsSlinky.encodingJapanese.mod

import typingsSlinky.encodingJapanese.encodingJapaneseStrings.array
import typingsSlinky.encodingJapanese.encodingJapaneseStrings.arraybuffer
import typingsSlinky.encodingJapanese.encodingJapaneseStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.encodingJapanese.mod.ConvertStringOptions
  - typingsSlinky.encodingJapanese.mod.ConvertArrayBufferOptions
  - typingsSlinky.encodingJapanese.mod.ConvertArrayOptions
  - typingsSlinky.encodingJapanese.mod.ConvertUnknownOptions
*/
trait ConvertOptions extends js.Object
object ConvertOptions {
  
  @scala.inline
  def ConvertStringOptions(to: Encoding, `type`: string): ConvertOptions = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvertOptions]
  }
  
  @scala.inline
  def ConvertArrayBufferOptions(to: Encoding, `type`: arraybuffer): ConvertOptions = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvertOptions]
  }
  
  @scala.inline
  def ConvertArrayOptions(to: Encoding, `type`: array): ConvertOptions = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvertOptions]
  }
  
  @scala.inline
  def ConvertUnknownOptions(to: Encoding): ConvertOptions = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvertOptions]
  }
}
