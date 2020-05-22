package typingsSlinky.filesystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  /**
    * This is the time at which the file or directory was last modified.
    * @readonly
    */
  var modificationTime: js.Date
  /**
    * The size of the file, in bytes. This must return 0 for directories.
    * @readonly
    */
  var size: Double
}

object Metadata {
  @scala.inline
  def apply(modificationTime: js.Date, size: Double): Metadata = {
    val __obj = js.Dynamic.literal(modificationTime = modificationTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
}

