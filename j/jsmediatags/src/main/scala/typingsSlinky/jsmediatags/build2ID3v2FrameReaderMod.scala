package typingsSlinky.jsmediatags

import typingsSlinky.jsmediatags.typesMod.FrameReaderSignature
import typingsSlinky.jsmediatags.typesMod.TagFrameFlags
import typingsSlinky.jsmediatags.typesMod.TagFrameHeader
import typingsSlinky.jsmediatags.typesMod.TagFrames
import typingsSlinky.jsmediatags.typesMod.TagHeader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsmediatags/build2/ID3v2FrameReader", JSImport.Namespace)
@js.native
object build2ID3v2FrameReaderMod extends js.Object {
  // tslint:disable-next-line:interface-name
  @js.native
  trait ID3v2FrameReader extends js.Object {
    def _getFrameDescription(frameId: String): String = js.native
    def _getFrameHeaderSize(id3header: TagHeader): Double = js.native
    def _readFrameFlags(data: typingsSlinky.jsmediatags.build2MediaFileReaderMod.default, offset: Double): TagFrameFlags = js.native
    def _readFrameHeader(
      data: typingsSlinky.jsmediatags.build2MediaFileReaderMod.default,
      offset: Double,
      id3header: TagHeader
    ): TagFrameHeader = js.native
    def getFrameReaderFunction(frameId: String): FrameReaderSignature | Null = js.native
    def getUnsyncFileReader(data: typingsSlinky.jsmediatags.build2MediaFileReaderMod.default, offset: Double, size: Double): typingsSlinky.jsmediatags.build2MediaFileReaderMod.default = js.native
    def readFrames(
      offset: Double,
      end: Double,
      data: typingsSlinky.jsmediatags.build2MediaFileReaderMod.default,
      id3header: TagHeader
    ): TagFrames = js.native
    def readFrames(
      offset: Double,
      end: Double,
      data: typingsSlinky.jsmediatags.build2MediaFileReaderMod.default,
      id3header: TagHeader,
      tags: js.Array[String]
    ): TagFrames = js.native
  }
  
  val default: ID3v2FrameReader = js.native
}

