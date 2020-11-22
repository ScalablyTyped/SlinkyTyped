package typingsSlinky.ipfsCore.utilsMod

import typingsSlinky.ipfsCore.ipfsCoreStrings.fixed
import typingsSlinky.ipfsCore.ipfsCoreStrings.rabin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ipfsCore.utilsMod.FixedChunkerOptions
  - typingsSlinky.ipfsCore.utilsMod.RabinChunkerOptions
*/
trait ChunkerOptions extends js.Object
object ChunkerOptions {
  
  @scala.inline
  def FixedChunkerOptions(chunker: fixed): ChunkerOptions = {
    val __obj = js.Dynamic.literal(chunker = chunker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChunkerOptions]
  }
  
  @scala.inline
  def RabinChunkerOptions(avgChunkSize: Double, chunker: rabin): ChunkerOptions = {
    val __obj = js.Dynamic.literal(avgChunkSize = avgChunkSize.asInstanceOf[js.Any], chunker = chunker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChunkerOptions]
  }
}
