package typingsSlinky.jsmediatags

import typingsSlinky.jsmediatags.typesMod.ByteRange
import typingsSlinky.jsmediatags.typesMod.TagFrames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object id3v2tagreaderMod {
  
  @JSImport("jsmediatags/build2/ID3v2TagReader", JSImport.Default)
  @js.native
  class default () extends ID3v2TagReader
  /* static members */
  object default {
    
    @JSImport("jsmediatags/build2/ID3v2TagReader", "default.canReadTagFormat")
    @js.native
    def canReadTagFormat(tagIdentifier: js.Array[Double]): Boolean = js.native
    
    @JSImport("jsmediatags/build2/ID3v2TagReader", "default.getTagIdentifierByteRange")
    @js.native
    def getTagIdentifierByteRange(): ByteRange = js.native
  }
  
  @js.native
  trait ID3v2TagReader
    extends typingsSlinky.jsmediatags.mediaTagReaderMod.default {
    
    def _getFrameData(frames: TagFrames, ids: js.Array[String]): js.Any = js.native
  }
}
