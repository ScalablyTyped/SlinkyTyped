package typingsSlinky.jsmediatags

import typingsSlinky.jsmediatags.typesMod.ByteRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object id3v1tagreaderMod {
  
  @JSImport("jsmediatags/build2/ID3v1TagReader", JSImport.Default)
  @js.native
  class default () extends ID3v1TagReader
  /* static members */
  object default {
    
    @JSImport("jsmediatags/build2/ID3v1TagReader", "default.canReadTagFormat")
    @js.native
    def canReadTagFormat(tagIdentifier: js.Array[Double]): Boolean = js.native
    
    @JSImport("jsmediatags/build2/ID3v1TagReader", "default.getTagIdentifierByteRange")
    @js.native
    def getTagIdentifierByteRange(): ByteRange = js.native
  }
  
  @js.native
  trait ID3v1TagReader
    extends typingsSlinky.jsmediatags.mediaTagReaderMod.default
}
