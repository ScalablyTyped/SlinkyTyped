package typingsSlinky.jsmediatags

import typingsSlinky.jsmediatags.typesMod.ByteRange
import typingsSlinky.jsmediatags.typesMod.LoadCallbackType
import typingsSlinky.jsmediatags.typesMod.TagFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsmediatags/build2/MP4TagReader", JSImport.Namespace)
@js.native
object mp4tagreaderMod extends js.Object {
  
  @js.native
  trait MP4TagReader
    extends typingsSlinky.jsmediatags.mediaTagReaderMod.default {
    
    def _canReadAtom(atomName: String): Boolean = js.native
    
    def _isContainerAtom(atomName: String): Boolean = js.native
    
    def _loadAtom(
      mediaFileReader: typingsSlinky.jsmediatags.mediaFileReaderMod.default,
      offset: Double,
      parentAtomFullName: String,
      callbacks: LoadCallbackType
    ): Unit = js.native
    
    def _readAtom(
      tags: js.Any,
      data: typingsSlinky.jsmediatags.mediaFileReaderMod.default,
      offset: Double,
      length: Double
    ): Unit = js.native
    def _readAtom(
      tags: js.Any,
      data: typingsSlinky.jsmediatags.mediaFileReaderMod.default,
      offset: Double,
      length: Double,
      tagsToRead: js.UndefOr[scala.Nothing],
      parentAtomFullName: js.UndefOr[scala.Nothing],
      indent: String
    ): Unit = js.native
    def _readAtom(
      tags: js.Any,
      data: typingsSlinky.jsmediatags.mediaFileReaderMod.default,
      offset: Double,
      length: Double,
      tagsToRead: js.UndefOr[scala.Nothing],
      parentAtomFullName: String
    ): Unit = js.native
    def _readAtom(
      tags: js.Any,
      data: typingsSlinky.jsmediatags.mediaFileReaderMod.default,
      offset: Double,
      length: Double,
      tagsToRead: js.UndefOr[scala.Nothing],
      parentAtomFullName: String,
      indent: String
    ): Unit = js.native
    def _readAtom(
      tags: js.Any,
      data: typingsSlinky.jsmediatags.mediaFileReaderMod.default,
      offset: Double,
      length: Double,
      tagsToRead: js.Array[String]
    ): Unit = js.native
    def _readAtom(
      tags: js.Any,
      data: typingsSlinky.jsmediatags.mediaFileReaderMod.default,
      offset: Double,
      length: Double,
      tagsToRead: js.Array[String],
      parentAtomFullName: js.UndefOr[scala.Nothing],
      indent: String
    ): Unit = js.native
    def _readAtom(
      tags: js.Any,
      data: typingsSlinky.jsmediatags.mediaFileReaderMod.default,
      offset: Double,
      length: Double,
      tagsToRead: js.Array[String],
      parentAtomFullName: String
    ): Unit = js.native
    def _readAtom(
      tags: js.Any,
      data: typingsSlinky.jsmediatags.mediaFileReaderMod.default,
      offset: Double,
      length: Double,
      tagsToRead: js.Array[String],
      parentAtomFullName: String,
      indent: String
    ): Unit = js.native
    
    def _readMetadataAtom(data: typingsSlinky.jsmediatags.mediaFileReaderMod.default, offset: Double): TagFrame = js.native
  }
  
  @js.native
  class default () extends MP4TagReader
  /* static members */
  @js.native
  object default extends js.Object {
    
    def canReadTagFormat(tagIdentifier: js.Array[Double]): Boolean = js.native
    
    def getTagIdentifierByteRange(): ByteRange = js.native
  }
}
