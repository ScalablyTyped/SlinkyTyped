package typingsSlinky.rollup.mod

import typingsSlinky.node.Buffer
import typingsSlinky.rollup.rollupStrings.asset
import typingsSlinky.rollup.rollupStrings.chunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rollup.mod.EmittedAsset
  - typingsSlinky.rollup.mod.EmittedChunk
*/
trait EmittedFile extends js.Object

object EmittedFile {
  @scala.inline
  def EmittedAsset(`type`: asset, fileName: String = null, name: String = null, source: String | Buffer = null): EmittedFile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmittedFile]
  }
  @scala.inline
  def EmittedChunk(id: String, `type`: chunk, fileName: String = null, name: String = null): EmittedFile = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmittedFile]
  }
}

