package typingsSlinky.jsmediatags.mod

import typingsSlinky.jsmediatags.anon.TypeofMediaFileReader
import typingsSlinky.jsmediatags.anon.TypeofMediaTagReader
import typingsSlinky.jsmediatags.mediaFileReaderMod.default
import typingsSlinky.jsmediatags.typesMod.CallbackType
import typingsSlinky.jsmediatags.typesMod.LoadCallbackType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsmediatags", "Reader")
@js.native
class Reader protected () extends js.Object {
  def this(file: js.Any) = this()
  
  var _file: js.Any = js.native
  
  var _fileReader: TypeofMediaFileReader = js.native
  
  def _findFileReader(): TypeofMediaFileReader = js.native
  
  def _findTagReader(fileReader: default, callbacks: CallbackType): Unit = js.native
  
  def _getFileReader(): TypeofMediaFileReader = js.native
  
  def _getTagReader(fileReader: default, callbacks: CallbackType): Unit = js.native
  
  def _loadTagIdentifierRanges(fileReader: default, tagReaders: js.Array[TypeofMediaTagReader], callbacks: LoadCallbackType): Unit = js.native
  
  var _tagReader: TypeofMediaTagReader = js.native
  
  var _tagsToRead: js.Array[String] = js.native
  
  def read(callbacks: CallbackType): Unit = js.native
  
  def setFileReader(fileReader: TypeofMediaFileReader): Reader = js.native
  
  def setTagReader(tagReader: TypeofMediaTagReader): Reader = js.native
  
  def setTagsToRead(tagsToRead: js.Array[String]): Reader = js.native
}
