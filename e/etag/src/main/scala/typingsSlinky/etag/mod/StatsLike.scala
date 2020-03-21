package typingsSlinky.etag.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsLike extends js.Object {
  var ctime: js.Date
  var ino: Double
  var mtime: js.Date
  var size: Double
}

object StatsLike {
  @scala.inline
  def apply(ctime: js.Date, ino: Double, mtime: js.Date, size: Double): StatsLike = {
    val __obj = js.Dynamic.literal(ctime = ctime.asInstanceOf[js.Any], ino = ino.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StatsLike]
  }
}

