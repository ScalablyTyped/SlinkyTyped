package typingsSlinky.rollup.mod

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
  def EmittedAsset(`type`: asset): EmittedFile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmittedFile]
  }
  @scala.inline
  def EmittedChunk(id: String, `type`: chunk): EmittedFile = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmittedFile]
  }
}

