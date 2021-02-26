package typingsSlinky.imageSize

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readUIntMod {
  
  @JSImport("image-size/dist/readUInt", "readUInt")
  @js.native
  def readUInt(buffer: Buffer, bits: Bits, offset: Double, isBigEndian: Boolean): Double = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.imageSize.imageSizeNumbers.`16`
    - typingsSlinky.imageSize.imageSizeNumbers.`32`
  */
  trait Bits extends StObject
  object Bits {
    
    @scala.inline
    def `16`: typingsSlinky.imageSize.imageSizeNumbers.`16` = 16.asInstanceOf[typingsSlinky.imageSize.imageSizeNumbers.`16`]
    
    @scala.inline
    def `32`: typingsSlinky.imageSize.imageSizeNumbers.`32` = 32.asInstanceOf[typingsSlinky.imageSize.imageSizeNumbers.`32`]
  }
}
