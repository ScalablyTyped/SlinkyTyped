package typingsSlinky.nodeOpenload.mod

import typingsSlinky.nodeOpenload.anon.Cstatus
import typingsSlinky.nodeOpenload.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFolder extends js.Object {
  var files: js.Array[Cstatus]
  var folders: js.Array[Id]
}

object ListFolder {
  @scala.inline
  def apply(files: js.Array[Cstatus], folders: js.Array[Id]): ListFolder = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], folders = folders.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFolder]
  }
}

