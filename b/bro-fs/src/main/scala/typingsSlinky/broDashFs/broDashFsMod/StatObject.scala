package typingsSlinky.broDashFs.broDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatObject extends js.Object {
  var fullPath: String
  var isDirectory: Boolean
  var isFile: Boolean
  var modificationTime: js.Date
  var name: String
  var size: Double
}

object StatObject {
  @scala.inline
  def apply(
    fullPath: String,
    isDirectory: Boolean,
    isFile: Boolean,
    modificationTime: js.Date,
    name: String,
    size: Double
  ): StatObject = {
    val __obj = js.Dynamic.literal(fullPath = fullPath.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], isFile = isFile.asInstanceOf[js.Any], modificationTime = modificationTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StatObject]
  }
}

