package typingsSlinky.jsmediatags

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jsmediatags.typesMod.ByteRange
import typingsSlinky.jsmediatags.typesMod.CallbackType
import typingsSlinky.jsmediatags.typesMod.LoadCallbackType
import typingsSlinky.jsmediatags.typesMod.TagType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsmediatags/build2/MediaTagReader", JSImport.Namespace)
@js.native
object mediaTagReaderMod extends js.Object {
  
  @js.native
  trait MediaTagReader extends js.Object {
    
    def _expandShortcutTags(): js.Array[String] | Null = js.native
    def _expandShortcutTags(tagsWithShortcuts: js.Array[String]): js.Array[String] | Null = js.native
    
    def _loadData(mediaFileReader: typingsSlinky.jsmediatags.mediaFileReaderMod.default, callbacks: LoadCallbackType): Unit = js.native
    
    var _mediaFileReader: typingsSlinky.jsmediatags.mediaFileReaderMod.default = js.native
    
    def _parseData(mediaFileReader: typingsSlinky.jsmediatags.mediaFileReaderMod.default): TagType = js.native
    def _parseData(mediaFileReader: typingsSlinky.jsmediatags.mediaFileReaderMod.default, tags: js.Array[String]): TagType = js.native
    
    var _tags: js.UndefOr[js.Array[String]] = js.native
    
    def getShortcuts(): StringDictionary[String | js.Array[String]] = js.native
    
    def read(callbacks: CallbackType): Unit = js.native
    
    def setTagsToRead(tags: js.Array[String]): MediaTagReader = js.native
  }
  
  @js.native
  class default protected () extends MediaTagReader {
    def this(mediaFileReader: typingsSlinky.jsmediatags.mediaFileReaderMod.default) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def canReadTagFormat(tagIdentifier: js.Array[Double]): Boolean = js.native
    
    def getTagIdentifierByteRange(): ByteRange = js.native
  }
}
