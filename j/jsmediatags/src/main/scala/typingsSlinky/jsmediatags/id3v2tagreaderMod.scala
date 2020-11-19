package typingsSlinky.jsmediatags

import typingsSlinky.jsmediatags.typesMod.ByteRange
import typingsSlinky.jsmediatags.typesMod.TagFrames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsmediatags/build2/ID3v2TagReader", JSImport.Namespace)
@js.native
object id3v2tagreaderMod extends js.Object {
  
  @js.native
  trait ID3v2TagReader
    extends typingsSlinky.jsmediatags.mediaTagReaderMod.default {
    
    def _getFrameData(frames: TagFrames, ids: js.Array[String]): js.Any = js.native
  }
  
  @js.native
  class default () extends ID3v2TagReader
  /* static members */
  @js.native
  object default extends js.Object {
    
    def canReadTagFormat(tagIdentifier: js.Array[Double]): Boolean = js.native
    
    def getTagIdentifierByteRange(): ByteRange = js.native
  }
}
