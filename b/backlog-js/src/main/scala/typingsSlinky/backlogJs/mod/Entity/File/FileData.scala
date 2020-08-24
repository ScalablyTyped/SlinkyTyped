package typingsSlinky.backlogJs.mod.Entity.File

import typingsSlinky.node.streamMod.PassThrough
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.backlogJs.mod.Entity.File.NodeFileData
  - typingsSlinky.backlogJs.mod.Entity.File.BrowserFileData
*/
trait FileData extends js.Object

object FileData {
  @scala.inline
  def NodeFileData(body: PassThrough, filename: String, url: String): FileData = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileData]
  }
  @scala.inline
  def BrowserFileData(body: js.Any, url: String): FileData = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileData]
  }
}

