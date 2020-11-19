package typingsSlinky.dav.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dav", "Calendar")
@js.native
class Calendar () extends DAVCollection[CalendarObject] {
  def this(options: CalendarOptions) = this()
  
  var components: js.Array[String] = js.native
  
  var timezone: String = js.native
}
