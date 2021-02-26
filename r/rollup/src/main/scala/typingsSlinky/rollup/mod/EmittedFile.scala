package typingsSlinky.rollup.mod

import typingsSlinky.rollup.rollupStrings.asset
import typingsSlinky.rollup.rollupStrings.chunk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rollup.mod.EmittedAsset
  - typingsSlinky.rollup.mod.EmittedChunk
*/
trait EmittedFile extends StObject
object EmittedFile {
  
  @scala.inline
  def EmittedAsset(`type`: asset): typingsSlinky.rollup.mod.EmittedAsset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.rollup.mod.EmittedAsset]
  }
  
  @scala.inline
  def EmittedChunk(id: String, `type`: chunk): typingsSlinky.rollup.mod.EmittedChunk = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.rollup.mod.EmittedChunk]
  }
}
