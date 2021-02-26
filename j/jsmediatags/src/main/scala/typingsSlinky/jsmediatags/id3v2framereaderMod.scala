package typingsSlinky.jsmediatags

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.jsmediatags.typesMod.FrameReaderSignature
import typingsSlinky.jsmediatags.typesMod.TagFrameFlags
import typingsSlinky.jsmediatags.typesMod.TagFrameHeader
import typingsSlinky.jsmediatags.typesMod.TagFrames
import typingsSlinky.jsmediatags.typesMod.TagHeader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object id3v2framereaderMod extends Shortcut {
  
  @JSImport("jsmediatags/build2/ID3v2FrameReader", JSImport.Default)
  @js.native
  val default: ID3v2FrameReader = js.native
  
  @js.native
  trait ID3v2FrameReader extends StObject {
    
    def _getFrameDescription(frameId: String): String = js.native
    
    def _getFrameHeaderSize(id3header: TagHeader): Double = js.native
    
    def _readFrameFlags(data: typingsSlinky.jsmediatags.mediaFileReaderMod.default, offset: Double): TagFrameFlags = js.native
    
    def _readFrameHeader(data: typingsSlinky.jsmediatags.mediaFileReaderMod.default, offset: Double, id3header: TagHeader): TagFrameHeader = js.native
    
    def getFrameReaderFunction(frameId: String): FrameReaderSignature | Null = js.native
    
    def getUnsyncFileReader(data: typingsSlinky.jsmediatags.mediaFileReaderMod.default, offset: Double, size: Double): typingsSlinky.jsmediatags.mediaFileReaderMod.default = js.native
    
    def readFrames(
      offset: Double,
      end: Double,
      data: typingsSlinky.jsmediatags.mediaFileReaderMod.default,
      id3header: TagHeader
    ): TagFrames = js.native
    def readFrames(
      offset: Double,
      end: Double,
      data: typingsSlinky.jsmediatags.mediaFileReaderMod.default,
      id3header: TagHeader,
      tags: js.Array[String]
    ): TagFrames = js.native
  }
  
  type _To = ID3v2FrameReader
  
  /* This means you don't have to write `default`, but can instead just say `id3v2framereaderMod.foo` */
  override def _to: ID3v2FrameReader = default
}
