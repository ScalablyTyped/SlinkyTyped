package typingsSlinky.atKoaMulter.atKoaMulterMod.koaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var file: org.scalajs.dom.raw.File
  var files: js.Array[org.scalajs.dom.raw.File]
}

object Request {
  @scala.inline
  def apply(file: org.scalajs.dom.raw.File, files: js.Array[org.scalajs.dom.raw.File]): Request = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Request]
  }
}

