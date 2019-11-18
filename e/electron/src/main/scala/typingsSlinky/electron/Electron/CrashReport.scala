package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrashReport extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/crash-report
  var date: js.Date
  var id: String
}

object CrashReport {
  @scala.inline
  def apply(date: js.Date, id: String): CrashReport = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CrashReport]
  }
}

