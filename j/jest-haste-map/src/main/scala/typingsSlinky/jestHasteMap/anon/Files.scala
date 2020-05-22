package typingsSlinky.jestHasteMap.anon

import typingsSlinky.jestHasteMap.typesMod.FileData
import typingsSlinky.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Files extends js.Object {
  var files: FileData
  var rootDir: Path
}

object Files {
  @scala.inline
  def apply(files: FileData, rootDir: Path): Files = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[Files]
  }
}

