package typingsSlinky.gulpSass

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDuration extends js.Object {
  var duration: Double
  var end: js.Date
  var entry: String
  var includedFiles: js.Array[String]
  var start: js.Date
}

object AnonDuration {
  @scala.inline
  def apply(duration: Double, end: js.Date, entry: String, includedFiles: js.Array[String], start: js.Date): AnonDuration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], entry = entry.asInstanceOf[js.Any], includedFiles = includedFiles.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDuration]
  }
}

