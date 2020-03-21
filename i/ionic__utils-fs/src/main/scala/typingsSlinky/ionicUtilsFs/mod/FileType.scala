package typingsSlinky.ionicUtilsFs.mod

import typingsSlinky.ionicUtilsFs.ionicUtilsFsStrings.directory
import typingsSlinky.ionicUtilsFs.ionicUtilsFsStrings.file
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ionicUtilsFs.ionicUtilsFsStrings.file
  - typingsSlinky.ionicUtilsFs.ionicUtilsFsStrings.directory
*/
trait FileType extends js.Object

object FileType {
  @scala.inline
  def DIRECTORY: directory = this.cast("directory")
  @scala.inline
  def FILE: file = this.cast("file")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

