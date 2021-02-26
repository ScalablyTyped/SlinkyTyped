package typingsSlinky.jsmediatags

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jsmediatags.typesMod.ByteRange
import typingsSlinky.jsmediatags.typesMod.CallbackType
import typingsSlinky.jsmediatags.typesMod.LoadCallbackType
import typingsSlinky.jsmediatags.typesMod.TagType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaTagReaderMod {
  
  @JSImport("jsmediatags/build2/MediaTagReader", JSImport.Default)
  @js.native
  class default protected () extends MediaTagReader {
    def this(mediaFileReader: typingsSlinky.jsmediatags.mediaFileReaderMod.default) = this()
  }
  /* static members */
  object default {
    
    @JSImport("jsmediatags/build2/MediaTagReader", "default.canReadTagFormat")
    @js.native
    def canReadTagFormat(tagIdentifier: js.Array[Double]): Boolean = js.native
    
    @JSImport("jsmediatags/build2/MediaTagReader", "default.getTagIdentifierByteRange")
    @js.native
    def getTagIdentifierByteRange(): ByteRange = js.native
  }
  
  @js.native
  trait MediaTagReader extends StObject {
    
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
}
