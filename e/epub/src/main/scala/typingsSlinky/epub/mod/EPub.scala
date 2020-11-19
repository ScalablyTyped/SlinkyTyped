package typingsSlinky.epub.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EPub extends EventEmitter {
  
  var flow: js.Array[js.Object] = js.native
  
  def getChapter(chapterId: String, callback: js.Function2[/* error */ js.Error, /* text */ String, Unit]): Unit = js.native
  
  def getChapterRaw(chapterId: String, callback: js.Function2[/* error */ js.Error, /* text */ String, Unit]): Unit = js.native
  
  def getFile(
    id: String,
    callback: js.Function3[/* error */ js.Error, /* data */ Buffer, /* mimeType */ String, Unit]
  ): Unit = js.native
  
  def getImage(
    id: String,
    callback: js.Function3[/* error */ js.Error, /* data */ Buffer, /* mimeType */ String, Unit]
  ): Unit = js.native
  
  var manifest: js.Object = js.native
  
  var metadata: js.Object = js.native
  
  def parse(): Unit = js.native
  
  var spine: js.Object = js.native
  
  var toc: js.Array[TocElement] = js.native
}
